import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsn extends dmm implements dmu {
   public static final MapCodec<dsn> a = b(dsn::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ffr f = ffo.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(ean.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eao $$0, eao $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!($$3 instanceof bxj) || $$3.dv().a(this)) {
         $$3.a($$0, new fex(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azv $$5 = $$1.C_();
            boolean $$6 = $$3.aa != $$3.dz() || $$3.ac != $$3.dF();
            if ($$6 && $$5.h()) {
               $$1.a(
                  ly.aN,
                  $$3.dz(),
                  (double)($$2.v() + 1),
                  $$3.dF(),
                  (double)(azm.b($$5, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azm.b($$5, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      iv $$7 = $$2.j();
      $$4.a(bxc.d, $$2x -> {
         if ($$1 instanceof arq $$3x && $$2x.bW() && ($$3x.O().c(djd.d) || $$2x instanceof crj) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(bxc.a);
      $$4.a(bxc.d);
   }

   @Override
   public void a(djh $$0, eao $$1, iv $$2, bwi $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxj $$5) {
         bxj.a $$7 = $$5.eN();
         awm $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, bwi $$3) {
      ffr $$4 = this.b($$0, $$1, $$2, ffc.a($$3));
      return $$4.c() ? ffo.b() : $$4;
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      if (!$$3.c() && $$3 instanceof ffh $$4) {
         bwi $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cnn;
            if ($$6 || a($$5) && $$3.a(ffo.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ffo.a();
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.a();
   }

   public static boolean a(bwi $$0) {
      if ($$0.an().a(axf.h)) {
         return true;
      } else {
         return $$0 instanceof bxj ? ((bxj)$$0).a(bws.c).a(czo.qp) : false;
      }
   }

   @Override
   public czk a(@Nullable bxj $$0, dji $$1, iv $$2, eao $$3) {
      $$1.a($$2, dmo.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dmm.j($$3));
      }

      return new czk(czo.rr);
   }

   @Override
   public Optional<awm> ap_() {
      return Optional.of(awn.dn);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return true;
   }
}
