import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjj extends fjo {
   private static final ajt a = new ajt("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int o = 204;
   private static final int p = 98;
   private static final wg q = wg.c("menu.returnToGame");
   private static final wg r = wg.c("gui.advancements");
   private static final wg s = wg.c("gui.stats");
   private static final wg u = wg.c("menu.sendFeedback");
   private static final wg v = wg.c("menu.reportBugs");
   private static final wg w = wg.c("menu.options");
   private static final wg x = wg.c("menu.shareToLan");
   private static final wg y = wg.c("menu.playerReporting");
   private static final wg z = wg.c("menu.returnToMenu");
   private static final wg A = wg.c("menu.savingLevel");
   private static final wg B = wg.c("menu.game");
   private static final wg C = wg.c("menu.paused");
   private final boolean D;
   @Nullable
   private fdp E;

   public fjj(boolean $$0) {
      super($$0 ? B : C);
      this.D = $$0;
   }

   public boolean m() {
      return this.D;
   }

   @Override
   protected void aN_() {
      if (this.D) {
         this.C();
      }

      this.c(new few(0, this.D ? 40 : 10, this.k, 9, this.i, this.m));
   }

   private void C() {
      fhb $$0 = new fhb();
      $$0.c().a(4, 4, 4, 0);
      fhb.b $$1 = $$0.d(2);
      $$1.a(fdp.a(q, $$0x -> {
         this.j.a(null);
         this.j.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(r, () -> new fkd(this.j.s.ct.q(), this)));
      $$1.a(this.a(s, () -> new fjx(this, this.j.s.j())));
      $$1.a(this.a(u, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(v, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(w, () -> new fjf(this, this.j.m)));
      if (this.j.U() && !this.j.V().r()) {
         $$1.a(this.a(x, () -> new fjp(this)));
      } else {
         $$1.a(this.a(y, () -> new fnx(this)));
      }

      wg $$2 = this.j.T() ? z : wf.p;
      this.E = $$1.a(fdp.a($$2, $$0x -> {
         $$0x.j = false;
         this.j.ba().a(this.j, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fha.a($$0, 0, 0, this.k, this.l, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.j.T();
      fuv $$1 = this.j.S();
      this.j.r.X();
      if ($$0) {
         this.j.b(new fiu(A));
      } else {
         this.j.y();
      }

      fjt $$2 = new fjt();
      if ($$0) {
         this.j.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.j.a(new ewt($$2));
      } else {
         this.j.a(new fml($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.D && this.j != null && this.j.ba().c() && this.E != null) {
         $$0.a(a, this.E.C() + this.E.x() - 17, this.E.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.D) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fdp a(wg $$0, Supplier<fjo> $$1) {
      return fdp.a($$0, $$1x -> this.j.a($$1.get())).a(98).a();
   }

   private fdp a(wg $$0, String $$1) {
      return fdp.a($$0, fif.b(this, $$1)).a(98).a();
   }
}
