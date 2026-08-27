import java.util.UUID;

public class fkj extends fkf<fsb.a> {
   private static final int r = 120;
   private static final vs t = vs.c("gui.abuseReport.name.title");
   private final fea u = fea.d().a(8);
   private fbc v;
   private fak w;

   private fkj(fgh $$0, fsg $$1, fsb.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fkj(fgh $$0, fsg $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fsb.a($$2, $$3, $$1.a().b()));
   }

   public fkj(fgh $$0, fsg $$1, fsb $$2) {
      this($$0, $$1, new fsb.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.u.c().b();
      this.u.a(new fbr(this.e, this.i));
      vs $$0 = vs.b(this.q.e().a()).a(n.o);
      this.u.a(new fbr(vs.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.u.a(fds.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      fea $$1 = this.u.a(fea.e().a(8));
      $$1.a(fak.a(vr.k, $$0x -> this.d()).a(120).a());
      this.w = $$1.a(fak.a(a, $$0x -> this.o()).a(120).a());
      this.E();
      this.u.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      fdu.a(this.u, this.F());
   }

   private void E() {
      fsc.b $$0 = this.q.c();
      this.w.j = $$0 == null;
      this.w.a(x.a($$0, fsc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
