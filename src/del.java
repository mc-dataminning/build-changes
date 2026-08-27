import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class del extends cys implements cyz {
   public static final MapCodec<del> a = b(del::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eos f = eop.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public del(dli.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dlj $$0, dlj $$1, ie $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected eos f(dlj $$0, cux $$1, hz $$2) {
      return eop.a();
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!($$3 instanceof boi) || $$3.dn().a(this)) {
         $$3.a($$0, new enz(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            awp $$4 = $$1.F_();
            boolean $$5 = $$3.ab != $$3.dr() || $$3.ad != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jz.aH,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(awi.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(awi.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(cvn.c) || $$3 instanceof chl) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof boi $$5) {
         boi.a $$7 = $$5.eH();
         atk $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$3 instanceof eoj $$4) {
         bnq $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cdv;
            if ($$6 || a($$5) && $$3.a(eop.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return eop.a();
   }

   @Override
   protected eos c(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return eop.a();
   }

   public static boolean a(bnq $$0) {
      if ($$0.ai().a(aud.h)) {
         return true;
      } else {
         return $$0 instanceof boi ? ((boi)$$0).c(bnx.c).a(cpg.pA) : false;
      }
   }

   @Override
   public cpd a(@Nullable chl $$0, cvs $$1, hz $$2, dlj $$3) {
      $$1.a($$2, cyu.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cys.i($$3));
      }

      return new cpd(cpg.qA);
   }

   @Override
   public Optional<atk> ax_() {
      return Optional.of(atl.de);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return true;
   }
}
