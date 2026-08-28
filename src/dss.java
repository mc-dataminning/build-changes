import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dss extends dmr implements dmz {
   public static final MapCodec<dss> a = b(dss::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ffw f = fft.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(eas.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eat $$0, eat $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!($$3 instanceof bxj) || $$3.dv().a(this)) {
         $$3.a($$0, new ffc(0.9F, 1.5, 0.9F));
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
         if ($$1 instanceof arq $$3x && $$2x.bW() && ($$3x.O().c(dji.d) || $$2x instanceof crm) && $$2x.c($$3x, $$7)) {
            $$1.b($$7, false);
         }
      });
      $$4.a(bxc.a);
      $$4.a(bxc.d);
   }

   @Override
   public void a(djm $$0, eat $$1, iv $$2, bwi $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxj $$5) {
         bxj.a $$7 = $$5.eN();
         awm $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, bwi $$3) {
      ffw $$4 = this.b($$0, $$1, $$2, ffh.a($$3));
      return $$4.c() ? fft.b() : $$4;
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      if (!$$3.c() && $$3 instanceof ffm $$4) {
         bwi $$5 = $$4.d();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cnq;
            if ($$6 || a($$5) && $$3.a(fft.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fft.a();
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.a();
   }

   public static boolean a(bwi $$0) {
      if ($$0.an().a(axf.h)) {
         return true;
      } else {
         return $$0 instanceof bxj ? ((bxj)$$0).a(bws.c).a(czr.qp) : false;
      }
   }

   @Override
   public czn a(@Nullable bxj $$0, djn $$1, iv $$2, eat $$3) {
      $$1.a($$2, dmt.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dmr.j($$3));
      }

      return new czn(czr.rr);
   }

   @Override
   public Optional<awm> ap_() {
      return Optional.of(awn.dn);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return true;
   }
}
