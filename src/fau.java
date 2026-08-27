public class fau extends exv {
   private static final int a = 600;
   private final sf b;
   private esi c;
   private int k;
   private final evo l = evo.d();

   public fau(te $$0, sf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected void aE_() {
      this.l.c().b().a(10);
      this.l.a(new etn(this.e, this.i));
      this.c = this.l.a(esi.a(td.p, $$0 -> this.b.a(ewp.a)).a());
      this.c.i = false;
      this.l.a();
      this.l.a($$1 -> {
         esg var10000 = this.d($$1);
      });
      this.b();
   }

   @Override
   protected void b() {
      evi.a(this.l, this.s());
   }

   @Override
   public void c() {
      super.c();
      this.k++;
      if (this.k == 600) {
         this.c.i = true;
      }

      if (this.b.k()) {
         this.b.d();
      } else {
         this.b.p();
      }
   }
}
