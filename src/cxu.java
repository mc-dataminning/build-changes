import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxu extends cya {
   public static final MapCodec<cxu> a = b(cxu::new);
   public static final dlz b = dlv.P;
   public static final dlw c = dlv.u;

   @Override
   public MapCodec<cxu> a() {
      return a;
   }

   public cxu(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof dim) {
            $$3.a((dim)$$5);
            $$3.a(atu.ar);
            cfy.a($$3, true);
         }

         return blu.b;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      blq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      dit $$4 = $$1.c_($$2);
      if ($$4 instanceof dim) {
         ((dim)$$4).m();
      }
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dim($$0, $$1);
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      if ($$4.B()) {
         dit $$5 = $$0.c_($$1);
         if ($$5 instanceof dim) {
            ((dim)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      return ckb.a($$1.c_($$2));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
