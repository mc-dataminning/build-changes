import java.util.UUID;

public class frs extends fro<fzn.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.abuseReport.name.title");
   private final flj A = flj.d().a(8);
   private fik B;
   private fhs C;

   private frs(fnj $$0, fzs $$1, fzn.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frs(fnj $$0, fzs $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fzn.a($$2, $$3, $$1.a().b()));
   }

   public frs(fnj $$0, fzs $$1, fzn $$2) {
      this($$0, $$1, new fzn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.A.c().b();
      this.A.a(new fiz(this.k, this.o));
      wu $$0 = wu.b(this.x.e().a()).a(n.o);
      this.A.a(new fiz(wu.a("gui.abuseReport.name.reporting", $$0), this.o), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.A.a(flb.a(this.o, this.B, q, $$0x -> $$0x.e(12)));
      flj $$1 = this.A.a(flj.e().a(8));
      $$1.a(fhs.a(wt.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(fhs.a(a, $$0x -> this.m()).a(120).a());
      this.E();
      this.A.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fld.a(this.A, this.H());
   }

   private void E() {
      fzo.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fzo.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
