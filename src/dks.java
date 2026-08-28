import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dks extends dey implements dff {
   public static final MapCodec<dks> a = b(dks::new);
   private static final float b = 0.083333336F;
   private static final float c = 0.9F;
   private static final float d = 1.5F;
   private static final float e = 2.5F;
   private static final ewj f = ewg.a(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double g = 4.0;
   private static final double h = 7.0;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dsb $$0, dsb $$1, je $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return ewg.a();
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!($$3 instanceof bto) || $$3.dq().a(this)) {
         $$3.a($$0, new evq(0.9F, 1.5, 0.9F));
         if ($$1.B) {
            azg $$4 = $$1.E_();
            boolean $$5 = $$3.ad != $$3.du() || $$3.af != $$3.dA();
            if ($$5 && $$4.h()) {
               $$1.a(
                  li.aK,
                  $$3.du(),
                  (double)($$2.v() + 1),
                  $$3.dA(),
                  (double)(ayy.b($$4, -1.0F, 1.0F) * 0.083333336F),
                  0.05F,
                  (double)(ayy.b($$4, -1.0F, 1.0F) * 0.083333336F)
               );
            }
         }
      }

      $$3.p(true);
      if (!$$1.B) {
         if ($$3.bQ() && ($$1.ab().b(dbt.c) || $$3 instanceof cmw) && $$3.a($$1, $$2)) {
            $$1.b($$2, false);
         }

         $$3.c(false);
      }
   }

   @Override
   public void a(dbx $$0, dsb $$1, iz $$2, bst $$3, float $$4) {
      if (!((double)$$4 < 4.0) && $$3 instanceof bto $$5) {
         bto.a $$7 = $$5.eL();
         avy $$8 = (double)$$4 < 7.0 ? $$7.a() : $$7.b();
         $$3.a($$8, 1.0F, 1.0F);
      }
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if ($$3 instanceof ewa $$4) {
         bst $$5 = $$4.c();
         if ($$5 != null) {
            if ($$5.ac > 2.5F) {
               return f;
            }

            boolean $$6 = $$5 instanceof cjf;
            if ($$6 || a($$5) && $$3.a(ewg.b(), $$2, false) && !$$3.b()) {
               return super.b($$0, $$1, $$2, $$3);
            }
         }
      }

      return ewg.a();
   }

   @Override
   protected ewj c(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.a();
   }

   public static boolean a(bst $$0) {
      if ($$0.ak().a(aws.h)) {
         return true;
      } else {
         return $$0 instanceof bto ? ((bto)$$0).a(bta.c).a(cur.pB) : false;
      }
   }

   @Override
   public cuo a(@Nullable cmw $$0, dby $$1, iz $$2, dsb $$3) {
      $$1.a($$2, dfa.a.o(), 11);
      if (!$$1.x_()) {
         $$1.c(2001, $$2, dey.i($$3));
      }

      return new cuo(cur.qB);
   }

   @Override
   public Optional<avy> ar_() {
      return Optional.of(avz.dm);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return true;
   }
}
