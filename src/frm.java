import java.util.UUID;

public class frm extends fri<fzh.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.abuseReport.name.title");
   private final fld A = fld.d().a(8);
   private fie B;
   private fhm C;

   private frm(fnd $$0, fzm $$1, fzh.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frm(fnd $$0, fzm $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fzh.a($$2, $$3, $$1.a().b()));
   }

   public frm(fnd $$0, fzm $$1, fzh $$2) {
      this($$0, $$1, new fzh.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.A.c().b();
      this.A.a(new fit(this.k, this.o));
      wu $$0 = wu.b(this.x.e().a()).a(n.o);
      this.A.a(new fit(wu.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.A.a(fkv.a(this.o, this.B, q, $$0x -> $$0x.e(12)));
      fld $$1 = this.A.a(fld.e().a(8));
      $$1.a(fhm.a(wt.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhm.a(a, $$0x -> this.m()).a(120).a());
      this.E();
      this.A.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fkx.a(this.A, this.H());
   }

   private void E() {
      fzi.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fzi.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
