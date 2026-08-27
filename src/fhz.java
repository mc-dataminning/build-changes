import java.nio.file.Path;
import javax.annotation.Nullable;

public class fhz extends fdm {
   private static final int a = 8;
   private static final vg b = vg.c("telemetry_info.screen.title");
   private static final vg c = vg.c("telemetry_info.screen.description").a(n.h);
   private static final vg k = vg.c("telemetry_info.button.privacy_statement");
   private static final vg l = vg.c("telemetry_info.button.give_feedback");
   private static final vg m = vg.c("telemetry_info.button.show_data");
   private static final vg n = vg.c("telemetry_info.opt_in.description");
   private final fdm o;
   private final evv p;
   @Nullable
   private fhy q;
   private double r;

   public fhz(fdm $$0, evv $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vg i() {
      return vf.a(super.i(), c);
   }

   @Override
   protected void aP_() {
      faz $$0 = new faz();
      $$0.c().a(8);
      $$0.a(this.h);
      fbf $$1 = $$0.a(fbf.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new eyy(this.p(), this.i));
      $$1.a(new eyl(c, this.i).c(this.g - 16).b(true));
      fba $$2 = this.a(exr.a(k, this::b).a(), exr.a(l, this::c).a());
      $$1.a($$2);
      fbc $$3 = this.o();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fhy(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      faz.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
   }

   private fbc o() {
      fbf $$0 = fbf.d();
      $$0.c().b().e(4);
      if (this.f.B()) {
         $$0.a(this.E());
      }

      $$0.a(this.a(exr.a(m, this::d).a(), exr.a(vf.d, this::a).a()));
      return $$0;
   }

   private exp E() {
      evu<Boolean> $$0 = this.p.af();
      ext $$1 = ext.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.B();
      return $$1;
   }

   private void a(exp $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(exr $$0) {
      this.f.a(this.o);
   }

   private void b(exr $$0) {
      fce.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(exr $$0) {
      fce.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(exr $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fba a(exp $$0, exp $$1) {
      fba $$2 = new fba();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
