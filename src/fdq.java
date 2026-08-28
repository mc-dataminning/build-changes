public class fdq extends gwj {
   private static final wy a = wy.c("mco.client.incompatible.title").b(-65536);
   private static final wy b = wy.b(ab.b().c()).b(-65536);
   private static final wy c = wy.a("mco.client.unsupported.snapshot.version", b);
   private static final wy A = wy.a("mco.client.outdated.stable.version", b);
   private final fnx B;
   private final flt C = new flt(this);

   public fdq(fnx $$0) {
      super(a);
      this.B = $$0;
   }

   @Override
   public void aP_() {
      this.C.a(a, this.o);
      this.C.c(new fja(this.D(), this.o).b(true));
      this.C.b(fig.a(wx.k, $$0 -> this.d()).a(200).a());
      this.C.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.l.a(this.B);
   }

   private wy D() {
      return ab.b().g() ? A : c;
   }
}
