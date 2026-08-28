import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dpt extends dmq implements dtd {
   public static final MapCodec<dpt> a = b(dpt::new);

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   protected dpt(ebf.d $$0) {
      super($$0);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new eaa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.w, $$0.C ? eaa::a : eaa::b);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      dye $$4 = $$1.c_($$2);
      if ($$4 instanceof eaa) {
         int $$5 = ((eaa)$$4).f();

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

            $$1.a(lz.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return daa.k;
   }

   @Override
   protected boolean a(ebg $$0, exp $$1) {
      return false;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof eaa $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         eaa.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public eyq a(aru $$0, bwv $$1, iw $$2) {
      if ($$0.c_($$2) instanceof eaa $$4) {
         ffs $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cte
               ? new eyq($$0, $$6, ffs.c, 0.0F, 0.0F, Set.of(), eyq.c)
               : new eyq($$0, $$6, ffs.c, 0.0F, 0.0F, byk.a(byk.l, byk.k), eyq.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }
}
