import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dkl extends dhk implements dnq {
   public static final MapCodec<dkl> a = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   protected dkl(dvc.d $$0) {
      super($$0);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dty($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.v, $$0.C ? dty::a : dty::b);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      dsg $$4 = $$1.c_($$2);
      if ($$4 instanceof dty) {
         int $$5 = ((dty)$$4).f();

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

            $$1.a(lq.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return cvx.k;
   }

   @Override
   protected boolean a(dvd $$0, erd $$1) {
      return false;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dty $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dty.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public esc a(arm $$0, btz $$1, jg $$2) {
      if ($$0.c_($$2) instanceof dty $$4) {
         ezh $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpl
               ? new esc($$0, $$6, ezh.c, 0.0F, 0.0F, Set.of(), esc.c)
               : new esc($$0, $$6, ezh.c, 0.0F, 0.0F, bvj.a(bvj.l, bvj.k), esc.c);
         }
      } else {
         return null;
      }
   }
}
