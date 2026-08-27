import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;

public class boa implements boc {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bnv, List<boh>> c = new Object2ObjectOpenHashMap();
   private final bmi d;
   private final Executor e;
   private final bog f;
   private final Consumer<bmn> g;
   private final Consumer<Path> h;
   private final bnx i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bmm m;
   private volatile boolean n;
   private Set<bnv> o = ImmutableSet.of();

   private boa(bnx $$0, LongSupplier $$1, Executor $$2, bog $$3, Consumer<bmn> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bmi($$1, () -> this.l);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bmh(this.j, () -> this.l, false);
      this.d.c();
   }

   public static boa a(bnx $$0, LongSupplier $$1, Executor $$2, bog $$3, Consumer<bmn> $$4, Consumer<Path> $$5) {
      return new boa($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public synchronized void a() {
      if (this.e()) {
         this.n = true;
      }
   }

   @Override
   public synchronized void b() {
      if (this.e()) {
         this.m = bml.a;
         this.g.accept(bmj.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bnv $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bnv $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               boh $$1 = new boh(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bmh(this.j, () -> this.l, false);
         } else {
            this.n = false;
            bmn $$2 = this.d.e();
            this.m = bml.a;
            this.g.accept($$2);
            this.a($$2);
         }
      }
   }

   @Override
   public boolean e() {
      return this.d.a();
   }

   @Override
   public bmo f() {
      return bmo.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(bmn $$0) {
      HashSet<bnv> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bnv> $$0) {
      for (bnv $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
