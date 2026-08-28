import javax.annotation.Nullable;

public class duf extends dvk {
   public duf(ji $$0, dwy $$1) {
      super(duc.K, $$0, $$1);
   }

   @Override
   public ecd.d b() {
      return new duf.a(this.aA_());
   }

   protected class a extends dvk.a {
      public a(final ji $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable ebu.a $$3) {
         int $$4 = this.a($$0, this.c, duf.this.m());
         return $$4 != 0 && ecd.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgj $$0, ji $$1, dwy $$2) {
         jn $$3 = $$2.c(dkb.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
