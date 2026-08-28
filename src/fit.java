import javax.annotation.Nullable;

public abstract class fit extends fie {
   fit(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wx.a);
   }

   public static fit a(int $$0, int $$1, akq $$2, int $$3, int $$4) {
      return new fit.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fit a(int $$0, int $$1, akq $$2) {
      return new fit.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fmc $$0) {
   }

   @Override
   public void a(guy $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fhq a(fmi $$0) {
      return null;
   }

   static class a extends fit {
      private final akq a;

      public a(int $$0, int $$1, int $$2, int $$3, akq $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fit {
      private final akq a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akq $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fht $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.D(), this.E(), this.y(), this.w(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
