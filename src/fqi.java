import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fqi extends fly {
   private static final wx c = wx.c("gui.socialInteractions.title");
   private static final akm d = new akm("social_interactions/background");
   private static final akm r = new akm("icon/search");
   private static final wx s = wx.c("gui.socialInteractions.tab_all");
   private static final wx u = wx.c("gui.socialInteractions.tab_hidden");
   private static final wx v = wx.c("gui.socialInteractions.tab_blocked");
   private static final wx w = s.e().a(n.t);
   private static final wx x = u.e().a(n.t);
   private static final wx y = v.e().a(n.t);
   private static final wx z = wx.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wx A = wx.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wx B = wx.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wx C = wx.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wx D = wx.c("gui.socialInteractions.blocking_hint");
   private static final int E = 8;
   private static final int F = 236;
   private static final int G = 16;
   private static final int H = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int I = 238;
   private static final int J = 20;
   private static final int K = 36;
   private final fjm L = new fjm(this);
   @Nullable
   private final fly M;
   fqh N;
   fgi O;
   private String P = "";
   private fqi.a Q = fqi.a.a;
   private ffz R;
   private ffz S;
   private ffz T;
   private ffz U;
   @Nullable
   private wx V;
   private int W;
   private boolean X;

   public fqi() {
      this(null);
   }

   public fqi(@Nullable fly $$0) {
      super(c);
      this.M = $$0;
      this.a(fdz.Q());
   }

   private int m() {
      return Math.max(52, this.o - 128 - 16);
   }

   private int C() {
      return 80 + this.m() - 8;
   }

   private int D() {
      return (this.n - 238) / 2;
   }

   @Override
   public wx i() {
      return (wx)(this.V != null ? ww.a(super.i(), this.V) : super.i());
   }

   @Override
   protected void aM_() {
      this.L.a(c, this.p);
      if (this.X) {
         this.N.a(this.n, this.m(), 0, 88);
      } else {
         this.N = new fqh(this, this.m, this.n, this.m(), 88, 36);
      }

      int $$0 = this.N.b() / 3;
      int $$1 = this.N.r();
      int $$2 = this.N.s();
      this.R = this.c(ffz.a(s, $$0x -> this.a(fqi.a.a)).a($$1, 45, $$0, 20).a());
      this.S = this.c(ffz.a(u, $$0x -> this.a(fqi.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.T = this.c(ffz.a(v, $$0x -> this.a(fqi.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.O != null ? this.O.a() : "";
      this.O = new fgi(this.p, this.D() + 28, 74, 200, 15, z) {
         @Override
         protected xl aK_() {
            return !fqi.this.O.a().isEmpty() && fqi.this.N.d() ? super.aK_().f(", ").b(fqi.A) : super.aK_();
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
      this.U = this.c(ffz.a(D, fkp.b(this, "https://aka.ms/javablocking")).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.X = true;
      this.a(this.Q);
      this.L.b(ffz.a(ww.d, $$0x -> this.d()).a(200).a());
      this.L.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.L.a();
      this.N.b(this.n, this.m(), 88);
      this.O.c(this.D() + 28, 74);
      int $$0 = this.N.r();
      int $$1 = this.N.s();
      int $$2 = this.N.b() / 3;
      this.R.c($$0, 45);
      this.S.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.T.c($$1 - $$2 + 1, 45);
      this.U.c(this.n / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aC_() {
      this.b(this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(fqi.a $$0) {
      this.Q = $$0;
      this.R.b(s);
      this.S.b(u);
      this.T.b(v);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.R.b(w);
            Collection<UUID> $$2 = this.m.s.h.o();
            this.N.a($$2, this.N.n(), true);
            break;
         case b:
            this.S.b(x);
            Set<UUID> $$3 = this.m.aN().c();
            $$1 = $$3.isEmpty();
            this.N.a($$3, this.N.n(), false);
            break;
         case c:
            this.T.b(y);
            fqg $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.s.h.o().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.N.a($$5, this.N.n(), false);
      }

      fdr $$6 = this.m.aZ();
      if (!this.O.a().isEmpty() && this.N.d() && !this.O.aI_()) {
         $$6.c(A);
      } else if ($$1) {
         if ($$0 == fqi.a.b) {
            $$6.c(B);
         } else if ($$0 == fqi.a.c) {
            $$6.c(C);
         }
      }
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.D() + 3;
      $$0.a(d, $$4, 64, 236, this.m() + 16);
      $$0.a(r, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.V != null) {
         $$0.b(this.m.h, this.V, this.D() + 8, 35, -1);
      }

      if (!this.N.d()) {
         this.N.a($$0, $$1, $$2, $$3);
      } else if (!this.O.a().isEmpty()) {
         $$0.a(this.m.h, A, this.n / 2, (72 + this.C()) / 2, -1);
      } else if (this.Q == fqi.a.b) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.C()) / 2, -1);
      } else if (this.Q == fqi.a.c) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.C()) / 2, -1);
      }

      this.U.k = this.Q == fqi.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.O.aI_() && this.m.m.N.a($$0, $$1)) {
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

   private void a(fdz $$0) {
      int $$1 = $$0.L().n().size();
      if (this.W != $$1) {
         String $$2 = "";
         fxf $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.V = wx.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.V = wx.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.W = $$1;
      }
   }

   public void a(fxc $$0) {
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
