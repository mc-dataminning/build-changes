public class dpa extends dpn {
   public static final int d = 9;
   private jg<ctq> e = jg.a(9, ctq.i);

   protected dpa(dok<?> $$0, io $$1, drd $$2) {
      super($$0, $$1, $$2);
   }

   public dpa(io $$0, drd $$1) {
      this(dok.f, $$0, $$1);
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

   public int b(ctq $$0) {
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
      this.e = jg.a(this.b(), ctq.i);
      if (!this.a_($$0)) {
         bpq.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpq.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jg<ctq> j() {
      return this.e;
   }

   @Override
   protected void a(jg<ctq> $$0) {
      this.e = $$0;
   }

   @Override
   protected cov a(int $$0, clx $$1) {
      return new cpo($$0, $$1, this);
   }
}
