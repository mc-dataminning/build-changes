import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dko extends deu implements dfb {
   public static final MapCodec<dko> a = b(dko::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewf f = ewc.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drx $$0, drx $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return ewc.a();
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!($$3 instanceof btk) || $$3.dq().a(this)) {
         $$3.a($$0, new evm(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azc $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  lj.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayu.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayu.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbp.c) || $$3 instanceof cms) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btk $$5) {
         btk.a $$7 = $$5.eL();
         avv $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      if ($$3 instanceof evw $$4) {
         bsp $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjb;
            if ($$6 || a($$5) && $$3.a(ewc.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewc.a();
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   public static boolean a(bsp $$0) {
      if ($$0.ak().a(awp.h)) {
         return true;
      } else {
         return $$0 instanceof btk ? ((btk)$$0).a(bsw.c).a(cun.pB) : false;
      }
   }

   @Override
   public cuk a(@Nullable cms $$0, dbu $$1, iz $$2, drx $$3) {
      $$1.a($$2, dew.a.n(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, deu.i($$3));
      }

      return new cuk(cun.qB);
   }

   @Override
   public Optional<avv> at_() {
      return Optional.of(avw.dm);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return true;
   }
}
