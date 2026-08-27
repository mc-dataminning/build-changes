import javax.annotation.Nullable;

public class dlt extends dkg implements cxr {
   private final cwb a = new cwb() {
      @Override
      public void a(cwz $$0, ib $$1, int $$2) {
         $$0.a($$1, dac.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cwz $$0, ib $$1, cxq $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dmz $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dlt(ib $$0, dmz $$1) {
      super(dki.j, $$0, $$1);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(cwz $$0, ib $$1, dmz $$2, dlt $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cwz $$0, ib $$1, dmz $$2, dlt $$3) {
      $$3.a.a((apf)$$0, $$1);
   }

   public aat b() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      ta $$1 = this.d($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bpc<?> $$0, axd $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cwb c() {
      return this.a;
   }
}
