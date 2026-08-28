import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dne extends dhj implements dhq {
   public static final MapCodec<dne> a = b(dne::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ezm f = ezj.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dun.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(duo $$0, duo $$1, jj $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!($$3 instanceof buk) || $$3.dt().a(this)) {
         $$3.a($$0, new eys(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azl $$4 = $$1.C_();
            boolean $$5 = $$3.ab != $$3.dx() || $$3.ad != $$3.dD();
            if ($$5 && $$4.h()) {
               $$1.a(
                  ln.aK,
                  $$3.dx(),
                  (double)($$2.v() + 1),
                  $$3.dD(),
                  (double)(azd.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(azd.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.q(true);
      if (!$$1.B) {
         if ($$3.bV() && ($$1.ac().b(dec.c) || $$3 instanceof cnu) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof buk $$5) {
         buk.a $$7 = $$5.eK();
         awd $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if ($$3 instanceof ezc $$4) {
         bto $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.aa > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof ckd;
            if ($$6 || a($$5) && $$3.a(ezj.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ezj.a();
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   public static boolean a(bto $$0) {
      if ($$0.ao().a(awx.h)) {
         return true;
      } else {
         return $$0 instanceof buk ? ((buk)$$0).a(btw.c).a(cvt.pC) : false;
      }
   }

   @Override
   public cvp a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      $$1.a($$2, dhl.a.o(), 11);
      if (!$$1.w_()) {
         $$1.c(2001, $$2, dhj.j($$3));
      }

      return new cvp(cvt.qC);
   }

   @Override
   public Optional<awd> at_() {
      return Optional.of(awe.dm);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return true;
   }
}
