import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcc extends cwj implements cwq {
   public static final MapCodec<dcc> a = b(dcc::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final emf f = emc.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dcc(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dja $$0, dja $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public emf f(dja $$0, cso $$1, hx $$2) {
      return emc.a();
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!($$3 instanceof bmf) || $$3.dn().a(this)) {
         $$3.a($$0, new elm(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            aup $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jx.aH,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(aui.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(aui.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(cte.c) || $$3 instanceof cfb) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bmf $$5) {
         bmf.a $$7 = $$5.eG();
         arl $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$3 instanceof elw $$4) {
         blp $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cbn;
            if ($$6 || a($$5) && $$3.a(emc.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return emc.a();
   }

   @Override
   public emf c(dja $$0, cso $$1, hx $$2, elr $$3) {
      return emc.a();
   }

   public static boolean a(blp $$0) {
      if ($$0.ai().a(ase.h)) {
         return true;
      } else {
         return $$0 instanceof bmf ? ((bmf)$$0).c(blu.c).a(cmu.py) : false;
      }
   }

   @Override
   public cmr a(@Nullable cfb $$0, ctj $$1, hx $$2, dja $$3) {
      $$1.a($$2, cwl.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cwj.i($$3));
      }

      return new cmr(cmu.qy);
   }

   @Override
   public Optional<arl> au_() {
      return Optional.of(arm.cO);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return true;
   }
}
