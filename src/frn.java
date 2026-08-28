import java.nio.file.Path;
import javax.annotation.Nullable;

public class frn extends fnb {
   private static final xo a = xo.c("telemetry_info.screen.title");
   private static final xo b = xo.c("telemetry_info.screen.description").b(-4539718);
   private static final xo c = xo.c("telemetry_info.button.privacy_statement");
   private static final xo d = xo.c("telemetry_info.button.give_feedback");
   private static final xo r = xo.c("telemetry_info.button.show_data");
   private static final xo s = xo.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffd.Q().D();
   private final fnb w;
   private final ffh x;
   private final fkp y = new fkp(this, 16 + 9 * 5 + 20, v ? 33 + fhe.a(ffd.Q().h) : 33);
   @Nullable
   private frm z;
   @Nullable
   private fhw A;
   private double B;

   public frn(fnb $$0, ffh $$1) {
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
      fkt $$0 = this.y.a(fkt.d().a(4));
      $$0.c().b();
      $$0.a(new fij(a, this.p));
      this.A = $$0.a(new fhw(b, this.p).b(true));
      fkt $$1 = $$0.a(fkt.e().a(8));
      $$1.a(fhc.a(c, this::a).a());
      $$1.a(fhc.a(d, this::b).a());
      fkt $$2 = this.y.b(fkt.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fkt $$3 = $$2.a(fkt.e().a(8));
      $$3.a(fhc.a(r, this::c).a());
      $$3.a(fhc.a(xn.d, $$0x -> this.d()).a());
      fkt $$4 = this.y.c(fkt.d().a(8));
      this.z = $$4.a(new frm(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fha var10000 = this.c($$1x);
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
   protected void aC_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fha m() {
      ffg<Boolean> $$0 = this.x.ai();
      return fhe.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fha $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhc $$0) {
      fls.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhc $$0) {
      fls.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhc $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
