import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dod extends dij implements diq {
   public static final MapCodec<dod> a = b(dod::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fal f = fai.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvo $$0, dvo $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!($$3 instanceof bve) || $$3.dz().a(this)) {
         $$3.a($$0, new ezr(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azv $$4 = $$1.E_();
            boolean $$5 = $$3.ab != $$3.dD() || $$3.ad != $$3.dJ();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ls.aK,
                  $$3.dD(),
                  (double)($$2.v() + 1),
                  $$3.dJ(),
                  (double)(azn.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azn.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.C) {
         if ($$3.ca() && ($$1.ac().b(dfb.c) || $$3 instanceof cor) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bve $$5) {
         bve.a $$7 = $$5.eQ();
         awn $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if ($$3 instanceof fab $$4) {
         bui $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cky;
            if ($$6 || a($$5) && $$3.a(fai.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fai.a();
   }

   @Override
   protected fal c(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return fai.a();
   }

   public static boolean a(bui $$0) {
      if ($$0.ar().a(axh.h)) {
         return true;
      } else {
         return $$0 instanceof bve ? ((bve)$$0).a(buq.c).a(cwj.pC) : false;
      }
   }

   @Override
   public cwf a(@Nullable cor $$0, dfg $$1, jh $$2, dvo $$3) {
      $$1.a($$2, dil.a.m(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, dij.j($$3));
      }

      return new cwf(cwj.qC);
   }

   @Override
   public Optional<awn> at_() {
      return Optional.of(awo.dm);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return true;
   }
}
