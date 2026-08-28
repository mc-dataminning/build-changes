import javax.annotation.Nullable;

public abstract class flm extends fkx {
   flm(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xg.a);
   }

   public static flm a(int $$0, int $$1, alh $$2, int $$3, int $$4) {
      return new flm.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static flm a(int $$0, int $$1, alh $$2) {
      return new flm.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fox $$0) {
   }

   @Override
   public void a(hcu $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fkj a(fpd $$0) {
      return null;
   }

   static class a extends flm {
      private final alh a;

      public a(int $$0, int $$1, int $$2, int $$3, alh $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fkm $$0, int $$1, int $$2, float $$3) {
         $$0.a(gig::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends flm {
      private final alh a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alh $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fkm $$0, int $$1, int $$2, float $$3) {
         $$0.a(gig::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
