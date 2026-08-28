public class fdw extends gwq {
   private static final wz a = wz.c("mco.client.incompatible.title").b(-65536);
   private static final wz b = wz.b(ab.b().c()).b(-65536);
   private static final wz c = wz.a("mco.client.unsupported.snapshot.version", b);
   private static final wz B = wz.a("mco.client.outdated.stable.version", b);
   private final fod C;
   private final flz D = new flz(this);

   public fdw(fod $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aT_() {
      this.D.a(a, this.o);
      this.D.c(new fjg(this.C(), this.o).b(true));
      this.D.b(fim.a(wy.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }

   private wz C() {
      return ab.b().g() ? B : c;
   }
}
