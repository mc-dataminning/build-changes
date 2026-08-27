import java.nio.file.Path;
import javax.annotation.Nullable;

public class foa extends fjo {
   private static final wg a = wg.c("telemetry_info.screen.title");
   private static final wg b = wg.c("telemetry_info.screen.description").a(n.h);
   private static final wg c = wg.c("telemetry_info.button.privacy_statement");
   private static final wg d = wg.c("telemetry_info.button.give_feedback");
   private static final wg o = wg.c("telemetry_info.button.show_data");
   private static final wg p = wg.c("telemetry_info.opt_in.description");
   private static final int q = 8;
   private static final boolean r = fbp.Q().D();
   private final fjo s;
   private final fbt u;
   private final fhc v = new fhc(this, 16 + 9 * 5 + 20, r ? 33 + fdr.a(fbp.Q().h) : 33);
   @Nullable
   private fnz w;
   @Nullable
   private fej x;
   private double y;

   public foa(fjo $$0, fbt $$1) {
      super(a);
      this.s = $$0;
      this.u = $$1;
   }

   @Override
   public wg i() {
      return wf.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fhg $$0 = this.v.a(fhg.d().a(4));
      $$0.c().b();
      $$0.a(new few(a, this.m));
      this.x = $$0.a(new fej(b, this.m).b(true));
      fhg $$1 = $$0.a(fhg.e().a(8));
      $$1.a(fdp.a(c, this::a).a());
      $$1.a(fdp.a(d, this::b).a());
      fhg $$2 = this.v.b(fhg.d().a(4));
      if (r) {
         $$2.a(this.m());
      }

      fhg $$3 = $$2.a(fhg.e().a(8));
      $$3.a(fdp.a(o, this::c).a());
      $$3.a(fdp.a(wf.d, $$0x -> this.d()).a());
      fhg $$4 = this.v.c(fhg.d().a(8));
      this.w = $$4.a(new fnz(0, 0, this.k - 40, this.v.d(), this.m));
      this.w.a($$0x -> this.y = $$0x);
      this.v.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.w != null) {
         this.w.a(this.y);
         this.w.k(this.k - 40);
         this.w.l(this.v.d());
         this.w.j();
      }

      if (this.x != null) {
         this.x.d(this.k - 16);
      }

      this.v.a();
   }

   @Override
   protected void aD_() {
      if (this.w != null) {
         this.b(this.w);
      }
   }

   private fdn m() {
      fbs<Boolean> $$0 = this.u.ai();
      return fdr.a(p, this.m).a($$0).a(this::a).a();
   }

   private void a(fdn $$0, boolean $$1) {
      if (this.w != null) {
         this.w.b($$1);
      }
   }

   private void a(fdp $$0) {
      fif.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fdp $$0) {
      fif.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fdp $$0) {
      Path $$1 = this.j.u().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.j.a(this.s);
   }
}
