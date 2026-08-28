import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ecg<T extends ebu> {
   static final Logger a = LogUtils.getLogger();
   final ecc<T> b;
   final ebw<T> c;
   final ebz<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ecd<T> f;

   public ecg(Class<T> $$0, ecc<T> $$1) {
      this.c = new ebw<>();
      this.d = new ebz<>($$0, $$0x -> this.e.contains($$0x) ? ecj.c : ecj.b);
      this.b = $$1;
      this.f = new ece<>(this.c, this.d);
   }

   public void a(dgg $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ecj $$1x = $$0x.a(ecj.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::e);
         }
      });
   }

   public void b(dgg $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ecj $$1x = $$0x.a(ecj.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::d);
         }
      });
   }

   public ecd<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kk.c($$0.du());
      eby<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ecg.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dT() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bag
   public int b() {
      return this.c.b();
   }

   void a(long $$0, eby<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bag
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebv {
      private final T c;
      private long d;
      private eby<T> e;

      a(final T $$0, final long $$1, final eby<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.du();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ecj $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ecg.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ecg.this.a(this.d, this.e);
            eby<T> $$3 = ecg.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ecg.this.b.a(this.c);
            if (!this.c.dT()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ecg.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ecg.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bva.d $$0) {
         if (!this.e.b(this.c)) {
            ecg.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ecj $$1 = this.e.c();
         if ($$1.a() || this.c.dT()) {
            ecg.this.b.d(this.c);
         }

         ecg.this.b.b(this.c);
         ecg.this.b.f(this.c);
         ecg.this.c.b(this.c);
         this.c.a(a);
         ecg.this.a(this.d, this.e);
      }
   }
}
