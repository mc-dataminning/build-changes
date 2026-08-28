import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebl<T extends eaz> {
   static final Logger a = LogUtils.getLogger();
   final ebh<T> b;
   final ebb<T> c;
   final ebe<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ebi<T> f;

   public ebl(Class<T> $$0, ebh<T> $$1) {
      this.c = new ebb<>();
      this.d = new ebe<>($$0, $$0x -> this.e.contains($$0x) ? ebm.c : ebm.b);
      this.b = $$1;
      this.f = new ebj<>(this.c, this.d);
   }

   public void a(dfn $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ebm $$1x = $$0x.a(ebm.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dfn $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ebm $$1x = $$0x.a(ebm.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ebi<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kk.c($$0.dv());
      ebd<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ebl.a($$0, $$1, $$2));
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

   void a(long $$0, ebd<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bag
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eba {
      private final T c;
      private long d;
      private ebd<T> e;

      a(final T $$0, final long $$1, final ebd<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.dv();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ebm $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ebl.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ebl.this.a(this.d, this.e);
            ebd<T> $$3 = ebl.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ebl.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ebl.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ebl.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(buk.d $$0) {
         if (!this.e.b(this.c)) {
            ebl.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ebm $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            ebl.this.b.d(this.c);
         }

         ebl.this.b.b(this.c);
         ebl.this.b.f(this.c);
         ebl.this.c.b(this.c);
         this.c.a(a);
         ebl.this.a(this.d, this.e);
      }
   }
}
