import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnv extends dfi implements dje {
   public static final MapCodec<dnv> a = b(dnv::new);
   public static final dty<duk> b = dtq.bj;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   protected dnv(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, duk.b));
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drv($$0, $$1);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      dqf $$5 = $$1.c_($$2);
      if ($$5 instanceof drv) {
         return ((drv)$$5).a($$3) ? bqq.a($$1.B) : bqq.e;
      } else {
         return bqq.e;
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dqf $$5 = $$0.c_($$1);
            if ($$5 instanceof drv) {
               ((drv)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$1 instanceof aqt) {
         if ($$1.c_($$2) instanceof drv $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.D();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aqt)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aqt $$0, drv $$1) {
      switch ($$1.v()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.B();
         case d:
      }
   }
}
