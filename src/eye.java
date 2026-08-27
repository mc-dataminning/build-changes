import javax.annotation.Nullable;

public abstract class eye extends exp {
   eye(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, vf.a);
   }

   public static eye a(int $$0, int $$1, ahh $$2, int $$3, int $$4) {
      return new eye.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static eye a(int $$0, int $$1, ahh $$2) {
      return new eye.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fbk $$0) {
   }

   @Override
   public void a(gjs $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public exb a(fbq $$0) {
      return null;
   }

   static class a extends eye {
      private final ahh a;

      public a(int $$0, int $$1, int $$2, int $$3, ahh $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends eye {
      private final ahh a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ahh $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(exe $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
