import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fbw extends eso.a<fbw> {
   private static final aep f = new aep("icon/draft_report");
   private static final int g = 10;
   private static final ett h = new ett(
      new aep("social_interactions/report_button"),
      new aep("social_interactions/report_button_disabled"),
      new aep("social_interactions/report_button_highlighted")
   );
   private static final ett i = new ett(new aep("social_interactions/mute_button"), new aep("social_interactions/mute_button_highlighted"));
   private static final ett j = new ett(new aep("social_interactions/unmute_button"), new aep("social_interactions/unmute_button_highlighted"));
   private final eqn k;
   private final List<esg> l;
   private final UUID m;
   private final String n;
   private final Supplier<fzg> o;
   private boolean p;
   private boolean q;
   private final boolean s;
   private final boolean t;
   private final boolean u;
   @Nullable
   private esi v;
   @Nullable
   private esi w;
   @Nullable
   private esi x;
   private float y;
   private static final te z = te.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final te A = te.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final te B = te.c("gui.socialInteractions.status_offline").a(n.u);
   private static final te C = te.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final te D = te.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final te E = te.c("gui.socialInteractions.tooltip.report.disabled");
   private static final te F = te.c("gui.socialInteractions.tooltip.report.not_reportable");
   private static final te G = te.c("gui.socialInteractions.tooltip.hide");
   private static final te H = te.c("gui.socialInteractions.tooltip.show");
   private static final te I = te.c("gui.socialInteractions.tooltip.report");
   private static final int J = 24;
   private static final int K = 4;
   public static final int a = aqy.b.a(190, 0, 0, 0);
   private static final int L = 20;
   public static final int b = aqy.b.a(255, 74, 74, 74);
   public static final int c = aqy.b.a(255, 48, 48, 48);
   public static final int d = aqy.b.a(255, 255, 255, 255);
   public static final int e = aqy.b.a(140, 255, 255, 255);

   public fbw(eqn $$0, fbz $$1, UUID $$2, String $$3, Supplier<fzg> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fjc $$6 = $$0.aW();
      this.s = $$6.a().a();
      this.t = $$5;
      this.u = $$6.a($$2);
      te $$7 = te.a("gui.socialInteractions.narration.hide", $$3);
      te $$8 = te.a("gui.socialInteractions.narration.show", $$3);
      fbx $$9 = $$0.aK();
      boolean $$10 = $$0.G().a($$0.Q());
      boolean $$11 = !$$0.t.cv().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new esu(0, 0, 20, 20, h, $$4x -> $$6.a($$0, $$1, () -> $$0.a(new fbr($$1, $$6, $$2)), false), te.c("gui.socialInteractions.report")) {
            @Override
            protected tr aB_() {
               return fbw.this.a(super.aB_());
            }
         };
         this.x.a(this.h());
         this.x.b(10);
         this.v = new esu(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, te.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, te.c("gui.socialInteractions.hide")) {
            @Override
            protected tr aB_() {
               return fbw.this.a(super.aB_());
            }
         };
         this.v.a(etr.a(G, $$7));
         this.v.b(10);
         this.w = new esu(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, te.a("gui.socialInteractions.shown_in_chat", $$3));
         }, te.c("gui.socialInteractions.show")) {
            @Override
            protected tr aB_() {
               return fbw.this.a(super.aB_());
            }
         };
         this.w.a(etr.a(H, $$8));
         this.w.b(10);
         this.x.i = false;
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private etr h() {
      if (!this.t) {
         return etr.a(F);
      } else if (!this.s) {
         return etr.a(E);
      } else {
         return !this.q
            ? etr.a(te.a("gui.socialInteractions.tooltip.report.no_messages", this.n))
            : etr.a(I, te.a("gui.socialInteractions.narration.report", this.n));
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      te $$13 = this.j();
      int $$14;
      if ($$13 == td.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      eth.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.e($$3 + ($$4 - this.v.k() - 4) - 20 - 4);
         this.v.f($$2 + ($$5 - this.v.h()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.e($$3 + ($$4 - this.w.k() - 4) - 20 - 4);
         this.w.f($$2 + ($$5 - this.w.h()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.e($$3 + ($$4 - this.w.k() - 4));
         this.x.f($$2 + ($$5 - this.w.h()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.u && this.x != null) {
         $$0.a(f, this.x.p() + 5, this.x.r() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends etw> i() {
      return this.l;
   }

   @Override
   public List<? extends evr> b() {
      return this.l;
   }

   public String d() {
      return this.n;
   }

   public UUID e() {
      return this.m;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean f() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
      if (this.x != null) {
         this.x.i = this.s && this.t && $$0;
         this.x.a(this.h());
      }
   }

   public boolean g() {
      return this.q;
   }

   private void a(boolean $$0, te $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aU().c($$1);
   }

   private void e(boolean $$0) {
      this.w.j = $$0;
      this.v.j = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   tr a(tr $$0) {
      te $$1 = this.j();
      return $$1 == td.a ? te.b(this.n).f(", ").b($$0) : te.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private te j() {
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
         return this.p ? B : td.a;
      }
   }
}
