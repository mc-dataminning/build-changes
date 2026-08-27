import javax.annotation.Nullable;

public class dkk extends dix implements cwj {
   private final cut a = new cut() {
      @Override
      public void a(cvr $$0, hz $$1, int $$2) {
         $$0.a($$1, cyu.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cvr $$0, hz $$1, cwi $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dlj $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dkk(hz $$0, dlj $$1) {
      super(diz.j, $$0, $$1);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cvr $$0, hz $$1, dlj $$2, dkk $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cvr $$0, hz $$1, dlj $$2, dkk $$3) {
      $$3.a.a((aow)$$0, $$1);
   }

   public aan c() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      sw $$0 = this.q();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bnw<?> $$0, awp $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cut d() {
      return this.a;
   }
}
