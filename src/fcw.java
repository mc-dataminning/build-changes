public class fcw extends gvm {
   private static final wu a = wu.c("mco.client.incompatible.title").b(-65536);
   private static final wu b = wu.b(aa.b().c()).b(-65536);
   private static final wu c = wu.a("mco.client.unsupported.snapshot.version", b);
   private static final wu A = wu.a("mco.client.outdated.stable.version", b);
   private final fnd B;
   private final fkz C = new fkz(this);

   public fcw(fnd $$0) {
      super(a);
      this.B = $$0;
   }

   @Override
   public void aO_() {
      this.C.a(a, this.o);
      this.C.c(new fig(this.E(), this.o).b(true));
      this.C.b(fhm.a(wt.k, $$0 -> this.d()).a(200).a());
      this.C.a($$1 -> {
         fhk var10000 = this.c($$1);
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

   private wu E() {
      return aa.b().g() ? A : c;
   }
}
