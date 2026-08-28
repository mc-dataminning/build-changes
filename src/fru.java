import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fru extends fnd {
   private static final wu c = wu.c("gui.socialInteractions.title");
   private static final akk q = new akk("social_interactions/background");
   private static final akk r = new akk("icon/search");
   private static final wu s = wu.c("gui.socialInteractions.tab_all");
   private static final wu u = wu.c("gui.socialInteractions.tab_hidden");
   private static final wu v = wu.c("gui.socialInteractions.tab_blocked");
   private static final wu w = s.e().a(n.t);
   private static final wu x = u.e().a(n.t);
   private static final wu y = v.e().a(n.t);
   private static final wu z = wu.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wu A = wu.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wu B = wu.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wu C = wu.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wu D = wu.c("gui.socialInteractions.blocking_hint");
   private static final int E = 8;
   private static final int F = 236;
   private static final int G = 16;
   private static final int H = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int I = 238;
   private static final int J = 20;
   private static final int K = 36;
   private final fkz L = new fkz(this);
   @Nullable
   private final fnd M;
   frt N;
   fhv O;
   private String P = "";
   private fru.a Q = fru.a.a;
   private fhm R;
   private fhm S;
   private fhm T;
   private fhm U;
   @Nullable
   private wu V;
   private int W;
   private boolean X;

   public fru() {
      this(null);
   }

   public fru(@Nullable fnd $$0) {
      super(c);
      this.M = $$0;
      this.a(ffn.Q());
   }

   private int m() {
      return Math.max(52, this.n - 128 - 16);
   }

   private int E() {
      return 80 + this.m() - 8;
   }

   private int F() {
      return (this.m - 238) / 2;
   }

   @Override
   public wu i() {
      return (wu)(this.V != null ? wt.a(super.i(), this.V) : super.i());
   }

   @Override
   protected void aO_() {
      this.L.a(c, this.o);
      if (this.X) {
         this.N.a(this.m, this.m(), 0, 88);
      } else {
         this.N = new frt(this, this.l, this.m, this.m(), 88, 36);
      }

      int $$0 = this.N.b() / 3;
      int $$1 = this.N.s();
      int $$2 = this.N.t();
      this.R = this.c(fhm.a(s, $$0x -> this.a(fru.a.a)).a($$1, 45, $$0, 20).a());
      this.S = this.c(fhm.a(u, $$0x -> this.a(fru.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.T = this.c(fhm.a(v, $$0x -> this.a(fru.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.O != null ? this.O.a() : "";
      this.O = new fhv(this.o, this.F() + 28, 74, 200, 15, z) {
         @Override
         protected xi aL_() {
            return !fru.this.O.a().isEmpty() && fru.this.N.c() ? super.aL_().f(", ").b(fru.A) : super.aL_();
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
      this.U = this.c(fhm.a(D, fma.b(this, "https://aka.ms/javablocking")).a(this.m / 2 - 100, 64 + this.m(), 200, 20).a());
      this.X = true;
      this.a(this.Q);
      this.L.b(fhm.a(wt.d, $$0x -> this.d()).a(200).a());
      this.L.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.L.a();
      this.N.b(this.m, this.m(), 88);
      this.O.c(this.F() + 28, 74);
      int $$0 = this.N.s();
      int $$1 = this.N.t();
      int $$2 = this.N.b() / 3;
      this.R.c($$0, 45);
      this.S.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.T.c($$1 - $$2 + 1, 45);
      this.U.c(this.m / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aD_() {
      this.b(this.O);
   }

   @Override
   public void d() {
      this.l.a(this.M);
   }

   private void a(fru.a $$0) {
      this.Q = $$0;
      this.R.b(s);
      this.S.b(u);
      this.T.b(v);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.R.b(w);
            Collection<UUID> $$2 = this.l.s.cB.n();
            this.N.a($$2, this.N.n(), true);
            break;
         case b:
            this.S.b(x);
            Set<UUID> $$3 = this.l.aM().c();
            $$1 = $$3.isEmpty();
            this.N.a($$3, this.N.n(), false);
            break;
         case c:
            this.T.b(y);
            frs $$4 = this.l.aM();
            Set<UUID> $$5 = this.l.s.cB.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.N.a($$5, this.N.n(), false);
      }

      fff $$6 = this.l.aX();
      if (!this.O.a().isEmpty() && this.N.c() && !this.O.aJ_()) {
         $$6.c(A);
      } else if ($$1) {
         if ($$0 == fru.a.b) {
            $$6.c(B);
         } else if ($$0 == fru.a.c) {
            $$6.c(C);
         }
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.F() + 3;
      $$0.a(q, $$4, 64, 236, this.m() + 16);
      $$0.a(r, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.l);
      if (this.V != null) {
         $$0.b(this.l.h, this.V, this.F() + 8, 35, -1);
      }

      if (!this.N.c()) {
         this.N.a($$0, $$1, $$2, $$3);
      } else if (!this.O.a().isEmpty()) {
         $$0.a(this.l.h, A, this.m / 2, (72 + this.E()) / 2, -1);
      } else if (this.Q == fru.a.b) {
         $$0.a(this.l.h, B, this.m / 2, (72 + this.E()) / 2, -1);
      } else if (this.Q == fru.a.c) {
         $$0.a(this.l.h, C, this.m / 2, (72 + this.E()) / 2, -1);
      }

      this.U.k = this.Q == fru.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.O.aJ_() && this.l.m.M.a($$0, $$1)) {
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

   private void a(ffn $$0) {
      int $$1 = $$0.L().m().size();
      if (this.W != $$1) {
         String $$2 = "";
         fyr $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.V = wu.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.V = wu.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.W = $$1;
      }
   }

   public void a(fyo $$0) {
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
