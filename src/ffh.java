import java.nio.file.Path;
import javax.annotation.Nullable;

public class ffh extends fau {
   private static final int a = 8;
   private static final ur b = ur.c("telemetry_info.screen.title");
   private static final ur c = ur.c("telemetry_info.screen.description").a(n.h);
   private static final ur k = ur.c("telemetry_info.button.privacy_statement");
   private static final ur l = ur.c("telemetry_info.button.give_feedback");
   private static final ur m = ur.c("telemetry_info.button.show_data");
   private static final ur n = ur.c("telemetry_info.opt_in.description");
   private final fau o;
   private final eth p;
   @Nullable
   private ffg q;
   private double r;

   public ffh(fau $$0, eth $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public ur h() {
      return uq.a(super.h(), c);
   }

   @Override
   protected void aP_() {
      eyh $$0 = new eyh();
      $$0.c().a(8);
      $$0.a(this.h);
      eyn $$1 = $$0.a(eyn.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new ewg(this.m(), this.i));
      $$1.a(new evt(c, this.i).j(this.g - 16).b(true));
      eyi $$2 = this.a(euz.a(k, this::b).a(), euz.a(l, this::c).a());
      $$1.a($$2);
      eyk $$3 = this.l();
      $$0.a();
      $$3.a();
      int $$4 = $$2.r() + $$2.i();
      int $$5 = $$3.i();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new ffg(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      eyh.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
   }

   private eyk l() {
      eyn $$0 = eyn.d();
      $$0.c().b().e(4);
      if (this.f.A()) {
         $$0.a(this.C());
      }

      $$0.a(this.a(euz.a(m, this::d).a(), euz.a(uq.d, this::a).a()));
      return $$0;
   }

   private eux C() {
      etg<Boolean> $$0 = this.p.af();
      evb $$1 = evb.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.i = this.f.A();
      return $$1;
   }

   private void a(eux $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(euz $$0) {
      this.f.a(this.o);
   }

   private void b(euz $$0) {
      ezm.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(euz $$0) {
      ezm.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(euz $$0) {
      Path $$1 = this.f.t().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void aF_() {
      this.f.a(this.o);
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private eyi a(eux $$0, eux $$1) {
      eyi $$2 = new eyi();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
