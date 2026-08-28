import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlt extends dfy implements dgf {
   public static final MapCodec<dlt> a = b(dlt::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final exv f = exs.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0, dtc $$1, ji $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected exv f(dtc $$0, dcc $$1, jd $$2) {
      return exs.a();
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!($$3 instanceof btn) || $$3.dp().a(this)) {
         $$3.a($$0, new exc(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ayw $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.dt() || $$3.af != $$3.dz();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lm.aK,
                  $$3.dt(),
                  (double)($$2.v() + 1),
                  $$3.dz(),
                  (double)(ayo.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayo.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bR() && ($$1.ab().b(dcs.c) || $$3 instanceof cmx) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btn $$5) {
         btn.a $$7 = $$5.eH();
         avo $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected exv b(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      if ($$3 instanceof exm $$4) {
         bsr $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjg;
            if ($$6 || a($$5) && $$3.a(exs.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return exs.a();
   }

   @Override
   protected exv c(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return exs.a();
   }

   public static boolean a(bsr $$0) {
      if ($$0.am().a(awi.h)) {
         return true;
      } else {
         return $$0 instanceof btn ? ((btn)$$0).a(bsy.c).a(cut.pB) : false;
      }
   }

   @Override
   public cuq a(@Nullable cmx $$0, dcx $$1, jd $$2, dtc $$3) {
      $$1.a($$2, dga.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfy.i($$3));
      }

      return new cuq(cut.qB);
   }

   @Override
   public Optional<avo> aw_() {
      return Optional.of(avp.dm);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return true;
   }
}
