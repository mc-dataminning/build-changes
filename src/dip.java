import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dip extends dcv implements ddc {
   public static final MapCodec<dip> a = b(dip::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ety f = etv.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return etv.a();
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!($$3 instanceof bre) || $$3.do().a(this)) {
         $$3.a($$0, new etf(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayd $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.ds() || $$3.af != $$3.dy();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kw.aH,
                  $$3.ds(),
                  (double)($$2.v() + 1),
                  $$3.dy(),
                  (double)(axw.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(axw.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bO() && ($$1.aa().b(czq.c) || $$3 instanceof ckl) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bre $$5) {
         bre.a $$7 = $$5.eJ();
         auy $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$3 instanceof etp $$4) {
         bql $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cgu;
            if ($$6 || a($$5) && $$3.a(etv.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return etv.a();
   }

   @Override
   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.a();
   }

   public static boolean a(bql $$0) {
      if ($$0.ai().a(avr.h)) {
         return true;
      } else {
         return $$0 instanceof bre ? ((bre)$$0).d(bqs.c).a(csg.pB) : false;
      }
   }

   @Override
   public csd a(@Nullable ckl $$0, czv $$1, im $$2, dpy $$3) {
      $$1.a($$2, dcx.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dcv.i($$3));
      }

      return new csd(csg.qB);
   }

   @Override
   public Optional<auy> as_() {
      return Optional.of(auz.dm);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return true;
   }
}
