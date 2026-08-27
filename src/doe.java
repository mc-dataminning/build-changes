public class doe extends dor {
   public static final int d = 9;
   private jf<csz> e = jf.a(9, csz.i);

   protected doe(dno<?> $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
   }

   public doe(in $$0, dqh $$1) {
      this(dno.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayg $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).d() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int b(csz $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).d()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected wu k() {
      return wu.c("container.dispenser");
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.e = jf.a(this.b(), csz.i);
      if (!this.a_($$0)) {
         bpg.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpg.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jf<csz> j() {
      return this.e;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.e = $$0;
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return new cox($$0, $$1, this);
   }
}
