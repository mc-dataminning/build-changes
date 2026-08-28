import javax.annotation.Nullable;

public abstract class foq extends fob {
   foq(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xu.a);
   }

   public static foq a(int $$0, int $$1, alz $$2, int $$3, int $$4) {
      return new foq.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static foq a(int $$0, int $$1, alz $$2) {
      return new foq.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(fsb $$0) {
   }

   @Override
   public void a(hgl $$0) {
   }

   @Override
   public boolean C() {
      return false;
   }

   @Nullable
   @Override
   public fnn a(fsh $$0) {
      return null;
   }

   static class a extends foq {
      private final alz a;

      public a(int $$0, int $$1, int $$2, int $$3, alz $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fnq $$0, int $$1, int $$2, float $$3) {
         $$0.a(glt::B, this.a, this.D(), this.E(), this.y(), this.w());
      }
   }

   static class b extends foq {
      private final alz a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, alz $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fnq $$0, int $$1, int $$2, float $$3) {
         $$0.a(glt::B, this.a, this.D(), this.E(), 0.0F, 0.0F, this.y(), this.w(), this.b, this.c);
      }
   }
}
