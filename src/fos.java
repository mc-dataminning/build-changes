import javax.annotation.Nullable;

public abstract class fos extends foc {
   fos(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xu.a);
   }

   public static fos a(int $$0, int $$1, alz $$2, int $$3, int $$4) {
      return new fos.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fos a(int $$0, int $$1, alz $$2) {
      return new fos.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsc $$0) {
   }

   @Override
   public void a(hgm $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fno a(fsi $$0) {
      return null;
   }

   static class a extends fos {
      private final alz a;

      public a(int $$0, int $$1, int $$2, int $$3, alz $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fnr $$0, int $$1, int $$2, float $$3) {
         $$0.a(glu::C, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fos {
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
      protected void b(fnr $$0, int $$1, int $$2, float $$3) {
         $$0.a(glu::C, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
