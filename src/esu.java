import javax.annotation.Nullable;

public abstract class esu extends esf {
   esu(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, te.a);
   }

   public static esu a(int $$0, int $$1, aer $$2, int $$3, int $$4) {
      return new esu.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static esu a(int $$0, int $$1, aer $$2) {
      return new esu.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(evx $$0) {
   }

   @Override
   public void a(gcx $$0) {
   }

   @Override
   public boolean az_() {
      return false;
   }

   @Nullable
   @Override
   public ert a(ewd $$0) {
      return null;
   }

   static class a extends esu {
      private final aer a;

      public a(int $$0, int $$1, int $$2, int $$3, aer $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.h());
      }
   }

   static class b extends esu {
      private final aer a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aer $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(erw $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.p(), this.r(), this.k(), this.h(), 0.0F, 0.0F, this.k(), this.h(), this.b, this.c);
      }
   }
}
