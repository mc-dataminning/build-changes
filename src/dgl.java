import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgl extends cya implements dbw {
   public static final MapCodec<dgl> a = b(dgl::new);
   public static final dmd<dmp> b = dlv.bj;

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   protected dgl(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmp.b));
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkh($$0, $$1);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      dit $$5 = $$1.c_($$2);
      if ($$5 instanceof dkh) {
         return ((dkh)$$5).a($$3) ? blu.a($$1.B) : blu.d;
      } else {
         return blu.d;
      }
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dit $$5 = $$0.c_($$1);
            if ($$5 instanceof dkh) {
               ((dkh)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if ($$1 instanceof aov) {
         if ($$1.c_($$2) instanceof dkh $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.F();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aov)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aov $$0, dkh $$1) {
      switch ($$1.x()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.D();
         case d:
      }
   }
}
