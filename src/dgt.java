import javax.annotation.Nullable;

public class dgt extends dhu {
   public dgt(hx $$0, dja $$1) {
      super(dgq.J, $$0, $$1);
   }

   @Override
   public dnt.d c() {
      return new dgt.a(this.aB_());
   }

   protected class a extends dhu.a {
      public a(hx $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(amz $$0, hx $$1, dnk $$2, @Nullable dnk.a $$3) {
         int $$4 = this.a($$0, this.c, dgt.this.r());
         return $$4 != 0 && dnt.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cti $$0, hx $$1, dja $$2) {
         ic $$3 = $$2.c(cww.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
