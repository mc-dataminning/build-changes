import javax.annotation.Nullable;

public class dwn extends duw implements dic {
   private final dgi a = new dgi() {
      @Override
      public void a(dhh $$0, jh $$1, int $$2) {
         $$0.a($$1, dkn.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dhh $$0, jh $$1, dib $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dxu $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dwn(jh $$0, dxu $$1) {
      super(duy.j, $$0, $$1);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dhh $$0, jh $$1, dxu $$2, dwn $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dhh $$0, jh $$1, dxu $$2, dwn $$3) {
      $$3.a.a((ash)$$0, $$1);
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      ux $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bvq<?> $$0, bam $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dgi c() {
      return this.a;
   }
}
