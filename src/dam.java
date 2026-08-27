import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dam extends cut implements cva {
   public static final MapCodec<dam> a = b(dam::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ekb f = ejy.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dam(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgw $$0, dgw $$1, hx $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public ekb f(dgw $$0, cqy $$1, ht $$2) {
      return ejy.a();
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!($$3 instanceof bky) || $$3.dm().a(this)) {
         $$3.a($$0, new eji(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            ato $$4 = $$1.E_();
            boolean $$5 = $$3.ac != $$3.dq() || $$3.ae != $$3.dw();
            if ($$5 && $$4.h()) {
               $$1.a(
                  js.aF,
                  $$3.dq(),
                  (double)($$2.v() + 1),
                  $$3.dw(),
                  (double)(ati.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ati.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.o(true);
      if (!$$1.B) {
         if ($$3.bM() && ($$1.X().b(cro.c) || $$3 instanceof cdm) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.a_(false);
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bky $$5) {
         bky.a $$7 = $$5.eF();
         aqm $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$3 instanceof ejs $$4) {
         bki $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ab > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cae;
            if ($$6 || a($$5) && $$3.a(ejy.b(), $$2, false) && !$$3.b()) {
               return super.c($$0, $$1, $$2, $$3);
            }
         }
      }

      return ejy.a();
   }

   @Override
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.a();
   }

   public static boolean a(bki $$0) {
      if ($$0.ag().a(arf.h)) {
         return true;
      } else {
         return $$0 instanceof bky ? ((bky)$$0).c(bkn.c).a(cle.oN) : false;
      }
   }

   @Override
   public clb a(@Nullable cdm $$0, crt $$1, ht $$2, dgw $$3) {
      $$1.a($$2, cuv.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, cut.i($$3));
      }

      return new clb(cle.pN);
   }

   @Override
   public Optional<aqm> at_() {
      return Optional.of(aqn.cF);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return true;
   }
}
