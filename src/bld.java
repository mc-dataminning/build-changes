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

public class bld implements blf {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bky, List<blk>> c = new Object2ObjectOpenHashMap();
   private final bjl d;
   private final Executor e;
   private final blj f;
   private final Consumer<bjq> g;
   private final Consumer<Path> h;
   private final bla i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bjp m;
   private volatile boolean n;
   private Set<bky> o = ImmutableSet.of();

   private bld(bla $$0, LongSupplier $$1, Executor $$2, blj $$3, Consumer<bjq> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bjl($$1, () -> this.l);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bjk(this.j, () -> this.l, false);
      this.d.c();
   }

   public static bld a(bla $$0, LongSupplier $$1, Executor $$2, blj $$3, Consumer<bjq> $$4, Consumer<Path> $$5) {
      return new bld($$0, $$1, $$2, $$3, $$4, $$5);
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
         this.m = bjo.a;
         this.g.accept(bjm.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bky $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bky $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               blk $$1 = new blk(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bjk(this.j, () -> this.l, false);
         } else {
            this.n = false;
            bjq $$2 = this.d.e();
            this.m = bjo.a;
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
   public bjr f() {
      return bjr.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(bjq $$0) {
      HashSet<bky> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bky> $$0) {
      for (bky $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
