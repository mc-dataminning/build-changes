import javax.annotation.Nullable;

public abstract class flu extends flf {
   flu(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xh.a);
   }

   public static flu a(int $$0, int $$1, ali $$2, int $$3, int $$4) {
      return new flu.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static flu a(int $$0, int $$1, ali $$2) {
      return new flu.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fpf $$0) {
   }

   @Override
   public void a(hdf $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fkr a(fpl $$0) {
      return null;
   }

   static class a extends flu {
      private final ali a;

      public a(int $$0, int $$1, int $$2, int $$3, ali $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         $$0.a(gir::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends flu {
      private final ali a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ali $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fku $$0, int $$1, int $$2, float $$3) {
         $$0.a(gir::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
