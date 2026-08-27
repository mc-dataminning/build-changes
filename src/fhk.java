import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fhk extends fda {
   private static final ahg c = new ahg("social_interactions/background");
   private static final ahg k = new ahg("icon/search");
   private static final vf l = vf.c("gui.socialInteractions.tab_all");
   private static final vf m = vf.c("gui.socialInteractions.tab_hidden");
   private static final vf n = vf.c("gui.socialInteractions.tab_blocked");
   private static final vf o = l.e().a(n.t);
   private static final vf p = m.e().a(n.t);
   private static final vf q = n.e().a(n.t);
   private static final vf r = vf.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final vf t = vf.c("gui.socialInteractions.search_empty").a(n.h);
   private static final vf u = vf.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final vf v = vf.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final vf w = vf.c("gui.socialInteractions.blocking_hint");
   private static final int x = 8;
   private static final int y = 236;
   private static final int z = 16;
   private static final int A = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int B = 238;
   private static final int C = 20;
   private static final int D = 36;
   fhj E;
   exo F;
   private String G = "";
   private fhk.a H = fhk.a.a;
   private exf I;
   private exf J;
   private exf K;
   private exf L;
   @Nullable
   private vf M;
   private int N;
   private boolean O;

   public fhk() {
      super(vf.c("gui.socialInteractions.title"));
      this.a(evh.O());
   }

   private int n() {
      return Math.max(52, this.h - 128 - 16);
   }

   private int D() {
      return 80 + this.n() - 8;
   }

   private int E() {
      return (this.g - 238) / 2;
   }

   @Override
   public vf h() {
      return (vf)(this.M != null ? ve.a(super.h(), this.M) : super.h());
   }

   @Override
   protected void aN_() {
      if (this.O) {
         this.E.a(this.g, this.D() - 88, 0, 88);
      } else {
         this.E = new fhj(this, this.f, this.g, this.D() - 88, 88, 36);
      }

      int $$0 = this.E.b() / 3;
      int $$1 = this.E.q();
      int $$2 = this.E.r();
      int $$3 = this.i.a(w) + 40;
      int $$4 = 64 + this.n();
      int $$5 = (this.g - $$3) / 2 + 3;
      this.I = this.d(exf.a(l, $$0x -> this.a(fhk.a.a)).a($$1, 45, $$0, 20).a());
      this.J = this.d(exf.a(m, $$0x -> this.a(fhk.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.K = this.d(exf.a(n, $$0x -> this.a(fhk.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$6 = this.F != null ? this.F.a() : "";
      this.F = new exo(this.i, this.E() + 28, 74, 200, 15, r) {
         @Override
         protected vt aK_() {
            return !fhk.this.F.a().isEmpty() && fhk.this.E.d() ? super.aK_().f(", ").b(fhk.t) : super.aK_();
         }
      };
      this.F.f(16);
      this.F.g(true);
      this.F.g(16777215);
      this.F.a($$6);
      this.F.c(r);
      this.F.b(this::a);
      this.e(this.F);
      this.e(this.E);
      this.L = this.d(exf.a(w, fbs.b(this, "https://aka.ms/javablocking")).a($$5, $$4, $$3, 20).a());
      this.O = true;
      this.a(this.H);
   }

   private void a(fhk.a $$0) {
      this.H = $$0;
      this.I.b(l);
      this.J.b(m);
      this.K.b(n);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.I.b(o);
            Collection<UUID> $$2 = this.f.s.cn.p();
            this.E.a($$2, this.E.o(), true);
            break;
         case b:
            this.J.b(p);
            Set<UUID> $$3 = this.f.aK().c();
            $$1 = $$3.isEmpty();
            this.E.a($$3, this.E.o(), false);
            break;
         case c:
            this.K.b(q);
            fhi $$4 = this.f.aK();
            Set<UUID> $$5 = this.f.s.cn.p().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.E.a($$5, this.E.o(), false);
      }

      euz $$6 = this.f.aV();
      if (!this.F.a().isEmpty() && this.E.d() && !this.F.aI_()) {
         $$6.c(t);
      } else if ($$1) {
         if ($$0 == fhk.a.b) {
            $$6.c(u);
         } else if ($$0 == fhk.a.c) {
            $$6.c(v);
         }
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.E() + 3;
      super.b($$0, $$1, $$2, $$3);
      $$0.a(c, $$4, 64, 236, this.n() + 16);
      $$0.a(k, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.f);
      if (this.M != null) {
         $$0.b(this.f.h, this.M, this.E() + 8, 35, -1);
      }

      if (!this.E.d()) {
         this.E.a($$0, $$1, $$2, $$3);
      } else if (!this.F.a().isEmpty()) {
         $$0.a(this.f.h, t, this.g / 2, (72 + this.D()) / 2, -1);
      } else if (this.H == fhk.a.b) {
         $$0.a(this.f.h, u, this.g / 2, (72 + this.D()) / 2, -1);
      } else if (this.H == fhk.a.c) {
         $$0.a(this.f.h, v, this.g / 2, (72 + this.D()) / 2, -1);
      }

      this.F.a($$0, $$1, $$2, $$3);
      this.L.k = this.H == fhk.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.F.aI_() && this.f.m.N.a($$0, $$1)) {
         this.f.a(null);
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
      if (!$$0.equals(this.G)) {
         this.E.a($$0);
         this.G = $$0;
         this.a(this.H);
      }
   }

   private void a(evh $$0) {
      int $$1 = $$0.J().o().size();
      if (this.N != $$1) {
         String $$2 = "";
         foc $$3 = $$0.Q();
         if ($$0.R()) {
            $$2 = $$0.T().ac();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.M = vf.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.M = vf.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.N = $$1;
      }
   }

   public void a(foa $$0) {
      this.E.a($$0, this.H);
   }

   public void a(UUID $$0) {
      this.E.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
