import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ftu extends fqs {
   private static final xh a = xh.c("options.title");
   private static final xh b = xh.c("options.skinCustomisation");
   private static final xh c = xh.c("options.sounds");
   private static final xh d = xh.c("options.video");
   private static final xh s = xh.c("options.controls");
   private static final xh u = xh.c("options.language");
   private static final xh v = xh.c("options.chat");
   private static final xh w = xh.c("options.resourcepack");
   private static final xh x = xh.c("options.accessibility");
   private static final xh y = xh.c("options.telemetry");
   private static final fmk z = fmk.a(xh.c("options.telemetry.disabled"));
   private static final xh A = xh.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fon C = new fon(this, 61, 33);
   private final fqs D;
   private final fje E;
   @Nullable
   private flg<brv> F;
   @Nullable
   private flp G;

   public ftu(fqs $$0, fje $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aS_() {
      fos $$0 = this.C.a(fos.d().a(8));
      $$0.a(new fmg(a, this.p), foq::b);
      fos $$1 = $$0.a(fos.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fom $$2 = new fom();
      $$2.c().f(4).e(4).b();
      fom.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new ftw(this, this.E)));
      $$3.a(this.a(c, () -> new ftx(this, this.E)));
      $$3.a(this.a(d, () -> new ftz(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fua(this, this.E)));
      $$3.a(this.a(u, () -> new ftr(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new ftp(this, this.E)));
      $$3.a(this.a(w, () -> new fuh(this.m.ad(), this::a, this.m.ag(), xh.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fto(this, this.E)));
      fkz $$4 = $$3.a(this.a(y, () -> new fvm(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fpu(this)));
      this.C.c($$2);
      this.C.b(fkz.a(xg.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         fkx var10000 = this.c($$1x);
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

   private void a(auk $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fop m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new flp(0, 0, $$0x -> this.m.a(new fpq(this::c, xh.c("difficulty.lock.title"), xh.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fok $$0 = new fok(150, 0, fok.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fkz.a(xh.c("options.online"), $$0x -> this.m.a(new ftt(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static flg<brv> a(int $$0, int $$1, String $$2, fja $$3) {
      return flg.a(brv::b).a(brv.values()).a($$3.s.am()).a($$0, $$1, 150, 20, xh.c($$2), ($$1x, $$2x) -> $$3.L().b(new agy($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahs(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private fkz a(xh $$0, Supplier<fqs> $$1) {
      return fkz.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
