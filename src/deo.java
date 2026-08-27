public class deo extends dfa {
   public static final int c = 9;
   private il<ckj> f = il.a(9, ckj.b);

   protected deo(ddz<?> $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
   }

   public deo(ht $$0, dgb $$1) {
      this(ddz.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ate $$0) {
      this.e(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.f.size(); $$3++) {
         if (!this.f.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(ckj $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         if (this.f.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected ui g() {
      return ui.c("container.dispenser");
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.f = il.a(this.b(), ckj.b);
      if (!this.d($$0)) {
         bhv.b($$0, this.f);
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bhv.a($$0, this.f);
      }
   }

   @Override
   protected il<ckj> f() {
      return this.f;
   }

   @Override
   protected void a(il<ckj> $$0) {
      this.f = $$0;
   }

   @Override
   protected cfp a(int $$0, ccw $$1) {
      return new cgg($$0, $$1, this);
   }
}
