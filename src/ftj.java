import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ftj extends fqh {
   private static final xe a = xe.c("options.title");
   private static final xe b = xe.c("options.skinCustomisation");
   private static final xe c = xe.c("options.sounds");
   private static final xe d = xe.c("options.video");
   private static final xe s = xe.c("options.controls");
   private static final xe u = xe.c("options.language");
   private static final xe v = xe.c("options.chat");
   private static final xe w = xe.c("options.resourcepack");
   private static final xe x = xe.c("options.accessibility");
   private static final xe y = xe.c("options.telemetry");
   private static final flz z = flz.a(xe.c("options.telemetry.disabled"));
   private static final xe A = xe.c("options.credits_and_attribution");
   private static final int B = 2;
   private final foc C = new foc(this, 61, 33);
   private final fqh D;
   private final fit E;
   @Nullable
   private fkv<brp> F;
   @Nullable
   private fle G;

   public ftj(fqh $$0, fit $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aS_() {
      fog $$0 = this.C.a(fog.d().a(8));
      $$0.a(new flv(a, this.p), fof::b);
      fog $$1 = $$0.a(fog.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fob $$2 = new fob();
      $$2.c().f(4).e(4).b();
      fob.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new ftl(this, this.E)));
      $$3.a(this.a(c, () -> new ftm(this, this.E)));
      $$3.a(this.a(d, () -> new fto(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new ftp(this, this.E)));
      $$3.a(this.a(u, () -> new ftg(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fte(this, this.E)));
      $$3.a(this.a(w, () -> new ftw(this.m.ad(), this::a, this.m.ag(), xe.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new ftd(this, this.E)));
      fko $$4 = $$3.a(this.a(y, () -> new fvb(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fpj(this)));
      this.C.c($$2);
      this.C.b(fko.a(xd.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.m.a(this.D);
   }

   private void a(aug $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private foe m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fle(0, 0, $$0x -> this.m.a(new fpf(this::c, xe.c("difficulty.lock.title"), xe.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fnz $$0 = new fnz(150, 0, fnz.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fko.a(xe.c("options.online"), $$0x -> this.m.a(new fti(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fkv<brp> a(int $$0, int $$1, String $$2, fip $$3) {
      return fkv.a(brp::b).a(brp.values()).a($$3.s.am()).a($$0, $$1, 150, 20, xe.c($$2), ($$1x, $$2x) -> $$3.L().b(new agv($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahp(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private fko a(xe $$0, Supplier<fqh> $$1) {
      return fko.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
