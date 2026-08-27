import java.util.UUID;

public class flj extends flf<ftd.a> {
   private static final int r = 120;
   private static final vu t = vu.c("gui.abuseReport.name.title");
   private final fez u = fez.d().a(8);
   private fca v;
   private fbi w;

   private flj(fhh $$0, fti $$1, ftd.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public flj(fhh $$0, fti $$1, UUID $$2, String $$3) {
      this($$0, $$1, new ftd.a($$2, $$3, $$1.a().b()));
   }

   public flj(fhh $$0, fti $$1, ftd $$2) {
      this($$0, $$1, new ftd.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.u.c().b();
      this.u.a(new fcp(this.e, this.i));
      vu $$0 = vu.b(this.q.e().a()).a(n.o);
      this.u.a(new fcp(vu.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.u.a(fer.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fez $$1 = this.u.a(fez.e().a(8));
      $$1.a(fbi.a(vt.k, $$0x -> this.d()).a(120).a());
      this.w = $$1.a(fbi.a(a, $$0x -> this.o()).a(120).a());
      this.E();
      this.u.a($$1x -> {
         fbg var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fet.a(this.u, this.F());
   }

   private void E() {
      fte.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, fte.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
