import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dpg extends dmd implements dsq {
   public static final MapCodec<dpg> a = b(dpg::new);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   protected dpg(eas.d $$0) {
      super($$0);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dzn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.w, $$0.C ? dzn::a : dzn::b);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      dxr $$4 = $$1.c_($$2);
      if ($$4 instanceof dzn) {
         int $$5 = ((dzn)$$4).f();

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
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return czn.k;
   }

   @Override
   protected boolean a(eat $$0, ewz $$1) {
      return false;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dzn $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         dzn.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public eya a(arq $$0, bwi $$1, iv $$2) {
      if ($$0.c_($$2) instanceof dzn $$4) {
         ffc $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof csr
               ? new eya($$0, $$6, ffc.c, 0.0F, 0.0F, Set.of(), eya.c)
               : new eya($$0, $$6, ffc.c, 0.0F, 0.0F, bxx.a(bxx.l, bxx.k), eya.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }
}
