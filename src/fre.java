import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fre extends fob {
   private static final wz a = wz.c("options.title");
   private static final wz b = wz.c("options.skinCustomisation");
   private static final wz c = wz.c("options.sounds");
   private static final wz r = wz.c("options.video");
   private static final wz s = wz.c("options.controls");
   private static final wz u = wz.c("options.language");
   private static final wz v = wz.c("options.chat");
   private static final wz w = wz.c("options.resourcepack");
   private static final wz x = wz.c("options.accessibility");
   private static final wz y = wz.c("options.telemetry");
   private static final fjv z = fjv.a(wz.c("options.telemetry.disabled"));
   private static final wz A = wz.c("options.credits_and_attribution");
   private static final int B = 2;
   private final flx C = new flx(this, 61, 33);
   private final fob D;
   private final fgq E;
   @Nullable
   private fir<bqo> F;
   @Nullable
   private fja G;

   public fre(fob $$0, fgq $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aT_() {
      fmb $$0 = this.C.a(fmb.d().a(8));
      $$0.a(new fjr(a, this.o), fma::b);
      fmb $$1 = $$0.a(fmb.e()).a(8);
      $$1.a(this.E.ah().a(this.l.m));
      $$1.a(this.m());
      flw $$2 = new flw();
      $$2.c().f(4).e(4).b();
      flw.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new frg(this, this.E)));
      $$3.a(this.a(c, () -> new frh(this, this.E)));
      $$3.a(this.a(r, () -> new frj(this, this.l, this.E)));
      $$3.a(this.a(s, () -> new frk(this, this.E)));
      $$3.a(this.a(u, () -> new frb(this, this.E, this.l.ag())));
      $$3.a(this.a(v, () -> new fqz(this, this.E)));
      $$3.a(this.a(w, () -> new frr(this.l.ac(), this::a, this.l.af(), wz.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fqy(this, this.E)));
      fik $$4 = $$3.a(this.a(y, () -> new fsx(this, this.E)));
      if (!this.l.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fnd(this)));
      this.C.c($$2);
      this.C.b(fik.a(wy.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.l.a(this.D);
   }

   private void a(atp $$0) {
      this.E.a($$0);
      this.l.a(this);
   }

   private flz m() {
      if (this.l.r != null && this.l.U()) {
         this.F = a(0, 0, "options.difficulty", this.l);
         if (!this.l.r.k().l()) {
            this.G = new fja(0, 0, $$0x -> this.l.a(new fmz(this::c, wz.c("difficulty.lock.title"), wz.a("difficulty.lock.question", this.l.r.k().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.l.r.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            flu $$0 = new flu(150, 0, flu.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fik.a(wz.c("options.online"), $$0x -> this.l.a(new frd(this, this.E))).a(this.m / 2 + 5, this.n / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fir<bqo> a(int $$0, int $$1, String $$2, fgm $$3) {
      return fir.a(bqo::b).a(bqo.values()).a($$3.r.al()).a($$0, $$1, 150, 20, wz.c($$2), ($$1x, $$2x) -> $$3.L().b(new agm($$2x)));
   }

   private void c(boolean $$0) {
      this.l.a(this);
      if ($$0 && this.l.r != null && this.G != null && this.F != null) {
         this.l.L().b(new ahf(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.av();
   }

   private fik a(wz $$0, Supplier<fob> $$1) {
      return fik.a($$0, $$1x -> this.l.a($$1.get())).a();
   }
}
