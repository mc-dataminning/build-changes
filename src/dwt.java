import javax.annotation.Nullable;

public class dwt extends dxy {
   public dwt(iu $$0, dzo $$1) {
      super(dwp.K, $$0, $$1);
   }

   @Override
   public eex.d a() {
      return new dwt.a(this.aw_());
   }

   protected class a extends dxy.a {
      public a(final iu $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aro $$0, iu $$1, je<eeo> $$2, @Nullable eeo.a $$3) {
         int $$4 = this.a($$0, this.c, dwt.this.m());
         return $$4 != 0 && eex.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dip $$0, iu $$1, dzo $$2) {
         ja $$3 = $$2.c(dmi.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
