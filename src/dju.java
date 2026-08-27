import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dju extends dea implements deh {
   public static final MapCodec<dju> a = b(dju::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final evf f = evc.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(drc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drd $$0, drd $$1, it $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected evf f(drd $$0, daf $$1, io $$2) {
      return evc.a();
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!($$3 instanceof bsq) || $$3.dq().a(this)) {
         $$3.a($$0, new eum(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            aym $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ky.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayf.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayf.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.aa().b(dav.c) || $$3 instanceof cly) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(daz $$0, drd $$1, io $$2, brw $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bsq $$5) {
         bsq.a $$7 = $$5.eL();
         avh $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$3 instanceof euw $$4) {
         brw $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cih;
            if ($$6 || a($$5) && $$3.a(evc.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return evc.a();
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.a();
   }

   public static boolean a(brw $$0) {
      if ($$0.ak().a(awa.h)) {
         return true;
      } else {
         return $$0 instanceof bsq ? ((bsq)$$0).a(bsd.c).a(ctt.pB) : false;
      }
   }

   @Override
   public ctq a(@Nullable cly $$0, dba $$1, io $$2, drd $$3) {
      $$1.a($$2, dec.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dea.i($$3));
      }

      return new ctq(ctt.qB);
   }

   @Override
   public Optional<avh> at_() {
      return Optional.of(avi.dm);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return true;
   }
}
