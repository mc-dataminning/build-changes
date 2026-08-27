public class dga extends dgm {
   public static final int e = 9;
   private ip<clo> f = ip.a(9, clo.b);

   protected dga(dfk<?> $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
   }

   public dga(hx $$0, dhn $$1) {
      this(dfk.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(atw $$0) {
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

   public int a(clo $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected uv l() {
      return uv.c("container.dispenser");
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.f = ip.a(this.b(), clo.b);
      if (!this.c_($$0)) {
         biv.b($$0, this.f);
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      if (!this.d_($$0)) {
         biv.a($$0, this.f);
      }
   }

   @Override
   protected ip<clo> k() {
      return this.f;
   }

   @Override
   protected void a(ip<clo> $$0) {
      this.f = $$0;
   }

   @Override
   protected cgr a(int $$0, cdy $$1) {
      return new chk($$0, $$1, this);
   }
}
