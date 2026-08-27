import java.util.UUID;

public class fck extends fcg<fju.a> {
   private static final int s = 120;
   private static final tl t = tl.c("gui.abuseReport.name.title");
   private final ewd u = ewd.d().a(8);
   private eti v;
   private esq w;

   private fck(eyk $$0, fjz $$1, fju.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fck(eyk $$0, fjz $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fju.a($$2, $$3, $$1.a().b()));
   }

   public fck(eyk $$0, fjz $$1, fju $$2) {
      this($$0, $$1, new fju.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.u.c().b();
      this.u.a(new etw(this.e, this.i));
      tl $$0 = tl.b(this.q.e().a()).a(n.o);
      this.u.a(new etw(tl.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.u.a(evv.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      ewd $$1 = this.u.a(ewd.e().a(8));
      $$1.a(esq.a(tk.k, $$0x -> this.az_()).a(120).a());
      this.w = $$1.a(esq.a(a, $$0x -> this.l()).a(120).a());
      this.D();
      this.u.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.u.a();
      evx.a(this.u, this.s());
   }

   private void D() {
      fjv.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fjv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
