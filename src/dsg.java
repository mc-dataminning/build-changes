import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dsg extends dmf implements dmn {
   public static final MapCodec<dsg> a = b(dsg::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ffk f = ffh.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(eag.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eah $$0, eah $$1, ja $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!($$3 instanceof bxe) || $$3.dw().a(this)) {
         $$3.a($$0, new feq(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azv $$4 = $$1.C_();
            boolean $$5 = $$3.aa != $$3.dA() || $$3.ac != $$3.dG();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lx.aN,
                  $$3.dA(),
                  (double)($$2.v() + 1),
                  $$3.dG(),
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if ($$1 instanceof arq $$6 && $$3.bY() && ($$6.O().c(diw.d) || $$3 instanceof crc) && $$3.c($$6, $$2)) {
         $$1.b($$2, false);
      }
   }

   @Override
   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      if (!($$4 < 4.0) && $$3 instanceof bxe $$5) {
         bxe.a $$7 = $$5.eO();
         awm $$8 = $$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, bwf $$3) {
      ffk $$4 = this.b($$0, $$1, $$2, fev.a($$3));
      return $$4.c() ? ffh.b() : $$4;
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      if ($$3 instanceof ffa $$4) {
         bwf $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5) {
               return f;
            }

            boolean $$6 = $$5 instanceof cng;
            if ($$6 || a($$5) && $$3.a(ffh.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ffh.a();
   }

   @Override
   protected ffk c(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.a();
   }

   public static boolean a(bwf $$0) {
      if ($$0.aq().a(axf.h)) {
         return true;
      } else {
         return $$0 instanceof bxe ? ((bxe)$$0).a(bwp.c).a(czh.qp) : false;
      }
   }

   @Override
   public czd a(@Nullable bxe $$0, djb $$1, iu $$2, eah $$3) {
      $$1.a($$2, dmh.a.m(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dmf.j($$3));
      }

      return new czd(czh.rr);
   }

   @Override
   public Optional<awm> ap_() {
      return Optional.of(awn.dn);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return true;
   }
}
