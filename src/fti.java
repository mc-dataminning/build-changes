import javax.annotation.Nullable;

public abstract class fti extends fst {
   fti(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wx.a);
   }

   public static fti a(int $$0, int $$1, alg $$2, int $$3, int $$4) {
      return new fti.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fti a(int $$0, int $$1, alg $$2) {
      return new fti.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fws $$0) {
   }

   @Override
   public void a(hon $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fse a(fwy $$0) {
      return null;
   }

   static class a extends fti {
      private final alg a;

      public a(int $$0, int $$1, int $$2, int $$3, alg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fsh $$0, int $$1, int $$2, float $$3) {
         $$0.a(gqx::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fti {
      private final alg a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alg $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fsh $$0, int $$1, int $$2, float $$3) {
         $$0.a(gqx::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
