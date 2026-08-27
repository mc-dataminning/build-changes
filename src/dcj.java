import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcj extends cwq implements cwx {
   public static final MapCodec<dcj> a = b(dcj::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final emm f = emj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcj(djg.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(djh $$0, djh $$1, ic $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public emm f(djh $$0, csv $$1, hx $$2) {
      return emj.a();
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!($$3 instanceof bml) || $$3.dn().a(this)) {
         $$3.a($$0, new elt(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            auv $$4 = $$1.F_();
            boolean $$5 = $$3.ac != $$3.dr() || $$3.ae != $$3.dx();
            if ($$5 && $$4.h()) {
               $$1.a(
                  jx.aH,
                  $$3.dr(),
                  (double)($$2.v() + 1),
                  $$3.dx(),
                  (double)(auo.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(auo.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bN() && ($$1.Z().b(ctl.c) || $$3 instanceof cfi) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, hx $$2, blv $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bml $$5) {
         bml.a $$7 = $$5.eG();
         arr $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      if ($$3 instanceof emd $$4) {
         blv $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cbt;
            if ($$6 || a($$5) && $$3.a(emj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return emj.a();
   }

   @Override
   public emm c(djh $$0, csv $$1, hx $$2, ely $$3) {
      return emj.a();
   }

   public static boolean a(blv $$0) {
      if ($$0.ai().a(ask.h)) {
         return true;
      } else {
         return $$0 instanceof bml ? ((bml)$$0).c(bma.c).a(cnb.py) : false;
      }
   }

   @Override
   public cmy a(@Nullable cfi $$0, ctq $$1, hx $$2, djh $$3) {
      $$1.a($$2, cws.a.o(), 11);
      if (!$$1.y_()) {
         $$1.c(2001, $$2, cwq.i($$3));
      }

      return new cmy(cnb.qy);
   }

   @Override
   public Optional<arr> au_() {
      return Optional.of(ars.cO);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return true;
   }
}
