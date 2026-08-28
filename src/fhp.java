import javax.annotation.Nullable;

public abstract class fhp extends fha {
   fhp(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xn.a);
   }

   public static fhp a(int $$0, int $$1, ale $$2, int $$3, int $$4) {
      return new fhp.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fhp a(int $$0, int $$1, ale $$2) {
      return new fhp.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fky $$0) {
   }

   @Override
   public void a(gtt $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgm a(fle $$0) {
      return null;
   }

   static class a extends fhp {
      private final ale a;

      public a(int $$0, int $$1, int $$2, int $$3, ale $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fgp $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fhp {
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
      protected void b(fgp $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
