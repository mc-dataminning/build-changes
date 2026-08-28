import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpj extends djk implements djs {
   public static final MapCodec<dpj> a = b(dpj::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final fbs f = fbp.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dpj> a() {
      return a;
   }

   public dpj(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwv $$0, dwv $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!($$3 instanceof bvf) || $$3.dx().a(this)) {
         $$3.a($$0, new fay(0.9F, 1.5, 0.9F));
         if ($$1.C) {
            azg $$4 = $$1.H_();
            boolean $$5 = $$3.aa != $$3.dB() || $$3.ac != $$3.dH();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lt.aM,
                  $$3.dB(),
                  (double)($$2.v() + 1),
                  $$3.dH(),
                  (double)(ayy.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayy.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if ($$1 instanceof arc $$6) {
         if ($$3.bY() && ($$6.O().b(dgc.c) || $$3 instanceof cov) && $$3.c($$6, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bvf $$5) {
         bvf.a $$7 = $$5.eM();
         avy $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if ($$3 instanceof fbi $$4) {
         buj $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.Z > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ckz;
            if ($$6 || a($$5) && $$3.a(fbp.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return fbp.a();
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.a();
   }

   public static boolean a(buj $$0) {
      if ($$0.aq().a(aws.h)) {
         return true;
      } else {
         return $$0 instanceof bvf ? ((bvf)$$0).a(bur.c).a(cwr.qg) : false;
      }
   }

   @Override
   public cwn a(@Nullable cov $$0, dgh $$1, ji $$2, dwv $$3) {
      $$1.a($$2, djm.a.m(), 11);
      if (!$$1.B_()) {
         $$1.c(2001, $$2, djk.j($$3));
      }

      return new cwn(cwr.ri);
   }

   @Override
   public Optional<avy> as_() {
      return Optional.of(avz.dn);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return true;
   }
}
