import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpm extends djn implements djv {
   public static final MapCodec<dpm> a = b(dpm::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fbv f = fbs.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwy $$0, dwy $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!($$3 instanceof bvi) || $$3.dw().a(this)) {
         $$3.a($$0, new fbb(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azh $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lt.aM,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof ard $$6) {
         if ($$3.bY() && ($$6.O().b(dgf.c) || $$3 instanceof coy) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvi $$5) {
         bvi.a $$7 = $$5.eM();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$3 instanceof fbl $$4) {
         bum $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof clc;
            if ($$6 || a($$5) && $$3.a(fbs.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fbs.a();
   }

   @Override
   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.a();
   }

   public static boolean a(bum $$0) {
      if ($$0.aq().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof bvi ? ((bvi)$$0).a(buu.c).a(cwu.qg) : false;
      }
   }

   @Override
   public cwq a(@Nullable coy $$0, dgk $$1, ji $$2, dwy $$3) {
      $$1.a($$2, djp.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, djn.j($$3));
      }

      return new cwq(cwu.ri);
   }

   @Override
   public Optional<avz> as_() {
      return Optional.of(awa.dn);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return true;
   }
}
