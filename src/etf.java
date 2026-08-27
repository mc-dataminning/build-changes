import javax.annotation.Nullable;

public abstract class etf extends esq {
   etf(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, tm.a);
   }

   public static etf a(int $$0, int $$1, aey $$2, int $$3, int $$4) {
      return new etf.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static etf a(int $$0, int $$1, aey $$2) {
      return new etf.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(ewk $$0) {
   }

   @Override
   public void a(gds $$0) {
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Nullable
   @Override
   public ese a(ewq $$0) {
      return null;
   }

   static class a extends etf {
      private final aey a;

      public a(int $$0, int $$1, int $$2, int $$3, aey $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i());
      }
   }

   static class b extends etf {
      private final aey a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aey $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(esh $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i(), 0.0F, 0.0F, this.l(), this.i(), this.b, this.c);
      }
   }
}
