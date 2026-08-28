import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebk<T extends eay> {
   static final Logger a = LogUtils.getLogger();
   final ebg<T> b;
   final eba<T> c;
   final ebd<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ebh<T> f;

   public ebk(Class<T> $$0, ebg<T> $$1) {
      this.c = new eba<>();
      this.d = new ebd<>($$0, $$0x -> this.e.contains($$0x) ? ebl.c : ebl.b);
      this.b = $$1;
      this.f = new ebi<>(this.c, this.d);
   }

   public void a(dfm $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ebl $$1x = $$0x.a(ebl.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::e);
         }
      });
   }

   public void b(dfm $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ebl $$1x = $$0x.a(ebl.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::d);
         }
      });
   }

   public ebh<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kk.c($$0.dw());
      ebc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ebk.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dV() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @baf
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ebc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @baf
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eaz {
      private final T c;
      private long d;
      private ebc<T> e;

      a(final T $$0, final long $$1, final ebc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.dw();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ebl $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ebk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ebk.this.a(this.d, this.e);
            ebc<T> $$3 = ebk.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ebk.this.b.a(this.c);
            if (!this.c.dV()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ebk.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ebk.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(buj.d $$0) {
         if (!this.e.b(this.c)) {
            ebk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ebl $$1 = this.e.c();
         if ($$1.a() || this.c.dV()) {
            ebk.this.b.d(this.c);
         }

         ebk.this.b.b(this.c);
         ebk.this.b.f(this.c);
         ebk.this.c.b(this.c);
         this.c.a(a);
         ebk.this.a(this.d, this.e);
      }
   }
}
