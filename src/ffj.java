public class ffj extends fgh {
   private static final vs a = vs.c("gui.toMenu");
   private static final vs b = vs.c("gui.toTitle");
   private final fgh c;
   private final vs k;
   private final vs l;
   private final fea m = fea.d();

   public ffj(fgh $$0, vs $$1, vs $$2) {
      this($$0, $$1, $$2, a);
   }

   public ffj(fgh $$0, vs $$1, vs $$2, vs $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      this.m.c().b().a(10);
      this.m.a(new fbr(this.e, this.i));
      this.m.a(new fbe(this.k, this.i).c(this.g - 50).b(true));
      fak $$0;
      if (this.f.E()) {
         $$0 = fak.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = fak.a(b, $$0x -> this.f.a(new fgm())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fdu.a(this.m, this.F());
   }

   @Override
   public vs i() {
      return vr.a(this.e, this.k);
   }

   @Override
   public boolean aN_() {
      return false;
   }
}
