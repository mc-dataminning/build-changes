import javax.annotation.Nullable;

public abstract class fhs extends fhd {
   fhs(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xo.a);
   }

   public static fhs a(int $$0, int $$1, alf $$2, int $$3, int $$4) {
      return new fhs.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fhs a(int $$0, int $$1, alf $$2) {
      return new fhs.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(flb $$0) {
   }

   @Override
   public void a(gtw $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fgp a(flh $$0) {
      return null;
   }

   static class a extends fhs {
      private final alf a;

      public a(int $$0, int $$1, int $$2, int $$3, alf $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fgs $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fhs {
      private final alf a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alf $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fgs $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
