import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfv extends dac implements daj {
   public static final MapCodec<dfv> a = b(dfv::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eqm f = eqj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dna.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dnb $$0, dnb $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected eqm f(dnb $$0, cwh $$1, ib $$2) {
      return eqj.a();
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!($$3 instanceof bpp) || $$3.dn().a(this)) {
         $$3.a($$0, new ept(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            axd $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kc.aI,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(aww.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aww.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(cwx.c) || $$3 instanceof ciu) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bpp $$5) {
         bpp.a $$7 = $$5.eI();
         atx $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      if ($$3 instanceof eqd $$4) {
         box $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cfd;
            if ($$6 || a($$5) && $$3.a(eqj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return eqj.a();
   }

   @Override
   protected eqm c(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return eqj.a();
   }

   public static boolean a(box $$0) {
      if ($$0.ai().a(auq.h)) {
         return true;
      } else {
         return $$0 instanceof bpp ? ((bpp)$$0).d(bpe.c).a(cqp.pA) : false;
      }
   }

   @Override
   public cqm a(@Nullable ciu $$0, cxc $$1, ib $$2, dnb $$3) {
      $$1.a($$2, dae.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dac.i($$3));
      }

      return new cqm(cqp.qA);
   }

   @Override
   public Optional<atx> av_() {
      return Optional.of(aty.dl);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return true;
   }
}
