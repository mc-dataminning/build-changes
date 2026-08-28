public class dqi extends dqv {
   public static final int d = 9;
   private js<cuc> e = js.a(9, cuc.l);

   protected dqi(dpr<?> $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
   }

   public dqi(ja $$0, dsk $$1) {
      this(dpr.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ayo $$0) {
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

   public cuc b(cuc $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cuc $$3 = this.e.get($$2);
         if ($$3.e() || cuc.c($$0, $$3)) {
            int $$4 = Math.min($$0.H(), $$1 - $$3.H());
            if ($$4 > 0) {
               if ($$3.e()) {
                  this.a($$2, $$0.a($$4));
               } else {
                  $$0.h($$4);
                  $$3.g($$4);
               }
            }

            if ($$0.e()) {
               break;
            }
         }
      }

      return $$0;
   }

   @Override
   protected wu k() {
      return wu.c("container.dispenser");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e = js.a(this.b(), cuc.l);
      if (!this.a_($$0)) {
         bqa.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqa.a($$0, this.e, $$1);
      }
   }

   @Override
   protected js<cuc> j() {
      return this.e;
   }

   @Override
   protected void a(js<cuc> $$0) {
      this.e = $$0;
   }

   @Override
   protected cph a(int $$0, cmj $$1) {
      return new cqb($$0, $$1, this);
   }
}
