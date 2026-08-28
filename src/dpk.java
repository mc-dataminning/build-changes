import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpk extends dkv {
   public static final MapCodec<dpk> c = b(dpk::new);

   @Override
   public MapCodec<dpk> a() {
      return c;
   }

   protected dpk(dzy.d $$0) {
      super($$0);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$0, $$2, dwz.a);
   }

   @Override
   protected void a(div $$0, iu $$1, cqy $$2) {
      dwx $$3 = $$0.c_($$1);
      if ($$3 instanceof dxx) {
         $$2.a((bud)$$3);
         $$2.a(awx.am);
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.kz, awo.e, 1.0F, 1.0F, false);
         }

         ja $$7 = $$0.c(a);
         ja.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ja.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ja.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lx.ah, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lx.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
