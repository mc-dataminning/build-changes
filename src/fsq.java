import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fsq extends fnx {
   private static final wy c = wy.c("gui.socialInteractions.title");
   private static final akq q = akq.b("social_interactions/background");
   private static final akq r = akq.b("icon/search");
   private static final wy s = wy.c("gui.socialInteractions.tab_all");
   private static final wy u = wy.c("gui.socialInteractions.tab_hidden");
   private static final wy v = wy.c("gui.socialInteractions.tab_blocked");
   private static final wy w = s.e().a(n.t);
   private static final wy x = u.e().a(n.t);
   private static final wy y = v.e().a(n.t);
   private static final wy z = wy.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wy A = wy.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wy B = wy.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wy C = wy.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wy D = wy.c("gui.socialInteractions.blocking_hint");
   private static final int E = 8;
   private static final int F = 236;
   private static final int G = 16;
   private static final int H = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int I = 238;
   private static final int J = 20;
   private static final int K = 36;
   private final flt L = new flt(this);
   @Nullable
   private final fnx M;
   fsp N;
   fip O;
   private String P = "";
   private fsq.a Q = fsq.a.a;
   private fig R;
   private fig S;
   private fig T;
   private fig U;
   @Nullable
   private wy V;
   private int W;

   public fsq() {
      this(null);
   }

   public fsq(@Nullable fnx $$0) {
      super(c);
      this.M = $$0;
      this.a(fgi.Q());
   }

   private int m() {
      return Math.max(52, this.n - 128 - 16);
   }

   private int D() {
      return 80 + this.m() - 8;
   }

   private int E() {
      return (this.m - 238) / 2;
   }

   @Override
   public wy i() {
      return (wy)(this.V != null ? wx.a(super.i(), this.V) : super.i());
   }

   @Override
   protected void aP_() {
      this.L.a(c, this.o);
      this.N = new fsp(this, this.l, this.m, this.D() - 88, 88, 36);
      int $$0 = this.N.b() / 3;
      int $$1 = this.N.s();
      int $$2 = this.N.t();
      this.R = this.c(fig.a(s, $$0x -> this.a(fsq.a.a)).a($$1, 45, $$0, 20).a());
      this.S = this.c(fig.a(u, $$0x -> this.a(fsq.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.T = this.c(fig.a(v, $$0x -> this.a(fsq.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.O != null ? this.O.a() : "";
      this.O = new fip(this.o, this.E() + 28, 74, 200, 15, z) {
         @Override
         protected xm aM_() {
            return !fsq.this.O.a().isEmpty() && fsq.this.N.c() ? super.aM_().f(", ").b(fsq.A) : super.aM_();
         }
      };
      this.O.f(16);
      this.O.g(true);
      this.O.g(-1);
      this.O.a($$3);
      this.O.c(z);
      this.O.b(this::a);
      this.c(this.O);
      this.d(this.N);
      this.U = this.c(fig.a(D, fmu.b(this, "https://aka.ms/javablocking")).a(this.m / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.Q);
      this.L.b(fig.a(wx.d, $$0x -> this.d()).a(200).a());
      this.L.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.L.a();
      this.N.b(this.m, this.D() - 88, 88);
      this.O.c(this.E() + 28, 74);
      int $$0 = this.N.s();
      int $$1 = this.N.t();
      int $$2 = this.N.b() / 3;
      this.R.c($$0, 45);
      this.S.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.T.c($$1 - $$2 + 1, 45);
      this.U.c(this.m / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aE_() {
      this.b(this.O);
   }

   @Override
   public void d() {
      this.l.a(this.M);
   }

   private void a(fsq.a $$0) {
      this.Q = $$0;
      this.R.b(s);
      this.S.b(u);
      this.T.b(v);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.R.b(w);
            Collection<UUID> $$2 = this.l.s.h.n();
            this.N.a($$2, this.N.n(), true);
            break;
         case b:
            this.S.b(x);
            Set<UUID> $$3 = this.l.aL().c();
            $$1 = $$3.isEmpty();
            this.N.a($$3, this.N.n(), false);
            break;
         case c:
            this.T.b(y);
            fso $$4 = this.l.aL();
            Set<UUID> $$5 = this.l.s.h.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.N.a($$5, this.N.n(), false);
      }

      fga $$6 = this.l.aV();
      if (!this.O.a().isEmpty() && this.N.c() && !this.O.aK_()) {
         $$6.c(A);
      } else if ($$1) {
         if ($$0 == fsq.a.b) {
            $$6.c(B);
         } else if ($$0 == fsq.a.c) {
            $$6.c(C);
         }
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.E() + 3;
      $$0.a(q, $$4, 64, 236, this.m() + 16);
      $$0.a(r, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.l);
      if (this.V != null) {
         $$0.b(this.l.h, this.V, this.E() + 8, 35, -1);
      }

      if (!this.N.c()) {
         this.N.a($$0, $$1, $$2, $$3);
      } else if (!this.O.a().isEmpty()) {
         $$0.a(this.l.h, A, this.m / 2, (72 + this.D()) / 2, -1);
      } else if (this.Q == fsq.a.b) {
         $$0.a(this.l.h, B, this.m / 2, (72 + this.D()) / 2, -1);
      } else if (this.Q == fsq.a.c) {
         $$0.a(this.l.h, C, this.m / 2, (72 + this.D()) / 2, -1);
      }

      this.U.k = this.Q == fsq.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.O.aK_() && this.l.m.M.a($$0, $$1)) {
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
      if (!$$0.equals(this.P)) {
         this.N.a($$0);
         this.P = $$0;
         this.a(this.Q);
      }
   }

   private void a(fgi $$0) {
      int $$1 = $$0.L().m().size();
      if (this.W != $$1) {
         String $$2 = "";
         fzn $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.V = wy.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.V = wy.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.W = $$1;
      }
   }

   public void a(fzk $$0) {
      this.N.a($$0, this.Q);
   }

   public void a(UUID $$0) {
      this.N.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
