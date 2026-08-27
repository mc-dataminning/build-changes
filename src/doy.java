public class doy extends dpl {
   public static final int d = 9;
   private jg<cto> e = jg.a(9, cto.i);

   protected doy(doi<?> $$0, io $$1, drb $$2) {
      super($$0, $$1, $$2);
   }

   public doy(io $$0, drb $$1) {
      this(doi.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayk $$0) {
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

   public int b(cto $$0) {
      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         if (this.e.get($$1).e()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected wx k() {
      return wx.c("container.dispenser");
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.e = jg.a(this.b(), cto.i);
      if (!this.a_($$0)) {
         bpo.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpo.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jg<cto> j() {
      return this.e;
   }

   @Override
   protected void a(jg<cto> $$0) {
      this.e = $$0;
   }

   @Override
   protected cot a(int $$0, clv $$1) {
      return new cpm($$0, $$1, this);
   }
}
