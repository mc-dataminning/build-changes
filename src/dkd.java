public class dkd extends dkp {
   public static final int e = 9;
   private iu<cpq> f = iu.a(9, cpq.h);

   protected dkd(djn<?> $$0, ib $$1, dme $$2) {
      super($$0, $$1, $$2);
   }

   public dkd(ib $$0, dme $$1) {
      this(djn.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(awt $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(cpq $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected vs k() {
      return vs.c("container.dispenser");
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.f = iu.a(this.b(), cpq.h);
      if (!this.c_($$0)) {
         bmf.b($$0, this.f);
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         bmf.a($$0, this.f);
      }
   }

   @Override
   protected iu<cpq> j() {
      return this.f;
   }

   @Override
   protected void a(iu<cpq> $$0) {
      this.f = $$0;
   }

   @Override
   protected cku a(int $$0, chz $$1) {
      return new cln($$0, $$1, this);
   }
}
