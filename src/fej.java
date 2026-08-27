import java.util.UUID;

public class fej extends fef<flu.a> {
   private static final int r = 120;
   private static final ur t = ur.c("gui.abuseReport.name.title");
   private final eya u = eya.d().a(8);
   private eve v;
   private eum w;

   private fej(fah $$0, flz $$1, flu.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fej(fah $$0, flz $$1, UUID $$2, String $$3) {
      this($$0, $$1, new flu.a($$2, $$3, $$1.a().b()));
   }

   public fej(fah $$0, flz $$1, flu $$2) {
      this($$0, $$1, new flu.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.u.c().b();
      this.u.a(new evt(this.e, this.i));
      ur $$0 = ur.b(this.q.e().a()).a(n.o);
      this.u.a(new evt(ur.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(exs.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      eya $$1 = this.u.a(eya.e().a(8));
      $$1.a(eum.a(uq.k, $$0x -> this.aE_()).a(120).a());
      this.w = $$1.a(eum.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      exu.a(this.u, this.s());
   }

   private void C() {
      flv.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, flv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
