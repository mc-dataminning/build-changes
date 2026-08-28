import javax.annotation.Nullable;

public abstract class fpg extends foq {
   fpg(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wo.a);
   }

   public static fpg a(int $$0, int $$1, akv $$2, int $$3, int $$4) {
      return new fpg.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fpg a(int $$0, int $$1, akv $$2) {
      return new fpg.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsq $$0) {
   }

   @Override
   public void a(hjv $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fob a(fsw $$0) {
      return null;
   }

   static class a extends fpg {
      private final akv a;

      public a(int $$0, int $$1, int $$2, int $$3, akv $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(foe $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmi::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fpg {
      private final akv a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, akv $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(foe $$0, int $$1, int $$2, float $$3) {
         $$0.a(gmi::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
