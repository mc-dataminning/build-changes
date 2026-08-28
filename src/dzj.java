public class dzj extends dzx {
   public static final int d = 9;
   private jp<dak> e = jp.a(9, dak.l);

   protected dzj(dyq<?> $$0, iw $$1, ebq $$2) {
      super($$0, $$1, $$2);
   }

   public dzj(iw $$0, ebq $$1) {
      this(dyq.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(bai $$0) {
      this.d_(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.e.size(); $$3++) {
         if (!this.e.get($$3).f() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public dak b(dak $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         dak $$3 = this.e.get($$2);
         if ($$3.f() || dak.c($$0, $$3)) {
            int $$4 = Math.min($$0.M(), $$1 - $$3.M());
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
   protected xg j() {
      return xg.c("container.dispenser");
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.e = jp.a(this.b(), dak.l);
      if (!this.b_($$0)) {
         buw.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (!this.b($$0)) {
         buw.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jp<dak> f() {
      return this.e;
   }

   @Override
   protected void a(jp<dak> $$0) {
      this.e = $$0;
   }

   @Override
   protected cwb a(int $$0, csh $$1) {
      return new cww($$0, $$1, this);
   }
}
