import javax.annotation.Nullable;

public class fsx extends fob {
   private static final wz a = wz.c("telemetry_info.screen.title");
   private static final wz b = wz.c("telemetry_info.screen.description").b(-4539718);
   private static final wz c = wz.c("telemetry_info.button.privacy_statement");
   private static final wz r = wz.c("telemetry_info.button.give_feedback");
   private static final wz s = wz.c("telemetry_info.button.show_data");
   private static final wz u = wz.c("telemetry_info.opt_in.description");
   private static final int v = 8;
   private static final boolean w = fgm.Q().D();
   private final fob x;
   private final fgq y;
   private final flx z = new flx(this, 16 + 9 * 5 + 20, w ? 33 + fim.a(fgm.Q().h) : 33);
   @Nullable
   private fsw A;
   @Nullable
   private fje B;
   private double C;

   public fsx(fob $$0, fgq $$1) {
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
      fmb $$0 = this.z.a(fmb.d().a(4));
      $$0.c().b();
      $$0.a(new fjr(a, this.o));
      this.B = $$0.a(new fje(b, this.o).b(true));
      fmb $$1 = $$0.a(fmb.e().a(8));
      $$1.a(fik.a(c, this::a).a());
      $$1.a(fik.a(r, this::b).a());
      fmb $$2 = this.z.b(fmb.d().a(4));
      if (w) {
         $$2.a(this.m());
      }

      fmb $$3 = $$2.a(fmb.e().a(8));
      $$3.a(fik.a(s, this::c).a());
      $$3.a(fik.a(wy.d, $$0x -> this.d()).a());
      fmb $$4 = this.z.c(fmb.d().a(8));
      this.A = $$4.a(new fsw(0, 0, this.m - 40, this.z.d(), this.o));
      this.A.a($$0x -> this.C = $$0x);
      this.z.a($$1x -> {
         fii var10000 = this.c($$1x);
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

   private fii m() {
      fgp<Boolean> $$0 = this.y.ai();
      return fim.a(u, this.o).a($$0).a(this::a).a();
   }

   private void a(fii $$0, boolean $$1) {
      if (this.A != null) {
         this.A.b($$1);
      }
   }

   private void a(fik $$0) {
      fmy.a(this, axj.c);
   }

   private void b(fik $$0) {
      fmy.a(this, axj.i);
   }

   private void c(fik $$0) {
      ad.k().a(this.l.u().b());
   }

   @Override
   public void d() {
      this.l.a(this.x);
   }
}
