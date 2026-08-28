import javax.annotation.Nullable;

public abstract class fif extends fhq {
   fif(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wt.a);
   }

   public static fif a(int $$0, int $$1, akk $$2, int $$3, int $$4) {
      return new fif.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fif a(int $$0, int $$1, akk $$2) {
      return new fif.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(flo $$0) {
   }

   @Override
   public void a(guh $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhc a(flu $$0) {
      return null;
   }

   static class a extends fif {
      private final akk a;

      public a(int $$0, int $$1, int $$2, int $$3, akk $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fhf $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fif {
      private final akk a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akk $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fhf $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
