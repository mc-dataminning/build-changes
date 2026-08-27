import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eyu extends euq {
   protected static final acq a = new acq("textures/gui/social_interactions.png");
   private static final sw k = sw.c("gui.socialInteractions.tab_all");
   private static final sw l = sw.c("gui.socialInteractions.tab_hidden");
   private static final sw m = sw.c("gui.socialInteractions.tab_blocked");
   private static final sw n = k.d().a(n.t);
   private static final sw o = l.d().a(n.t);
   private static final sw p = m.d().a(n.t);
   private static final sw q = sw.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final sw r = sw.c("gui.socialInteractions.search_empty").a(n.h);
   private static final sw s = sw.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final sw t = sw.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final sw u = sw.c("gui.socialInteractions.blocking_hint");
   private static final int v = 8;
   private static final int w = 236;
   private static final int x = 16;
   private static final int y = 64;
   public static final int b = 72;
   public static final int c = 88;
   private static final int z = 238;
   private static final int A = 20;
   private static final int C = 36;
   eyt D;
   epr E;
   private String F = "";
   private eyu.a G = eyu.a.a;
   private epi H;
   private epi I;
   private epi J;
   private epi K;
   @Nullable
   private sw L;
   private int M;
   private boolean N;

   public eyu() {
      super(sw.c("gui.socialInteractions.title"));
      this.a(enn.N());
   }

   private int l() {
      return Math.max(52, this.h - 128 - 16);
   }

   private int B() {
      return 80 + this.l() - 8;
   }

   private int C() {
      return (this.g - 238) / 2;
   }

   @Override
   public sw au_() {
      return (sw)(this.L != null ? sv.a(super.au_(), this.L) : super.au_());
   }

   @Override
   public void f() {
      super.f();
      this.E.a();
   }

   @Override
   protected void b() {
      if (this.N) {
         this.D.a(this.g, this.h, 88, this.B());
      } else {
         this.D = new eyt(this, this.f, this.g, this.h, 88, this.B(), 36);
      }

      int $$0 = this.D.b() / 3;
      int $$1 = this.D.o();
      int $$2 = this.D.p();
      int $$3 = this.i.a(u) + 40;
      int $$4 = 64 + this.l();
      int $$5 = (this.g - $$3) / 2 + 3;
      this.H = this.d(epi.a(k, $$0x -> this.a(eyu.a.a)).a($$1, 45, $$0, 20).a());
      this.I = this.d(epi.a(l, $$0x -> this.a(eyu.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.J = this.d(epi.a(m, $$0x -> this.a(eyu.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$6 = this.E != null ? this.E.b() : "";
      this.E = new epr(this.i, this.C() + 29, 75, 198, 13, q) {
         @Override
         protected tj aE_() {
            return !eyu.this.E.b().isEmpty() && eyu.this.D.d() ? super.aE_().f(", ").b(eyu.r) : super.aE_();
         }
      };
      this.E.m(16);
      this.E.e(true);
      this.E.n(16777215);
      this.E.a($$6);
      this.E.c(q);
      this.E.b(this::a);
      this.e(this.E);
      this.e(this.D);
      this.K = this.d(epi.a(u, $$0x -> this.f.a(new etj($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/javablocking");
            }

            this.f.a(this);
         }, "https://aka.ms/javablocking", true))).a($$5, $$4, $$3, 20).a());
      this.N = true;
      this.a(this.G);
   }

   private void a(eyu.a $$0) {
      this.G = $$0;
      this.H.b(k);
      this.I.b(l);
      this.J.b(m);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.H.b(n);
            Collection<UUID> $$2 = this.f.t.cl.j();
            this.D.a($$2, this.D.l(), true);
            break;
         case b:
            this.I.b(o);
            Set<UUID> $$3 = this.f.aK().c();
            $$1 = $$3.isEmpty();
            this.D.a($$3, this.D.l(), false);
            break;
         case c:
            this.J.b(p);
            eys $$4 = this.f.aK();
            Set<UUID> $$5 = this.f.t.cl.j().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.D.a($$5, this.D.l(), false);
      }

      enf $$6 = this.f.aU();
      if (!this.E.b().isEmpty() && this.D.d() && !this.E.aB_()) {
         $$6.c(r);
      } else if ($$1) {
         if ($$0 == eyu.a.b) {
            $$6.c(s);
         } else if ($$0 == eyu.a.c) {
            $$6.c(t);
         }
      }
   }

   @Override
   public void a(eox $$0) {
      int $$1 = this.C() + 3;
      super.a($$0);
      $$0.a(a, $$1, 64, 236, this.l() + 16, 8, 236, 34, 1, 1);
      $$0.a(a, $$1 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a(this.f);
      this.a($$0);
      if (this.L != null) {
         $$0.b(this.f.h, this.L, this.C() + 8, 35, -1);
      }

      if (!this.D.d()) {
         this.D.a($$0, $$1, $$2, $$3);
      } else if (!this.E.b().isEmpty()) {
         $$0.a(this.f.h, r, this.g / 2, (72 + this.B()) / 2, -1);
      } else if (this.G == eyu.a.b) {
         $$0.a(this.f.h, s, this.g / 2, (72 + this.B()) / 2, -1);
      } else if (this.G == eyu.a.c) {
         $$0.a(this.f.h, t, this.g / 2, (72 + this.B()) / 2, -1);
      }

      this.E.a($$0, $$1, $$2, $$3);
      this.K.s = this.G == eyu.a.c;
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.E.aB_() && this.f.m.N.a($$0, $$1)) {
         this.f.a(null);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean az_() {
      return false;
   }

   private void a(String $$0) {
      $$0 = $$0.toLowerCase(Locale.ROOT);
      if (!$$0.equals(this.F)) {
         this.D.a($$0);
         this.F = $$0;
         this.a(this.G);
      }
   }

   private void a(enn $$0) {
      int $$1 = $$0.I().i().size();
      if (this.M != $$1) {
         String $$2 = "";
         ffd $$3 = $$0.P();
         if ($$0.Q()) {
            $$2 = $$0.S().aa();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.L = sw.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.L = sw.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.M = $$1;
      }
   }

   public void a(ffb $$0) {
      this.D.a($$0, this.G);
   }

   public void a(UUID $$0) {
      this.D.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
