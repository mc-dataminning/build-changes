import javax.annotation.Nullable;

public class don extends dpp {
   public don(io $$0, drd $$1) {
      super(dok.J, $$0, $$1);
   }

   @Override
   public dwf.d b() {
      return new don.a(this.aA_());
   }

   protected class a extends dpp.a {
      public a(io $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable dvw.a $$3) {
         int $$4 = this.a($$0, this.c, don.this.n());
         return $$4 != 0 && dwf.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(daz $$0, io $$1, drd $$2) {
         it $$3 = $$2.c(den.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
