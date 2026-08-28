import com.mojang.serialization.MapCodec;

public class drj extends dlu implements dlx {
   public static final MapCodec<drj> a = b(drj::new);

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   protected drj(dzn.d $$0) {
      super($$0);
   }

   private static boolean b(dzo $$0, dis $$1, iu $$2) {
      iu $$3 = $$2.d();
      dzo $$4 = $$1.a_($$3);
      int $$5 = evm.a($$0, $$4, ja.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, dlw.ei.m());
      }
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      dzo $$4 = $$0.a_($$2);
      iu $$5 = $$2.d();
      ebm $$6 = $$0.m().g();
      jr<eif<?, ?>> $$7 = $$0.F_().f(mg.aK);
      if ($$4.a(dlw.oY)) {
         this.a($$7, rk.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dlw.oP)) {
         this.a($$7, rk.j, $$0, $$6, $$1, $$5);
         this.a($$7, rk.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rk.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jr<eif<?, ?>> $$0, ald<eif<?, ?>> $$1, aro $$2, ebm $$3, azt $$4, iu $$5) {
      $$0.a($$1).ifPresent($$4x -> ((eif)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dlx.a am_() {
      return dlx.a.a;
   }
}
