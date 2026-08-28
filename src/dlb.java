import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlb extends dfh implements dfo {
   public static final MapCodec<dlb> a = b(dlb::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewy f = ewv.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsk $$0, dsk $$1, jf $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return ewv.a();
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!($$3 instanceof btb) || $$3.dr().a(this)) {
         $$3.a($$0, new ewf(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayo $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.dv() || $$3.af != $$3.dB();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lj.aK,
                  $$3.dv(),
                  (double)($$2.v() + 1),
                  $$3.dB(),
                  (double)(ayg.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayg.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bR() && ($$1.ab().b(dcb.c) || $$3 instanceof cmk) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btb $$5) {
         btb.a $$7 = $$5.eI();
         avg $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$3 instanceof ewp $$4) {
         bsg $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cit;
            if ($$6 || a($$5) && $$3.a(ewv.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewv.a();
   }

   @Override
   protected ewy c(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.a();
   }

   public static boolean a(bsg $$0) {
      if ($$0.al().a(awa.h)) {
         return true;
      } else {
         return $$0 instanceof btb ? ((btb)$$0).a(bsn.c).a(cuf.pB) : false;
      }
   }

   @Override
   public cuc a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      $$1.a($$2, dfj.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfh.i($$3));
      }

      return new cuc(cuf.qB);
   }

   @Override
   public Optional<avg> as_() {
      return Optional.of(avh.dm);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return true;
   }
}
