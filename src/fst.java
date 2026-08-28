import java.nio.file.Path;
import javax.annotation.Nullable;

public class fst extends fnx {
   private static final wy a = wy.c("telemetry_info.screen.title");
   private static final wy b = wy.c("telemetry_info.screen.description").b(-4539718);
   private static final wy c = wy.c("telemetry_info.button.privacy_statement");
   private static final wy q = wy.c("telemetry_info.button.give_feedback");
   private static final wy r = wy.c("telemetry_info.button.show_data");
   private static final wy s = wy.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fgi.Q().D();
   private final fnx w;
   private final fgm x;
   private final flt y = new flt(this, 16 + 9 * 5 + 20, v ? 33 + fii.a(fgi.Q().h) : 33);
   @Nullable
   private fss z;
   @Nullable
   private fja A;
   private double B;

   public fst(fnx $$0, fgm $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      flx $$0 = this.y.a(flx.d().a(4));
      $$0.c().b();
      $$0.a(new fjn(a, this.o));
      this.A = $$0.a(new fja(b, this.o).b(true));
      flx $$1 = $$0.a(flx.e().a(8));
      $$1.a(fig.a(c, this::a).a());
      $$1.a(fig.a(q, this::b).a());
      flx $$2 = this.y.b(flx.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      flx $$3 = $$2.a(flx.e().a(8));
      $$3.a(fig.a(r, this::c).a());
      $$3.a(fig.a(wx.d, $$0x -> this.d()).a());
      flx $$4 = this.y.c(flx.d().a(8));
      this.z = $$4.a(new fss(0, 0, this.m - 40, this.y.d(), this.o));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.k(this.m - 40);
         this.z.l(this.y.d());
         this.z.j();
      }

      if (this.A != null) {
         this.A.d(this.m - 16);
      }

      this.y.a();
   }

   @Override
   protected void aE_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fie m() {
      fgl<Boolean> $$0 = this.x.ai();
      return fii.a(s, this.o).a($$0).a(this::a).a();
   }

   private void a(fie $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fig $$0) {
      fmu.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fig $$0) {
      fmu.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fig $$0) {
      Path $$1 = this.l.u().b();
      ad.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }
}
