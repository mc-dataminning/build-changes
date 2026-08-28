import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ecj<T extends ebx> {
   static final Logger a = LogUtils.getLogger();
   final ecf<T> b;
   final ebz<T> c;
   final ecc<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ecg<T> f;

   public ecj(Class<T> $$0, ecf<T> $$1) {
      this.c = new ebz<>();
      this.d = new ecc<>($$0, $$0x -> this.e.contains($$0x) ? eck.c : eck.b);
      this.b = $$1;
      this.f = new ech<>(this.c, this.d);
   }

   public void a(dgn $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eck $$1x = $$0x.a(eck.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dgn $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eck $$1x = $$0x.a(eck.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ecg<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dv());
      ecb<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ecj.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bbl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ecb<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bbl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eby {
      private final T c;
      private long d;
      private ecb<T> e;

      a(final T $$0, final long $$1, final ecb<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dv();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eck $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ecj.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            ecj.this.a(this.d, this.e);
            ecb<T> $$3 = ecj.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ecj.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ecj.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ecj.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bvj.c $$0) {
         if (!this.e.b(this.c)) {
            ecj.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eck $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            ecj.this.b.d(this.c);
         }

         ecj.this.b.b(this.c);
         ecj.this.b.f(this.c);
         ecj.this.c.b(this.c);
         this.c.a(a);
         ecj.this.a(this.d, this.e);
      }
   }
}
