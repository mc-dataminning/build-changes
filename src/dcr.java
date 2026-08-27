import javax.annotation.Nullable;

public class dcr extends ddr {
   public dcr(gu $$0, dfa $$1) {
      super(dco.J, $$0, $$1);
   }

   @Override
   public djt.d c() {
      return new dcr.a(this.p());
   }

   protected class a extends ddr.a {
      public a(gu $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djk $$2, @Nullable djk.a $$3) {
         int $$4 = this.a($$0, this.c, dcr.this.q());
         return $$4 != 0 && djt.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpm $$0, gu $$1, dfa $$2) {
         ha $$3 = $$2.c(csy.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
