import com.mojang.serialization.MapCodec;

public abstract class dox extends dma implements dow {
   public dox(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dox> a();

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cnc $$4 = cnc.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cnc $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dzz $$0) {
      return $$0.l() || $$0.a(axc.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iu $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azq.a($$1, $$2, $$3, new lp(lx.C, $$0));
         }
      }
   }

   public abstract int b(dzz var1, dib var2, iu var3);
}
