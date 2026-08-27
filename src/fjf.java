import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjf extends fjo {
   private static final wg a = wg.c("options.title");
   private static final wg b = wg.c("options.skinCustomisation");
   private static final wg c = wg.c("options.sounds");
   private static final wg d = wg.c("options.video");
   private static final wg o = wg.c("options.controls");
   private static final wg p = wg.c("options.language");
   private static final wg q = wg.c("options.chat");
   private static final wg r = wg.c("options.resourcepack");
   private static final wg s = wg.c("options.accessibility");
   private static final wg u = wg.c("options.telemetry");
   private static final wg v = wg.c("options.credits_and_attribution");
   private static final int w = 2;
   private final fhc x = new fhc(this, 61, 33);
   private final fjo y;
   private final fbt z;
   @Nullable
   private fdw<bnx> A;
   @Nullable
   private fef B;

   public fjf(fjo $$0, fbt $$1) {
      super(a);
      this.y = $$0;
      this.z = $$1;
   }

   @Override
   protected void aN_() {
      fhg $$0 = this.x.a(fhg.d().a(8));
      $$0.a(new few(a, this.m), fhf::b);
      fhg $$1 = $$0.a(fhg.e()).a(8);
      $$1.a(this.z.ah().a(this.j.m));
      $$1.a(this.m());
      fhb $$2 = new fhb();
      $$2.c().f(4).e(4).b();
      fhb.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fjr(this, this.z)));
      $$3.a(this.a(c, () -> new fjs(this, this.z)));
      $$3.a(this.a(d, () -> new fjv(this, this.z)));
      $$3.a(this.a(o, () -> new fkf(this, this.z)));
      $$3.a(this.a(p, () -> new fix(this, this.z, this.j.ag())));
      $$3.a(this.a(q, () -> new fid(this, this.z)));
      $$3.a(this.a(r, () -> new fmu(this.j.ac(), this::a, this.j.af(), wg.c("resourcePack.title"))));
      $$3.a(this.a(s, () -> new fhz(this, this.z)));
      $$3.a(this.a(u, () -> new foa(this, this.z)));
      $$3.a(this.a(v, () -> new fik(this)));
      this.x.c($$2);
      this.x.b(fdp.a(wf.d, $$0x -> this.d()).a(200).a());
      this.x.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   private void a(asn $$0) {
      this.z.a($$0);
      this.j.a(this);
   }

   private fhe m() {
      if (this.j.r != null && this.j.U()) {
         this.A = a(0, 0, "options.difficulty", this.j);
         if (!this.j.r.k().l()) {
            this.B = new fef(0, 0, $$0x -> this.j.a(new fig(this::c, wg.c("difficulty.lock.title"), wg.a("difficulty.lock.question", this.j.r.k().q().b()))));
            this.A.k(this.A.x() - this.B.x());
            this.B.b(this.j.r.k().r());
            this.B.j = !this.B.a();
            this.A.j = !this.B.a();
            fgz $$0 = new fgz(150, 0, fgz.b.a);
            $$0.a(this.A);
            $$0.a(this.B);
            return $$0;
         } else {
            this.A.j = false;
            return this.A;
         }
      } else {
         return fdp.a(wg.c("options.online"), $$0x -> this.j.a(fje.a(this.j, this, this.z))).a(this.k / 2 + 5, this.l / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fdw<bnx> a(int $$0, int $$1, String $$2, fbp $$3) {
      return fdw.a(bnx::b).a(bnx.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, wg.c($$2), ($$1x, $$2x) -> $$3.L().b(new afp($$2x)));
   }

   private void c(boolean $$0) {
      this.j.a(this);
      if ($$0 && this.j.r != null && this.B != null && this.A != null) {
         this.j.L().b(new agh(true));
         this.B.b(true);
         this.B.j = false;
         this.A.j = false;
      }
   }

   @Override
   public void j() {
      this.z.av();
   }

   private fdp a(wg $$0, Supplier<fjo> $$1) {
      return fdp.a($$0, $$1x -> this.j.a($$1.get())).a();
   }
}
