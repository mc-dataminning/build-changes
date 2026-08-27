import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbx extends fcc {
   private static final agt a = new agt("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vb n = vb.c("menu.returnToGame");
   private static final vb o = vb.c("gui.advancements");
   private static final vb p = vb.c("gui.stats");
   private static final vb q = vb.c("menu.sendFeedback");
   private static final vb r = vb.c("menu.reportBugs");
   private static final vb t = vb.c("menu.options");
   private static final vb u = vb.c("menu.shareToLan");
   private static final vb v = vb.c("menu.playerReporting");
   private static final vb w = vb.c("menu.returnToMenu");
   private static final vb x = vb.c("menu.savingLevel");
   private static final vb y = vb.c("menu.game");
   private static final vb z = vb.c("menu.paused");
   private final boolean A;
   @Nullable
   private ewh B;

   public fbx(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aP_() {
      if (this.A) {
         this.C();
      }

      this.d(new exo(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      ezq $$0 = new ezq();
      $$0.c().a(4, 4, 4, 0);
      ezq.b $$1 = $$0.d(2);
      $$1.a(ewh.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fcs(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new fcl(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fbt(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new fcd(this)));
      } else {
         $$1.a(this.a(v, fgm::new));
      }

      vb $$2 = this.f.Q() ? w : va.p;
      this.B = $$1.a(ewh.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aW().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      ezp.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.Q();
      fne $$1 = this.f.P();
      this.f.r.V();
      if ($$0) {
         this.f.b(new fbi(x));
      } else {
         this.f.y();
      }

      fch $$2 = new fch();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new epo($$2));
      } else {
         this.f.a(new ffa($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ewh a(vb $$0, Supplier<fcc> $$1) {
      return ewh.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private ewh a(vb $$0, String $$1) {
      return ewh.a($$0, fau.b(this, $$1)).a(98).a();
   }
}
