import javax.annotation.Nullable;

public abstract class fsw extends fsh {
   fsw(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wx.a);
   }

   public static fsw a(int $$0, int $$1, alg $$2, int $$3, int $$4) {
      return new fsw.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fsw a(int $$0, int $$1, alg $$2) {
      return new fsw.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fwg $$0) {
   }

   @Override
   public void a(hoa $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public frs a(fwm $$0) {
      return null;
   }

   static class a extends fsw {
      private final alg a;

      public a(int $$0, int $$1, int $$2, int $$3, alg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(frv $$0, int $$1, int $$2, float $$3) {
         $$0.a(gqk::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fsw {
      private final alg a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alg $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(frv $$0, int $$1, int $$2, float $$3) {
         $$0.a(gqk::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
