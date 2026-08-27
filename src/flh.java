import java.util.UUID;

public class flh extends fld<ftb.a> {
   private static final int r = 120;
   private static final vu t = vu.c("gui.abuseReport.name.title");
   private final fex u = fex.d().a(8);
   private fby v;
   private fbg w;

   private flh(fhf $$0, ftg $$1, ftb.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public flh(fhf $$0, ftg $$1, UUID $$2, String $$3) {
      this($$0, $$1, new ftb.a($$2, $$3, $$1.a().b()));
   }

   public flh(fhf $$0, ftg $$1, ftb $$2) {
      this($$0, $$1, new ftb.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.u.c().b();
      this.u.a(new fcn(this.e, this.i));
      vu $$0 = vu.b(this.q.e().a()).a(n.o);
      this.u.a(new fcn(vu.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.u.a(fep.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fex $$1 = this.u.a(fex.e().a(8));
      $$1.a(fbg.a(vt.k, $$0x -> this.d()).a(120).a());
      this.w = $$1.a(fbg.a(a, $$0x -> this.o()).a(120).a());
      this.E();
      this.u.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fer.a(this.u, this.F());
   }

   private void E() {
      ftc.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, ftc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
