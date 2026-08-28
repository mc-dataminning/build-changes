import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fms extends fnb {
   private static final xo a = xo.c("options.title");
   private static final xo b = xo.c("options.skinCustomisation");
   private static final xo c = xo.c("options.sounds");
   private static final xo d = xo.c("options.video");
   private static final xo r = xo.c("options.controls");
   private static final xo s = xo.c("options.language");
   private static final xo u = xo.c("options.chat");
   private static final xo v = xo.c("options.resourcepack");
   private static final xo w = xo.c("options.accessibility");
   private static final xo x = xo.c("options.telemetry");
   private static final fin y = fin.a(xo.c("options.telemetry.disabled"));
   private static final xo z = xo.c("options.credits_and_attribution");
   private static final int A = 2;
   private final fkp B = new fkp(this, 61, 33);
   private final fnb C;
   private final ffh D;
   @Nullable
   private fhj<bqp> E;
   @Nullable
   private fhs F;

   public fms(fnb $$0, ffh $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aM_() {
      fkt $$0 = this.B.a(fkt.d().a(8));
      $$0.a(new fij(a, this.p), fks::b);
      fkt $$1 = $$0.a(fkt.e()).a(8);
      $$1.a(this.D.ah().a(this.m.m));
      $$1.a(this.m());
      fko $$2 = new fko();
      $$2.c().f(4).e(4).b();
      fko.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fne(this, this.D)));
      $$3.a(this.a(c, () -> new fnf(this, this.D)));
      $$3.a(this.a(d, () -> new fni(this, this.D)));
      $$3.a(this.a(r, () -> new fns(this, this.D)));
      $$3.a(this.a(s, () -> new fmk(this, this.D, this.m.ag())));
      $$3.a(this.a(u, () -> new flq(this, this.D)));
      $$3.a(this.a(v, () -> new fqh(this.m.ac(), this::a, this.m.af(), xo.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new flm(this, this.D)));
      fhc $$4 = $$3.a(this.a(x, () -> new frn(this, this.D)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new flx(this)));
      this.B.c($$2);
      this.B.b(fhc.a(xn.d, $$0x -> this.d()).a(200).a());
      this.B.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.B.a();
   }

   @Override
   public void d() {
      this.m.a(this.C);
   }

   private void a(atz $$0) {
      this.D.a($$0);
      this.m.a(this);
   }

   private fkr m() {
      if (this.m.r != null && this.m.U()) {
         this.E = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.F = new fhs(0, 0, $$0x -> this.m.a(new flt(this::c, xo.c("difficulty.lock.title"), xo.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.E.k(this.E.x() - this.F.x());
            this.F.b(this.m.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fkm $$0 = new fkm(150, 0, fkm.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fhc.a(xo.c("options.online"), $$0x -> this.m.a(fmr.a(this.m, this, this.D))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fhj<bqp> a(int $$0, int $$1, String $$2, ffd $$3) {
      return fhj.a(bqp::b).a(bqp.values()).a($$3.r.al()).a($$0, $$1, 150, 20, xo.c($$2), ($$1x, $$2x) -> $$3.L().b(new agz($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.F != null && this.E != null) {
         this.m.L().b(new ahs(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fhc a(xo $$0, Supplier<fnb> $$1) {
      return fhc.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
