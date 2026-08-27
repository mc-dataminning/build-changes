import javax.annotation.Nullable;

public class dlv extends dki implements cxt {
   private final cwd a = new cwd() {
      @Override
      public void a(cxb $$0, ib $$1, int $$2) {
         $$0.a($$1, dae.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cxb $$0, ib $$1, cxs $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dnb $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dlv(ib $$0, dnb $$1) {
      super(dkk.j, $$0, $$1);
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

   public static void a(cxb $$0, ib $$1, dnb $$2, dlv $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cxb $$0, ib $$1, dnb $$2, dlv $$3) {
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
   public void a(bpd<?> $$0, axd $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cwd c() {
      return this.a;
   }
}
