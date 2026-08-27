public class fim extends ffl {
   private static final int a = 600;
   private final uo b;
   private ezo c;
   private int k;
   private final fde l = fde.d();

   public fim(vq $$0, uo $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aO_() {
      return false;
   }

   @Override
   protected void aQ_() {
      this.l.c().b().a(10);
      this.l.a(new fav(this.e, this.i));
      this.c = this.l.a(ezo.a(vp.p, $$0 -> this.b.a(fef.a)).a());
      this.c.j = false;
      this.l.a();
      this.l.a($$1 -> {
         ezm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      fcy.a(this.l, this.F());
   }

   @Override
   public void e() {
      super.e();
      this.k++;
      if (this.k == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
