import javax.annotation.Nullable;

public class ddx extends dcl {
   private final com a = new com() {
      @Override
      public void a(cpl $$0, gu $$1, int $$2) {
         $$0.a($$1, csm.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cpl $$0, gu $$1, cqc $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dez $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public ddx(gu $$0, dez $$1) {
      super(dcn.j, $$0, $$1);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cpl $$0, gu $$1, dez $$2, ddx $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cpl $$0, gu $$1, dez $$2, ddx $$3) {
      $$3.a.a((akk)$$0, $$1);
   }

   public wx c() {
      return wx.a(this);
   }

   @Override
   public qr an_() {
      qr $$0 = this.o();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean t() {
      return true;
   }

   public void a(bim<?> $$0, aru $$1) {
      this.a.a($$0, this.o, $$1, this.p);
   }

   public com d() {
      return this.a;
   }
}
