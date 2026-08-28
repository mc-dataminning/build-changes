import javax.annotation.Nullable;

public abstract class fot extends fod {
   fot(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xu.a);
   }

   public static fot a(int $$0, int $$1, alz $$2, int $$3, int $$4) {
      return new fot.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fot a(int $$0, int $$1, alz $$2) {
      return new fot.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsd $$0) {
   }

   @Override
   public void a(hgn $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fnp a(fsj $$0) {
      return null;
   }

   static class a extends fot {
      private final alz a;

      public a(int $$0, int $$1, int $$2, int $$3, alz $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         $$0.a(glv::C, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fot {
      private final alz a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alz $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fns $$0, int $$1, int $$2, float $$3) {
         $$0.a(glv::C, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
