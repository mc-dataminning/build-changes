import javax.annotation.Nullable;

public abstract class ewu extends ewf {
   ewu(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, va.a);
   }

   public static ewu a(int $$0, int $$1, agt $$2, int $$3, int $$4) {
      return new ewu.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static ewu a(int $$0, int $$1, agt $$2) {
      return new ewu.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(faa $$0) {
   }

   @Override
   public void a(gia $$0) {
   }

   @Override
   public boolean aL_() {
      return false;
   }

   @Nullable
   @Override
   public evt a(fag $$0) {
      return null;
   }

   static class a extends ewu {
      private final agt a;

      public a(int $$0, int $$1, int $$2, int $$3, agt $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(evw $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i());
      }
   }

   static class b extends ewu {
      private final agt a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, agt $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(evw $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.i(), 0.0F, 0.0F, this.k(), this.i(), this.b, this.c);
      }
   }
}
