public class drx extends dsl {
   public static final int d = 9;
   private jw<cvl> e = jw.a(9, cvl.k);

   protected drx(drg<?> $$0, je $$1, dua $$2) {
      super($$0, $$1, $$2);
   }

   public drx(je $$0, dua $$1) {
      this(drg.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azk $$0) {
      this.e_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public cvl b(cvl $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cvl $$3 = this.e.get($$2);
         if ($$3.f() || cvl.c($$0, $$3)) {
            int $$4 = Math.min($$0.J(), $$1 - $$3.J());
            if ($$4 > 0) {
               if ($$3.f()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.f()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected xd j() {
      return xd.c("container.dispenser");
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.e = jw.a(this.b(), cvl.k);
      if (!this.b_($$0)) {
         bre.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bre.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jw<cvl> f() {
      return this.e;
   }

   @Override
   protected void a(jw<cvl> $$0) {
      this.e = $$0;
   }

   @Override
   protected cqq a(int $$0, cno $$1) {
      return new crl($$0, $$1, this);
   }
}
