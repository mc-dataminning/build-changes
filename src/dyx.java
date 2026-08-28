public class dyx extends dzl {
   public static final int d = 9;
   private jo<czy> e = jo.a(9, czy.k);

   protected dyx(dye<?> $$0, iv $$1, ebe $$2) {
      super($$0, $$1, $$2);
   }

   public dyx(iv $$0, ebe $$1) {
      this(dye.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azx $$0) {
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

   public czy b(czy $$0) {
      int $$1 = this.f_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         czy $$3 = this.e.get($$2);
         if ($$3.f() || czy.c($$0, $$3)) {
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
   protected xa j() {
      return xa.c("container.dispenser");
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.e = jo.a(this.b(), czy.k);
      if (!this.b_($$0)) {
         bul.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         bul.a($$0, this.e, $$1);
      }
   }

   @Override
   protected jo<czy> f() {
      return this.e;
   }

   @Override
   protected void a(jo<czy> $$0) {
      this.e = $$0;
   }

   @Override
   protected cvq a(int $$0, crw $$1) {
      return new cwl($$0, $$1, this);
   }
}
