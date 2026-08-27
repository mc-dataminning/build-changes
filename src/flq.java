import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flq extends flz {
   private static final wx a = wx.c("options.title");
   private static final wx b = wx.c("options.skinCustomisation");
   private static final wx c = wx.c("options.sounds");
   private static final wx d = wx.c("options.video");
   private static final wx r = wx.c("options.controls");
   private static final wx s = wx.c("options.language");
   private static final wx u = wx.c("options.chat");
   private static final wx v = wx.c("options.resourcepack");
   private static final wx w = wx.c("options.accessibility");
   private static final wx x = wx.c("options.telemetry");
   private static final fhl y = fhl.a(wx.c("options.telemetry.disabled"));
   private static final wx z = wx.c("options.credits_and_attribution");
   private static final int A = 2;
   private final fjn B = new fjn(this, 61, 33);
   private final flz C;
   private final fef D;
   @Nullable
   private fgh<bpt> E;
   @Nullable
   private fgq F;

   public flq(flz $$0, fef $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aN_() {
      fjr $$0 = this.B.a(fjr.d().a(8));
      $$0.a(new fhh(a, this.p), fjq::b);
      fjr $$1 = $$0.a(fjr.e()).a(8);
      $$1.a(this.D.ah().a(this.m.m));
      $$1.a(this.m());
      fjm $$2 = new fjm();
      $$2.c().f(4).e(4).b();
      fjm.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fmc(this, this.D)));
      $$3.a(this.a(c, () -> new fmd(this, this.D)));
      $$3.a(this.a(d, () -> new fmg(this, this.D)));
      $$3.a(this.a(r, () -> new fmq(this, this.D)));
      $$3.a(this.a(s, () -> new fli(this, this.D, this.m.ag())));
      $$3.a(this.a(u, () -> new fko(this, this.D)));
      $$3.a(this.a(v, () -> new fpf(this.m.ac(), this::a, this.m.af(), wx.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fkk(this, this.D)));
      fga $$4 = $$3.a(this.a(x, () -> new fql(this, this.D)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new fkv(this)));
      this.B.c($$2);
      this.B.b(fga.a(ww.d, $$0x -> this.d()).a(200).a());
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

   private void a(ati $$0) {
      this.D.a($$0);
      this.m.a(this);
   }

   private fjp m() {
      if (this.m.r != null && this.m.U()) {
         this.E = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.F = new fgq(0, 0, $$0x -> this.m.a(new fkr(this::c, wx.c("difficulty.lock.title"), wx.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.E.k(this.E.x() - this.F.x());
            this.F.b(this.m.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fjk $$0 = new fjk(150, 0, fjk.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fga.a(wx.c("options.online"), $$0x -> this.m.a(flp.a(this.m, this, this.D))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fgh<bpt> a(int $$0, int $$1, String $$2, feb $$3) {
      return fgh.a(bpt::b).a(bpt.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, wx.c($$2), ($$1x, $$2x) -> $$3.L().b(new agi($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.F != null && this.E != null) {
         this.m.L().b(new ahb(true));
         this.F.b(true);
         this.F.j = false;
         this.E.j = false;
      }
   }

   @Override
   public void j() {
      this.D.av();
   }

   private fga a(wx $$0, Supplier<flz> $$1) {
      return fga.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
