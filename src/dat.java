import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dat extends cva implements cvh {
   public static final MapCodec<dat> a = b(dat::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ekn f = ekk.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dat> a() {
      return a;
   }

   public dat(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public ekn f(dhi $$0, crg $$1, ht $$2) {
      return ekk.a();
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!($$3 instanceof blg) || $$3.do().a(this)) {
         $$3.a($$0, new eju(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ats $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.ds() || $$3.ae != $$3.dy();
            if ($$5 && $$4.h()) {
               $$1.a(
                  js.aF,
                  $$3.ds(),
                  (double)($$2.v() + 1),
                  $$3.dy(),
                  (double)(atm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(atm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Y().b(crw.c) || $$3 instanceof cdu) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ht $$2, bkq $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof blg $$5) {
         blg.a $$7 = $$5.eH();
         aqq $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      if ($$3 instanceof eke $$4) {
         bkq $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cam;
            if ($$6 || a($$5) && $$3.a(ekk.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ekk.a();
   }

   @Override
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.a();
   }

   public static boolean a(bkq $$0) {
      if ($$0.ai().a(arj.h)) {
         return true;
      } else {
         return $$0 instanceof blg ? ((blg)$$0).c(bkv.c).a(clm.py) : false;
      }
   }

   @Override
   public clj a(@Nullable cdu $$0, csb $$1, ht $$2, dhi $$3) {
      $$1.a($$2, cvc.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, cva.i($$3));
      }

      return new clj(clm.qy);
   }

   @Override
   public Optional<aqq> at_() {
      return Optional.of(aqr.cF);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return true;
   }
}
