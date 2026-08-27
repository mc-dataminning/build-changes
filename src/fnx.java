import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fnx extends fjo {
   private static final wg c = wg.c("gui.socialInteractions.title");
   private static final ajt d = new ajt("social_interactions/background");
   private static final ajt o = new ajt("icon/search");
   private static final wg p = wg.c("gui.socialInteractions.tab_all");
   private static final wg q = wg.c("gui.socialInteractions.tab_hidden");
   private static final wg r = wg.c("gui.socialInteractions.tab_blocked");
   private static final wg s = p.e().a(n.t);
   private static final wg u = q.e().a(n.t);
   private static final wg v = r.e().a(n.t);
   private static final wg w = wg.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wg x = wg.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wg y = wg.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wg z = wg.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wg A = wg.c("gui.socialInteractions.blocking_hint");
   private static final int B = 8;
   private static final int C = 236;
   private static final int D = 16;
   private static final int E = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int F = 238;
   private static final int G = 20;
   private static final int H = 36;
   private final fhc I = new fhc(this);
   @Nullable
   private final fjo J;
   fnw K;
   fdy L;
   private String M = "";
   private fnx.a N = fnx.a.a;
   private fdp O;
   private fdp P;
   private fdp Q;
   private fdp R;
   @Nullable
   private wg S;
   private int T;
   private boolean U;

   public fnx() {
      this(null);
   }

   public fnx(@Nullable fjo $$0) {
      super(c);
      this.J = $$0;
      this.a(fbp.Q());
   }

   private int m() {
      return Math.max(52, this.l - 128 - 16);
   }

   private int C() {
      return 80 + this.m() - 8;
   }

   private int D() {
      return (this.k - 238) / 2;
   }

   @Override
   public wg i() {
      return (wg)(this.S != null ? wf.a(super.i(), this.S) : super.i());
   }

   @Override
   protected void aN_() {
      this.I.a(c, this.m);
      if (this.U) {
         this.K.a(this.k, this.m(), 0, 88);
      } else {
         this.K = new fnw(this, this.j, this.k, this.m(), 88, 36);
      }

      int $$0 = this.K.b() / 3;
      int $$1 = this.K.r();
      int $$2 = this.K.s();
      this.O = this.c(fdp.a(p, $$0x -> this.a(fnx.a.a)).a($$1, 45, $$0, 20).a());
      this.P = this.c(fdp.a(q, $$0x -> this.a(fnx.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.Q = this.c(fdp.a(r, $$0x -> this.a(fnx.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.L != null ? this.L.a() : "";
      this.L = new fdy(this.m, this.D() + 28, 74, 200, 15, w) {
         @Override
         protected wu aL_() {
            return !fnx.this.L.a().isEmpty() && fnx.this.K.d() ? super.aL_().f(", ").b(fnx.x) : super.aL_();
         }
      };
      this.L.f(16);
      this.L.g(true);
      this.L.g(-1);
      this.L.a($$3);
      this.L.c(w);
      this.L.b(this::a);
      this.c(this.L);
      this.d(this.K);
      this.R = this.c(fdp.a(A, fif.b(this, "https://aka.ms/javablocking")).a(this.k / 2 - 100, 64 + this.m(), 200, 20).a());
      this.U = true;
      this.a(this.N);
      this.I.b(fdp.a(wf.d, $$0x -> this.d()).a(200).a());
      this.I.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.a();
      this.K.b(this.k, this.m(), 88);
      this.L.c(this.D() + 28, 74);
      int $$0 = this.K.r();
      int $$1 = this.K.s();
      int $$2 = this.K.b() / 3;
      this.O.c($$0, 45);
      this.P.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.Q.c($$1 - $$2 + 1, 45);
      this.R.c(this.k / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aD_() {
      this.b(this.L);
   }

   @Override
   public void d() {
      this.j.a(this.J);
   }

   private void a(fnx.a $$0) {
      this.N = $$0;
      this.O.b(p);
      this.P.b(q);
      this.Q.b(r);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.O.b(s);
            Collection<UUID> $$2 = this.j.s.ct.o();
            this.K.a($$2, this.K.n(), true);
            break;
         case b:
            this.P.b(u);
            Set<UUID> $$3 = this.j.aM().c();
            $$1 = $$3.isEmpty();
            this.K.a($$3, this.K.n(), false);
            break;
         case c:
            this.Q.b(v);
            fnv $$4 = this.j.aM();
            Set<UUID> $$5 = this.j.s.ct.o().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.K.a($$5, this.K.n(), false);
      }

      fbh $$6 = this.j.aY();
      if (!this.L.a().isEmpty() && this.K.d() && !this.L.aJ_()) {
         $$6.c(x);
      } else if ($$1) {
         if ($$0 == fnx.a.b) {
            $$6.c(y);
         } else if ($$0 == fnx.a.c) {
            $$6.c(z);
         }
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.D() + 3;
      $$0.a(d, $$4, 64, 236, this.m() + 16);
      $$0.a(o, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.j);
      if (this.S != null) {
         $$0.b(this.j.h, this.S, this.D() + 8, 35, -1);
      }

      if (!this.K.d()) {
         this.K.a($$0, $$1, $$2, $$3);
      } else if (!this.L.a().isEmpty()) {
         $$0.a(this.j.h, x, this.k / 2, (72 + this.C()) / 2, -1);
      } else if (this.N == fnx.a.b) {
         $$0.a(this.j.h, y, this.k / 2, (72 + this.C()) / 2, -1);
      } else if (this.N == fnx.a.c) {
         $$0.a(this.j.h, z, this.k / 2, (72 + this.C()) / 2, -1);
      }

      this.R.k = this.N == fnx.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.L.aJ_() && this.j.m.N.a($$0, $$1)) {
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
      if (!$$0.equals(this.M)) {
         this.K.a($$0);
         this.M = $$0;
         this.a(this.N);
      }
   }

   private void a(fbp $$0) {
      int $$1 = $$0.L().n().size();
      if (this.T != $$1) {
         String $$2 = "";
         fuv $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.S = wg.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.S = wg.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.T = $$1;
      }
   }

   public void a(fus $$0) {
      this.K.a($$0, this.N);
   }

   public void a(UUID $$0) {
      this.K.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
