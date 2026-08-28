import javax.annotation.Nullable;

public abstract class fhm extends fgx {
   fhm(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xk.a);
   }

   public static fhm a(int $$0, int $$1, alb $$2, int $$3, int $$4) {
      return new fhm.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fhm a(int $$0, int $$1, alb $$2) {
      return new fhm.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fkv $$0) {
   }

   @Override
   public void a(gtq $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgj a(flb $$0) {
      return null;
   }

   static class a extends fhm {
      private final alb a;

      public a(int $$0, int $$1, int $$2, int $$3, alb $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fhm {
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
      protected void b(fgm $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
