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

public class bpk implements bpm {
   public static final int a = 10;
   @Nullable
   private static Consumer<Path> b = null;
   private final Map<bpf, List<bpr>> c = new Object2ObjectOpenHashMap();
   private final bns d;
   private final Executor e;
   private final bpq f;
   private final Consumer<bnx> g;
   private final Consumer<Path> h;
   private final bph i;
   private final LongSupplier j;
   private final long k;
   private int l;
   private bnw m;
   private volatile boolean n;
   private Set<bpf> o = ImmutableSet.of();

   private bpk(bph $$0, LongSupplier $$1, Executor $$2, bpq $$3, Consumer<bnx> $$4, Consumer<Path> $$5) {
      this.i = $$0;
      this.j = $$1;
      this.d = new bns($$1, () -> this.l);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = b == null ? $$5 : $$5.andThen(b);
      this.k = $$1.getAsLong() + TimeUnit.NANOSECONDS.convert(10L, TimeUnit.SECONDS);
      this.m = new bnr(this.j, () -> this.l, false);
      this.d.c();
   }

   public static bpk a(bph $$0, LongSupplier $$1, Executor $$2, bpq $$3, Consumer<bnx> $$4, Consumer<Path> $$5) {
      return new bpk($$0, $$1, $$2, $$3, $$4, $$5);
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
         this.m = bnv.a;
         this.g.accept(bnt.a);
         this.a(this.o);
      }
   }

   @Override
   public void c() {
      this.g();
      this.o = this.i.a(() -> this.m);

      for (bpf $$0 : this.o) {
         $$0.a();
      }

      this.l++;
   }

   @Override
   public void d() {
      this.g();
      if (this.l != 0) {
         for (bpf $$0 : this.o) {
            $$0.a(this.l);
            if ($$0.g()) {
               bpr $$1 = new bpr(Instant.now(), this.l, this.m.d());
               this.c.computeIfAbsent($$0, $$0x -> Lists.newArrayList()).add($$1);
            }
         }

         if (!this.n && this.j.getAsLong() <= this.k) {
            this.m = new bnr(this.j, () -> this.l, false);
         } else {
            this.n = false;
            bnx $$2 = this.d.e();
            this.m = bnv.a;
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
   public bny f() {
      return bny.a(this.d.d(), this.m);
   }

   private void g() {
      if (!this.e()) {
         throw new IllegalStateException("Not started!");
      }
   }

   private void a(bnx $$0) {
      HashSet<bpf> $$1 = new HashSet<>(this.o);
      this.e.execute(() -> {
         Path $$2 = this.f.a($$1, this.c, $$0);
         this.a($$1);
         this.h.accept($$2);
      });
   }

   private void a(Collection<bpf> $$0) {
      for (bpf $$1 : $$0) {
         $$1.b();
      }

      this.c.clear();
      this.d.b();
   }

   public static void a(Consumer<Path> $$0) {
      b = $$0;
   }
}
