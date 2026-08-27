import javax.annotation.Nullable;

public abstract class ext extends exe {
   ext(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, ve.a);
   }

   public static ext a(int $$0, int $$1, ahg $$2, int $$3, int $$4) {
      return new ext.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static ext a(int $$0, int $$1, ahg $$2) {
      return new ext.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(faz $$0) {
   }

   @Override
   public void a(gje $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public ewr a(fbf $$0) {
      return null;
   }

   static class a extends ext {
      private final ahg a;

      public a(int $$0, int $$1, int $$2, int $$3, ahg $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends ext {
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
      protected void b(ewu $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
