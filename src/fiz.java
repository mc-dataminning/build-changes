import javax.annotation.Nullable;

public abstract class fiz extends fik {
   fiz(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wy.a);
   }

   public static fiz a(int $$0, int $$1, akr $$2, int $$3, int $$4) {
      return new fiz.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fiz a(int $$0, int $$1, akr $$2) {
      return new fiz.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fmi $$0) {
   }

   @Override
   public void a(gvf $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhw a(fmo $$0) {
      return null;
   }

   static class a extends fiz {
      private final akr a;

      public a(int $$0, int $$1, int $$2, int $$3, akr $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fiz {
      private final akr a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akr $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fhz $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
