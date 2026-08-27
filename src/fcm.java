import java.util.UUID;

public class fcm extends fci<fjw.a> {
   private static final int s = 120;
   private static final tn t = tn.c("gui.abuseReport.name.title");
   private final ewf u = ewf.d().a(8);
   private etk v;
   private ess w;

   private fcm(eym $$0, fkb $$1, fjw.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcm(eym $$0, fkb $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fjw.a($$2, $$3, $$1.a().b()));
   }

   public fcm(eym $$0, fkb $$1, fjw $$2) {
      this($$0, $$1, new fjw.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.u.c().b();
      this.u.a(new ety(this.e, this.i));
      tn $$0 = tn.b(this.q.e().a()).a(n.o);
      this.u.a(new ety(tn.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.u.a(evx.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      ewf $$1 = this.u.a(ewf.e().a(8));
      $$1.a(ess.a(tm.k, $$0x -> this.az_()).a(120).a());
      this.w = $$1.a(ess.a(a, $$0x -> this.l()).a(120).a());
      this.D();
      this.u.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.u.a();
      evz.a(this.u, this.s());
   }

   private void D() {
      fjx.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fjx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
