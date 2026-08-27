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

public class bfa implements bfc {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bev, List<bfh>> c = new Object2ObjectOpenHashMap();
   private final bdl d;
   private final Executor e;
   private final bfg f;
   private final Consumer<bdq> g;
   private final Consumer<Path> h;
   private final bex i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bdp m;
   private volatile boolean n;
   private Set<bev> o = ImmutableSet.of();

   private bfa(bex $$0, LongSupplier $$1, Executor $$2, bfg $$3, Consumer<bdq> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bdl($$1, () -> this.l);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bdk(this.j, () -> this.l, false);
      this.d.c();
   }

   public static bfa a(bex $$0, LongSupplier $$1, Executor $$2, bfg $$3, Consumer<bdq> $$4, Consumer<Path> $$5) {
      return new bfa($$0, $$1, $$2, $$3, $$4, $$5);
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
         this.m = bdo.a;
         this.g.accept(bdm.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bev $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bev $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               bfh $$1 = new bfh(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bdk(this.j, () -> this.l, false);
         } else {
            this.n = false;
            bdq $$2 = this.d.e();
            this.m = bdo.a;
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
   public bdr f() {
      return bdr.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(bdq $$0) {
      HashSet<bev> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bev> $$0) {
      for (bev $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
