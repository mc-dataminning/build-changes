import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqm extends fnl {
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
   private static final fjf y = fjf.a(wu.c("options.telemetry.disabled"));
   private static final wu z = wu.c("options.credits_and_attribution");
   private static final int A = 2;
   private final flh B = new flh(this, 61, 33);
   private final fnl C;
   private final fga D;
   @Nullable
   private fib<bqe> E;
   @Nullable
   private fik F;

   public fqm(fnl $$0, fga $$1) {
      super(a);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   protected void aP_() {
      fll $$0 = this.B.a(fll.d().a(8));
      $$0.a(new fjb(a, this.o), flk::b);
      fll $$1 = $$0.a(fll.e()).a(8);
      $$1.a(this.D.ah().a(this.l.m));
      $$1.a(this.m());
      flg $$2 = new flg();
      $$2.c().f(4).e(4).b();
      flg.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fqo(this, this.D)));
      $$3.a(this.a(c, () -> new fqp(this, this.D)));
      $$3.a(this.a(q, () -> new fqr(this, this.l, this.D)));
      $$3.a(this.a(r, () -> new fqs(this, this.D)));
      $$3.a(this.a(s, () -> new fqj(this, this.D, this.l.ag())));
      $$3.a(this.a(u, () -> new fqh(this, this.D)));
      $$3.a(this.a(v, () -> new fqz(this.l.ac(), this::a, this.l.af(), wu.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fqg(this, this.D)));
      fhu $$4 = $$3.a(this.a(x, () -> new fsf(this, this.D)));
      if (!this.l.E()) {
         $$4.j = false;
         $$4.a(y);
      }

      $$3.a(this.a(z, () -> new fmn(this)));
      this.B.c($$2);
      this.B.b(fhu.a(wt.d, $$0x -> this.d()).a(200).a());
      this.B.a($$1x -> {
         fhs var10000 = this.c($$1x);
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

   private void a(ath $$0) {
      this.D.a($$0);
      this.l.a(this);
   }

   private flj m() {
      if (this.l.r != null && this.l.U()) {
         this.E = a(0, 0, "options.difficulty", this.l);
         if (!this.l.r.k().l()) {
            this.F = new fik(0, 0, $$0x -> this.l.a(new fmj(this::c, wu.c("difficulty.lock.title"), wu.a("difficulty.lock.question", this.l.r.k().q().b()))));
            this.E.k(this.E.y() - this.F.y());
            this.F.b(this.l.r.k().r());
            this.F.j = !this.F.a();
            this.E.j = !this.F.a();
            fle $$0 = new fle(150, 0, fle.b.a);
            $$0.a(this.E);
            $$0.a(this.F);
            return $$0;
         } else {
            this.E.j = false;
            return this.E;
         }
      } else {
         return fhu.a(wu.c("options.online"), $$0x -> this.l.a(new fql(this, this.D))).a(this.m / 2 + 5, this.n / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fib<bqe> a(int $$0, int $$1, String $$2, ffw $$3) {
      return fib.a(bqe::b).a(bqe.values()).a($$3.r.al()).a($$0, $$1, 150, 20, wu.c($$2), ($$1x, $$2x) -> $$3.L().b(new agf($$2x)));
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

   private fhu a(wu $$0, Supplier<fnl> $$1) {
      return fhu.a($$0, $$1x -> this.l.a($$1.get())).a();
   }
}
