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

public class bss implements bsu {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bsn, List<bsz>> c = new Object2ObjectOpenHashMap();
   private final bqw d;
   private final Executor e;
   private final bsy f;
   private final Consumer<brb> g;
   private final Consumer<Path> h;
   private final bsp i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bra m;
   private volatile boolean n;
   private Set<bsn> o = ImmutableSet.of();

   private bss(bsp $$0, LongSupplier $$1, Executor $$2, bsy $$3, Consumer<brb> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bqw($$1, () -> this.l, () -> false);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bqv(this.j, () -> this.l, () -> true);
      this.d.c();
   }

   public static bss a(bsp $$0, LongSupplier $$1, Executor $$2, bsy $$3, Consumer<brb> $$4, Consumer<Path> $$5) {
      return new bss($$0, $$1, $$2, $$3, $$4, $$5);
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
         this.m = bqz.a;
         this.g.accept(bqx.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bsn $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bsn $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               bsz $$1 = new bsz(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bqv(this.j, () -> this.l, () -> true);
         } else {
            this.n = false;
            brb $$2 = this.d.e();
            this.m = bqz.a;
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
   public brd f() {
      return brd.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(brb $$0) {
      HashSet<bsn> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bsn> $$0) {
      for (bsn $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
