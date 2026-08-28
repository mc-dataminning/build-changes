import java.nio.file.Path;
import javax.annotation.Nullable;

public class frk extends fmy {
   private static final xl a = xl.c("telemetry_info.screen.title");
   private static final xl b = xl.c("telemetry_info.screen.description").b(-4539718);
   private static final xl c = xl.c("telemetry_info.button.privacy_statement");
   private static final xl d = xl.c("telemetry_info.button.give_feedback");
   private static final xl r = xl.c("telemetry_info.button.show_data");
   private static final xl s = xl.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffa.Q().D();
   private final fmy w;
   private final ffe x;
   private final fkm y = new fkm(this, 16 + 9 * 5 + 20, v ? 33 + fhb.a(ffa.Q().h) : 33);
   @Nullable
   private frj z;
   @Nullable
   private fht A;
   private double B;

   public frk(fmy $$0, ffe $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fkq $$0 = this.y.a(fkq.d().a(4));
      $$0.c().b();
      $$0.a(new fig(a, this.p));
      this.A = $$0.a(new fht(b, this.p).b(true));
      fkq $$1 = $$0.a(fkq.e().a(8));
      $$1.a(fgz.a(c, this::a).a());
      $$1.a(fgz.a(d, this::b).a());
      fkq $$2 = this.y.b(fkq.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fkq $$3 = $$2.a(fkq.e().a(8));
      $$3.a(fgz.a(r, this::c).a());
      $$3.a(fgz.a(xk.d, $$0x -> this.d()).a());
      fkq $$4 = this.y.c(fkq.d().a(8));
      this.z = $$4.a(new frj(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fgx var10000 = this.c($$1x);
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
   protected void aD_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fgx m() {
      ffd<Boolean> $$0 = this.x.ai();
      return fhb.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fgx $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fgz $$0) {
      flp.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fgz $$0) {
      flp.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fgz $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
