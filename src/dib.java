import javax.annotation.Nullable;

public class dib extends dgo implements cua {
   private final csk a = new csk() {
      @Override
      public void a(cti $$0, hx $$1, int $$2) {
         $$0.a($$1, cwl.ct, $$2, 0);
      }

      @Override
      public void a(@Nullable cti $$0, hx $$1, ctz $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            dja $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 4);
         }
      }
   };

   public dib(hx $$0, dja $$1) {
      super(dgq.j, $$0, $$1);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a.a(this.o, this.p, $$0);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.a.a($$0);
   }

   public static void a(cti $$0, hx $$1, dja $$2, dib $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(cti $$0, hx $$1, dja $$2, dib $$3) {
      $$3.a.a((amz)$$0, $$1);
   }

   public ze c() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      sl $$0 = this.q();
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
   public void a(blt<?> $$0, aup $$1) {
      this.a.a($$0, this.o, $$1, this.p);
      this.e();
   }

   public csk d() {
      return this.a;
   }
}
