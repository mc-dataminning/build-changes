import javax.annotation.Nullable;

public abstract class fhq extends fhb {
   fhq(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xn.a);
   }

   public static fhq a(int $$0, int $$1, ale $$2, int $$3, int $$4) {
      return new fhq.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fhq a(int $$0, int $$1, ale $$2) {
      return new fhq.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fkz $$0) {
   }

   @Override
   public void a(gtu $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgn a(flf $$0) {
      return null;
   }

   static class a extends fhq {
      private final ale a;

      public a(int $$0, int $$1, int $$2, int $$3, ale $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fgq $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fhq {
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
      protected void b(fgq $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
