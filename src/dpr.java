import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dpr extends dmo implements dtb {
   public static final MapCodec<dpr> a = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   protected dpr(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.w, $$0.C ? dzy::a : dzy::b);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      dyc $$4 = $$1.c_($$2);
      if ($$4 instanceof dzy) {
         int $$5 = ((dzy)$$4).f();

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
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return czy.k;
   }

   @Override
   protected boolean a(ebe $$0, exn $$1) {
      return false;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dzy $$6 && !$$6.c()) {
         $$3.a(this, $$2);
         dzy.c($$1, $$2, $$0, $$6);
      }
   }

   @Nullable
   @Override
   public eyo a(ars $$0, bwt $$1, iv $$2) {
      if ($$0.c_($$2) instanceof dzy $$4) {
         ffq $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof ctc
               ? new eyo($$0, $$6, ffq.c, 0.0F, 0.0F, Set.of(), eyo.c)
               : new eyo($$0, $$6, ffq.c, 0.0F, 0.0F, byi.a(byi.l, byi.k), eyo.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }
}
