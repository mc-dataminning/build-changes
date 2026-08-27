import java.nio.file.Path;

public class fcx extends eym {
   private static final int a = 8;
   private static final tn b = tn.c("telemetry_info.screen.title");
   private static final tn c = tn.c("telemetry_info.screen.description").a(n.h);
   private static final tn k = tn.c("telemetry_info.button.privacy_statement");
   private static final tn l = tn.c("telemetry_info.button.give_feedback");
   private static final tn m = tn.c("telemetry_info.button.show_data");
   private final eym n;
   private final erb o;
   private fcw p;
   private double q;

   public fcx(eym $$0, erb $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public tn g() {
      return tm.a(super.g(), c);
   }

   @Override
   protected void aH_() {
      evz $$0 = new evz();
      $$0.c().a(8);
      $$0.a(this.h);
      ewf $$1 = $$0.a(ewf.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new ety(this.m(), this.i));
      $$1.a(new etm(c, this.i).j(this.g - 16).b(true));
      ess $$2 = ess.a(k, this::b).a();
      $$1.a($$2);
      ewa $$3 = this.a(ess.a(l, this::c).a(), ess.a(m, this::d).a());
      $$1.a($$3);
      ewa $$4 = this.a(this.l(), ess.a(tm.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fcw(0, 0, this.g - 40, $$4.t() - ($$3.t() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evz.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
   }

   private esq l() {
      esq $$0 = this.o.ae().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(ess $$0) {
      this.f.a(this.n);
   }

   private void b(ess $$0) {
      this.f.a(new exe($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(ess $$0) {
      this.f.a(new exe($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(ess $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private ewa a(esq $$0, esq $$1) {
      ewa $$2 = new ewa();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
