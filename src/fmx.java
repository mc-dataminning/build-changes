public class fmx extends fjx {
   private static final int a = 600;
   private final vg b;
   private fdy c;
   private int d;
   private final fhp o = fhp.d();

   public fmx(wi $$0, vg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected void aM_() {
      this.o.c().b().a(10);
      this.o.a(new fff(this.i, this.m));
      this.c = this.o.a(fdy.a(wh.p, $$0 -> this.b.a(fiq.a)).a());
      this.c.j = false;
      this.o.a();
      this.o.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fhj.a(this.o, this.G());
   }

   @Override
   public void e() {
      super.e();
      this.d++;
      if (this.d == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
