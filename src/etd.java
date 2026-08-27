import javax.annotation.Nullable;

public abstract class etd extends eso {
   etd(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, tk.a);
   }

   public static etd a(int $$0, int $$1, aex $$2, int $$3, int $$4) {
      return new etd.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static etd a(int $$0, int $$1, aex $$2) {
      return new etd.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(ewi $$0) {
   }

   @Override
   public void a(gdq $$0) {
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Nullable
   @Override
   public esc a(ewo $$0) {
      return null;
   }

   static class a extends etd {
      private final aex a;

      public a(int $$0, int $$1, int $$2, int $$3, aex $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i());
      }
   }

   static class b extends etd {
      private final aex a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aex $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(esf $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i(), 0.0F, 0.0F, this.l(), this.i(), this.b, this.c);
      }
   }
}
