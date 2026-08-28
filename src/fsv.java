import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsv extends fpt {
   private static final xd a = xd.c("options.title");
   private static final xd b = xd.c("options.skinCustomisation");
   private static final xd c = xd.c("options.sounds");
   private static final xd d = xd.c("options.video");
   private static final xd s = xd.c("options.controls");
   private static final xd u = xd.c("options.language");
   private static final xd v = xd.c("options.chat");
   private static final xd w = xd.c("options.resourcepack");
   private static final xd x = xd.c("options.accessibility");
   private static final xd y = xd.c("options.telemetry");
   private static final fll z = fll.a(xd.c("options.telemetry.disabled"));
   private static final xd A = xd.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fno C = new fno(this, 61, 33);
   private final fpt D;
   private final fif E;
   @Nullable
   private fkh<brh> F;
   @Nullable
   private fkq G;

   public fsv(fpt $$0, fif $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aT_() {
      fns $$0 = this.C.a(fns.d().a(8));
      $$0.a(new flh(a, this.p), fnr::b);
      fns $$1 = $$0.a(fns.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fnn $$2 = new fnn();
      $$2.c().f(4).e(4).b();
      fnn.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fsx(this, this.E)));
      $$3.a(this.a(c, () -> new fsy(this, this.E)));
      $$3.a(this.a(d, () -> new fta(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new ftb(this, this.E)));
      $$3.a(this.a(u, () -> new fss(this, this.E, this.m.ag())));
      $$3.a(this.a(v, () -> new fsq(this, this.E)));
      $$3.a(this.a(w, () -> new fti(this.m.ac(), this::a, this.m.af(), xd.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fsp(this, this.E)));
      fka $$4 = $$3.a(this.a(y, () -> new fun(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fov(this)));
      this.C.c($$2);
      this.C.b(fka.a(xc.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         fjy var10000 = this.c($$1x);
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

   private void a(aud $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fnq m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fkq(0, 0, $$0x -> this.m.a(new foq(this::c, xd.c("difficulty.lock.title"), xd.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fnl $$0 = new fnl(150, 0, fnl.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fka.a(xd.c("options.online"), $$0x -> this.m.a(new fsu(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fkh<brh> a(int $$0, int $$1, String $$2, fib $$3) {
      return fkh.a(brh::b).a(brh.values()).a($$3.s.am()).a($$0, $$1, 150, 20, xd.c($$2), ($$1x, $$2x) -> $$3.L().b(new agu($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new aho(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private fka a(xd $$0, Supplier<fpt> $$1) {
      return fka.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
