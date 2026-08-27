import java.util.UUID;

public class fcf extends fcb<fjq.a> {
   private static final int s = 120;
   private static final tl t = tl.c("gui.abuseReport.name.title");
   private final evy u = evy.d().a(8);
   private etc v;
   private esk w;

   private fcf(eye $$0, fjv $$1, fjq.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcf(eye $$0, fjv $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fjq.a($$2, $$3, $$1.a().b()));
   }

   public fcf(eye $$0, fjv $$1, fjq $$2) {
      this($$0, $$1, new fjq.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.u.c().b();
      this.u.a(new etr(this.e, this.i));
      tl $$0 = tl.b(this.q.e().a()).a(n.o);
      this.u.a(new etr(tl.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.u.a(evq.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      evy $$1 = this.u.a(evy.e().a(8));
      $$1.a(esk.a(tk.k, $$0x -> this.az_()).a(120).a());
      this.w = $$1.a(esk.a(a, $$0x -> this.l()).a(120).a());
      this.D();
      this.u.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.u.a();
      evs.a(this.u, this.s());
   }

   private void D() {
      fjr.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fjr.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
