import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fca extends esn.a<fca> {
   private static final aer f = new aer("icon/draft_report");
   private static final int g = 10;
   private static final ets h = new ets(
      new aer("social_interactions/report_button"),
      new aer("social_interactions/report_button_disabled"),
      new aer("social_interactions/report_button_highlighted")
   );
   private static final ets i = new ets(new aer("social_interactions/mute_button"), new aer("social_interactions/mute_button_highlighted"));
   private static final ets j = new ets(new aer("social_interactions/unmute_button"), new aer("social_interactions/unmute_button_highlighted"));
   private final eqm k;
   private final List<esf> l;
   private final UUID m;
   private final String n;
   private final Supplier<fzl> o;
   private boolean p;
   private boolean q;
   private final boolean s;
   private final boolean t;
   private final boolean u;
   @Nullable
   private esh v;
   @Nullable
   private esh w;
   @Nullable
   private esh x;
   private float y;
   private static final tf z = tf.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final tf A = tf.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final tf B = tf.c("gui.socialInteractions.status_offline").a(n.u);
   private static final tf C = tf.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final tf D = tf.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final tf E = tf.c("gui.socialInteractions.tooltip.report.disabled");
   private static final tf F = tf.c("gui.socialInteractions.tooltip.report.not_reportable");
   private static final tf G = tf.c("gui.socialInteractions.tooltip.hide");
   private static final tf H = tf.c("gui.socialInteractions.tooltip.show");
   private static final tf I = tf.c("gui.socialInteractions.tooltip.report");
   private static final int J = 24;
   private static final int K = 4;
   public static final int a = ara.b.a(190, 0, 0, 0);
   private static final int L = 20;
   public static final int b = ara.b.a(255, 74, 74, 74);
   public static final int c = ara.b.a(255, 48, 48, 48);
   public static final int d = ara.b.a(255, 255, 255, 255);
   public static final int e = ara.b.a(140, 255, 255, 255);

   public fca(eqm $$0, fcd $$1, UUID $$2, String $$3, Supplier<fzl> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fjh $$6 = $$0.aX();
      this.s = $$6.a().a();
      this.t = $$5;
      this.u = $$6.a($$2);
      tf $$7 = tf.a("gui.socialInteractions.narration.hide", $$3);
      tf $$8 = tf.a("gui.socialInteractions.narration.show", $$3);
      fcb $$9 = $$0.aL();
      boolean $$10 = $$0.H().a($$0.R());
      boolean $$11 = !$$0.v.cv().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new est(0, 0, 20, 20, h, $$4x -> $$6.a($$0, $$1, () -> $$0.a(new fbv($$1, $$6, $$2)), false), tf.c("gui.socialInteractions.report")) {
            @Override
            protected ts aB_() {
               return fca.this.a(super.aB_());
            }
         };
         this.x.a(this.h());
         this.x.b(10);
         this.v = new est(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, tf.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, tf.c("gui.socialInteractions.hide")) {
            @Override
            protected ts aB_() {
               return fca.this.a(super.aB_());
            }
         };
         this.v.a(etq.a(G, $$7));
         this.v.b(10);
         this.w = new est(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, tf.a("gui.socialInteractions.shown_in_chat", $$3));
         }, tf.c("gui.socialInteractions.show")) {
            @Override
            protected ts aB_() {
               return fca.this.a(super.aB_());
            }
         };
         this.w.a(etq.a(H, $$8));
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

   private etq h() {
      if (!this.t) {
         return etq.a(F);
      } else if (!this.s) {
         return etq.a(E);
      } else {
         return !this.q
            ? etq.a(tf.a("gui.socialInteractions.tooltip.report.no_messages", this.n))
            : etq.a(I, tf.a("gui.socialInteractions.narration.report", this.n));
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      tf $$13 = this.j();
      int $$14;
      if ($$13 == te.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      etg.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends eua> i() {
      return this.l;
   }

   @Override
   public List<? extends evv> b() {
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

   private void a(boolean $$0, tf $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aV().c($$1);
   }

   private void e(boolean $$0) {
      this.w.j = $$0;
      this.v.j = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   ts a(ts $$0) {
      tf $$1 = this.j();
      return $$1 == te.a ? tf.b(this.n).f(", ").b($$0) : tf.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private tf j() {
      boolean $$0 = this.k.aL().d(this.m);
      boolean $$1 = this.k.aL().e(this.m);
      if ($$1 && this.p) {
         return D;
      } else if ($$0 && this.p) {
         return C;
      } else if ($$1) {
         return A;
      } else if ($$0) {
         return z;
      } else {
         return this.p ? B : te.a;
      }
   }
}
