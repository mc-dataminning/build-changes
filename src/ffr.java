import javax.annotation.Nullable;

public abstract class ffr extends ffc {
   ffr(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wt.a);
   }

   public static ffr a(int $$0, int $$1, akh $$2, int $$3, int $$4) {
      return new ffr.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static ffr a(int $$0, int $$1, akh $$2) {
      return new ffr.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fja $$0) {
   }

   @Override
   public void a(grq $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public feo a(fjg $$0) {
      return null;
   }

   static class a extends ffr {
      private final akh a;

      public a(int $$0, int $$1, int $$2, int $$3, akh $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends ffr {
      private final akh a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akh $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fer $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
