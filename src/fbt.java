import javax.annotation.Nullable;

public abstract class fbt extends fbe {
   fbt(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, vt.a);
   }

   public static fbt a(int $$0, int $$1, ajh $$2, int $$3, int $$4) {
      return new fbt.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fbt a(int $$0, int $$1, ajh $$2) {
      return new fbt.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(ffc $$0) {
   }

   @Override
   public void a(gnq $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public faq a(ffi $$0) {
      return null;
   }

   static class a extends fbt {
      private final ajh a;

      public a(int $$0, int $$1, int $$2, int $$3, ajh $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fat $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends fbt {
      private final ajh a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ajh $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fat $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
