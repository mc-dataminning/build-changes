import javax.annotation.Nullable;

public abstract class fpf extends fop {
   fpf(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wn.a);
   }

   public static fpf a(int $$0, int $$1, aku $$2, int $$3, int $$4) {
      return new fpf.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fpf a(int $$0, int $$1, aku $$2) {
      return new fpf.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsp $$0) {
   }

   @Override
   public void a(hjo $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public foa a(fsv $$0) {
      return null;
   }

   static class a extends fpf {
      private final aku a;

      public a(int $$0, int $$1, int $$2, int $$3, aku $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fod $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmh::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fpf {
      private final aku a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aku $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fod $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmh::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
