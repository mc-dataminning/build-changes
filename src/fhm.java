import java.nio.file.Path;
import javax.annotation.Nullable;

public class fhm extends fcz {
   private static final int a = 8;
   private static final vf b = vf.c("telemetry_info.screen.title");
   private static final vf c = vf.c("telemetry_info.screen.description").a(n.h);
   private static final vf k = vf.c("telemetry_info.button.privacy_statement");
   private static final vf l = vf.c("telemetry_info.button.give_feedback");
   private static final vf m = vf.c("telemetry_info.button.show_data");
   private static final vf n = vf.c("telemetry_info.opt_in.description");
   private final fcz o;
   private final evk p;
   @Nullable
   private fhl q;
   private double r;

   public fhm(fcz $$0, evk $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vf h() {
      return ve.a(super.h(), c);
   }

   @Override
   protected void aN_() {
      fam $$0 = new fam();
      $$0.c().a(8);
      $$0.a(this.h);
      fas $$1 = $$0.a(fas.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new eyl(this.o(), this.i));
      $$1.a(new exy(c, this.i).c(this.g - 16).b(true));
      fan $$2 = this.a(exe.a(k, this::b).a(), exe.a(l, this::c).a());
      $$1.a($$2);
      fap $$3 = this.n();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fhl(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fam.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
   }

   private fap n() {
      fas $$0 = fas.d();
      $$0.c().b().e(4);
      if (this.f.B()) {
         $$0.a(this.C());
      }

      $$0.a(this.a(exe.a(m, this::d).a(), exe.a(ve.d, this::a).a()));
      return $$0;
   }

   private exc C() {
      evj<Boolean> $$0 = this.p.af();
      exg $$1 = exg.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.B();
      return $$1;
   }

   private void a(exc $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(exe $$0) {
      this.f.a(this.o);
   }

   private void b(exe $$0) {
      fbr.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(exe $$0) {
      fbr.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(exe $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void aE_() {
      this.f.a(this.o);
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fan a(exc $$0, exc $$1) {
      fan $$2 = new fan();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
