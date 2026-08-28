import javax.annotation.Nullable;

public class due extends dvj {
   public due(ji $$0, dwx $$1) {
      super(dub.K, $$0, $$1);
   }

   @Override
   public ecc.d b() {
      return new due.a(this.aA_());
   }

   protected class a extends dvj.a {
      public a(final ji $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebt> $$2, @Nullable ebt.a $$3) {
         int $$4 = this.a($$0, this.c, due.this.m());
         return $$4 != 0 && ecc.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgi $$0, ji $$1, dwx $$2) {
         jn $$3 = $$2.c(dka.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
