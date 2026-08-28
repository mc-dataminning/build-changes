import javax.annotation.Nullable;

public abstract class fol extends fnw {
   fol(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xj.a);
   }

   public static fol a(int $$0, int $$1, alp $$2, int $$3, int $$4) {
      return new fol.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fol a(int $$0, int $$1, alp $$2) {
      return new fol.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(frw $$0) {
   }

   @Override
   public void a(hgj $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fni a(fsc $$0) {
      return null;
   }

   static class a extends fol {
      private final alp a;

      public a(int $$0, int $$1, int $$2, int $$3, alp $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         $$0.a(glq::H, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fol {
      private final alp a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alp $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fnl $$0, int $$1, int $$2, float $$3) {
         $$0.a(glq::H, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
