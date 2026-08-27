import java.nio.file.Path;

public class fcq extends eye {
   private static final int a = 8;
   private static final tl b = tl.c("telemetry_info.screen.title");
   private static final tl c = tl.c("telemetry_info.screen.description").a(n.h);
   private static final tl k = tl.c("telemetry_info.button.privacy_statement");
   private static final tl l = tl.c("telemetry_info.button.give_feedback");
   private static final tl m = tl.c("telemetry_info.button.show_data");
   private final eye n;
   private final eqt o;
   private fcp p;
   private double q;

   public fcq(eye $$0, eqt $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public tl g() {
      return tk.a(super.g(), c);
   }

   @Override
   protected void aH_() {
      evs $$0 = new evs();
      $$0.c().a(8);
      $$0.a(this.h);
      evy $$1 = $$0.a(evy.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new etr(this.m(), this.i));
      $$1.a(new ete(c, this.i).j(this.g - 16).b(true));
      esk $$2 = esk.a(k, this::b).a();
      $$1.a($$2);
      evt $$3 = this.a(esk.a(l, this::c).a(), esk.a(m, this::d).a());
      $$1.a($$3);
      evt $$4 = this.a(this.l(), esk.a(tk.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fcp(0, 0, this.g - 40, $$4.t() - ($$3.t() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evs.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
   }

   private esi l() {
      esi $$0 = this.o.ae().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(esk $$0) {
      this.f.a(this.n);
   }

   private void b(esk $$0) {
      this.f.a(new ewx($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(esk $$0) {
      this.f.a(new ewx($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(esk $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private evt a(esi $$0, esi $$1) {
      evt $$2 = new evt();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
