import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fgj extends ewn.a<fgj> {
   private static final agt f = new agt("icon/draft_report");
   private static final int g = 10;
   private static final exu h = new exu(
      new agt("social_interactions/report_button"),
      new agt("social_interactions/report_button_disabled"),
      new agt("social_interactions/report_button_highlighted")
   );
   private static final exu i = new exu(new agt("social_interactions/mute_button"), new agt("social_interactions/mute_button_highlighted"));
   private static final exu j = new exu(new agt("social_interactions/unmute_button"), new agt("social_interactions/unmute_button_highlighted"));
   private final euk k;
   private final List<ewf> l;
   private final UUID m;
   private final String n;
   private final Supplier<geo> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private ewh v;
   @Nullable
   private ewh w;
   @Nullable
   private ewh x;
   private float y;
   private static final vb z = vb.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vb A = vb.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vb B = vb.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vb C = vb.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vb D = vb.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vb E = vb.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vb F = vb.c("gui.socialInteractions.tooltip.hide");
   private static final vb G = vb.c("gui.socialInteractions.tooltip.show");
   private static final vb H = vb.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = ati.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = ati.b.a(255, 74, 74, 74);
   public static final int c = ati.b.a(255, 48, 48, 48);
   public static final int d = ati.b.a(255, 255, 255, 255);
   public static final int e = ati.b.a(140, 255, 255, 255);

   public fgj(euk $$0, fgm $$1, UUID $$2, String $$3, Supplier<geo> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fnw $$6 = $$0.aW();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vb $$7 = vb.a("gui.socialInteractions.narration.hide", $$3);
      vb $$8 = vb.a("gui.socialInteractions.narration.show", $$3);
      fgk $$9 = $$0.aJ();
      boolean $$10 = $$0.G().a($$0.Q());
      boolean $$11 = !$$0.s.cw().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new ewt(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fgf($$1, $$6, this)), false), vb.c("gui.socialInteractions.report")) {
            @Override
            protected vp aM_() {
               return fgj.this.a(super.aM_());
            }
         };
         this.x.i = this.r;
         this.x.a(this.k());
         this.x.b(10);
         this.v = new ewt(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vb.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vb.c("gui.socialInteractions.hide")) {
            @Override
            protected vp aM_() {
               return fgj.this.a(super.aM_());
            }
         };
         this.v.a(exs.a(F, $$7));
         this.v.b(10);
         this.w = new ewt(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vb.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vb.c("gui.socialInteractions.show")) {
            @Override
            protected vp aM_() {
               return fgj.this.a(super.aM_());
            }
         };
         this.w.a(exs.a(G, $$8));
         this.w.b(10);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private exs k() {
      return !this.r ? exs.a(E) : exs.a(H, vb.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vb $$13 = this.l();
      int $$14;
      if ($$13 == va.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      exg.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.f($$3 + ($$4 - this.v.k() - 4) - 20 - 4);
         this.v.g($$2 + ($$5 - this.v.i()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.f($$3 + ($$4 - this.w.k() - 4) - 20 - 4);
         this.w.g($$2 + ($$5 - this.w.i()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.f($$3 + ($$4 - this.w.k() - 4));
         this.x.g($$2 + ($$5 - this.w.i()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.t && this.x != null) {
         $$0.a(f, this.x.p() + 5, this.x.r() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends eyc> i() {
      return this.l;
   }

   @Override
   public List<? extends ezy> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID e() {
      return this.m;
   }

   public Supplier<geo> f() {
      return this.o;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean g() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
   }

   public boolean h() {
      return this.q;
   }

   public boolean j() {
      return this.u;
   }

   private void a(boolean $$0, vb $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aU().c($$1);
   }

   private void e(boolean $$0) {
      this.w.j = $$0;
      this.v.j = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   vp a(vp $$0) {
      vb $$1 = this.l();
      return $$1 == va.a ? vb.b(this.n).f(", ").b($$0) : vb.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vb l() {
      boolean $$0 = this.k.aJ().d(this.m);
      boolean $$1 = this.k.aJ().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : va.a;
      }
   }
}
