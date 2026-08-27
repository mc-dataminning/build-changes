import javax.annotation.Nullable;

public class dpu extends dog implements dbp {
   private final czz a = new czz() {
      @Override
      public void a(dax $$0, io $$1, int $$2) {
         $$0.a($$1, dea.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dax $$0, io $$1, dbo $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            drb $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dpu(io $$0, drb $$1) {
      super(doi.j, $$0, $$1);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dax $$0, io $$1, drb $$2, dpu $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dax $$0, io $$1, drb $$2, dpu $$3) {
      $$3.a.a((aqm)$$0, $$1);
   }

   public abx b() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      ud $$1 = this.e($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsa<?> $$0, ayk $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public czz c() {
      return this.a;
   }
}
