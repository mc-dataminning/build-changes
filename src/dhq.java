import javax.annotation.Nullable;

public class dhq extends dgd implements ctq {
   private final csa a = new csa() {
      @Override
      public void a(csy $$0, hv $$1, int $$2) {
         $$0.a($$1, cwb.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable csy $$0, hv $$1, ctp $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dip $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dhq(hv $$0, dip $$1) {
      super(dgf.j, $$0, $$1);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhq $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(csy $$0, hv $$1, dip $$2, dhq $$3) {
      $$3.a.a((amp)$$0, $$1);
   }

   public yv c() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      sj $$0 = this.q();
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
   public void a(blj<?> $$0, auf $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public csa d() {
      return this.a;
   }
}
