import javax.annotation.Nullable;

public class drw extends dqh implements ddp {
   private final dby a = new dby() {
      @Override
      public void a(dcw $$0, jd $$1, int $$2) {
         $$0.a($$1, dga.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable dcw $$0, jd $$1, ddo $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dtc $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public drw(jd $$0, dtc $$1) {
      super(dqj.j, $$0, $$1);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, drw $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dcw $$0, jd $$1, dtc $$2, drw $$3) {
      $$3.a.a((aqu)$$0, $$1);
   }

   public acb b() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      ub $$1 = this.e($$0);
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
   public void a(bsx<?> $$0, ayw $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dby c() {
      return this.a;
   }
}
