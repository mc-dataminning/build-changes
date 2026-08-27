public class fiy extends fjx {
   private static final wi a = wi.c("gui.toMenu");
   private static final wi b = wi.c("gui.toTitle");
   private final fjx c;
   private final wi d;
   private final wi o;
   private final fhp p = fhp.d();

   public fiy(fjx $$0, wi $$1, wi $$2) {
      this($$0, $$1, $$2, a);
   }

   public fiy(fjx $$0, wi $$1, wi $$2, wi $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.o = $$3;
   }

   @Override
   protected void aM_() {
      this.p.c().b().a(10);
      this.p.a(new fff(this.i, this.m));
      this.p.a(new fes(this.d, this.m).d(this.k - 50).b(true));
      fdy $$0;
      if (this.j.F()) {
         $$0 = fdy.a(this.o, $$0x -> this.j.a(this.c)).a();
      } else {
         $$0 = fdy.a(b, $$0x -> this.j.a(new fkc())).a();
      }

      this.p.a($$0);
      this.p.a();
      this.p.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fhj.a(this.p, this.G());
   }

   @Override
   public wi i() {
      return wh.a(this.i, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
