import java.nio.file.Path;
import javax.annotation.Nullable;

public class fro extends fnc {
   private static final xo a = xo.c("telemetry_info.screen.title");
   private static final xo b = xo.c("telemetry_info.screen.description").b(-4539718);
   private static final xo c = xo.c("telemetry_info.button.privacy_statement");
   private static final xo d = xo.c("telemetry_info.button.give_feedback");
   private static final xo r = xo.c("telemetry_info.button.show_data");
   private static final xo s = xo.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffe.Q().D();
   private final fnc w;
   private final ffi x;
   private final fkq y = new fkq(this, 16 + 9 * 5 + 20, v ? 33 + fhf.a(ffe.Q().h) : 33);
   @Nullable
   private frn z;
   @Nullable
   private fhx A;
   private double B;

   public fro(fnc $$0, ffi $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fku $$0 = this.y.a(fku.d().a(4));
      $$0.c().b();
      $$0.a(new fik(a, this.p));
      this.A = $$0.a(new fhx(b, this.p).b(true));
      fku $$1 = $$0.a(fku.e().a(8));
      $$1.a(fhd.a(c, this::a).a());
      $$1.a(fhd.a(d, this::b).a());
      fku $$2 = this.y.b(fku.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fku $$3 = $$2.a(fku.e().a(8));
      $$3.a(fhd.a(r, this::c).a());
      $$3.a(fhd.a(xn.d, $$0x -> this.d()).a());
      fku $$4 = this.y.c(fku.d().a(8));
      this.z = $$4.a(new frn(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.k(this.n - 40);
         this.z.l(this.y.d());
         this.z.j();
      }

      if (this.A != null) {
         this.A.d(this.n - 16);
      }

      this.y.a();
   }

   @Override
   protected void aB_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fhb m() {
      ffh<Boolean> $$0 = this.x.ai();
      return fhf.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fhb $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhd $$0) {
      flt.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhd $$0) {
      flt.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhd $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
