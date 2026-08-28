import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebm<T extends eba> {
   static final Logger a = LogUtils.getLogger();
   final ebi<T> b;
   final ebc<T> c;
   final ebf<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ebj<T> f;

   public ebm(Class<T> $$0, ebi<T> $$1) {
      this.c = new ebc<>();
      this.d = new ebf<>($$0, $$0x -> this.e.contains($$0x) ? ebn.c : ebn.b);
      this.b = $$1;
      this.f = new ebk<>(this.c, this.d);
   }

   public void a(dfo $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ebn $$1x = $$0x.a(ebn.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dfo $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ebn $$1x = $$0x.a(ebn.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ebj<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kk.c($$0.dv());
      ebe<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ebm.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bag
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ebe<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bag
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebb {
      private final T c;
      private long d;
      private ebe<T> e;

      a(final T $$0, final long $$1, final ebe<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.dv();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ebn $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ebm.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ebm.this.a(this.d, this.e);
            ebe<T> $$3 = ebm.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ebm.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ebm.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ebm.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bul.d $$0) {
         if (!this.e.b(this.c)) {
            ebm.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ebn $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            ebm.this.b.d(this.c);
         }

         ebm.this.b.b(this.c);
         ebm.this.b.f(this.c);
         ebm.this.c.b(this.c);
         this.c.a(a);
         ebm.this.a(this.d, this.e);
      }
   }
}
