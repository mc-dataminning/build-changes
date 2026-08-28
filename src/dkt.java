import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkt extends dez implements dfg {
   public static final MapCodec<dkt> a = b(dkt::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewk f = ewh.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return ewh.a();
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, bsu $$3) {
      if (!($$3 instanceof btp) || $$3.dq().a(this)) {
         $$3.a($$0, new evr(0.9F, 1.5, 0.9F));
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
         if ($$3.bQ() && ($$1.ab().b(dbu.c) || $$3 instanceof cmx) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dby $$0, dsc $$1, iz $$2, bsu $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btp $$5) {
         btp.a $$7 = $$5.eL();
         avz $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if ($$3 instanceof ewb $$4) {
         bsu $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjg;
            if ($$6 || a($$5) && $$3.a(ewh.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewh.a();
   }

   @Override
   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.a();
   }

   public static boolean a(bsu $$0) {
      if ($$0.ak().a(awt.h)) {
         return true;
      } else {
         return $$0 instanceof btp ? ((btp)$$0).a(btb.c).a(cus.pB) : false;
      }
   }

   @Override
   public cup a(@Nullable cmx $$0, dbz $$1, iz $$2, dsc $$3) {
      $$1.a($$2, dfb.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dez.i($$3));
      }

      return new cup(cus.qB);
   }

   @Override
   public Optional<avz> ar_() {
      return Optional.of(awa.dm);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return true;
   }
}
