import javax.annotation.Nullable;

public abstract class evm extends eux {
   evm(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, uq.a);
   }

   public static evm a(int $$0, int $$1, agi $$2, int $$3, int $$4) {
      return new evm.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static evm a(int $$0, int $$1, agi $$2) {
      return new evm.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(eys $$0) {
   }

   @Override
   public void a(ggg $$0) {
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Nullable
   @Override
   public eul a(eyy $$0) {
      return null;
   }

   static class a extends evm {
      private final agi a;

      public a(int $$0, int $$1, int $$2, int $$3, agi $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(euo $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i());
      }
   }

   static class b extends evm {
      private final agi a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, agi $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(euo $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i(), 0.0F, 0.0F, this.k(), this.i(), this.b, this.c);
      }
   }
}
