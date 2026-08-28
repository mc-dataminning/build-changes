import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dma extends dix implements dpi {
   public static final MapCodec<dma> a = b(dma::new);
   protected static final fbt b = djl.a(0.0, 6.0, 0.0, 16.0, 12.0, 16.0);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvs($$0, $$1);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected fbt a_(dww $$0, dgh $$1, ji $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$3.o(false)) {
         if (!$$1.C && $$1.ai() == dgh.k && $$3 instanceof are $$4 && !$$4.i) {
            $$4.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public ety a(ard $$0, buk $$1, ji $$2) {
      aku<dgh> $$3 = $$0.ai() == dgh.k ? dgh.i : dgh.k;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == dgh.k;
         ji $$6 = $$5 ? ard.a : $$4.Z();
         faz $$7 = $$6.c();
         float $$8;
         Set<bvu> $$9;
         if ($$5) {
            efv.a($$4, ji.a((kb)$$7).e(), true);
            $$8 = jn.e.p();
            $$9 = bvu.a(bvu.l, Set.of(bvu.e));
            if ($$1 instanceof are) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = bvu.a(bvu.l, bvu.k);
            if ($$1 instanceof are $$12) {
               return $$12.a(false, ety.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new ety($$4, $$7, faz.c, $$8, 0.0F, $$9, ety.b.then(ety.c));
      }
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(lt.ag, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return cwo.j;
   }

   @Override
   protected boolean a(dww $$0, esx $$1) {
      return false;
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }
}
