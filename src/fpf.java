import java.util.UUID;

public class fpf extends fpb<fwz.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.abuseReport.name.title");
   private final fiv A = fiv.d().a(8);
   private ffw B;
   private ffe C;

   private fpf(fld $$0, fxe $$1, fwz.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fpf(fld $$0, fxe $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fwz.a($$2, $$3, $$1.a().b()));
   }

   public fpf(fld $$0, fxe $$1, fwz $$2) {
      this($$0, $$1, new fwz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fgl(this.l, this.p));
      wu $$0 = wu.b(this.x.e().a()).a(n.o);
      this.A.a(new fgl(wu.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.A.a(fin.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fiv $$1 = this.A.a(fiv.e().a(8));
      $$1.a(ffe.a(wt.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(ffe.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.A.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fip.a(this.A, this.G());
   }

   private void C() {
      fxa.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fxa.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
