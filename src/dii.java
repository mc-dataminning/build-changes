import javax.annotation.Nullable;

public class dii extends dgv implements cuh {
   private final csr a = new csr() {
      @Override
      public void a(ctp $$0, hx $$1, int $$2) {
         $$0.a($$1, cws.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable ctp $$0, hx $$1, cug $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            djh $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dii(hx $$0, djh $$1) {
      super(dgx.j, $$0, $$1);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dii $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(ctp $$0, hx $$1, djh $$2, dii $$3) {
      $$3.a.a((and)$$0, $$1);
   }

   public zh c() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      sn $$0 = this.q();
      $$0.r("SpawnPotentials");
      return $$0;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.o, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(blz<?> $$0, auv $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public csr d() {
      return this.a;
   }
}
