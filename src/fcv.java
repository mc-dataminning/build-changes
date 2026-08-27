import java.nio.file.Path;

public class fcv extends eyk {
   private static final int a = 8;
   private static final tl b = tl.c("telemetry_info.screen.title");
   private static final tl c = tl.c("telemetry_info.screen.description").a(n.h);
   private static final tl k = tl.c("telemetry_info.button.privacy_statement");
   private static final tl l = tl.c("telemetry_info.button.give_feedback");
   private static final tl m = tl.c("telemetry_info.button.show_data");
   private final eyk n;
   private final eqz o;
   private fcu p;
   private double q;

   public fcv(eyk $$0, eqz $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public tl g() {
      return tk.a(super.g(), c);
   }

   @Override
   protected void aI_() {
      evx $$0 = new evx();
      $$0.c().a(8);
      $$0.a(this.h);
      ewd $$1 = $$0.a(ewd.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new etw(this.m(), this.i));
      $$1.a(new etk(c, this.i).j(this.g - 16).b(true));
      esq $$2 = esq.a(k, this::b).a();
      $$1.a($$2);
      evy $$3 = this.a(esq.a(l, this::c).a(), esq.a(m, this::d).a());
      $$1.a($$3);
      evy $$4 = this.a(this.l(), esq.a(tk.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fcu(0, 0, this.g - 40, $$4.t() - ($$3.t() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evx.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
   }

   private eso l() {
      eso $$0 = this.o.ae().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(esq $$0) {
      this.f.a(this.n);
   }

   private void b(esq $$0) {
      this.f.a(new exc($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(esq $$0) {
      this.f.a(new exc($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(esq $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void az_() {
      this.f.a(this.n);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private evy a(eso $$0, eso $$1) {
      evy $$2 = new evy();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
