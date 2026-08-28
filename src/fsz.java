import javax.annotation.Nullable;

public class fsz extends fod {
   private static final wz a = wz.c("telemetry_info.screen.title");
   private static final wz b = wz.c("telemetry_info.screen.description").b(-4539718);
   private static final wz c = wz.c("telemetry_info.button.privacy_statement");
   private static final wz r = wz.c("telemetry_info.button.give_feedback");
   private static final wz s = wz.c("telemetry_info.button.show_data");
   private static final wz u = wz.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fgo.Q().D();
   private final fod x;
   private final fgs y;
   private final flz z = new flz(this, 16 + 9 * 5 + 20, w ? 33 + fio.a(fgo.Q().h) : 33);
   @Nullable
   private fsy A;
   @Nullable
   private fjg B;
   private double C;

   public fsz(fod $$0, fgs $$1) {
      super(a);
      this.x = $$0;
      this.y = $$1;
   }

   @Override
   public wz i() {
      return wy.a(super.i(), b);
   }

   @Override
   protected void aT_() {
      fmd $$0 = this.z.a(fmd.d().a(4));
      $$0.c().b();
      $$0.a(new fjt(a, this.o));
      this.B = $$0.a(new fjg(b, this.o).b(true));
      fmd $$1 = $$0.a(fmd.e().a(8));
      $$1.a(fim.a(c, this::a).a());
      $$1.a(fim.a(r, this::b).a());
      fmd $$2 = this.z.b(fmd.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fmd $$3 = $$2.a(fmd.e().a(8));
      $$3.a(fim.a(s, this::c).a());
      $$3.a(fim.a(wy.d, $$0x -> this.d()).a());
      fmd $$4 = this.z.c(fmd.d().a(8));
      this.A = $$4.a(new fsy(0, 0, this.m - 40, this.z.d(), this.o));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.A != null) {
         this.A.a(this.C);
         this.A.k(this.m - 40);
         this.A.l(this.z.d());
         this.A.j();
      }

      if (this.B != null) {
         this.B.d(this.m - 16);
      }

      this.z.a();
   }

   @Override
   protected void aI_() {
      if (this.A != null) {
         this.b(this.A);
      }
   }

   private fik m() {
      fgr<Boolean> $$0 = this.y.ai();
      return fio.a(u, this.o).a($$0).a(this::a).a();
   }

   private void a(fik $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fim $$0) {
      fna.a(this, axj.c);
   }

   private void b(fim $$0) {
      fna.a(this, axj.i);
   }

   private void c(fim $$0) {
      ad.k().a(this.l.u().b());
   }

   @Override
   public void d() {
      this.l.a(this.x);
   }
}
