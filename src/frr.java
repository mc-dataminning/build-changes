import java.nio.file.Path;
import javax.annotation.Nullable;

public class frr extends fnf {
   private static final xp a = xp.c("telemetry_info.screen.title");
   private static final xp b = xp.c("telemetry_info.screen.description").b(-4539718);
   private static final xp c = xp.c("telemetry_info.button.privacy_statement");
   private static final xp d = xp.c("telemetry_info.button.give_feedback");
   private static final xp r = xp.c("telemetry_info.button.show_data");
   private static final xp s = xp.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffh.Q().D();
   private final fnf w;
   private final ffl x;
   private final fkt y = new fkt(this, 16 + 9 * 5 + 20, v ? 33 + fhi.a(ffh.Q().h) : 33);
   @Nullable
   private frq z;
   @Nullable
   private fia A;
   private double B;

   public frr(fnf $$0, ffl $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public xp i() {
      return xo.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fkx $$0 = this.y.a(fkx.d().a(4));
      $$0.c().b();
      $$0.a(new fin(a, this.p));
      this.A = $$0.a(new fia(b, this.p).b(true));
      fkx $$1 = $$0.a(fkx.e().a(8));
      $$1.a(fhg.a(c, this::a).a());
      $$1.a(fhg.a(d, this::b).a());
      fkx $$2 = this.y.b(fkx.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fkx $$3 = $$2.a(fkx.e().a(8));
      $$3.a(fhg.a(r, this::c).a());
      $$3.a(fhg.a(xo.d, $$0x -> this.d()).a());
      fkx $$4 = this.y.c(fkx.d().a(8));
      this.z = $$4.a(new frq(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhe var10000 = this.c($$1x);
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

   private fhe m() {
      ffk<Boolean> $$0 = this.x.ai();
      return fhi.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fhe $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhg $$0) {
      flw.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhg $$0) {
      flw.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhg $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
