import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqe extends fnd {
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
   private static final fix y = fix.a(wu.c("options.telemetry.disabled"));
   private static final wu z = wu.c("options.credits_and_attribution");
   private static final int A = 2;
   private final fkz B = new fkz(this, 61, 33);
   private final fnd C;
   private final ffr D;
   @Nullable
   private fht<bqa> E;
   @Nullable
   private fic F;

   public fqe(fnd $$0, ffr $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aO_() {
      fld $$0 = this.B.a(fld.d().a(8));
      $$0.a(new fit(a, this.o), flc::b);
      fld $$1 = $$0.a(fld.e()).a(8);
      $$1.a(this.D.ah().a(this.l.m));
      $$1.a(this.m());
      fky $$2 = new fky();
      $$2.c().f(4).e(4).b();
      fky.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fqg(this, this.D)));
      $$3.a(this.a(c, () -> new fqh(this, this.D)));
      $$3.a(this.a(q, () -> new fqj(this, this.l, this.D)));
      $$3.a(this.a(r, () -> new fqk(this, this.D)));
      $$3.a(this.a(s, () -> new fqb(this, this.D, this.l.ag())));
      $$3.a(this.a(u, () -> new fpz(this, this.D)));
      $$3.a(this.a(v, () -> new fqr(this.l.ac(), this::a, this.l.af(), wu.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fpy(this, this.D)));
      fhm $$4 = $$3.a(this.a(x, () -> new frx(this, this.D)));
      if (!this.l.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new fmf(this)));
      this.B.c($$2);
      this.B.b(fhm.a(wt.d, $$0x -> this.d()).a(200).a());
      this.B.a($$1x -> {
         fhk var10000 = this.c($$1x);
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

   private void a(atf $$0) {
      this.D.a($$0);
      this.l.a(this);
   }

   private flb m() {
      if (this.l.r != null && this.l.U()) {
         this.E = a(0, 0, "options.difficulty", this.l);
         if (!this.l.r.k().l()) {
            this.F = new fic(0, 0, $$0x -> this.l.a(new fmb(this::c, wu.c("difficulty.lock.title"), wu.a("difficulty.lock.question", this.l.r.k().q().b()))));
            this.E.k(this.E.y() - this.F.y());
            this.F.b(this.l.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fkw $$0 = new fkw(150, 0, fkw.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fhm.a(wu.c("options.online"), $$0x -> this.l.a(new fqd(this, this.D))).a(this.m / 2 + 5, this.n / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fht<bqa> a(int $$0, int $$1, String $$2, ffn $$3) {
      return fht.a(bqa::b).a(bqa.values()).a($$3.r.al()).a($$0, $$1, 150, 20, wu.c($$2), ($$1x, $$2x) -> $$3.L().b(new agf($$2x)));
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

   private fhm a(wu $$0, Supplier<fnd> $$1) {
      return fhm.a($$0, $$1x -> this.l.a($$1.get())).a();
   }
}
