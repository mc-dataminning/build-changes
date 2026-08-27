import java.nio.file.Path;
import javax.annotation.Nullable;

public class fls extends fhf {
   private static final int a = 8;
   private static final vu b = vu.c("telemetry_info.screen.title");
   private static final vu c = vu.c("telemetry_info.screen.description").a(n.h);
   private static final vu k = vu.c("telemetry_info.button.privacy_statement");
   private static final vu l = vu.c("telemetry_info.button.give_feedback");
   private static final vu m = vu.c("telemetry_info.button.show_data");
   private static final vu n = vu.c("telemetry_info.opt_in.description");
   private final fhf o;
   private final ezk p;
   @Nullable
   private flr q;
   private double r;

   public fls(fhf $$0, ezk $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), c);
   }

   @Override
   protected void aO_() {
      fer $$0 = new fer();
      $$0.c().a(8);
      $$0.a(this.h);
      fex $$1 = $$0.a(fex.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new fcn(this.p(), this.i));
      $$1.a(new fca(c, this.i).c(this.g - 16).b(true));
      fes $$2 = this.a(fbg.a(k, this::b).a(), fbg.a(l, this::c).a());
      $$1.a($$2);
      feu $$3 = this.o();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new flr(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fer.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aF_() {
      this.b(this.q);
   }

   private feu o() {
      fex $$0 = fex.d();
      $$0.c().b().e(4);
      if (this.f.D()) {
         $$0.a(this.E());
      }

      $$0.a(this.a(fbg.a(m, this::d).a(), fbg.a(vt.d, this::a).a()));
      return $$0;
   }

   private fbe E() {
      ezj<Boolean> $$0 = this.p.ag();
      fbi $$1 = fbi.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.D();
      return $$1;
   }

   private void a(fbe $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(fbg $$0) {
      this.f.a(this.o);
   }

   private void b(fbg $$0) {
      ffw.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(fbg $$0) {
      ffw.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(fbg $$0) {
      Path $$1 = this.f.u().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fes a(fbe $$0, fbe $$1) {
      fes $$2 = new fes();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
