public class fmb extends hpb {
   private static final wy a = wy.c("mco.client.incompatible.title").b(-65536);
   private static final wy b = wy.b(ab.b().c()).b(-65536);
   private static final wy c = wy.a("mco.client.unsupported.snapshot.version", b);
   private static final wy C = wy.a("mco.client.outdated.stable.version", b);
   private final fxu D;
   private final fvq E = new fvq(this);

   public fmb(fxu $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aN_() {
      this.E.a(a, this.p);
      this.E.c(new fsw(this.E(), this.p).b(true));
      this.E.b(fsc.a(wx.k, $$0 -> this.aK_()).a(200).a());
      this.E.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aK_() {
      this.m.a(this.D);
   }

   private wy E() {
      return ab.b().g() ? C : c;
   }
}
