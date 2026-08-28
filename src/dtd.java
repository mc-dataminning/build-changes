import javax.annotation.Nullable;

public class dtd extends duh {
   public dtd(jh $$0, dvv $$1) {
      super(dta.J, $$0, $$1);
   }

   @Override
   public eba.d b() {
      return new dtd.a(this.aA_());
   }

   protected class a extends duh.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arp $$0, jh $$1, jq<ear> $$2, @Nullable ear.a $$3) {
         int $$4 = this.a($$0, this.c, dtd.this.m());
         return $$4 != 0 && eba.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dfm $$0, jh $$1, dvv $$2) {
         jm $$3 = $$2.c(djd.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
