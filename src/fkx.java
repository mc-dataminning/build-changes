import javax.annotation.Nullable;

public abstract class fkx extends fki {
   fkx(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xc.a);
   }

   public static fkx a(int $$0, int $$1, alc $$2, int $$3, int $$4) {
      return new fkx.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fkx a(int $$0, int $$1, alc $$2) {
      return new fkx.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(foh $$0) {
   }

   @Override
   public void a(hca $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fju a(fon $$0) {
      return null;
   }

   static class a extends fkx {
      private final alc a;

      public a(int $$0, int $$1, int $$2, int $$3, alc $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fjx $$0, int $$1, int $$2, float $$3) {
         $$0.a(ghq::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fkx {
      private final alc a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alc $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fjx $$0, int $$1, int $$2, float $$3) {
         $$0.a(ghq::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
