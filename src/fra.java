import javax.annotation.Nullable;

public abstract class fra extends fql {
   fra(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, wu.a);
   }

   public static fra a(int $$0, int $$1, ald $$2, int $$3, int $$4) {
      return new fra.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fra a(int $$0, int $$1, ald $$2) {
      return new fra.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fuk $$0) {
   }

   @Override
   public void a(hlv $$0) {
   }

   @Override
   public boolean E() {
      return false;
   }

   @Nullable
   @Override
   public fpw a(fuq $$0) {
      return null;
   }

   static class a extends fra {
      private final ald a;

      public a(int $$0, int $$1, int $$2, int $$3, ald $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         $$0.a(goi::H, this.a, this.F(), this.G(), this.A(), this.y());
      }
   }

   static class b extends fra {
      private final ald a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ald $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fpz $$0, int $$1, int $$2, float $$3) {
         $$0.a(goi::H, this.a, this.F(), this.G(), 0.0F, 0.0F, this.A(), this.y(), this.b, this.c);
      }
   }
}
