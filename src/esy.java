import javax.annotation.Nullable;

public abstract class esy extends esj {
   esy(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, th.a);
   }

   public static esy a(int $$0, int $$1, aeu $$2, int $$3, int $$4) {
      return new esy.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static esy a(int $$0, int $$1, aeu $$2) {
      return new esy.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(ewd $$0) {
   }

   @Override
   public void a(gdl $$0) {
   }

   @Override
   public boolean az_() {
      return false;
   }

   @Nullable
   @Override
   public erx a(ewj $$0) {
      return null;
   }

   static class a extends esy {
      private final aeu a;

      public a(int $$0, int $$1, int $$2, int $$3, aeu $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i());
      }
   }

   static class b extends esy {
      private final aeu a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, aeu $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(esa $$0, int $$1, int $$2, float $$3) {
         $$0.a(this.a, this.r(), this.t(), this.l(), this.i(), 0.0F, 0.0F, this.l(), this.i(), this.b, this.c);
      }
   }
}
