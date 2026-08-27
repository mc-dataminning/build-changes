import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class flp extends fhf {
   private static final ajh c = new ajh("social_interactions/background");
   private static final ajh k = new ajh("icon/search");
   private static final vu l = vu.c("gui.socialInteractions.tab_all");
   private static final vu m = vu.c("gui.socialInteractions.tab_hidden");
   private static final vu n = vu.c("gui.socialInteractions.tab_blocked");
   private static final vu o = l.e().a(n.t);
   private static final vu p = m.e().a(n.t);
   private static final vu q = n.e().a(n.t);
   private static final vu r = vu.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final vu t = vu.c("gui.socialInteractions.search_empty").a(n.h);
   private static final vu u = vu.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final vu v = vu.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final vu w = vu.c("gui.socialInteractions.blocking_hint");
   private static final int x = 8;
   private static final int y = 236;
   private static final int z = 16;
   private static final int A = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int B = 238;
   private static final int C = 20;
   private static final int D = 36;
   flo E;
   fbp F;
   private String G = "";
   private flp.a H = flp.a.a;
   private fbg I;
   private fbg J;
   private fbg K;
   private fbg L;
   @Nullable
   private vu M;
   private int N;
   private boolean O;

   public flp() {
      super(vu.c("gui.socialInteractions.title"));
      this.a(ezg.Q());
   }

   private int o() {
      return Math.max(52, this.h - 128 - 16);
   }

   private int E() {
      return 80 + this.o() - 8;
   }

   private int H() {
      return (this.g - 238) / 2;
   }

   @Override
   public vu i() {
      return (vu)(this.M != null ? vt.a(super.i(), this.M) : super.i());
   }

   @Override
   protected void aO_() {
      if (this.O) {
         this.E.a(this.g, this.E() - 88, 0, 88);
      } else {
         this.E = new flo(this, this.f, this.g, this.E() - 88, 88, 36);
      }

      int $$0 = this.E.b() / 3;
      int $$1 = this.E.q();
      int $$2 = this.E.r();
      int $$3 = this.i.a(w) + 40;
      int $$4 = 64 + this.o();
      int $$5 = (this.g - $$3) / 2 + 3;
      this.I = this.c(fbg.a(l, $$0x -> this.a(flp.a.a)).a($$1, 45, $$0, 20).a());
      this.J = this.c(fbg.a(m, $$0x -> this.a(flp.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.K = this.c(fbg.a(n, $$0x -> this.a(flp.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$6 = this.F != null ? this.F.a() : "";
      this.F = new fbp(this.i, this.H() + 28, 74, 200, 15, r) {
         @Override
         protected wi aL_() {
            return !flp.this.F.a().isEmpty() && flp.this.E.d() ? super.aL_().f(", ").b(flp.t) : super.aL_();
         }
      };
      this.F.f(16);
      this.F.g(true);
      this.F.g(16777215);
      this.F.a($$6);
      this.F.c(r);
      this.F.b(this::a);
      this.d(this.F);
      this.d(this.E);
      this.L = this.c(fbg.a(w, ffw.b(this, "https://aka.ms/javablocking")).a($$5, $$4, $$3, 20).a());
      this.O = true;
      this.a(this.H);
   }

   private void a(flp.a $$0) {
      this.H = $$0;
      this.I.b(l);
      this.J.b(m);
      this.K.b(n);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.I.b(o);
            Collection<UUID> $$2 = this.f.s.cu.o();
            this.E.a($$2, this.E.o(), true);
            break;
         case b:
            this.J.b(p);
            Set<UUID> $$3 = this.f.aM().c();
            $$1 = $$3.isEmpty();
            this.E.a($$3, this.E.o(), false);
            break;
         case c:
            this.K.b(q);
            fln $$4 = this.f.aM();
            Set<UUID> $$5 = this.f.s.cu.o().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.E.a($$5, this.E.o(), false);
      }

      eyy $$6 = this.f.aY();
      if (!this.F.a().isEmpty() && this.E.d() && !this.F.aJ_()) {
         $$6.c(t);
      } else if ($$1) {
         if ($$0 == flp.a.b) {
            $$6.c(u);
         } else if ($$0 == flp.a.c) {
            $$6.c(v);
         }
      }
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.H() + 3;
      super.b($$0, $$1, $$2, $$3);
      $$0.a(c, $$4, 64, 236, this.o() + 16);
      $$0.a(k, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.f);
      if (this.M != null) {
         $$0.b(this.f.h, this.M, this.H() + 8, 35, -1);
      }

      if (!this.E.d()) {
         this.E.a($$0, $$1, $$2, $$3);
      } else if (!this.F.a().isEmpty()) {
         $$0.a(this.f.h, t, this.g / 2, (72 + this.E()) / 2, -1);
      } else if (this.H == flp.a.b) {
         $$0.a(this.f.h, u, this.g / 2, (72 + this.E()) / 2, -1);
      } else if (this.H == flp.a.c) {
         $$0.a(this.f.h, v, this.g / 2, (72 + this.E()) / 2, -1);
      }

      this.F.a($$0, $$1, $$2, $$3);
      this.L.k = this.H == flp.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.F.aJ_() && this.f.m.N.a($$0, $$1)) {
         this.f.a(null);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean m() {
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

   private void a(ezg $$0) {
      int $$1 = $$0.L().n().size();
      if (this.N != $$1) {
         String $$2 = "";
         fsm $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().af();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.M = vu.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.M = vu.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.N = $$1;
      }
   }

   public void a(fsj $$0) {
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
