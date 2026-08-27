import javax.annotation.Nullable;

public abstract class exs extends exd {
   exs(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, ve.a);
   }

   public static exs a(int $$0, int $$1, ahg $$2, int $$3, int $$4) {
      return new exs.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static exs a(int $$0, int $$1, ahg $$2) {
      return new exs.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fay $$0) {
   }

   @Override
   public void a(gjd $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewq a(fbe $$0) {
      return null;
   }

   static class a extends exs {
      private final ahg a;

      public a(int $$0, int $$1, int $$2, int $$3, ahg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ewt $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends exs {
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
      protected void b(ewt $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
