import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dlx {
   public static final MapCodec<dqn> c = b(dqn::new);

   @Override
   public MapCodec<dqn> a() {
      return c;
   }

   protected dqn(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$0, $$2, dye.a);
   }

   @Override
   protected void a(djx $$0, iv $$1, crx $$2) {
      dyc $$3 = $$0.c_($$1);
      if ($$3 instanceof dzc) {
         $$2.a((but)$$3);
         $$2.a(awz.am);
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awp.kC, awq.e, 1.0F, 1.0F, false);
         }

         jb $$7 = $$0.c(a);
         jb.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jb.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jb.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ly.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(ly.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
