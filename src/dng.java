public class dng extends dnt {
   public static final int e = 9;
   private iw<crs> f = iw.a(9, crs.i);

   protected dng(dmq<?> $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
   }

   public dng(id $$0, dpi $$1) {
      this(dmq.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(axt $$0) {
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

   public int a(crs $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).d()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected wi k() {
      return wi.c("container.dispenser");
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.f = iw.a(this.b(), crs.i);
      if (!this.a_($$0)) {
         bnz.b($$0, this.f, $$1);
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bnz.a($$0, this.f, $$1);
      }
   }

   @Override
   protected iw<crs> j() {
      return this.f;
   }

   @Override
   protected void a(iw<crs> $$0) {
      this.f = $$0;
   }

   @Override
   protected cmw a(int $$0, cjz $$1) {
      return new cnp($$0, $$1, this);
   }
}
