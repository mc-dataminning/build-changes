import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dci extends cwp implements cww {
   public static final MapCodec<dci> a = b(dci::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final eml f = emi.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dci> a() {
      return a;
   }

   public dci(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djg $$0, djg $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public eml f(djg $$0, csu $$1, hx $$2) {
      return emi.a();
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!($$3 instanceof bmk) || $$3.dn().a(this)) {
         $$3.a($$0, new els(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            auu $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jx.aH,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(aun.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aun.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(ctk.c) || $$3 instanceof cfh) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bmk $$5) {
         bmk.a $$7 = $$5.eG();
         arq $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      if ($$3 instanceof emc $$4) {
         blu $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cbs;
            if ($$6 || a($$5) && $$3.a(emi.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return emi.a();
   }

   @Override
   public eml c(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.a();
   }

   public static boolean a(blu $$0) {
      if ($$0.ai().a(asj.h)) {
         return true;
      } else {
         return $$0 instanceof bmk ? ((bmk)$$0).c(blz.c).a(cna.py) : false;
      }
   }

   @Override
   public cmx a(@Nullable cfh $$0, ctp $$1, hx $$2, djg $$3) {
      $$1.a($$2, cwr.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cwp.i($$3));
      }

      return new cmx(cna.qy);
   }

   @Override
   public Optional<arq> au_() {
      return Optional.of(arr.cO);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return true;
   }
}
