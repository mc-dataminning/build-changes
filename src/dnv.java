public class dnv extends doi {
   public static final int e = 9;
   private je<csd> f = je.a(9, csd.i);

   protected dnv(dnf<?> $$0, im $$1, dpy $$2) {
      super($$0, $$1, $$2);
   }

   public dnv(im $$0, dpy $$1) {
      this(dnf.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayd $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).d() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(csd $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).d()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected ws k() {
      return ws.c("container.dispenser");
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.f = je.a(this.b(), csd.i);
      if (!this.a_($$0)) {
         bok.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bok.a($$0, this.f, $$1);
      }
   }

   @Override
   protected je<csd> j() {
      return this.f;
   }

   @Override
   protected void a(je<csd> $$0) {
      this.f = $$0;
   }

   @Override
   protected cnh a(int $$0, ckk $$1) {
      return new coa($$0, $$1, this);
   }
}
