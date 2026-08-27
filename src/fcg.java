import java.nio.file.Path;

public class fcg extends exz {
   private static final int a = 8;
   private static final tf b = tf.c("telemetry_info.screen.title");
   private static final tf c = tf.c("telemetry_info.screen.description").a(n.h);
   private static final tf k = tf.c("telemetry_info.button.privacy_statement");
   private static final tf l = tf.c("telemetry_info.button.give_feedback");
   private static final tf m = tf.c("telemetry_info.button.show_data");
   private final exz n;
   private final eqq o;
   private fcf p;
   private double q;

   public fcg(exz $$0, eqq $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public tf e() {
      return te.a(super.e(), c);
   }

   @Override
   protected void aE_() {
      evm $$0 = new evm();
      $$0.c().a(8);
      $$0.a(this.h);
      evs $$1 = $$0.a(evs.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new etm(this.m(), this.i));
      $$1.a(new etb(c, this.i).i(this.g - 16).b(true));
      esh $$2 = esh.a(k, this::b).a();
      $$1.a($$2);
      evn $$3 = this.a(esh.a(l, this::c).a(), esh.a(m, this::d).a());
      $$1.a($$3);
      evn $$4 = this.a(this.l(), esh.a(te.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fcf(0, 0, this.g - 40, $$4.r() - ($$3.r() + $$3.h()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      evm.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         esf var10000 = this.d($$1x);
      });
   }

   private esf l() {
      esf $$0 = this.o.ad().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.B();
      return $$0;
   }

   private void a(esh $$0) {
      this.f.a(this.n);
   }

   private void b(esh $$0) {
      this.f.a(new ewr($$0x -> {
         if ($$0x) {
            ac.i().a("http://go.microsoft.com/fwlink/?LinkId=521839");
         }

         this.f.a(this);
      }, "http://go.microsoft.com/fwlink/?LinkId=521839", true));
   }

   private void c(esh $$0) {
      this.f.a(new ewr($$0x -> {
         if ($$0x) {
            ac.i().a("https://aka.ms/javafeedback?ref=game");
         }

         this.f.a(this);
      }, "https://aka.ms/javafeedback?ref=game", true));
   }

   private void d(esh $$0) {
      Path $$1 = this.f.u().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void au_() {
      this.f.a(this.n);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private evn a(esf $$0, esf $$1) {
      evn $$2 = new evn();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
