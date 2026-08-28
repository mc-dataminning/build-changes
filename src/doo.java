import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class doo extends dlm implements dry {
   public static final MapCodec<doo> a = b(doo::new);

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   protected doo(dzy.d $$0) {
      super($$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.w, $$0.C ? dyt::a : dyt::b);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      dwx $$4 = $$1.c_($$2);
      if ($$4 instanceof dyt) {
         int $$5 = ((dyt)$$4).f();

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

            $$1.a(lx.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return cyy.k;
   }

   @Override
   protected boolean a(dzz $$0, ewf $$1) {
      return false;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dyt $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dyt.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public exg a(arq $$0, bwd $$1, iu $$2) {
      if ($$0.c_($$2) instanceof dyt $$4) {
         fei $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof csc
               ? new exg($$0, $$6, fei.c, 0.0F, 0.0F, Set.of(), exg.c)
               : new exg($$0, $$6, fei.c, 0.0F, 0.0F, bxq.a(bxq.l, bxq.k), exg.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }
}
