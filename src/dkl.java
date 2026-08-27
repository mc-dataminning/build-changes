import javax.annotation.Nullable;

public class dkl extends dlm {
   public dkl(ib $$0, dmz $$1) {
      super(dki.J, $$0, $$1);
   }

   @Override
   public drw.d b() {
      return new dkl.a(this.aC_());
   }

   protected class a extends dlm.a {
      public a(ib $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drn> $$2, @Nullable drn.a $$3) {
         int $$4 = this.a($$0, this.c, dkl.this.n());
         return $$4 != 0 && drw.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cwz $$0, ib $$1, dmz $$2) {
         ih $$3 = $$2.c(dan.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
