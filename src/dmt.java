import javax.annotation.Nullable;

public class dmt extends dnv {
   public dmt(id $$0, dpi $$1) {
      super(dmq.J, $$0, $$1);
   }

   @Override
   public duk.d b() {
      return new dmt.a(this.az_());
   }

   protected class a extends dnv.a {
      public a(id $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(apu $$0, id $$1, in<dub> $$2, @Nullable dub.a $$3) {
         int $$4 = this.a($$0, this.c, dmt.this.n());
         return $$4 != 0 && duk.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(czg $$0, id $$1, dpi $$2) {
         ij $$3 = $$2.c(dcu.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
