import javax.annotation.Nullable;

public abstract class fph extends fos {
   fph(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wo.a);
   }

   public static fph a(int $$0, int $$1, akv $$2, int $$3, int $$4) {
      return new fph.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fph a(int $$0, int $$1, akv $$2) {
      return new fph.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsr $$0) {
   }

   @Override
   public void a(hjw $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public foc a(fsx $$0) {
      return null;
   }

   static class a extends fph {
      private final akv a;

      public a(int $$0, int $$1, int $$2, int $$3, akv $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmj::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fph {
      private final akv a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akv $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fof $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmj::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
