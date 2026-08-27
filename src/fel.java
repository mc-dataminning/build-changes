import javax.annotation.Nullable;

public abstract class fel extends fdw {
   fel(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wh.a);
   }

   public static fel a(int $$0, int $$1, ajv $$2, int $$3, int $$4) {
      return new fel.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fel a(int $$0, int $$1, ajv $$2) {
      return new fel.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fhu $$0) {
   }

   @Override
   public void a(gqj $$0) {
   }

   @Override
   public boolean B() {
      return false;
   }

   @Nullable
   @Override
   public fdi a(fia $$0) {
      return null;
   }

   static class a extends fel {
      private final ajv a;

      public a(int $$0, int $$1, int $$2, int $$3, ajv $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v());
      }
   }

   static class b extends fel {
      private final ajv a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ajv $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fdl $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.C(), this.D(), this.x(), this.v(), 0.0F, 0.0F, this.x(), this.v(), this.b, this.c);
      }
   }
}
