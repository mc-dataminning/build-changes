import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqf extends fgg.a<fqf> {
   private static final akn f = new akn("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fhn h = new fhn(
      new akn("social_interactions/report_button"),
      new akn("social_interactions/report_button_disabled"),
      new akn("social_interactions/report_button_highlighted")
   );
   private static final fhn i = new fhn(new akn("social_interactions/mute_button"), new akn("social_interactions/mute_button_highlighted"));
   private static final fhn j = new fhn(new akn("social_interactions/unmute_button"), new akn("social_interactions/unmute_button_highlighted"));
   private final feb k;
   private final List<ffy> l;
   private final UUID m;
   private final String n;
   private final Supplier<gov> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fga v;
   @Nullable
   private fga w;
   @Nullable
   private fga x;
   private float y;
   private static final wx z = wx.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final wx A = wx.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final wx B = wx.c("gui.socialInteractions.status_offline").a(n.u);
   private static final wx C = wx.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final wx D = wx.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final wx E = wx.c("gui.socialInteractions.tooltip.report.disabled");
   private static final wx F = wx.c("gui.socialInteractions.tooltip.hide");
   private static final wx G = wx.c("gui.socialInteractions.tooltip.show");
   private static final wx H = wx.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = axp.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = axp.b.a(255, 74, 74, 74);
   public static final int c = axp.b.a(255, 48, 48, 48);
   public static final int d = axp.b.a(255, 255, 255, 255);
   public static final int e = axp.b.a(140, 255, 255, 255);

   public fqf(feb $$0, fqi $$1, UUID $$2, String $$3, Supplier<gov> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fxz $$6 = $$0.aZ();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      wx $$7 = wx.a("gui.socialInteractions.narration.hide", $$3);
      wx $$8 = wx.a("gui.socialInteractions.narration.show", $$3);
      fqg $$9 = $$0.aM();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.s.cz().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fgm(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fqb($$1, $$6, this)), false), wx.c("gui.socialInteractions.report")) {
            @Override
            protected xl aL_() {
               return fqf.this.a(super.aL_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fgm(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, wx.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, wx.c("gui.socialInteractions.hide")) {
            @Override
            protected xl aL_() {
               return fqf.this.a(super.aL_());
            }
         };
         this.v.a(fhl.a(F, $$7));
         this.v.a(g);
         this.w = new fgm(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, wx.a("gui.socialInteractions.shown_in_chat", $$3));
         }, wx.c("gui.socialInteractions.show")) {
            @Override
            protected xl aL_() {
               return fqf.this.a(super.aL_());
            }
         };
         this.w.a(fhl.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fhl l() {
      return !this.r ? fhl.a(E) : fhl.a(H, wx.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      wx $$13 = this.m();
      int $$14;
      if ($$13 == ww.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fgz.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.m($$3 + ($$4 - this.v.x() - 4) - 20 - 4);
         this.v.n($$2 + ($$5 - this.v.v()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.m($$3 + ($$4 - this.w.x() - 4) - 20 - 4);
         this.w.n($$2 + ($$5 - this.w.v()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.m($$3 + ($$4 - this.w.x() - 4));
         this.x.n($$2 + ($$5 - this.w.v()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.s && this.x != null) {
         $$0.a(f, this.x.C() + 5, this.x.D() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fhw> aF_() {
      return this.l;
   }

   @Override
   public List<? extends fju> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID d() {
      return this.m;
   }

   public Supplier<gov> h() {
      return this.o;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean i() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
   }

   public boolean j() {
      return this.q;
   }

   public boolean k() {
      return this.u;
   }

   private void a(boolean $$0, wx $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aX().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xl a(xl $$0) {
      wx $$1 = this.m();
      return $$1 == ww.a ? wx.b(this.n).f(", ").b($$0) : wx.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private wx m() {
      boolean $$0 = this.k.aM().d(this.m);
      boolean $$1 = this.k.aM().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : ww.a;
      }
   }
}
