import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fku extends fld {
   private static final wu a = wu.c("options.title");
   private static final wu b = wu.c("options.skinCustomisation");
   private static final wu c = wu.c("options.sounds");
   private static final wu d = wu.c("options.video");
   private static final wu r = wu.c("options.controls");
   private static final wu s = wu.c("options.language");
   private static final wu u = wu.c("options.chat");
   private static final wu v = wu.c("options.resourcepack");
   private static final wu w = wu.c("options.accessibility");
   private static final wu x = wu.c("options.telemetry");
   private static final wu y = wu.c("options.credits_and_attribution");
   private static final int z = 2;
   private final fir A = new fir(this, 61, 33);
   private final fld B;
   private final fdi C;
   @Nullable
   private ffl<bpj> D;
   @Nullable
   private ffu E;

   public fku(fld $$0, fdi $$1) {
      super(a);
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   protected void aM_() {
      fiv $$0 = this.A.a(fiv.d().a(8));
      $$0.a(new fgl(a, this.p), fiu::b);
      fiv $$1 = $$0.a(fiv.e()).a(8);
      $$1.a(this.C.ah().a(this.m.m));
      $$1.a(this.m());
      fiq $$2 = new fiq();
      $$2.c().f(4).e(4).b();
      fiq.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new flg(this, this.C)));
      $$3.a(this.a(c, () -> new flh(this, this.C)));
      $$3.a(this.a(d, () -> new flk(this, this.C)));
      $$3.a(this.a(r, () -> new flu(this, this.C)));
      $$3.a(this.a(s, () -> new fkm(this, this.C, this.m.ag())));
      $$3.a(this.a(u, () -> new fjs(this, this.C)));
      $$3.a(this.a(v, () -> new foj(this.m.ac(), this::a, this.m.af(), wu.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fjo(this, this.C)));
      $$3.a(this.a(x, () -> new fpq(this, this.C)));
      $$3.a(this.a(y, () -> new fjz(this)));
      this.A.c($$2);
      this.A.b(ffe.a(wt.d, $$0x -> this.d()).a(200).a());
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

   private void a(atc $$0) {
      this.C.a($$0);
      this.m.a(this);
   }

   private fit m() {
      if (this.m.r != null && this.m.U()) {
         this.D = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.E = new ffu(0, 0, $$0x -> this.m.a(new fjv(this::c, wu.c("difficulty.lock.title"), wu.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.D.k(this.D.x() - this.E.x());
            this.E.b(this.m.r.k().r());
            this.E.j = !this.E.a();
            this.D.j = !this.E.a();
            fio $$0 = new fio(150, 0, fio.b.a);
            $$0.a(this.D);
            $$0.a(this.E);
            return $$0;
         } else {
            this.D.j = false;
            return this.D;
         }
      } else {
         return ffe.a(wu.c("options.online"), $$0x -> this.m.a(fkt.a(this.m, this, this.C))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ffl<bpj> a(int $$0, int $$1, String $$2, fde $$3) {
      return ffl.a(bpj::b).a(bpj.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, wu.c($$2), ($$1x, $$2x) -> $$3.L().b(new agd($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.E != null && this.D != null) {
         this.m.L().b(new agv(true));
         this.E.b(true);
         this.E.j = false;
         this.D.j = false;
      }
   }

   @Override
   public void j() {
      this.C.av();
   }

   private ffe a(wu $$0, Supplier<fld> $$1) {
      return ffe.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
