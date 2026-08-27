import javax.annotation.Nullable;

public abstract class euz extends euk {
   euz(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, uq.a);
   }

   public static euz a(int $$0, int $$1, agg $$2, int $$3, int $$4) {
      return new euz.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static euz a(int $$0, int $$1, agg $$2) {
      return new euz.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(eyf $$0) {
   }

   @Override
   public void a(gft $$0) {
   }

   @Override
   public boolean aK_() {
      return false;
   }

   @Nullable
   @Override
   public ety a(eyl $$0) {
      return null;
   }

   static class a extends euz {
      private final agg a;

      public a(int $$0, int $$1, int $$2, int $$3, agg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i());
      }
   }

   static class b extends euz {
      private final agg a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, agg $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(eub $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i(), 0.0F, 0.0F, this.k(), this.i(), this.b, this.c);
      }
   }
}
