import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqj extends dkm implements dku {
   public static final MapCodec<dqj> a = b(dqj::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fcs f = fcp.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxv $$0, dxv $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (!($$3 instanceof bwg) || $$3.dx().a(this)) {
         $$3.a($$0, new fby(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            bam $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dB() || $$3.ac != $$3.dH();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ls.aL,
                  $$3.dB(),
                  (double)($$2.v() + 1),
                  $$3.dH(),
                  (double)(bae.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(bae.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof ash $$6) {
         if ($$3.bY() && ($$6.N().b(dhe.c) || $$3 instanceof cpx) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bwg $$5) {
         bwg.a $$7 = $$5.eM();
         axe $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      if ($$3 instanceof fci $$4) {
         bvk $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cma;
            if ($$6 || a($$5) && $$3.a(fcp.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fcp.a();
   }

   @Override
   protected fcs c(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return fcp.a();
   }

   public static boolean a(bvk $$0) {
      if ($$0.aq().a(axy.h)) {
         return true;
      } else {
         return $$0 instanceof bwg ? ((bwg)$$0).a(bvs.c).a(cxt.pX) : false;
      }
   }

   @Override
   public cxp a(@Nullable cpx $$0, dhj $$1, jh $$2, dxv $$3) {
      $$1.a($$2, dko.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, dkm.j($$3));
      }

      return new cxp(cxt.qZ);
   }

   @Override
   public Optional<axe> at_() {
      return Optional.of(axf.dn);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return true;
   }
}
