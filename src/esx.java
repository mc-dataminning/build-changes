import javax.annotation.Nullable;

public abstract class esx extends esi {
   esx(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, tk.a);
   }

   public static esx a(int $$0, int $$1, aez $$2, int $$3, int $$4) {
      return new esx.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static esx a(int $$0, int $$1, aez $$2) {
      return new esx.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(ewd $$0) {
   }

   @Override
   public void a(gdm $$0) {
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Nullable
   @Override
   public erw a(ewj $$0) {
      return null;
   }

   static class a extends esx {
      private final aez a;

      public a(int $$0, int $$1, int $$2, int $$3, aez $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(erz $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i());
      }
   }

   static class b extends esx {
      private final aez a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aez $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(erz $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i(), 0.0F, 0.0F, this.l(), this.i(), this.b, this.c);
      }
   }
}
