import javax.annotation.Nullable;

public class duv extends dwa {
   public duv(jh $$0, dxo $$1) {
      super(dus.K, $$0, $$1);
   }

   @Override
   public ect.d b() {
      return new duv.a(this.aB_());
   }

   protected class a extends dwa.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arx $$0, jh $$1, jq<eck> $$2, @Nullable eck.a $$3) {
         int $$4 = this.a($$0, this.c, duv.this.m());
         return $$4 != 0 && ect.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgz $$0, jh $$1, dxo $$2) {
         jm $$3 = $$2.c(dkr.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
