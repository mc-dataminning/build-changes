import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuc extends fra {
   private static final xi a = xi.c("options.title");
   private static final xi b = xi.c("options.skinCustomisation");
   private static final xi c = xi.c("options.sounds");
   private static final xi d = xi.c("options.video");
   private static final xi s = xi.c("options.controls");
   private static final xi u = xi.c("options.language");
   private static final xi v = xi.c("options.chat");
   private static final xi w = xi.c("options.resourcepack");
   private static final xi x = xi.c("options.accessibility");
   private static final xi y = xi.c("options.telemetry");
   private static final fms z = fms.a(xi.c("options.telemetry.disabled"));
   private static final xi A = xi.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fow C = new fow(this, 61, 33);
   private final fra D;
   private final fjm E;
   @Nullable
   private flo<bsa> F;
   @Nullable
   private flx G;

   public fuc(fra $$0, fjm $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      fpa $$0 = this.C.a(fpa.d().a(8));
      $$0.a(new fmo(a, this.p), foz::b);
      fpa $$1 = $$0.a(fpa.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fov $$2 = new fov();
      $$2.c().f(4).e(4).b();
      fov.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fue(this, this.E)));
      $$3.a(this.a(c, () -> new fuf(this, this.E)));
      $$3.a(this.a(d, () -> new fuh(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fui(this, this.E)));
      $$3.a(this.a(u, () -> new ftz(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new ftx(this, this.E)));
      $$3.a(this.a(w, () -> new fup(this.m.ad(), this::a, this.m.ag(), xi.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new ftw(this, this.E)));
      flh $$4 = $$3.a(this.a(y, () -> new fvu(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fqc(this)));
      this.C.c($$2);
      this.C.b(flh.a(xh.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         flf var10000 = this.c($$1x);
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

   private void a(aul $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private foy m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new flx(0, 0, $$0x -> this.m.a(new fpy(this::c, xi.c("difficulty.lock.title"), xi.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fot $$0 = new fot(150, 0, fot.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return flh.a(xi.c("options.online"), $$0x -> this.m.a(new fub(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static flo<bsa> a(int $$0, int $$1, String $$2, fji $$3) {
      return flo.a(bsa::b).a(bsa.values()).a($$3.s.ak()).a($$0, $$1, 150, 20, xi.c($$2), ($$1x, $$2x) -> $$3.L().b(new agz($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new aht(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private flh a(xi $$0, Supplier<fra> $$1) {
      return flh.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
