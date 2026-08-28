import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dma extends diy implements dpj {
   public static final MapCodec<dma> a = b(dma::new);

   @Override
   public MapCodec<dma> a() {
      return a;
   }

   protected dma(dww.d $$0) {
      super($$0);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return a($$2, dub.w, $$0.C ? dvs::a : dvs::b);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      dtz $$4 = $$1.c_($$2);
      if ($$4 instanceof dvs) {
         int $$5 = ((dvs)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(lt.ae, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return cwp.j;
   }

   @Override
   protected boolean a(dwx $$0, esy $$1) {
      return false;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dvs $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dvs.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public etz a(arc $$0, buk $$1, ji $$2) {
      if ($$0.c_($$2) instanceof dvs $$4) {
         fba $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cqa
               ? new etz($$0, $$6, fba.c, 0.0F, 0.0F, Set.of(), etz.c)
               : new etz($$0, $$6, fba.c, 0.0F, 0.0F, bvu.a(bvu.l, bvu.k), etz.c);
         }
      } else {
         return null;
      }
   }
}
