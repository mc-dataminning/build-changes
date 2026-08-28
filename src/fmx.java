public class fmx extends hpw {
   private static final wy a = wy.c("mco.client.incompatible.title").b(-65536);
   private static final wy b = wy.b(ac.b().c()).b(-65536);
   private static final wy c = wy.a("mco.client.unsupported.snapshot.version", b);
   private static final wy C = wy.a("mco.client.outdated.stable.version", b);
   private final fyn D;
   private final fwj E = new fwj(this);

   public fmx(fyn $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aO_() {
      this.E.a(a, this.p);
      this.E.c(new ftp(this.E(), this.p).b(true));
      this.E.b(fsv.a(wx.k, $$0 -> this.aL_()).a(200).a());
      this.E.a($$1 -> {
         fst var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aL_() {
      this.m.a(this.D);
   }

   private wy E() {
      return ac.b().g() ? C : c;
   }
}
