import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlr extends dfw implements dgd {
   public static final MapCodec<dlr> a = b(dlr::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final exp f = exm.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dta $$0, dta $$1, ji $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected exp f(dta $$0, dca $$1, jd $$2) {
      return exm.a();
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!($$3 instanceof btl) || $$3.dr().a(this)) {
         $$3.a($$0, new eww(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayv $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.dv() || $$3.af != $$3.dB();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lm.aK,
                  $$3.dv(),
                  (double)($$2.v() + 1),
                  $$3.dB(),
                  (double)(ayn.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayn.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bR() && ($$1.ab().b(dcq.c) || $$3 instanceof cmv) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.d(false);
      }
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btl $$5) {
         btl.a $$7 = $$5.eI();
         avn $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$3 instanceof exg $$4) {
         bsq $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cje;
            if ($$6 || a($$5) && $$3.a(exm.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return exm.a();
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   public static boolean a(bsq $$0) {
      if ($$0.am().a(awh.h)) {
         return true;
      } else {
         return $$0 instanceof btl ? ((btl)$$0).a(bsx.c).a(cur.pB) : false;
      }
   }

   @Override
   public cuo a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      $$1.a($$2, dfy.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfw.i($$3));
      }

      return new cuo(cur.qB);
   }

   @Override
   public Optional<avn> as_() {
      return Optional.of(avo.dm);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return true;
   }
}
