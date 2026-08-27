import java.nio.file.Path;

public class feu extends fah {
   private static final int a = 8;
   private static final ur b = ur.c("telemetry_info.screen.title");
   private static final ur c = ur.c("telemetry_info.screen.description").a(n.h);
   private static final ur k = ur.c("telemetry_info.button.privacy_statement");
   private static final ur l = ur.c("telemetry_info.button.give_feedback");
   private static final ur m = ur.c("telemetry_info.button.show_data");
   private final fah n;
   private final esv o;
   private fet p;
   private double q;

   public feu(fah $$0, esv $$1) {
      super(b);
      this.n = $$0;
      this.o = $$1;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), c);
   }

   @Override
   protected void aO_() {
      exu $$0 = new exu();
      $$0.c().a(8);
      $$0.a(this.h);
      eya $$1 = $$0.a(eya.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new evt(this.m(), this.i));
      $$1.a(new evg(c, this.i).j(this.g - 16).b(true));
      eum $$2 = eum.a(k, this::b).a();
      $$1.a($$2);
      exv $$3 = this.a(eum.a(l, this::c).a(), eum.a(m, this::d).a());
      $$1.a($$3);
      exv $$4 = this.a(this.l(), eum.a(uq.d, this::a).a());
      $$0.a($$4, $$0.b().a(0.5F, 1.0F));
      $$0.a();
      this.p = new fet(0, 0, this.g - 40, $$4.r() - ($$3.r() + $$3.i()) - 16, this.f.h);
      this.p.a(this.q);
      this.p.a($$0x -> this.q = $$0x);
      this.c(this.p);
      $$1.a(this.p);
      $$0.a();
      exu.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
   }

   private euk l() {
      euk $$0 = this.o.af().a(this.o, 0, 0, 150, $$0x -> this.p.b($$0x));
      $$0.i = this.f.A();
      return $$0;
   }

   private void a(eum $$0) {
      this.f.a(this.n);
   }

   private void b(eum $$0) {
      eyz.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(eum $$0) {
      eyz.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(eum $$0) {
      Path $$1 = this.f.t().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void aE_() {
      this.f.a(this.n);
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private exv a(euk $$0, euk $$1) {
      exv $$2 = new exv();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
