import javax.annotation.Nullable;

public abstract class esv extends esg {
   esv(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, td.a);
   }

   public static esv a(int $$0, int $$1, aep $$2, int $$3, int $$4) {
      return new esv.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static esv a(int $$0, int $$1, aep $$2) {
      return new esv.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(evt $$0) {
   }

   @Override
   public void a(gcs $$0) {
   }

   @Override
   public boolean az_() {
      return false;
   }

   @Nullable
   @Override
   public eru a(evz $$0) {
      return null;
   }

   static class a extends esv {
      private final aep a;

      public a(int $$0, int $$1, int $$2, int $$3, aep $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(erx $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.h());
      }
   }

   static class b extends esv {
      private final aep a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aep $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(erx $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.h(), 0.0F, 0.0F, this.k(), this.h(), this.b, this.c);
      }
   }
}
