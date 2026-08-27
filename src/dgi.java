import javax.annotation.Nullable;

public class dgi extends dhj {
   public dgi(hv $$0, dip $$1) {
      super(dgf.J, $$0, $$1);
   }

   @Override
   public dni.d c() {
      return new dgi.a(this.aB_());
   }

   protected class a extends dhj.a {
      public a(hv $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(amp $$0, hv $$1, dmz $$2, @Nullable dmz.a $$3) {
         int $$4 = this.a($$0, this.c, dgi.this.r());
         return $$4 != 0 && dni.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(csy $$0, hv $$1, dip $$2) {
         ia $$3 = $$2.c(cwm.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
