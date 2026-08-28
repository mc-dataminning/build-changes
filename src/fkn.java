import javax.annotation.Nullable;

public abstract class fkn extends fjy {
   fkn(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xc.a);
   }

   public static fkn a(int $$0, int $$1, alb $$2, int $$3, int $$4) {
      return new fkn.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fkn a(int $$0, int $$1, alb $$2) {
      return new fkn.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fnx $$0) {
   }

   @Override
   public void a(hbj $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fjk a(fod $$0) {
      return null;
   }

   static class a extends fkn {
      private final alb a;

      public a(int $$0, int $$1, int $$2, int $$3, alb $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         $$0.a(ghe::C, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fkn {
      private final alb a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alb $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fjn $$0, int $$1, int $$2, float $$3) {
         $$0.a(ghe::C, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
