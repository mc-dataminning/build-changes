import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ftf extends fqd {
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
   private static final flv z = flv.a(xd.c("options.telemetry.disabled"));
   private static final xd A = xd.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fny C = new fny(this, 61, 33);
   private final fqd D;
   private final fip E;
   @Nullable
   private fkr<brm> F;
   @Nullable
   private fla G;

   public ftf(fqd $$0, fip $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      foc $$0 = this.C.a(foc.d().a(8));
      $$0.a(new flr(a, this.p), fob::b);
      foc $$1 = $$0.a(foc.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fnx $$2 = new fnx();
      $$2.c().f(4).e(4).b();
      fnx.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fth(this, this.E)));
      $$3.a(this.a(c, () -> new fti(this, this.E)));
      $$3.a(this.a(d, () -> new ftk(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new ftl(this, this.E)));
      $$3.a(this.a(u, () -> new ftc(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fta(this, this.E)));
      $$3.a(this.a(w, () -> new fts(this.m.ad(), this::a, this.m.ag(), xd.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fsz(this, this.E)));
      fkk $$4 = $$3.a(this.a(y, () -> new fux(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fpf(this)));
      this.C.c($$2);
      this.C.b(fkk.a(xc.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1x -> {
         fki var10000 = this.c($$1x);
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

   private void a(aue $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private foa m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fla(0, 0, $$0x -> this.m.a(new fpb(this::c, xd.c("difficulty.lock.title"), xd.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fnv $$0 = new fnv(150, 0, fnv.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fkk.a(xd.c("options.online"), $$0x -> this.m.a(new fte(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fkr<brm> a(int $$0, int $$1, String $$2, fil $$3) {
      return fkr.a(brm::b).a(brm.values()).a($$3.s.am()).a($$0, $$1, 150, 20, xd.c($$2), ($$1x, $$2x) -> $$3.L().b(new agu($$2x)));
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

   private fkk a(xd $$0, Supplier<fqd> $$1) {
      return fkk.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
