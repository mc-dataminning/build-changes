import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkr extends dex implements dfe {
   public static final MapCodec<dkr> a = b(dkr::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewi f = ewf.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(drz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsa $$0, dsa $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return ewf.a();
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!($$3 instanceof btn) || $$3.dq().a(this)) {
         $$3.a($$0, new evp(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azf $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  li.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayx.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayx.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbs.c) || $$3 instanceof cmv) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof btn $$5) {
         btn.a $$7 = $$5.eL();
         avy $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      if ($$3 instanceof evz $$4) {
         bss $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cje;
            if ($$6 || a($$5) && $$3.a(ewf.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewf.a();
   }

   @Override
   protected ewi c(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.a();
   }

   public static boolean a(bss $$0) {
      if ($$0.ak().a(aws.h)) {
         return true;
      } else {
         return $$0 instanceof btn ? ((btn)$$0).a(bsz.c).a(cuq.pB) : false;
      }
   }

   @Override
   public cun a(@Nullable cmv $$0, dbx $$1, iz $$2, dsa $$3) {
      $$1.a($$2, dez.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dex.i($$3));
      }

      return new cun(cuq.qB);
   }

   @Override
   public Optional<avy> as_() {
      return Optional.of(avz.dm);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return true;
   }
}
