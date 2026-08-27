import javax.annotation.Nullable;

public abstract class fgn extends ffy {
   fgn(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, ww.a);
   }

   public static fgn a(int $$0, int $$1, akn $$2, int $$3, int $$4) {
      return new fgn.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fgn a(int $$0, int $$1, akn $$2) {
      return new fgn.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fjw $$0) {
   }

   @Override
   public void a(gsn $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public ffk a(fkc $$0) {
      return null;
   }

   static class a extends fgn {
      private final akn a;

      public a(int $$0, int $$1, int $$2, int $$3, akn $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ffn $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fgn {
      private final akn a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akn $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ffn $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
