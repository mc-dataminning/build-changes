import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqt extends dku implements dlc {
   public static final MapCodec<dqt> a = b(dqt::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fdo f = fdl.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   public dqt(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dym $$0, dym $$1, jo $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!($$3 instanceof bwr) || $$3.dw().a(this)) {
         $$3.a($$0, new fcu(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azs $$4 = $$1.C_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lv.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azk.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if ($$1 instanceof arn $$6 && $$3.bY() && ($$6.O().c(dhl.c) || $$3 instanceof cqi) && $$3.c($$6, $$2)) {
         $$1.b($$2, false);
      }
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bwr $$5) {
         bwr.a $$7 = $$5.eN();
         awj $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      if ($$3 instanceof fde $$4) {
         bvs $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cmm;
            if ($$6 || a($$5) && $$3.a(fdl.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fdl.a();
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   public static boolean a(bvs $$0) {
      if ($$0.aq().a(axd.h)) {
         return true;
      } else {
         return $$0 instanceof bwr ? ((bwr)$$0).a(bwc.c).a(cyc.qk) : false;
      }
   }

   @Override
   public cxy a(@Nullable bwr $$0, dhq $$1, jj $$2, dym $$3) {
      $$1.a($$2, dkw.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dku.j($$3));
      }

      return new cxy(cyc.rm);
   }

   @Override
   public Optional<awj> ao_() {
      return Optional.of(awk.dn);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return true;
   }
}
