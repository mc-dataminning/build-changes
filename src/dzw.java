import javax.annotation.Nullable;

public class dzw extends dye implements dku {
   private final diz a = new diz() {
      @Override
      public void a(djz $$0, iw $$1, int $$2) {
         $$0.a($$1, dng.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable djz $$0, iw $$1, dkt $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            ebg $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dzw(iw $$0, ebg $$1) {
      super(dyg.j, $$0, $$1);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzw $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(djz $$0, iw $$1, ebg $$2, dzw $$3) {
      $$3.a.a((aru)$$0, $$1);
   }

   public ace a() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      ua $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bxe<?> $$0, azz $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public diz c() {
      return this.a;
   }
}
