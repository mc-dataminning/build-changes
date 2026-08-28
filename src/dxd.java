import javax.annotation.Nullable;

public class dxd extends dvl implements dik {
   private final dgr a = new dgr() {
      @Override
      public void a(dhp $$0, jj $$1, int $$2) {
         $$0.a($$1, dkw.cA, $$2, 0);
      }

      @Override
      public void a(@Nullable dhp $$0, jj $$1, dij $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dym $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public dxd(jj $$0, dym $$1) {
      super(dvn.j, $$0, $$1);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dxd $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dhp $$0, jj $$1, dym $$2, dxd $$3) {
      $$3.a.a((arn)$$0, $$1);
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      tw $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bwb<?> $$0, azs $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dgr c() {
      return this.a;
   }
}
