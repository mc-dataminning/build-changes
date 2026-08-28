import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fra extends fnx {
   private static final wy a = wy.c("options.title");
   private static final wy b = wy.c("options.skinCustomisation");
   private static final wy c = wy.c("options.sounds");
   private static final wy q = wy.c("options.video");
   private static final wy r = wy.c("options.controls");
   private static final wy s = wy.c("options.language");
   private static final wy u = wy.c("options.chat");
   private static final wy v = wy.c("options.resourcepack");
   private static final wy w = wy.c("options.accessibility");
   private static final wy x = wy.c("options.telemetry");
   private static final fjr y = fjr.a(wy.c("options.telemetry.disabled"));
   private static final wy z = wy.c("options.credits_and_attribution");
   private static final int A = 2;
   private final flt B = new flt(this, 61, 33);
   private final fnx C;
   private final fgm D;
   @Nullable
   private fin<bqn> E;
   @Nullable
   private fiw F;

   public fra(fnx $$0, fgm $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aP_() {
      flx $$0 = this.B.a(flx.d().a(8));
      $$0.a(new fjn(a, this.o), flw::b);
      flx $$1 = $$0.a(flx.e()).a(8);
      $$1.a(this.D.ah().a(this.l.m));
      $$1.a(this.m());
      fls $$2 = new fls();
      $$2.c().f(4).e(4).b();
      fls.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new frc(this, this.D)));
      $$3.a(this.a(c, () -> new frd(this, this.D)));
      $$3.a(this.a(q, () -> new frf(this, this.l, this.D)));
      $$3.a(this.a(r, () -> new frg(this, this.D)));
      $$3.a(this.a(s, () -> new fqx(this, this.D, this.l.ag())));
      $$3.a(this.a(u, () -> new fqv(this, this.D)));
      $$3.a(this.a(v, () -> new frn(this.l.ac(), this::a, this.l.af(), wy.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fqu(this, this.D)));
      fig $$4 = $$3.a(this.a(x, () -> new fst(this, this.D)));
      if (!this.l.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new fmz(this)));
      this.B.c($$2);
      this.B.b(fig.a(wx.d, $$0x -> this.d()).a(200).a());
      this.B.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }

   private void a(ato $$0) {
      this.D.a($$0);
      this.l.a(this);
   }

   private flv m() {
      if (this.l.r != null && this.l.U()) {
         this.E = a(0, 0, "options.difficulty", this.l);
         if (!this.l.r.k().l()) {
            this.F = new fiw(0, 0, $$0x -> this.l.a(new fmv(this::c, wy.c("difficulty.lock.title"), wy.a("difficulty.lock.question", this.l.r.k().q().b()))));
            this.E.k(this.E.y() - this.F.y());
            this.F.b(this.l.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            flq $$0 = new flq(150, 0, flq.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fig.a(wy.c("options.online"), $$0x -> this.l.a(new fqz(this, this.D))).a(this.m / 2 + 5, this.n / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fin<bqn> a(int $$0, int $$1, String $$2, fgi $$3) {
      return fin.a(bqn::b).a(bqn.values()).a($$3.r.al()).a($$0, $$1, 150, 20, wy.c($$2), ($$1x, $$2x) -> $$3.L().b(new agl($$2x)));
   }

   private void c(boolean $$0) {
      this.l.a(this);
      if ($$0 && this.l.r != null && this.F != null && this.E != null) {
         this.l.L().b(new ahe(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fig a(wy $$0, Supplier<fnx> $$1) {
      return fig.a($$0, $$1x -> this.l.a($$1.get())).a();
   }
}
