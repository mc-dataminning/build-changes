import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fcr extends esy.a<fcr> {
   private static final aey f = new aey("icon/draft_report");
   private static final int g = 10;
   private static final eue h = new eue(
      new aey("social_interactions/report_button"),
      new aey("social_interactions/report_button_disabled"),
      new aey("social_interactions/report_button_highlighted")
   );
   private static final eue i = new eue(new aey("social_interactions/mute_button"), new aey("social_interactions/mute_button_highlighted"));
   private static final eue j = new eue(new aey("social_interactions/unmute_button"), new aey("social_interactions/unmute_button_highlighted"));
   private final eqx k;
   private final List<esq> l;
   private final UUID m;
   private final String n;
   private final Supplier<gag> o;
   private boolean p;
   private boolean q;
   private final boolean s;
   private final boolean t;
   private final boolean u;
   @Nullable
   private ess v;
   @Nullable
   private ess w;
   @Nullable
   private ess x;
   private float y;
   private static final tn z = tn.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final tn A = tn.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final tn B = tn.c("gui.socialInteractions.status_offline").a(n.u);
   private static final tn C = tn.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final tn D = tn.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final tn E = tn.c("gui.socialInteractions.tooltip.report.disabled");
   private static final tn F = tn.c("gui.socialInteractions.tooltip.hide");
   private static final tn G = tn.c("gui.socialInteractions.tooltip.show");
   private static final tn H = tn.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = arj.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = arj.b.a(255, 74, 74, 74);
   public static final int c = arj.b.a(255, 48, 48, 48);
   public static final int d = arj.b.a(255, 255, 255, 255);
   public static final int e = arj.b.a(140, 255, 255, 255);

   public fcr(eqx $$0, fcu $$1, UUID $$2, String $$3, Supplier<gag> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fkb $$6 = $$0.aX();
      this.s = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      tn $$7 = tn.a("gui.socialInteractions.narration.hide", $$3);
      tn $$8 = tn.a("gui.socialInteractions.narration.show", $$3);
      fcs $$9 = $$0.aK();
      boolean $$10 = $$0.H().a($$0.R());
      boolean $$11 = !$$0.s.cv().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new ete(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fcn($$1, $$6, this)), false), tn.c("gui.socialInteractions.report")) {
            @Override
            protected ua aE_() {
               return fcr.this.a(super.aE_());
            }
         };
         this.x.i = this.s;
         this.x.a(this.k());
         this.x.b(10);
         this.v = new ete(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, tn.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, tn.c("gui.socialInteractions.hide")) {
            @Override
            protected ua aE_() {
               return fcr.this.a(super.aE_());
            }
         };
         this.v.a(euc.a(F, $$7));
         this.v.b(10);
         this.w = new ete(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, tn.a("gui.socialInteractions.shown_in_chat", $$3));
         }, tn.c("gui.socialInteractions.show")) {
            @Override
            protected ua aE_() {
               return fcr.this.a(super.aE_());
            }
         };
         this.w.a(euc.a(G, $$8));
         this.w.b(10);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private euc k() {
      return !this.s ? euc.a(E) : euc.a(H, tn.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      tn $$13 = this.l();
      int $$14;
      if ($$13 == tm.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      etr.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.f($$3 + ($$4 - this.v.l() - 4) - 20 - 4);
         this.v.g($$2 + ($$5 - this.v.i()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.f($$3 + ($$4 - this.w.l() - 4) - 20 - 4);
         this.w.g($$2 + ($$5 - this.w.i()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.f($$3 + ($$4 - this.w.l() - 4));
         this.x.g($$2 + ($$5 - this.w.i()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.t && this.x != null) {
         $$0.a(f, this.x.r() + 5, this.x.t() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends eum> i() {
      return this.l;
   }

   @Override
   public List<? extends ewi> b() {
      return this.l;
   }

   public String d() {
      return this.n;
   }

   public UUID e() {
      return this.m;
   }

   public Supplier<gag> f() {
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

   private void a(boolean $$0, tn $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aV().c($$1);
   }

   private void e(boolean $$0) {
      this.w.j = $$0;
      this.v.j = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   ua a(ua $$0) {
      tn $$1 = this.l();
      return $$1 == tm.a ? tn.b(this.n).f(", ").b($$0) : tn.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private tn l() {
      boolean $$0 = this.k.aK().d(this.m);
      boolean $$1 = this.k.aK().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : tm.a;
      }
   }
}
