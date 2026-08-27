import javax.annotation.Nullable;

public abstract class est extends ese {
   est(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, te.a);
   }

   public static est a(int $$0, int $$1, aer $$2, int $$3, int $$4) {
      return new est.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static est a(int $$0, int $$1, aer $$2) {
      return new est.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(evy $$0) {
   }

   @Override
   public void a(gdg $$0) {
   }

   @Override
   public boolean ax_() {
      return false;
   }

   @Nullable
   @Override
   public ers a(ewe $$0) {
      return null;
   }

   static class a extends est {
      private final aer a;

      public a(int $$0, int $$1, int $$2, int $$3, aer $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(erv $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i());
      }
   }

   static class b extends est {
      private final aer a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aer $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(erv $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i(), 0.0F, 0.0F, this.l(), this.i(), this.b, this.c);
      }
   }
}
