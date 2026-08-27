import javax.annotation.Nullable;

public abstract class etw extends eth {
   etw(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, uh.a);
   }

   public static etw a(int $$0, int $$1, afw $$2, int $$3, int $$4) {
      return new etw.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static etw a(int $$0, int $$1, afw $$2) {
      return new etw.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(exc $$0) {
   }

   @Override
   public void a(gem $$0) {
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Nullable
   @Override
   public esv a(exi $$0) {
      return null;
   }

   static class a extends etw {
      private final afw a;

      public a(int $$0, int $$1, int $$2, int $$3, afw $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i());
      }
   }

   static class b extends etw {
      private final afw a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, afw $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(esy $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i(), 0.0F, 0.0F, this.k(), this.i(), this.b, this.c);
      }
   }
}
