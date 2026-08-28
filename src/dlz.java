import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dlz extends dix implements dpi {
   public static final MapCodec<dlz> a = b(dlz::new);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dvr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.w, $$0.C ? dvr::a : dvr::b);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      dty $$4 = $$1.c_($$2);
      if ($$4 instanceof dvr) {
         int $$5 = ((dvr)$$4).f();

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
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return cwo.j;
   }

   @Override
   protected boolean a(dww $$0, esx $$1) {
      return false;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dvr $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dvr.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public ety a(ard $$0, buk $$1, ji $$2) {
      if ($$0.c_($$2) instanceof dvr $$4) {
         faz $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpz
               ? new ety($$0, $$6, faz.c, 0.0F, 0.0F, Set.of(), ety.c)
               : new ety($$0, $$6, faz.c, 0.0F, 0.0F, bvu.a(bvu.l, bvu.k), ety.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dpw a_(dww $$0) {
      return dpw.a;
   }
}
