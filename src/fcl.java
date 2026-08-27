import java.nio.file.Path;

public class fcl extends eya {
   private static final int a = 8;
   private static final tf b = tf.c("telemetry_info.screen.title");
   private static final tf c = tf.c("telemetry_info.screen.description").a(n.h);
   private static final tf k = tf.c("telemetry_info.button.privacy_statement");
   private static final tf l = tf.c("telemetry_info.button.give_feedback");
   private static final tf m = tf.c("telemetry_info.button.show_data");
   private final eya n;
   private final eqp o;
   private fck p;
   private double q;

   public fcl(eya $$0, eqp $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public tf e() {
      return te.a(super.e(), c);
   }

   @Override
   protected void aC_() {
      evn $$0 = new evn();
      $$0.c().a(8);
      $$0.a(this.h);
      evt $$1 = $$0.a(evt.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new etm(this.m(), this.i));
      $$1.a(new eta(c, this.i).j(this.g - 16).b(true));
      esg $$2 = esg.a(k, this::b).a();
      $$1.a($$2);
      evo $$3 = this.a(esg.a(l, this::c).a(), esg.a(m, this::d).a());
      $$1.a($$3);
      evo $$4 = this.a(this.l(), esg.a(te.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fck(0, 0, this.g - 40, $$4.t() - ($$3.t() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evn.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
   }

   private ese l() {
      ese $$0 = this.o.ae().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(esg $$0) {
      this.f.a(this.n);
   }

   private void b(esg $$0) {
      this.f.a(new ews($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(esg $$0) {
      this.f.a(new ews($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(esg $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void at_() {
      this.f.a(this.n);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private evo a(ese $$0, ese $$1) {
      evo $$2 = new evo();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
