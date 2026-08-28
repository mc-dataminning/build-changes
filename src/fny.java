import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fny extends fod {
   private static final akr a = akr.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int r = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wz v = wz.c("menu.returnToGame");
   private static final wz w = wz.c("gui.advancements");
   private static final wz x = wz.c("gui.stats");
   private static final wz y = wz.c("menu.sendFeedback");
   private static final wz z = wz.c("menu.reportBugs");
   private static final wz A = wz.c("menu.feedback");
   private static final wz B = wz.c("menu.server_links");
   private static final wz C = wz.c("menu.options");
   private static final wz D = wz.c("menu.shareToLan");
   private static final wz E = wz.c("menu.playerReporting");
   private static final wz F = wz.c("menu.returnToMenu");
   private static final wz G = wz.c("menu.savingLevel");
   private static final wz H = wz.c("menu.game");
   private static final wz I = wz.c("menu.paused");
   private final boolean J;
   @Nullable
   private fim K;

   public fny(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aT_() {
      if (this.J) {
         this.C();
      }

      this.c(new fjt(0, this.J ? 40 : 10, this.m, 9, this.k, this.o));
   }

   private void C() {
      fly $$0 = new fly();
      $$0.c().a(4, 4, 4, 0);
      fly.b $$1 = $$0.d(2);
      $$1.a(fim.a(v, $$0x -> {
         this.l.a(null);
         this.l.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fon(this.l.s.h.p(), this)));
      $$1.a(this.a(x, () -> new foh(this, this.l.s.j())));
      alj $$2 = this.l.s.h.C();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fny.a(this)));
         $$1.a(this.a(B, () -> new fqv(this, $$2)));
      }

      $$1.a(this.a(C, () -> new frg(this, this.l.m)));
      if (this.l.U() && !this.l.V().r()) {
         $$1.a(this.a(D, () -> new foe(this)));
      } else {
         $$1.a(this.a(E, () -> new fsw(this)));
      }

      wz $$3 = this.l.T() ? F : wy.p;
      this.K = $$1.a(fim.a($$3, $$0x -> {
         $$0x.j = false;
         this.l.aX().a(this.l, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      flx.a($$0, 0, 0, this.m, this.n, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fod $$0, fly.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axj.i : axj.h));
      $$1.a(a($$0, z, axj.j)).j = !ab.b().d().a();
   }

   private void D() {
      boolean $$0 = this.l.T();
      fzt $$1 = this.l.S();
      this.l.r.Y();
      if ($$0) {
         this.l.b(new fno(G));
      } else {
         this.l.y();
      }

      fof $$2 = new fof();
      if ($$0) {
         this.l.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.l.a(new fbt($$2));
      } else {
         this.l.a(new fqt($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.l != null && this.l.aX().c() && this.K != null) {
         $$0.a(a, this.K.D() + this.K.y() - 17, this.K.E() + 3, 15, 15);
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fim a(wz $$0, Supplier<fod> $$1) {
      return fim.a($$0, $$1x -> this.l.a($$1.get())).a(98).a();
   }

   private static fim a(fod $$0, wz $$1, URI $$2) {
      return fim.a($$1, fna.b($$0, $$2)).a(98).a();
   }

   static class a extends fod {
      private static final wz b = wz.c("menu.feedback.title");
      public final fod a;
      private final flz c = new flz(this);

      protected a(fod $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.o);
         fly $$0 = this.c.c(new fly());
         $$0.c().a(4, 4, 4, 0);
         fly.b $$1 = $$0.d(2);
         fny.a(this, $$1);
         this.c.b(fim.a(wy.k, $$0x -> this.d()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void d() {
         this.l.a(this.a);
      }
   }
}
