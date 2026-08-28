public class dwg extends dwu {
   public static final int d = 9;
   private kb<cxy> e = kb.a(9, cxy.k);

   protected dwg(dvn<?> $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
   }

   public dwg(jj $$0, dym $$1) {
      this(dvn.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(azs $$0) {
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

   public cxy b(cxy $$0) {
      int $$1 = this.e_($$0);

      for (int $$2 = 0; $$2 < this.e.size(); $$2++) {
         cxy $$3 = this.e.get($$2);
         if ($$3.f() || cxy.c($$0, $$3)) {
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
   protected wv j() {
      return wv.c("container.dispenser");
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.e = kb.a(this.b(), cxy.k);
      if (!this.b_($$0)) {
         btk.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      if (!this.c_($$0)) {
         btk.a($$0, this.e, $$1);
      }
   }

   @Override
   protected kb<cxy> f() {
      return this.e;
   }

   @Override
   protected void a(kb<cxy> $$0) {
      this.e = $$0;
   }

   @Override
   protected ctn a(int $$0, cqh $$1) {
      return new cui($$0, $$1, this);
   }
}
