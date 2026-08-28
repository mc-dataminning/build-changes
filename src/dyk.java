import javax.annotation.Nullable;

public class dyk extends dzp {
   public dyk(iw $$0, ebg $$1) {
      super(dyg.K, $$0, $$1);
   }

   @Override
   public egp.d a() {
      return new dyk.a(this.aB_());
   }

   protected class a extends dzp.a {
      public a(final iw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aru $$0, iw $$1, jg<egg> $$2, @Nullable egg.a $$3) {
         int $$4 = this.a($$0, this.c, dyk.this.m());
         return $$4 != 0 && egp.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(djz $$0, iw $$1, ebg $$2) {
         jc $$3 = $$2.c(dnt.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
