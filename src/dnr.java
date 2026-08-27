import javax.annotation.Nullable;

public class dnr extends dot {
   public dnr(in $$0, dqh $$1) {
      super(dno.J, $$0, $$1);
   }

   @Override
   public dvj.d b() {
      return new dnr.a(this.az_());
   }

   protected class a extends dot.a {
      public a(in $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqh $$0, in $$1, iw<dva> $$2, @Nullable dva.a $$3) {
         int $$4 = this.a($$0, this.c, dnr.this.n());
         return $$4 != 0 && dvj.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dad $$0, in $$1, dqh $$2) {
         is $$3 = $$2.c(ddr.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
