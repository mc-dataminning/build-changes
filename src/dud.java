import javax.annotation.Nullable;

public class dud extends dvi {
   public dud(ji $$0, dww $$1) {
      super(dua.K, $$0, $$1);
   }

   @Override
   public ecb.d b() {
      return new dud.a(this.aA_());
   }

   protected class a extends dvi.a {
      public a(final ji $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebs> $$2, @Nullable ebs.a $$3) {
         int $$4 = this.a($$0, this.c, dud.this.m());
         return $$4 != 0 && ecb.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgh $$0, ji $$1, dww $$2) {
         jn $$3 = $$2.c(djz.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
