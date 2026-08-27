import javax.annotation.Nullable;

public abstract class fax extends fai {
   fax(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, vr.a);
   }

   public static fax a(int $$0, int $$1, ajc $$2, int $$3, int $$4) {
      return new fax.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fax a(int $$0, int $$1, ajc $$2) {
      return new fax.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fef $$0) {
   }

   @Override
   public void a(gmq $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ezu a(fel $$0) {
      return null;
   }

   static class a extends fax {
      private final ajc a;

      public a(int $$0, int $$1, int $$2, int $$3, ajc $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends fax {
      private final ajc a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ajc $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(ezx $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
