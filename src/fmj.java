import javax.annotation.Nullable;

public abstract class fmj extends flu {
   fmj(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xk.a);
   }

   public static fmj a(int $$0, int $$1, all $$2, int $$3, int $$4) {
      return new fmj.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fmj a(int $$0, int $$1, all $$2) {
      return new fmj.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fpu $$0) {
   }

   @Override
   public void a(hdv $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public flg a(fqa $$0) {
      return null;
   }

   static class a extends fmj {
      private final all a;

      public a(int $$0, int $$1, int $$2, int $$3, all $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         $$0.a(gjh::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fmj {
      private final all a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, all $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(flj $$0, int $$1, int $$2, float $$3) {
         $$0.a(gjh::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
