import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddt extends dek {
   public static final dsv a = diu.aE;
   public static final dss b = dsr.r;

   protected ddt(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddt> a();

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqt.c;
      }
   }

   protected abstract void a(dbx var1, iz var2, cmw var3);

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof dou) {
            if ($$1 instanceof are) {
               bqp.a($$1, $$2, (dou)$$5);
               ((dou)$$5).a((are)$$1, evq.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dpg> dph<T> a(dbx $$0, dpi<T> $$1, dpi<? extends dou> $$2) {
      return $$0.B ? null : a($$1, $$2, dou::a);
   }
}
