import java.util.UUID;

public class fru extends frq<fzp.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.abuseReport.name.title");
   private final fll A = fll.d().a(8);
   private fim B;
   private fhu C;

   private fru(fnl $$0, fzu $$1, fzp.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fru(fnl $$0, fzu $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fzp.a($$2, $$3, $$1.a().b()));
   }

   public fru(fnl $$0, fzu $$1, fzp $$2) {
      this($$0, $$1, new fzp.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.A.c().b();
      this.A.a(new fjb(this.k, this.o));
      wu $$0 = wu.b(this.x.e().a()).a(n.o);
      this.A.a(new fjb(wu.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.A.a(fld.a(this.o, this.B, q, $$0x -> $$0x.e(12)));
      fll $$1 = this.A.a(fll.e().a(8));
      $$1.a(fhu.a(wt.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhu.a(a, $$0x -> this.m()).a(120).a());
      this.D();
      this.A.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      flf.a(this.A, this.H());
   }

   private void D() {
      fzq.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fzq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
