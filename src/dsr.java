import javax.annotation.Nullable;

public class dsr extends dtv {
   public dsr(jh $$0, dvj $$1) {
      super(dso.J, $$0, $$1);
   }

   @Override
   public eap.d b() {
      return new dsr.a(this.aB_());
   }

   protected class a extends dtv.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arn $$0, jh $$1, jq<eag> $$2, @Nullable eag.a $$3) {
         int $$4 = this.a($$0, this.c, dsr.this.m());
         return $$4 != 0 && eap.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dfb $$0, jh $$1, dvj $$2) {
         jm $$3 = $$2.c(dir.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
