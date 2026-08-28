import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqd extends dke implements dkm {
   public static final MapCodec<dqd> a = b(dqd::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fcr f = fco.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   public dqd(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxq $$0, dxq $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!($$3 instanceof bvy) || $$3.dv().a(this)) {
         $$3.a($$0, new fbx(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azh $$4 = $$1.C_();
            boolean $$5 = $$3.aa != $$3.dz() || $$3.ac != $$3.dF();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lt.aN,
                  $$3.dz(),
                  (double)($$2.v() + 1),
                  $$3.dF(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if ($$1 instanceof ard $$6) {
         if ($$3.bX() && ($$6.O().b(dgv.c) || $$3 instanceof cpr) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvy $$5) {
         bvy.a $$7 = $$5.eM();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      if ($$3 instanceof fch $$4) {
         bva $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clv;
            if ($$6 || a($$5) && $$3.a(fco.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fco.a();
   }

   @Override
   protected fcr c(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return fco.a();
   }

   public static boolean a(bva $$0) {
      if ($$0.aq().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof bvy ? ((bvy)$$0).a(bvj.c).a(cxl.qi) : false;
      }
   }

   @Override
   public cxh a(@Nullable bvy $$0, dha $$1, ji $$2, dxq $$3) {
      $$1.a($$2, dkg.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dke.j($$3));
      }

      return new cxh(cxl.rk);
   }

   @Override
   public Optional<avz> as_() {
      return Optional.of(awa.dn);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return true;
   }
}
