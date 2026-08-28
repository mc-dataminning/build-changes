import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqb extends dke implements dkm {
   public static final MapCodec<dqb> a = b(dqb::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fcm f = fcj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxn $$0, dxn $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!($$3 instanceof bwb) || $$3.dw().a(this)) {
         $$3.a($$0, new fbs(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            bam $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ls.aL,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(bae.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(bae.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof ash $$6) {
         if ($$3.bY() && ($$6.N().b(dgw.c) || $$3 instanceof cps) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bwb $$5) {
         bwb.a $$7 = $$5.eL();
         axe $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      if ($$3 instanceof fcc $$4) {
         bvf $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clv;
            if ($$6 || a($$5) && $$3.a(fcj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fcj.a();
   }

   @Override
   protected fcm c(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return fcj.a();
   }

   public static boolean a(bvf $$0) {
      if ($$0.aq().a(axy.h)) {
         return true;
      } else {
         return $$0 instanceof bwb ? ((bwb)$$0).a(bvn.c).a(cxo.pX) : false;
      }
   }

   @Override
   public cxk a(@Nullable cps $$0, dhb $$1, jh $$2, dxn $$3) {
      $$1.a($$2, dkg.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, dke.j($$3));
      }

      return new cxk(cxo.qZ);
   }

   @Override
   public Optional<axe> at_() {
      return Optional.of(axf.dm);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return true;
   }
}
