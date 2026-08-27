import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhr extends dby implements dcf {
   public static final MapCodec<dhr> a = b(dhr::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final est f = esq.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(doy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(doz $$0, doz $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected est f(doz $$0, cyd $$1, ib $$2) {
      return esq.a();
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!($$3 instanceof bqo) || $$3.dn().a(this)) {
         $$3.a($$0, new esa(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            axr $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kl.aI,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(axk.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(axk.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.aa().b(cyt.c) || $$3 instanceof cjt) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bqo $$5) {
         bqo.a $$7 = $$5.eI();
         aul $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if ($$3 instanceof esk $$4) {
         bpv $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cgc;
            if ($$6 || a($$5) && $$3.a(esq.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return esq.a();
   }

   @Override
   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.a();
   }

   public static boolean a(bpv $$0) {
      if ($$0.ai().a(avf.h)) {
         return true;
      } else {
         return $$0 instanceof bqo ? ((bqo)$$0).d(bqc.c).a(crm.pA) : false;
      }
   }

   @Override
   public crj a(@Nullable cjt $$0, cyy $$1, ib $$2, doz $$3) {
      $$1.a($$2, dca.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dby.i($$3));
      }

      return new crj(crm.qA);
   }

   @Override
   public Optional<aul> at_() {
      return Optional.of(aum.dm);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return true;
   }
}
