import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcr extends cwy implements cxf {
   public static final MapCodec<dcr> a = b(dcr::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final emv f = ems.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcr(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djp $$0, djp $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return ems.a();
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!($$3 instanceof bmo) || $$3.dm().a(this)) {
         $$3.a($$0, new emc(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            auw $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jx.aH,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(aup.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aup.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(ctt.c) || $$3 instanceof cfq) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bmo $$5) {
         bmo.a $$7 = $$5.eG();
         ars $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      if ($$3 instanceof emm $$4) {
         blw $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cca;
            if ($$6 || a($$5) && $$3.a(ems.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ems.a();
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.a();
   }

   public static boolean a(blw $$0) {
      if ($$0.ai().a(asl.h)) {
         return true;
      } else {
         return $$0 instanceof bmo ? ((bmo)$$0).c(bmd.c).a(cnj.pA) : false;
      }
   }

   @Override
   public cng a(@Nullable cfq $$0, cty $$1, hx $$2, djp $$3) {
      $$1.a($$2, cxa.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cwy.i($$3));
      }

      return new cng(cnj.qA);
   }

   @Override
   public Optional<ars> ax_() {
      return Optional.of(art.dd);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return true;
   }
}
