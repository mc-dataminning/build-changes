import javax.annotation.Nullable;

public abstract class exl extends eww {
   exl(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, vc.a);
   }

   public static exl a(int $$0, int $$1, ahd $$2, int $$3, int $$4) {
      return new exl.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static exl a(int $$0, int $$1, ahd $$2) {
      return new exl.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(far $$0) {
   }

   @Override
   public void a(gir $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewj a(fax $$0) {
      return null;
   }

   static class a extends exl {
      private final ahd a;

      public a(int $$0, int $$1, int $$2, int $$3, ahd $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends exl {
      private final ahd a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ahd $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ewm $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
