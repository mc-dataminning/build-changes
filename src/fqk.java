import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqk extends fnj {
   private static final wu a = wu.c("options.title");
   private static final wu b = wu.c("options.skinCustomisation");
   private static final wu c = wu.c("options.sounds");
   private static final wu q = wu.c("options.video");
   private static final wu r = wu.c("options.controls");
   private static final wu s = wu.c("options.language");
   private static final wu u = wu.c("options.chat");
   private static final wu v = wu.c("options.resourcepack");
   private static final wu w = wu.c("options.accessibility");
   private static final wu x = wu.c("options.telemetry");
   private static final fjd y = fjd.a(wu.c("options.telemetry.disabled"));
   private static final wu z = wu.c("options.credits_and_attribution");
   private static final int A = 2;
   private final flf B = new flf(this, 61, 33);
   private final fnj C;
   private final ffx D;
   @Nullable
   private fhz<bqd> E;
   @Nullable
   private fii F;

   public fqk(fnj $$0, ffx $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aP_() {
      flj $$0 = this.B.a(flj.d().a(8));
      $$0.a(new fiz(a, this.o), fli::b);
      flj $$1 = $$0.a(flj.e()).a(8);
      $$1.a(this.D.ah().a(this.l.m));
      $$1.a(this.m());
      fle $$2 = new fle();
      $$2.c().f(4).e(4).b();
      fle.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fqm(this, this.D)));
      $$3.a(this.a(c, () -> new fqn(this, this.D)));
      $$3.a(this.a(q, () -> new fqp(this, this.l, this.D)));
      $$3.a(this.a(r, () -> new fqq(this, this.D)));
      $$3.a(this.a(s, () -> new fqh(this, this.D, this.l.ag())));
      $$3.a(this.a(u, () -> new fqf(this, this.D)));
      $$3.a(this.a(v, () -> new fqx(this.l.ac(), this::a, this.l.af(), wu.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fqe(this, this.D)));
      fhs $$4 = $$3.a(this.a(x, () -> new fsd(this, this.D)));
      if (!this.l.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new fml(this)));
      this.B.c($$2);
      this.B.b(fhs.a(wt.d, $$0x -> this.d()).a(200).a());
      this.B.a($$1x -> {
         fhq var10000 = this.c($$1x);
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

   private void a(ath $$0) {
      this.D.a($$0);
      this.l.a(this);
   }

   private flh m() {
      if (this.l.r != null && this.l.U()) {
         this.E = a(0, 0, "options.difficulty", this.l);
         if (!this.l.r.k().l()) {
            this.F = new fii(0, 0, $$0x -> this.l.a(new fmh(this::c, wu.c("difficulty.lock.title"), wu.a("difficulty.lock.question", this.l.r.k().q().b()))));
            this.E.k(this.E.y() - this.F.y());
            this.F.b(this.l.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            flc $$0 = new flc(150, 0, flc.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fhs.a(wu.c("options.online"), $$0x -> this.l.a(new fqj(this, this.D))).a(this.m / 2 + 5, this.n / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fhz<bqd> a(int $$0, int $$1, String $$2, fft $$3) {
      return fhz.a(bqd::b).a(bqd.values()).a($$3.r.al()).a($$0, $$1, 150, 20, wu.c($$2), ($$1x, $$2x) -> $$3.L().b(new agf($$2x)));
   }

   private void c(boolean $$0) {
      this.l.a(this);
      if ($$0 && this.l.r != null && this.F != null && this.E != null) {
         this.l.L().b(new agy(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fhs a(wu $$0, Supplier<fnj> $$1) {
      return fhs.a($$0, $$1x -> this.l.a($$1.get())).a();
   }
}
