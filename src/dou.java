import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dou extends dlr implements dse {
   public static final MapCodec<dou> a = b(dou::new);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(eag.d $$0) {
      super($$0);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dzb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.w, $$0.C ? dzb::a : dzb::b);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      dxf $$4 = $$1.c_($$2);
      if ($$4 instanceof dzb) {
         int $$5 = ((dzb)$$4).f();

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
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return czd.k;
   }

   @Override
   protected boolean a(eah $$0, ewn $$1) {
      return false;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dzb $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dzb.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public exo a(arq $$0, bwf $$1, iu $$2) {
      if ($$0.c_($$2) instanceof dzb $$4) {
         feq $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof csh
               ? new exo($$0, $$6, feq.c, 0.0F, 0.0F, Set.of(), exo.c)
               : new exo($$0, $$6, feq.c, 0.0F, 0.0F, bxs.a(bxs.l, bxs.k), exo.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }
}
