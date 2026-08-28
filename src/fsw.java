import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fsw extends fod {
   private static final wz c = wz.c("gui.socialInteractions.title");
   private static final akr r = akr.b("social_interactions/background");
   private static final akr s = akr.b("icon/search");
   private static final wz u = wz.c("gui.socialInteractions.tab_all");
   private static final wz v = wz.c("gui.socialInteractions.tab_hidden");
   private static final wz w = wz.c("gui.socialInteractions.tab_blocked");
   private static final wz x = u.e().a(n.t);
   private static final wz y = v.e().a(n.t);
   private static final wz z = w.e().a(n.t);
   private static final wz A = wz.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wz B = wz.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wz C = wz.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wz D = wz.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wz E = wz.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final flz M = new flz(this);
   @Nullable
   private final fod N;
   fsv O;
   fiv P;
   private String Q = "";
   private fsw.a R = fsw.a.a;
   private fim S;
   private fim T;
   private fim U;
   private fim V;
   @Nullable
   private wz W;
   private int X;

   public fsw() {
      this(null);
   }

   public fsw(@Nullable fod $$0) {
      super(c);
      this.N = $$0;
      this.a(fgo.Q());
   }

   private int m() {
      return Math.max(52, this.n - 128 - 16);
   }

   private int C() {
      return 80 + this.m() - 8;
   }

   private int D() {
      return (this.m - 238) / 2;
   }

   @Override
   public wz i() {
      return (wz)(this.W != null ? wy.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aT_() {
      this.M.a(c, this.o);
      this.O = new fsv(this, this.l, this.m, this.C() - 88, 88, 36);
      int $$0 = this.O.b() / 3;
      int $$1 = this.O.s();
      int $$2 = this.O.t();
      this.S = this.c(fim.a(u, $$0x -> this.a(fsw.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fim.a(v, $$0x -> this.a(fsw.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fim.a(w, $$0x -> this.a(fsw.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new fiv(this.o, this.D() + 28, 74, 200, 15, A) {
         @Override
         protected xn aQ_() {
            return !fsw.this.P.a().isEmpty() && fsw.this.O.c() ? super.aQ_().f(", ").b(fsw.B) : super.aQ_();
         }
      };
      this.P.f(16);
      this.P.g(true);
      this.P.g(-1);
      this.P.a($$3);
      this.P.c(A);
      this.P.b(this::a);
      this.c(this.P);
      this.d(this.O);
      this.V = this.c(fim.a(E, fna.b(this, axj.o)).a(this.m / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fim.a(wy.d, $$0x -> this.d()).a(200).a());
      this.M.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.M.a();
      this.O.b(this.m, this.C() - 88, 88);
      this.P.c(this.D() + 28, 74);
      int $$0 = this.O.s();
      int $$1 = this.O.t();
      int $$2 = this.O.b() / 3;
      this.S.c($$0, 45);
      this.T.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.U.c($$1 - $$2 + 1, 45);
      this.V.c(this.m / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aI_() {
      this.b(this.P);
   }

   @Override
   public void d() {
      this.l.a(this.N);
   }

   private void a(fsw.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.l.s.h.n();
            this.O.a($$2, this.O.n(), true);
            break;
         case b:
            this.T.b(y);
            Set<UUID> $$3 = this.l.aL().c();
            $$1 = $$3.isEmpty();
            this.O.a($$3, this.O.n(), false);
            break;
         case c:
            this.U.b(z);
            fsu $$4 = this.l.aL();
            Set<UUID> $$5 = this.l.s.h.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.n(), false);
      }

      fgg $$6 = this.l.aV();
      if (!this.P.a().isEmpty() && this.O.c() && !this.P.aO_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fsw.a.b) {
            $$6.c(C);
         } else if ($$0 == fsw.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.D() + 3;
      $$0.a(r, $$4, 64, 236, this.m() + 16);
      $$0.a(s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.l);
      if (this.W != null) {
         $$0.b(this.l.h, this.W, this.D() + 8, 35, -1);
      }

      if (!this.O.c()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.l.h, B, this.m / 2, (72 + this.C()) / 2, -1);
      } else if (this.R == fsw.a.b) {
         $$0.a(this.l.h, C, this.m / 2, (72 + this.C()) / 2, -1);
      } else if (this.R == fsw.a.c) {
         $$0.a(this.l.h, D, this.m / 2, (72 + this.C()) / 2, -1);
      }

      this.V.k = this.R == fsw.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aO_() && this.l.m.M.a($$0, $$1)) {
         this.d();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   private void a(String $$0) {
      $$0 = $$0.toLowerCase(Locale.ROOT);
      if (!$$0.equals(this.Q)) {
         this.O.a($$0);
         this.Q = $$0;
         this.a(this.R);
      }
   }

   private void a(fgo $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         fzt $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = wz.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = wz.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(fzq $$0) {
      this.O.a($$0, this.R);
   }

   public void a(UUID $$0) {
      this.O.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
