import javax.annotation.Nullable;

public abstract class fec extends fdn {
   fec(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wf.a);
   }

   public static fec a(int $$0, int $$1, ajt $$2, int $$3, int $$4) {
      return new fec.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fec a(int $$0, int $$1, ajt $$2) {
      return new fec.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fhl $$0) {
   }

   @Override
   public void a(gqa $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fcz a(fhr $$0) {
      return null;
   }

   static class a extends fec {
      private final ajt a;

      public a(int $$0, int $$1, int $$2, int $$3, ajt $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fec {
      private final ajt a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ajt $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fdc $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
