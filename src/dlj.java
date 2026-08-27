import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlj extends dfc implements dfj {
   public static final MapCodec<dlj> a = b(dlj::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final exn f = exk.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, iw $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected exn g(dtc $$0, dbg $$1, ir $$2) {
      return exk.a();
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!($$3 instanceof bso) || $$3.dv().a(this)) {
         $$3.a($$0, new ewu(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            ayt $$4 = $$1.F_();
            boolean $$5 = $$3.ae != $$3.dz() || $$3.ag != $$3.dF();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lb.aL,
                  $$3.dz(),
                  (double)($$2.v() + 1),
                  $$3.dF(),
                  (double)(aym.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aym.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.C) {
         if ($$3.bV() && ($$1.ab().b(dbw.c) || $$3 instanceof cly) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bso $$5) {
         bso.a $$7 = $$5.eT();
         avn $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      if ($$3 instanceof exe $$4) {
         brv $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ad > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cif;
            if ($$6 || a($$5) && $$3.a(exk.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return exk.a();
   }

   @Override
   protected exn c(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   public static boolean a(brv $$0) {
      if ($$0.ak().a(awh.h)) {
         return true;
      } else {
         return $$0 instanceof bso ? ((bso)$$0).d(bsc.c).a(cuk.qU) : false;
      }
   }

   @Override
   public cuh a(@Nullable cly $$0, dcb $$1, ir $$2, dtc $$3) {
      $$1.a($$2, dfe.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfc.i($$3));
      }

      return new cuh(cuk.rY);
   }

   @Override
   public Optional<avn> as_() {
      return Optional.of(avo.dr);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return true;
   }
}
