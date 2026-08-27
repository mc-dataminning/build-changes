import javax.annotation.Nullable;

public abstract class ezu extends ezf {
   ezu(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, vp.a);
   }

   public static ezu a(int $$0, int $$1, aiy $$2, int $$3, int $$4) {
      return new ezu.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static ezu a(int $$0, int $$1, aiy $$2) {
      return new ezu.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0) {
   }

   @Override
   public void a(glk $$0) {
   }

   @Override
   public boolean A() {
      return false;
   }

   @Nullable
   @Override
   public eyr a(fdi $$0) {
      return null;
   }

   static class a extends ezu {
      private final aiy a;

      public a(int $$0, int $$1, int $$2, int $$3, aiy $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u());
      }
   }

   static class b extends ezu {
      private final aiy a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aiy $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(eyu $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.B(), this.C(), this.w(), this.u(), 0.0F, 0.0F, this.w(), this.u(), this.b, this.c);
      }
   }
}
