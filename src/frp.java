import java.nio.file.Path;
import javax.annotation.Nullable;

public class frp extends fnd {
   private static final xp a = xp.c("telemetry_info.screen.title");
   private static final xp b = xp.c("telemetry_info.screen.description").b(-4539718);
   private static final xp c = xp.c("telemetry_info.button.privacy_statement");
   private static final xp d = xp.c("telemetry_info.button.give_feedback");
   private static final xp r = xp.c("telemetry_info.button.show_data");
   private static final xp s = xp.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fff.Q().D();
   private final fnd w;
   private final ffj x;
   private final fkr y = new fkr(this, 16 + 9 * 5 + 20, v ? 33 + fhg.a(fff.Q().h) : 33);
   @Nullable
   private fro z;
   @Nullable
   private fhy A;
   private double B;

   public frp(fnd $$0, ffj $$1) {
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
      fkv $$0 = this.y.a(fkv.d().a(4));
      $$0.c().b();
      $$0.a(new fil(a, this.p));
      this.A = $$0.a(new fhy(b, this.p).b(true));
      fkv $$1 = $$0.a(fkv.e().a(8));
      $$1.a(fhe.a(c, this::a).a());
      $$1.a(fhe.a(d, this::b).a());
      fkv $$2 = this.y.b(fkv.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fkv $$3 = $$2.a(fkv.e().a(8));
      $$3.a(fhe.a(r, this::c).a());
      $$3.a(fhe.a(xo.d, $$0x -> this.d()).a());
      fkv $$4 = this.y.c(fkv.d().a(8));
      this.z = $$4.a(new fro(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhc var10000 = this.c($$1x);
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

   private fhc m() {
      ffi<Boolean> $$0 = this.x.ai();
      return fhg.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fhc $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhe $$0) {
      flu.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhe $$0) {
      flu.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhe $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
