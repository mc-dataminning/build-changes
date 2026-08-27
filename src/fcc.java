import java.nio.file.Path;

public class fcc extends exv {
   private static final int a = 8;
   private static final te b = te.c("telemetry_info.screen.title");
   private static final te c = te.c("telemetry_info.screen.description").a(n.h);
   private static final te k = te.c("telemetry_info.button.privacy_statement");
   private static final te l = te.c("telemetry_info.button.give_feedback");
   private static final te m = te.c("telemetry_info.button.show_data");
   private final exv n;
   private final eqr o;
   private fcb p;
   private double q;

   public fcc(exv $$0, eqr $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public te e() {
      return td.a(super.e(), c);
   }

   @Override
   protected void aE_() {
      evi $$0 = new evi();
      $$0.c().a(8);
      $$0.a(this.h);
      evo $$1 = $$0.a(evo.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new etn(this.m(), this.i));
      $$1.a(new etc(c, this.i).i(this.g - 16).b(true));
      esi $$2 = esi.a(k, this::b).a();
      $$1.a($$2);
      evj $$3 = this.a(esi.a(l, this::c).a(), esi.a(m, this::d).a());
      $$1.a($$3);
      evj $$4 = this.a(this.l(), esi.a(td.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fcb(0, 0, this.g - 40, $$4.r() - ($$3.r() + $$3.h()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evi.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         esg var10000 = this.d($$1x);
      });
   }

   private esg l() {
      esg $$0 = this.o.ad().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.A();
      return $$0;
   }

   private void a(esi $$0) {
      this.f.a(this.n);
   }

   private void b(esi $$0) {
      this.f.a(new ewn($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(esi $$0) {
      this.f.a(new ewn($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(esi $$0) {
      Path $$1 = this.f.t().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private evj a(esg $$0, esg $$1) {
      evj $$2 = new evj();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
