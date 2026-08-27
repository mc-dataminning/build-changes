import javax.annotation.Nullable;

public class dec extends dfc {
   public dec(ht $$0, dgb $$1) {
      super(ddz.J, $$0, $$1);
   }

   @Override
   public dku.d c() {
      return new dec.a(this.p());
   }

   protected class a extends dfc.a {
      public a(ht $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(alq $$0, ht $$1, dkl $$2, @Nullable dkl.a $$3) {
         int $$4 = this.a($$0, this.c, dec.this.q());
         return $$4 != 0 && dku.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cqz $$0, ht $$1, dgb $$2) {
         hx $$3 = $$2.c(cun.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
