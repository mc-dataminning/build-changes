import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dpb extends dly implements dsl {
   public static final MapCodec<dpb> a = b(dpb::new);

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(ean.d $$0) {
      super($$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return a($$2, dxo.w, $$0.C ? dzi::a : dzi::b);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      dxm $$4 = $$1.c_($$2);
      if ($$4 instanceof dzi) {
         int $$5 = ((dzi)$$4).f();

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

            $$1.a(ly.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return czk.k;
   }

   @Override
   protected boolean a(eao $$0, ewu $$1) {
      return false;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dzi $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         dzi.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public exv a(arq $$0, bwi $$1, iv $$2) {
      if ($$0.c_($$2) instanceof dzi $$4) {
         fex $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cso
               ? new exv($$0, $$6, fex.c, 0.0F, 0.0F, Set.of(), exv.c)
               : new exv($$0, $$6, fex.c, 0.0F, 0.0F, bxx.a(bxx.l, bxx.k), exv.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }
}
