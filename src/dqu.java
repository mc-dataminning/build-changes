public class dqu extends drm {
   public static final int d = 9;
   private jj<cuh> e = jj.a(9, cuh.i);

   protected dqu(dqe<?> $$0, ir $$1, dtc $$2) {
      super($$0, $$1, $$2);
   }

   public dqu(ir $$0, dtc $$1) {
      this(dqe.g, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayt $$0) {
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

   public int b(cuh $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).d()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected xe k() {
      return xe.c("container.dispenser");
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.e = jj.a(this.b(), cuh.i);
      if (!this.a_($$0)) {
         bpu.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpu.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jj<cuh> j() {
      return this.e;
   }

   @Override
   protected void a(jj<cuh> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpg a(int $$0, clx $$1) {
      return new cpz($$0, $$1, this);
   }
}
