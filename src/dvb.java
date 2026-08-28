import javax.annotation.Nullable;

public class dvb extends dwg {
   public dvb(jh $$0, dxu $$1) {
      super(duy.K, $$0, $$1);
   }

   @Override
   public ecz.d b() {
      return new dvb.a(this.aB_());
   }

   protected class a extends dwg.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecq> $$2, @Nullable ecq.a $$3) {
         int $$4 = this.a($$0, this.c, dvb.this.m());
         return $$4 != 0 && ecz.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dhh $$0, jh $$1, dxu $$2) {
         jm $$3 = $$2.c(dkz.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
