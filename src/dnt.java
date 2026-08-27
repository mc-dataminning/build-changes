import javax.annotation.Nullable;

public class dnt extends dmf implements czp {
   private final cxz a = new cxz() {
      @Override
      public void a(cyx $$0, ib $$1, int $$2) {
         $$0.a($$1, dca.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cyx $$0, ib $$1, czo $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            doz $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dnt(ib $$0, doz $$1) {
      super(dmh.j, $$0, $$1);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      this.a.a($$0);
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dnt $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cyx $$0, ib $$1, doz $$2, dnt $$3) {
      $$3.a.a((aps)$$0, $$1);
   }

   public abf b() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      tm $$1 = this.d($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bqb<?> $$0, axr $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public cxz c() {
      return this.a;
   }
}
