import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fko extends fkt {
   private static final akf a = new akf("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final ws u = ws.c("menu.returnToGame");
   private static final ws v = ws.c("gui.advancements");
   private static final ws w = ws.c("gui.stats");
   private static final ws x = ws.c("menu.sendFeedback");
   private static final ws y = ws.c("menu.reportBugs");
   private static final ws z = ws.c("menu.options");
   private static final ws A = ws.c("menu.shareToLan");
   private static final ws B = ws.c("menu.playerReporting");
   private static final ws C = ws.c("menu.returnToMenu");
   private static final ws D = ws.c("menu.savingLevel");
   private static final ws E = ws.c("menu.game");
   private static final ws F = ws.c("menu.paused");
   private final boolean G;
   @Nullable
   private feu H;

   public fko(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aM_() {
      if (this.G) {
         this.C();
      }

      this.c(new fgb(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void C() {
      fig $$0 = new fig();
      $$0.c().a(4, 4, 4, 0);
      fig.b $$1 = $$0.d(2);
      $$1.a(feu.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fli(this.m.s.h.q(), this)));
      $$1.a(this.a(w, () -> new flc(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fkk(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fku(this)));
      } else {
         $$1.a(this.a(B, () -> new fpd(this)));
      }

      ws $$2 = this.m.T() ? C : wr.p;
      this.H = $$1.a(feu.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fif.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.m.T();
      fwa $$1 = this.m.S();
      this.m.r.X();
      if ($$0) {
         this.m.b(new fjz(D));
      } else {
         this.m.y();
      }

      fky $$2 = new fky();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new exy($$2));
      } else {
         this.m.a(new fnq($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.ba().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private feu a(ws $$0, Supplier<fkt> $$1) {
      return feu.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private feu a(ws $$0, String $$1) {
      return feu.a($$0, fjk.b(this, $$1)).a(98).a();
   }
}
