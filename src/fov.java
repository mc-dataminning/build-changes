import java.util.UUID;

public class fov extends foq<fwp.a> {
   private static final int y = 120;
   private static final ws z = ws.c("gui.abuseReport.name.title");
   private final fil A = fil.d().a(8);
   private ffm B;
   private feu C;

   private fov(fkt $$0, fwu $$1, fwp.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fov(fkt $$0, fwu $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fwp.a($$2, $$3, $$1.a().b()));
   }

   public fov(fkt $$0, fwu $$1, fwp $$2) {
      this($$0, $$1, new fwp.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.A.c().b();
      this.A.a(new fgb(this.l, this.p));
      ws $$0 = ws.b(this.x.e().a()).a(n.o);
      this.A.a(new fgb(ws.a("gui.abuseReport.name.reporting", $$0), this.p), $$0x -> $$0x.a().a(0, 8));
      this.B = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.A.a(fid.a(this.p, this.B, d, $$0x -> $$0x.e(12)));
      fil $$1 = this.A.a(fil.e().a(8));
      $$1.a(feu.a(wr.k, $$0x -> this.d()).a(120).a());
      this.C = $$1.a(feu.a(a, $$0x -> this.m()).a(120).a());
      this.C();
      this.A.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
      fif.a(this.A, this.G());
   }

   private void C() {
      fwq.b $$0 = this.x.c();
      this.C.j = $$0 == null;
      this.C.a(x.a($$0, fwq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.B.b($$0, $$1, $$2);
   }
}
