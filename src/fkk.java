import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fkk extends fkt {
   private static final ws a = ws.c("options.title");
   private static final ws b = ws.c("options.skinCustomisation");
   private static final ws c = ws.c("options.sounds");
   private static final ws d = ws.c("options.video");
   private static final ws r = ws.c("options.controls");
   private static final ws s = ws.c("options.language");
   private static final ws u = ws.c("options.chat");
   private static final ws v = ws.c("options.resourcepack");
   private static final ws w = ws.c("options.accessibility");
   private static final ws x = ws.c("options.telemetry");
   private static final ws y = ws.c("options.credits_and_attribution");
   private static final int z = 2;
   private final fih A = new fih(this, 61, 33);
   private final fkt B;
   private final fcy C;
   @Nullable
   private ffb<bon> D;
   @Nullable
   private ffk E;

   public fkk(fkt $$0, fcy $$1) {
      super(a);
      this.B = $$0;
      this.C = $$1;
   }

   @Override
   protected void aM_() {
      fil $$0 = this.A.a(fil.d().a(8));
      $$0.a(new fgb(a, this.p), fik::b);
      fil $$1 = $$0.a(fil.e()).a(8);
      $$1.a(this.C.ah().a(this.m.m));
      $$1.a(this.m());
      fig $$2 = new fig();
      $$2.c().f(4).e(4).b();
      fig.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fkw(this, this.C)));
      $$3.a(this.a(c, () -> new fkx(this, this.C)));
      $$3.a(this.a(d, () -> new fla(this, this.C)));
      $$3.a(this.a(r, () -> new flk(this, this.C)));
      $$3.a(this.a(s, () -> new fkc(this, this.C, this.m.ag())));
      $$3.a(this.a(u, () -> new fji(this, this.C)));
      $$3.a(this.a(v, () -> new fnz(this.m.ac(), this::a, this.m.af(), ws.c("resourcePack.title"))));
      $$3.a(this.a(w, () -> new fje(this, this.C)));
      $$3.a(this.a(x, () -> new fpg(this, this.C)));
      $$3.a(this.a(y, () -> new fjp(this)));
      this.A.c($$2);
      this.A.b(feu.a(wr.d, $$0x -> this.d()).a(200).a());
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

   private void a(asz $$0) {
      this.C.a($$0);
      this.m.a(this);
   }

   private fij m() {
      if (this.m.r != null && this.m.U()) {
         this.D = a(0, 0, "options.difficulty", this.m);
         if (!this.m.r.k().l()) {
            this.E = new ffk(0, 0, $$0x -> this.m.a(new fjl(this::c, ws.c("difficulty.lock.title"), ws.a("difficulty.lock.question", this.m.r.k().q().b()))));
            this.D.k(this.D.x() - this.E.x());
            this.E.b(this.m.r.k().r());
            this.E.j = !this.E.a();
            this.D.j = !this.E.a();
            fie $$0 = new fie(150, 0, fie.b.a);
            $$0.a(this.D);
            $$0.a(this.E);
            return $$0;
         } else {
            this.D.j = false;
            return this.D;
         }
      } else {
         return feu.a(ws.c("options.online"), $$0x -> this.m.a(fkj.a(this.m, this, this.C))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ffb<bon> a(int $$0, int $$1, String $$2, fcu $$3) {
      return ffb.a(bon::b).a(bon.values()).a($$3.r.ak()).a($$0, $$1, 150, 20, ws.c($$2), ($$1x, $$2x) -> $$3.L().b(new agb($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.r != null && this.E != null && this.D != null) {
         this.m.L().b(new agt(true));
         this.E.b(true);
         this.E.j = false;
         this.D.j = false;
      }
   }

   @Override
   public void j() {
      this.C.av();
   }

   private feu a(ws $$0, Supplier<fkt> $$1) {
      return feu.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
