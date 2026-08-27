import javax.annotation.Nullable;

public abstract class evr extends evc {
   evr(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, uu.a);
   }

   public static evr a(int $$0, int $$1, agm $$2, int $$3, int $$4) {
      return new evr.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static evr a(int $$0, int $$1, agm $$2) {
      return new evr.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(eyx $$0) {
   }

   @Override
   public void a(ggl $$0) {
   }

   @Override
   public boolean aM_() {
      return false;
   }

   @Nullable
   @Override
   public euq a(ezd $$0) {
      return null;
   }

   static class a extends evr {
      private final agm a;

      public a(int $$0, int $$1, int $$2, int $$3, agm $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i());
      }
   }

   static class b extends evr {
      private final agm a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, agm $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(eut $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i(), 0.0F, 0.0F, this.k(), this.i(), this.b, this.c);
      }
   }
}
