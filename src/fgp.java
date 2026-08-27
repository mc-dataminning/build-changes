import java.nio.file.Path;
import javax.annotation.Nullable;

public class fgp extends fcc {
   private static final int a = 8;
   private static final vb b = vb.c("telemetry_info.screen.title");
   private static final vb c = vb.c("telemetry_info.screen.description").a(n.h);
   private static final vb k = vb.c("telemetry_info.button.privacy_statement");
   private static final vb l = vb.c("telemetry_info.button.give_feedback");
   private static final vb m = vb.c("telemetry_info.button.show_data");
   private static final vb n = vb.c("telemetry_info.opt_in.description");
   private final fcc o;
   private final euo p;
   @Nullable
   private fgo q;
   private double r;

   public fgp(fcc $$0, euo $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vb h() {
      return va.a(super.h(), c);
   }

   @Override
   protected void aP_() {
      ezp $$0 = new ezp();
      $$0.c().a(8);
      $$0.a(this.h);
      ezv $$1 = $$0.a(ezv.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new exo(this.m(), this.i));
      $$1.a(new exb(c, this.i).j(this.g - 16).b(true));
      ezq $$2 = this.a(ewh.a(k, this::b).a(), ewh.a(l, this::c).a());
      $$1.a($$2);
      ezs $$3 = this.l();
      $$0.a();
      $$3.a();
      int $$4 = $$2.r() + $$2.i();
      int $$5 = $$3.i();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fgo(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      ezp.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
   }

   private ezs l() {
      ezv $$0 = ezv.d();
      $$0.c().b().e(4);
      if (this.f.A()) {
         $$0.a(this.C());
      }

      $$0.a(this.a(ewh.a(m, this::d).a(), ewh.a(va.d, this::a).a()));
      return $$0;
   }

   private ewf C() {
      eun<Boolean> $$0 = this.p.af();
      ewj $$1 = ewj.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.i = this.f.A();
      return $$1;
   }

   private void a(ewf $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(ewh $$0) {
      this.f.a(this.o);
   }

   private void b(ewh $$0) {
      fau.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(ewh $$0) {
      fau.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(ewh $$0) {
      Path $$1 = this.f.t().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void aF_() {
      this.f.a(this.o);
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private ezq a(ewf $$0, ewf $$1) {
      ezq $$2 = new ezq();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
