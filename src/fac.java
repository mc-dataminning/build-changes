public class fac extends gsq {
   private static final ws a = ws.c("mco.client.incompatible.title").b(-65536);
   private static final ws b = ws.b(aa.b().c()).b(-65536);
   private static final ws c = ws.a("mco.client.unsupported.snapshot.version", b);
   private static final ws B = ws.a("mco.client.outdated.stable.version", b);
   private final fkt C;
   private final fih D = new fih(this);

   public fac(fkt $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aM_() {
      this.D.a(a, this.p);
      this.D.c(new ffo(this.C(), this.p).b(true));
      this.D.b(feu.a(wr.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   public void d() {
      this.m.a(this.C);
   }

   private ws C() {
      return aa.b().g() ? B : c;
   }
}
