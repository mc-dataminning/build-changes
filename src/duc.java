import javax.annotation.Nullable;

public class duc extends dvh {
   public duc(ji $$0, dwv $$1) {
      super(dtz.K, $$0, $$1);
   }

   @Override
   public eca.d b() {
      return new duc.a(this.aA_());
   }

   protected class a extends dvh.a {
      public a(final ji $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arc $$0, ji $$1, jr<ebr> $$2, @Nullable ebr.a $$3) {
         int $$4 = this.a($$0, this.c, duc.this.m());
         return $$4 != 0 && eca.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgg $$0, ji $$1, dwv $$2) {
         jn $$3 = $$2.c(djy.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
