import java.util.UUID;

public class fde extends fda<fkp.a> {
   private static final int s = 120;
   private static final ui t = ui.c("gui.abuseReport.name.title");
   private final ewx u = ewx.d().a(8);
   private eub v;
   private etj w;

   private fde(ezd $$0, fku $$1, fkp.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fde(ezd $$0, fku $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fkp.a($$2, $$3, $$1.a().b()));
   }

   public fde(ezd $$0, fku $$1, fkp $$2) {
      this($$0, $$1, new fkp.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.u.c().b();
      this.u.a(new euq(this.e, this.i));
      ui $$0 = ui.b(this.q.e().a()).a(n.o);
      this.u.a(new euq(ui.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(ewp.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      ewx $$1 = this.u.a(ewx.e().a(8));
      $$1.a(etj.a(uh.k, $$0x -> this.aC_()).a(120).a());
      this.w = $$1.a(etj.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      ewr.a(this.u, this.s());
   }

   private void C() {
      fkq.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fkq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
