import java.nio.file.Path;
import javax.annotation.Nullable;

public class frq extends fne {
   private static final xp a = xp.c("telemetry_info.screen.title");
   private static final xp b = xp.c("telemetry_info.screen.description").b(-4539718);
   private static final xp c = xp.c("telemetry_info.button.privacy_statement");
   private static final xp d = xp.c("telemetry_info.button.give_feedback");
   private static final xp r = xp.c("telemetry_info.button.show_data");
   private static final xp s = xp.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffg.Q().D();
   private final fne w;
   private final ffk x;
   private final fks y = new fks(this, 16 + 9 * 5 + 20, v ? 33 + fhh.a(ffg.Q().h) : 33);
   @Nullable
   private frp z;
   @Nullable
   private fhz A;
   private double B;

   public frq(fne $$0, ffk $$1) {
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
      fkw $$0 = this.y.a(fkw.d().a(4));
      $$0.c().b();
      $$0.a(new fim(a, this.p));
      this.A = $$0.a(new fhz(b, this.p).b(true));
      fkw $$1 = $$0.a(fkw.e().a(8));
      $$1.a(fhf.a(c, this::a).a());
      $$1.a(fhf.a(d, this::b).a());
      fkw $$2 = this.y.b(fkw.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fkw $$3 = $$2.a(fkw.e().a(8));
      $$3.a(fhf.a(r, this::c).a());
      $$3.a(fhf.a(xo.d, $$0x -> this.d()).a());
      fkw $$4 = this.y.c(fkw.d().a(8));
      this.z = $$4.a(new frp(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhd var10000 = this.c($$1x);
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

   private fhd m() {
      ffj<Boolean> $$0 = this.x.ai();
      return fhh.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fhd $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhf $$0) {
      flv.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhf $$0) {
      flv.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhf $$0) {
      Path $$1 = this.m.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
