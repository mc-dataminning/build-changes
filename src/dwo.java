import javax.annotation.Nullable;

public class dwo extends dux implements did {
   private final dgj a = new dgj() {
      @Override
      public void a(dhi $$0, jh $$1, int $$2) {
         $$0.a($$1, dko.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dhi $$0, jh $$1, dic $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dxv $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dwo(jh $$0, dxv $$1) {
      super(duz.j, $$0, $$1);
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

   public static void a(dhi $$0, jh $$1, dxv $$2, dwo $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dhi $$0, jh $$1, dxv $$2, dwo $$3) {
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
   public void a(bvr<?> $$0, bam $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public dgj c() {
      return this.a;
   }
}
