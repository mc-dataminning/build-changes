import javax.annotation.Nullable;

public class dsw extends dua {
   public dsw(jh $$0, dvo $$1) {
      super(dst.J, $$0, $$1);
   }

   @Override
   public eat.d b() {
      return new dsw.a(this.aB_());
   }

   protected class a extends dua.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arq $$0, jh $$1, jq<eak> $$2, @Nullable eak.a $$3) {
         int $$4 = this.a($$0, this.c, dsw.this.m());
         return $$4 != 0 && eat.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dff $$0, jh $$1, dvo $$2) {
         jm $$3 = $$2.c(diw.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
