import javax.annotation.Nullable;

public class dde extends dee {
   public dde(gw $$0, dfd $$1) {
      super(ddb.J, $$0, $$1);
   }

   @Override
   public djw.d c() {
      return new dde.a(this.p());
   }

   protected class a extends dee.a {
      public a(gw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(akt $$0, gw $$1, djn $$2, @Nullable djn.a $$3) {
         int $$4 = this.a($$0, this.c, dde.this.q());
         return $$4 != 0 && djw.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cqb $$0, gw $$1, dfd $$2) {
         ha $$3 = $$2.c(ctp.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
