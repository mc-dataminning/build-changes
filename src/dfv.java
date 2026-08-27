public class dfv extends dgh {
   public static final int c = 9;
   private il<clj> d = il.a(9, clj.b);

   protected dfv(dff<?> $$0, ht $$1, dhi $$2) {
      super($$0, $$1, $$2);
   }

   public dfv(ht $$0, dhi $$1) {
      this(dff.f, $$0, $$1);
   }

   @Override
   public int b() {
      return 9;
   }

   public int a(ats $$0) {
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

   public int a(clj $$0) {
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
      this.d = il.a(this.b(), clj.b);
      if (!this.d($$0)) {
         bir.b($$0, this.d);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bir.a($$0, this.d);
      }
   }

   @Override
   protected il<clj> f() {
      return this.d;
   }

   @Override
   protected void a(il<clj> $$0) {
      this.d = $$0;
   }

   @Override
   protected cgm a(int $$0, cdt $$1) {
      return new chf($$0, $$1, this);
   }
}
