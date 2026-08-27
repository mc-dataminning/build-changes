import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class day extends cvf implements cvm {
   public static final MapCodec<day> a = b(day::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eks f = ekp.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<day> a() {
      return a;
   }

   public day(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return ekp.a();
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!($$3 instanceof bll) || $$3.do().a(this)) {
         $$3.a($$0, new ejz(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            atw $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.ds() || $$3.ae != $$3.dy();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jw.aF,
                  $$3.ds(),
                  (double)($$2.v() + 1),
                  $$3.dy(),
                  (double)(atq.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(atq.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Y().b(csb.c) || $$3 instanceof cdz) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bll $$5) {
         bll.a $$7 = $$5.eH();
         aqu $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$3 instanceof ekj $$4) {
         bkv $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof car;
            if ($$6 || a($$5) && $$3.a(ekp.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ekp.a();
   }

   @Override
   public eks c(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.a();
   }

   public static boolean a(bkv $$0) {
      if ($$0.ai().a(arn.h)) {
         return true;
      } else {
         return $$0 instanceof bll ? ((bll)$$0).c(bla.c).a(clr.py) : false;
      }
   }

   @Override
   public clo a(@Nullable cdz $$0, csg $$1, hx $$2, dhn $$3) {
      $$1.a($$2, cvh.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cvf.i($$3));
      }

      return new clo(clr.qy);
   }

   @Override
   public Optional<aqu> av_() {
      return Optional.of(aqv.cF);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return true;
   }
}
