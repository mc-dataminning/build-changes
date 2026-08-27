import javax.annotation.Nullable;

public abstract class fja extends fil {
   fja(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xd.a);
   }

   public static fja a(int $$0, int $$1, akt $$2, int $$3, int $$4) {
      return new fja.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fja a(int $$0, int $$1, akt $$2) {
      return new fja.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fmj $$0) {
   }

   @Override
   public void a(gvq $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fhx a(fmp $$0) {
      return null;
   }

   static class a extends fja {
      private final akt a;

      public a(int $$0, int $$1, int $$2, int $$3, akt $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fja {
      private final akt a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akt $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fia $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
