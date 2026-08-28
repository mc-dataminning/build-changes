import javax.annotation.Nullable;

public abstract class fsd extends fro {
   fsd(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wv.a);
   }

   public static fsd a(int $$0, int $$1, ale $$2, int $$3, int $$4) {
      return new fsd.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fsd a(int $$0, int $$1, ale $$2) {
      return new fsd.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fvn $$0) {
   }

   @Override
   public void a(hnc $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fqz a(fvt $$0) {
      return null;
   }

   static class a extends fsd {
      private final ale a;

      public a(int $$0, int $$1, int $$2, int $$3, ale $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         $$0.a(gpn::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fsd {
      private final ale a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ale $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(frc $$0, int $$1, int $$2, float $$3) {
         $$0.a(gpn::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
