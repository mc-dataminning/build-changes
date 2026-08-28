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

public class bsd implements bsf {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bry, List<bsk>> c = new Object2ObjectOpenHashMap();
   private final bqh d;
   private final Executor e;
   private final bsj f;
   private final Consumer<bqm> g;
   private final Consumer<Path> h;
   private final bsa i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bql m;
   private volatile boolean n;
   private Set<bry> o = ImmutableSet.of();

   private bsd(bsa $$0, LongSupplier $$1, Executor $$2, bsj $$3, Consumer<bqm> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bqh($$1, () -> this.l, () -> false);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bqg(this.j, () -> this.l, () -> true);
      this.d.c();
   }

   public static bsd a(bsa $$0, LongSupplier $$1, Executor $$2, bsj $$3, Consumer<bqm> $$4, Consumer<Path> $$5) {
      return new bsd($$0, $$1, $$2, $$3, $$4, $$5);
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
         this.m = bqk.a;
         this.g.accept(bqi.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bry $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bry $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               bsk $$1 = new bsk(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bqg(this.j, () -> this.l, () -> true);
         } else {
            this.n = false;
            bqm $$2 = this.d.e();
            this.m = bqk.a;
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
   public bqo f() {
      return bqo.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(bqm $$0) {
      HashSet<bry> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bry> $$0) {
      for (bry $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
