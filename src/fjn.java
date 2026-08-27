import java.util.UUID;

public class fjn extends fjj<fre.a> {
   private static final int r = 120;
   private static final vq t = vq.c("gui.abuseReport.name.title");
   private final fde u = fde.d().a(8);
   private fag v;
   private ezo w;

   private fjn(ffl $$0, frj $$1, fre.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fjn(ffl $$0, frj $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fre.a($$2, $$3, $$1.a().b()));
   }

   public fjn(ffl $$0, frj $$1, fre $$2) {
      this($$0, $$1, new fre.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.u.c().b();
      this.u.a(new fav(this.e, this.i));
      vq $$0 = vq.b(this.q.e().a()).a(n.o);
      this.u.a(new fav(vq.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.u.a(fcw.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fde $$1 = this.u.a(fde.e().a(8));
      $$1.a(ezo.a(vp.k, $$0x -> this.d()).a(120).a());
      this.w = $$1.a(ezo.a(a, $$0x -> this.o()).a(120).a());
      this.E();
      this.u.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fcy.a(this.u, this.F());
   }

   private void E() {
      frf.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, frf.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
