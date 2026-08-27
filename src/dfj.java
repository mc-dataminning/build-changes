public class dfj extends dfv {
   public static final int c = 9;
   private il<clb> d = il.a(9, clb.b);

   protected dfj(det<?> $$0, ht $$1, dgw $$2) {
      super($$0, $$1, $$2);
   }

   public dfj(ht $$0, dgw $$1) {
      this(det.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ato $$0) {
      this.e(null);
      int $$1 = -1;
      int $$2 = 1;

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         if (!this.d.get($$3).b() && $$0.a($$2++) == 0) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public int a(clb $$0) {
      for (int $$1 = 0; $$1 < this.d.size(); $$1++) {
         if (this.d.get($$1).b()) {
            this.a($$1, $$0);
            return $$1;
         }
      }

      return -1;
   }

   @Override
   protected ur g() {
      return ur.c("container.dispenser");
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.d = il.a(this.b(), clb.b);
      if (!this.d($$0)) {
         bik.b($$0, this.d);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bik.a($$0, this.d);
      }
   }

   @Override
   protected il<clb> f() {
      return this.d;
   }

   @Override
   protected void a(il<clb> $$0) {
      this.d = $$0;
   }

   @Override
   protected cge a(int $$0, cdl $$1) {
      return new cgx($$0, $$1, this);
   }
}
