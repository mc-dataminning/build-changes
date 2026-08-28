import javax.annotation.Nullable;

public abstract class fmq extends fmb {
   fmq(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xi.a);
   }

   public static fmq a(int $$0, int $$1, alj $$2, int $$3, int $$4) {
      return new fmq.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fmq a(int $$0, int $$1, alj $$2) {
      return new fmq.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fqb $$0) {
   }

   @Override
   public void a(heg $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fln a(fqh $$0) {
      return null;
   }

   static class a extends fmq {
      private final alj a;

      public a(int $$0, int $$1, int $$2, int $$3, alj $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         $$0.a(gjq::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends fmq {
      private final alj a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alj $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(flq $$0, int $$1, int $$2, float $$3) {
         $$0.a(gjq::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
