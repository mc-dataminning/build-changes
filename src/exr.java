import javax.annotation.Nullable;

public abstract class exr extends exc {
   exr(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, ve.a);
   }

   public static exr a(int $$0, int $$1, ahg $$2, int $$3, int $$4) {
      return new exr.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static exr a(int $$0, int $$1, ahg $$2) {
      return new exr.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fax $$0) {
   }

   @Override
   public void a(gjc $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewp a(fbd $$0) {
      return null;
   }

   static class a extends exr {
      private final ahg a;

      public a(int $$0, int $$1, int $$2, int $$3, ahg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ews $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends exr {
      private final ahg a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ahg $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ews $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
