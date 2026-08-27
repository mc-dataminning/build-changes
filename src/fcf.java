import java.util.UUID;

public class fcf extends fcb<fjp.a> {
   private static final int s = 120;
   private static final ti t = ti.c("gui.abuseReport.name.title");
   private final evy u = evy.d().a(8);
   private etd v;
   private esl w;

   private fcf(eyf $$0, fju $$1, fjp.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcf(eyf $$0, fju $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fjp.a($$2, $$3, $$1.a().b()));
   }

   public fcf(eyf $$0, fju $$1, fjp $$2) {
      this($$0, $$1, new fjp.a($$2, $$1.a().b()));
   }

   @Override
   protected void aD_() {
      this.u.c().b();
      this.u.a(new etr(this.e, this.i));
      ti $$0 = ti.b(this.q.e().a()).a(n.o);
      this.u.a(new etr(ti.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(evq.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      evy $$1 = this.u.a(evy.e().a(8));
      $$1.a(esl.a(th.k, $$0x -> this.au_()).a(120).a());
      this.w = $$1.a(esl.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         esj var10000 = this.d($$1x);
      });
      this.b();
   }

   @Override
   protected void b() {
      this.u.a();
      evs.a(this.u, this.s());
   }

   private void C() {
      fjq.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fjq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
