import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fcn extends eyf {
   private static final aeu c = new aeu("social_interactions/background");
   private static final aeu k = new aeu("icon/search");
   private static final ti l = ti.c("gui.socialInteractions.tab_all");
   private static final ti m = ti.c("gui.socialInteractions.tab_hidden");
   private static final ti n = ti.c("gui.socialInteractions.tab_blocked");
   private static final ti o = l.d().a(n.t);
   private static final ti p = m.d().a(n.t);
   private static final ti q = n.d().a(n.t);
   private static final ti s = ti.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final ti t = ti.c("gui.socialInteractions.search_empty").a(n.h);
   private static final ti u = ti.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final ti v = ti.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final ti w = ti.c("gui.socialInteractions.blocking_hint");
   private static final int x = 8;
   private static final int y = 236;
   private static final int z = 16;
   private static final int A = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int B = 238;
   private static final int C = 20;
   private static final int D = 36;
   fcm E;
   esu F;
   private String G = "";
   private fcn.a H = fcn.a.a;
   private esl I;
   private esl J;
   private esl K;
   private esl L;
   @Nullable
   private ti M;
   private int N;
   private boolean O;

   public fcn() {
      super(ti.c("gui.socialInteractions.title"));
      this.a(eqq.O());
   }

   private int l() {
      return Math.max(52, this.h - 128 - 16);
   }

   private int C() {
      return 80 + this.l() - 8;
   }

   private int D() {
      return (this.g - 238) / 2;
   }

   @Override
   public ti g() {
      return (ti)(this.M != null ? th.a(super.g(), this.M) : super.g());
   }

   @Override
   protected void aD_() {
      if (this.O) {
         this.E.a(this.g, this.h, 88, this.C());
      } else {
         this.E = new fcm(this, this.f, this.g, this.h, 88, this.C(), 36);
      }

      int $$0 = this.E.b() / 3;
      int $$1 = this.E.o();
      int $$2 = this.E.p();
      int $$3 = this.i.a(w) + 40;
      int $$4 = 64 + this.l();
      int $$5 = (this.g - $$3) / 2 + 3;
      this.I = this.d(esl.a(l, $$0x -> this.a(fcn.a.a)).a($$1, 45, $$0, 20).a());
      this.J = this.d(esl.a(m, $$0x -> this.a(fcn.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.K = this.d(esl.a(n, $$0x -> this.a(fcn.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$6 = this.F != null ? this.F.a() : "";
      this.F = new esu(this.i, this.D() + 28, 74, 200, 15, s) {
         @Override
         protected tv aA_() {
            return !fcn.this.F.a().isEmpty() && fcn.this.E.d() ? super.aA_().f(", ").b(fcn.t) : super.aA_();
         }
      };
      this.F.l(16);
      this.F.g(true);
      this.F.m(16777215);
      this.F.a($$6);
      this.F.c(s);
      this.F.b(this::a);
      this.e(this.F);
      this.e(this.E);
      this.L = this.d(esl.a(w, $$0x -> this.f.a(new ewx($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/javablocking");
            }

            this.f.a(this);
         }, "https://aka.ms/javablocking", true))).a($$5, $$4, $$3, 20).a());
      this.O = true;
      this.a(this.H);
   }

   private void a(fcn.a $$0) {
      this.H = $$0;
      this.I.b(l);
      this.J.b(m);
      this.K.b(n);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.I.b(o);
            Collection<UUID> $$2 = this.f.s.cl.o();
            this.E.a($$2, this.E.l(), true);
            break;
         case b:
            this.J.b(p);
            Set<UUID> $$3 = this.f.aK().c();
            $$1 = $$3.isEmpty();
            this.E.a($$3, this.E.l(), false);
            break;
         case c:
            this.K.b(q);
            fcl $$4 = this.f.aK();
            Set<UUID> $$5 = this.f.s.cl.o().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.E.a($$5, this.E.l(), false);
      }

      eqi $$6 = this.f.aV();
      if (!this.F.a().isEmpty() && this.E.d() && !this.F.ay_()) {
         $$6.c(t);
      } else if ($$1) {
         if ($$0 == fcn.a.b) {
            $$6.c(u);
         } else if ($$0 == fcn.a.c) {
            $$6.c(v);
         }
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.D() + 3;
      super.b($$0, $$1, $$2, $$3);
      $$0.a(c, $$4, 64, 236, this.l() + 16);
      $$0.a(k, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.f);
      if (this.M != null) {
         $$0.b(this.f.h, this.M, this.D() + 8, 35, -1);
      }

      if (!this.E.d()) {
         this.E.a($$0, $$1, $$2, $$3);
      } else if (!this.F.a().isEmpty()) {
         $$0.a(this.f.h, t, this.g / 2, (72 + this.C()) / 2, -1);
      } else if (this.H == fcn.a.b) {
         $$0.a(this.f.h, u, this.g / 2, (72 + this.C()) / 2, -1);
      } else if (this.H == fcn.a.c) {
         $$0.a(this.f.h, v, this.g / 2, (72 + this.C()) / 2, -1);
      }

      this.F.a($$0, $$1, $$2, $$3);
      this.L.j = this.H == fcn.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.F.ay_() && this.f.m.N.a($$0, $$1)) {
         this.f.a(null);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean j() {
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

   private void a(eqq $$0) {
      int $$1 = $$0.J().n().size();
      if (this.N != $$1) {
         String $$2 = "";
         fjc $$3 = $$0.Q();
         if ($$0.R()) {
            $$2 = $$0.T().aa();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.M = ti.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.M = ti.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.N = $$1;
      }
   }

   public void a(fja $$0) {
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
