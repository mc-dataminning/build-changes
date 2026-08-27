import java.nio.file.Path;

public class fdp extends ezd {
   private static final int a = 8;
   private static final ui b = ui.c("telemetry_info.screen.title");
   private static final ui c = ui.c("telemetry_info.screen.description").a(n.h);
   private static final ui k = ui.c("telemetry_info.button.privacy_statement");
   private static final ui l = ui.c("telemetry_info.button.give_feedback");
   private static final ui m = ui.c("telemetry_info.button.show_data");
   private final ezd n;
   private final ers o;
   private fdo p;
   private double q;

   public fdp(ezd $$0, ers $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public ui h() {
      return uh.a(super.h(), c);
   }

   @Override
   protected void aM_() {
      ewr $$0 = new ewr();
      $$0.c().a(8);
      $$0.a(this.h);
      ewx $$1 = $$0.a(ewx.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new euq(this.m(), this.i));
      $$1.a(new eud(c, this.i).j(this.g - 16).b(true));
      etj $$2 = etj.a(k, this::b).a();
      $$1.a($$2);
      ews $$3 = this.a(etj.a(l, this::c).a(), etj.a(m, this::d).a());
      $$1.a($$3);
      ews $$4 = this.a(this.l(), etj.a(uh.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fdo(0, 0, this.g - 40, $$4.r() - ($$3.r() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      ewr.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
   }

   private eth l() {
      eth $$0 = this.o.ae().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(etj $$0) {
      this.f.a(this.n);
   }

   private void b(etj $$0) {
      this.f.a(new exw($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(etj $$0) {
      this.f.a(new exw($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(etj $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void aC_() {
      this.f.a(this.n);
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private ews a(eth $$0, eth $$1) {
      ews $$2 = new ews();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
