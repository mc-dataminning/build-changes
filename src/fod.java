import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fod extends fon {
   private static final xe a = xe.c("options.title");
   private static final xe b = xe.c("options.skinCustomisation");
   private static final xe c = xe.c("options.sounds");
   private static final xe d = xe.c("options.video");
   private static final xe r = xe.c("options.controls");
   private static final xe s = xe.c("options.language");
   private static final xe u = xe.c("options.chat");
   private static final xe v = xe.c("options.resourcepack");
   private static final xe w = xe.c("options.accessibility");
   private static final xe x = xe.c("options.telemetry");
   private static final xe y = xe.c("options.credits_and_attribution");
   private static final int z = 2;
   private final fma A = new fma(this, 61, 33);
   private final fon B;
   private final fgn C;
   @Nullable
   private fiu<bpx> D;
   @Nullable
   private fjd E;

   public fod(fon $$0, fgn $$1) {
      super(a);
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   protected void aN_() {
      fme $$0 = this.A.a(fme.d().a(8));
      $$0.a(new fju(a, this.p), fmd::b);
      fme $$1 = $$0.a(fme.e()).a(8);
      $$1.a(this.C.ah().a(this.m.m));
      $$1.a(this.B());
      flz $$2 = new flz();
      $$2.c().f(4).e(4).b();
      flz.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new foq(this, this.C)));
      $$3.a(this.a(c, () -> new fos(this, this.C)));
      $$3.a(this.a(d, () -> new fow(this, this.C)));
      $$3.a(this.a(r, () -> new fpg(this, this.C)));
      $$3.a(this.a(s, () -> new fnv(this, this.C, this.m.ag())));
      $$3.a(this.a(u, () -> new fnb(this, this.C)));
      $$3.a(this.a(v, () -> new fry(this.m.ac(), this::a, this.m.af(), xe.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fmx(this, this.C)));
      $$3.a(this.a(x, () -> new fte(this, this.C)));
      $$3.a(this.a(y, () -> new fni(this)));
      this.A.c($$2);
      this.A.b(fin.a(xd.d, $$0x -> this.d()).a(200).a());
      this.A.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   private void a(ato $$0) {
      this.C.a($$0);
      this.m.a(this);
   }

   private fmc B() {
      if (this.m.r != null && this.m.U()) {
         this.D = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.E = new fjd(0, 0, $$0x -> this.m.a(new fne(this::c, xe.c("difficulty.lock.title"), xe.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.D.k(this.D.x() - this.E.x());
            this.E.b(this.m.r.k().r());
            this.E.j = !this.E.a();
            this.D.j = !this.E.a();
            flx $$0 = new flx(150, 0, flx.b.a);
            $$0.a(this.D);
            $$0.a(this.E);
            return $$0;
         } else {
            this.D.j = false;
            return this.D;
         }
      } else {
         return fin.a(xe.c("options.online"), $$0x -> this.m.a(foc.a(this.m, this, this.C))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fiu<bpx> a(int $$0, int $$1, String $$2, fgj $$3) {
      return fiu.a(bpx::b).a(bpx.values()).a($$3.r.al()).a($$0, $$1, 150, 20, xe.c($$2), ($$1x, $$2x) -> $$3.L().b(new agp($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.E != null && this.D != null) {
         this.m.L().b(new ahh(true));
         this.E.b(true);
         this.E.j = false;
         this.D.j = false;
      }
   }

   @Override
   public void j() {
      this.C.av();
   }

   private fin a(xe $$0, Supplier<fon> $$1) {
      return fin.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
