public class dqf extends dqs {
   public static final int d = 9;
   private js<cua> e = js.a(9, cua.l);

   protected dqf(dpp<?> $$0, ja $$1, dsh $$2) {
      super($$0, $$1, $$2);
   }

   public dqf(ja $$0, dsh $$1) {
      this(dpp.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(aym $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).e() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int b(cua $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).e()) {
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
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e = js.a(this.b(), cua.l);
      if (!this.a_($$0)) {
         bpx.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpx.a($$0, this.e, $$1);
      }
   }

   @Override
   protected js<cua> j() {
      return this.e;
   }

   @Override
   protected void a(js<cua> $$0) {
      this.e = $$0;
   }

   @Override
   protected cpe a(int $$0, cmg $$1) {
      return new cpy($$0, $$1, this);
   }
}
