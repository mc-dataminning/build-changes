import javax.annotation.Nullable;

public class dcq extends ddq {
   public dcq(gu $$0, dez $$1) {
      super(dcn.J, $$0, $$1);
   }

   @Override
   public djs.d c() {
      return new dcq.a(this.p());
   }

   protected class a extends ddq.a {
      public a(gu $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djj $$2, @Nullable djj.a $$3) {
         int $$4 = this.a($$0, this.c, dcq.this.q());
         return $$4 != 0 && djs.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpl $$0, gu $$1, dez $$2) {
         ha $$3 = $$2.c(csx.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
