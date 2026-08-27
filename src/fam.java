public class fam extends gtb {
   private static final wu a = wu.c("mco.client.incompatible.title").b(-65536);
   private static final wu b = wu.b(aa.b().c()).b(-65536);
   private static final wu c = wu.a("mco.client.unsupported.snapshot.version", b);
   private static final wu B = wu.a("mco.client.outdated.stable.version", b);
   private final fld C;
   private final fir D = new fir(this);

   public fam(fld $$0) {
      super(a);
      this.C = $$0;
   }

   @Override
   public void aM_() {
      this.D.a(a, this.p);
      this.D.c(new ffy(this.C(), this.p).b(true));
      this.D.b(ffe.a(wt.k, $$0 -> this.d()).a(200).a());
      this.D.a($$1 -> {
         ffc var10000 = this.c($$1);
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

   private wu C() {
      return aa.b().g() ? B : c;
   }
}
