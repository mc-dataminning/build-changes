import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dia extends dch implements dco {
   public static final MapCodec<dia> a = b(dia::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final etc f = esz.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected etc f(dpi $$0, cym $$1, id $$2) {
      return esz.a();
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!($$3 instanceof bqt) || $$3.dn().a(this)) {
         $$3.a($$0, new esj(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            axt $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  kn.aI,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(axm.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(axm.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.aa().b(czc.c) || $$3 instanceof cka) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bqt $$5) {
         bqt.a $$7 = $$5.eI();
         aun $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$3 instanceof est $$4) {
         bqa $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cgj;
            if ($$6 || a($$5) && $$3.a(esz.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return esz.a();
   }

   @Override
   protected etc c(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }

   public static boolean a(bqa $$0) {
      if ($$0.ai().a(avh.h)) {
         return true;
      } else {
         return $$0 instanceof bqt ? ((bqt)$$0).d(bqh.c).a(crv.pA) : false;
      }
   }

   @Override
   public crs a(@Nullable cka $$0, czh $$1, id $$2, dpi $$3) {
      $$1.a($$2, dcj.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dch.i($$3));
      }

      return new crs(crv.qA);
   }

   @Override
   public Optional<aun> as_() {
      return Optional.of(auo.dm);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return true;
   }
}
