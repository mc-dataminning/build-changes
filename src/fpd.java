import javax.annotation.Nullable;

public abstract class fpd extends fon {
   fpd(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wn.a);
   }

   public static fpd a(int $$0, int $$1, aku $$2, int $$3, int $$4) {
      return new fpd.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fpd a(int $$0, int $$1, aku $$2) {
      return new fpd.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsn $$0) {
   }

   @Override
   public void a(hjp $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fny a(fst $$0) {
      return null;
   }

   static class a extends fpd {
      private final aku a;

      public a(int $$0, int $$1, int $$2, int $$3, aku $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmf::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fpd {
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
      protected void b(fob $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmf::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
