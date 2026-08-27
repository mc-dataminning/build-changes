import javax.annotation.Nullable;

public class djc extends dkd {
   public djc(hz $$0, dlj $$1) {
      super(diz.J, $$0, $$1);
   }

   @Override
   public dqf.d c() {
      return new djc.a(this.aE_());
   }

   protected class a extends dkd.a {
      public a(hz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable dpw.a $$3) {
         int $$4 = this.a($$0, this.c, djc.this.r());
         return $$4 != 0 && dqf.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cvr $$0, hz $$1, dlj $$2) {
         ie $$3 = $$2.c(czf.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
