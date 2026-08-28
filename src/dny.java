import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dny extends die implements dil {
   public static final MapCodec<dny> a = b(dny::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fah f = fae.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dvj $$0, dvj $$1, jm $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!($$3 instanceof bva) || $$3.dy().a(this)) {
         $$3.a($$0, new ezn(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azs $$4 = $$1.E_();
            boolean $$5 = $$3.ab != $$3.dC() || $$3.ad != $$3.dI();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lr.aK,
                  $$3.dC(),
                  (double)($$2.v() + 1),
                  $$3.dI(),
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.C) {
         if ($$3.bZ() && ($$1.ac().b(dex.c) || $$3 instanceof com) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dfb $$0, dvj $$1, jh $$2, bue $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bva $$5) {
         bva.a $$7 = $$5.eP();
         awk $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$3 instanceof ezx $$4) {
         bue $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cku;
            if ($$6 || a($$5) && $$3.a(fae.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fae.a();
   }

   @Override
   protected fah c(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return fae.a();
   }

   public static boolean a(bue $$0) {
      if ($$0.ar().a(axe.h)) {
         return true;
      } else {
         return $$0 instanceof bva ? ((bva)$$0).a(bum.c).a(cwf.pC) : false;
      }
   }

   @Override
   public cwb a(@Nullable com $$0, dfc $$1, jh $$2, dvj $$3) {
      $$1.a($$2, dig.a.m(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, die.j($$3));
      }

      return new cwb(cwf.qC);
   }

   @Override
   public Optional<awk> at_() {
      return Optional.of(awl.dm);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return true;
   }
}
