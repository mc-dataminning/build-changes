import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dku extends dfa implements dfh {
   public static final MapCodec<dku> a = b(dku::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewl f = ewi.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsd $$0, dsd $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewl f(dsd $$0, dbf $$1, iz $$2) {
      return ewi.a();
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!($$3 instanceof btq) || $$3.dq().a(this)) {
         $$3.a($$0, new evs(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azh $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  li.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayz.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbv.c) || $$3 instanceof cmy) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btq $$5) {
         btq.a $$7 = $$5.eL();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if ($$3 instanceof ewc $$4) {
         bsv $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjh;
            if ($$6 || a($$5) && $$3.a(ewi.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewi.a();
   }

   @Override
   protected ewl c(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.a();
   }

   public static boolean a(bsv $$0) {
      if ($$0.ak().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof btq ? ((btq)$$0).a(btc.c).a(cut.pB) : false;
      }
   }

   @Override
   public cuq a(@Nullable cmy $$0, dca $$1, iz $$2, dsd $$3) {
      $$1.a($$2, dfc.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dfa.i($$3));
      }

      return new cuq(cut.qB);
   }

   @Override
   public Optional<avz> ar_() {
      return Optional.of(awa.dm);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return true;
   }
}
