import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqi extends dkl implements dkt {
   public static final MapCodec<dqi> a = b(dqi::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fcr f = fco.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dxu $$0, dxu $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (!($$3 instanceof bwf) || $$3.dw().a(this)) {
         $$3.a($$0, new fbx(0.9F, 1.5, 0.9F));
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
         if ($$3.bY() && ($$6.N().b(dhd.c) || $$3 instanceof cpw) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bwf $$5) {
         bwf.a $$7 = $$5.eL();
         axe $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      if ($$3 instanceof fch $$4) {
         bvj $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clz;
            if ($$6 || a($$5) && $$3.a(fco.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fco.a();
   }

   @Override
   protected fcr c(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return fco.a();
   }

   public static boolean a(bvj $$0) {
      if ($$0.aq().a(axy.h)) {
         return true;
      } else {
         return $$0 instanceof bwf ? ((bwf)$$0).a(bvr.c).a(cxs.pX) : false;
      }
   }

   @Override
   public cxo a(@Nullable cpw $$0, dhi $$1, jh $$2, dxu $$3) {
      $$1.a($$2, dkn.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, dkl.j($$3));
      }

      return new cxo(cxs.qZ);
   }

   @Override
   public Optional<axe> at_() {
      return Optional.of(axf.dn);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return true;
   }
}
