import com.mojang.serialization.MapCodec;

public abstract class dor extends dlu implements doq {
   public dor(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dor> a();

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cmw $$4 = cmw.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cmw $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dzo $$0) {
      return $$0.l() || $$0.a(axa.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$3.a(16) == 0) {
         iu $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azo.a($$1, $$2, $$3, new lp(lx.C, $$0));
         }
      }
   }

   public abstract int b(dzo var1, dhv var2, iu var3);
}
