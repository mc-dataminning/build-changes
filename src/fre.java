import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fre extends fhf.a<fre> {
   private static final alb f = new alb("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fim h = new fim(
      new alb("social_interactions/report_button"),
      new alb("social_interactions/report_button_disabled"),
      new alb("social_interactions/report_button_highlighted")
   );
   private static final fim i = new fim(new alb("social_interactions/mute_button"), new alb("social_interactions/mute_button_highlighted"));
   private static final fim j = new fim(new alb("social_interactions/unmute_button"), new alb("social_interactions/unmute_button_highlighted"));
   private final ffa k;
   private final List<fgx> l;
   private final UUID m;
   private final String n;
   private final Supplier<gpu> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean s;
   private final boolean u;
   @Nullable
   private fgz v;
   @Nullable
   private fgz w;
   @Nullable
   private fgz x;
   private float y;
   private static final xl z = xl.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final xl A = xl.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final xl B = xl.c("gui.socialInteractions.status_offline").a(n.u);
   private static final xl C = xl.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final xl D = xl.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final xl E = xl.c("gui.socialInteractions.tooltip.report.disabled");
   private static final xl F = xl.c("gui.socialInteractions.tooltip.hide");
   private static final xl G = xl.c("gui.socialInteractions.tooltip.show");
   private static final xl H = xl.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = aye.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = aye.b.a(255, 74, 74, 74);
   public static final int c = aye.b.a(255, 48, 48, 48);
   public static final int d = aye.b.a(255, 255, 255, 255);
   public static final int e = aye.b.a(140, 255, 255, 255);

   public fre(ffa $$0, frh $$1, UUID $$2, String $$3, Supplier<gpu> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fyy $$6 = $$0.aZ();
      this.r = $$6.a().a();
      this.u = $$5;
      this.s = $$6.a($$2);
      xl $$7 = xl.a("gui.socialInteractions.narration.hide", $$3);
      xl $$8 = xl.a("gui.socialInteractions.narration.show", $$3);
      frf $$9 = $$0.aM();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.s.cz().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fhl(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fra($$1, $$6, this)), false), xl.c("gui.socialInteractions.report")) {
            @Override
            protected xz aL_() {
               return fre.this.a(super.aL_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.l());
         this.x.a(g);
         this.v = new fhl(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, xl.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, xl.c("gui.socialInteractions.hide")) {
            @Override
            protected xz aL_() {
               return fre.this.a(super.aL_());
            }
         };
         this.v.a(fik.a(F, $$7));
         this.v.a(g);
         this.w = new fhl(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, xl.a("gui.socialInteractions.shown_in_chat", $$3));
         }, xl.c("gui.socialInteractions.show")) {
            @Override
            protected xz aL_() {
               return fre.this.a(super.aL_());
            }
         };
         this.w.a(fik.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fik l() {
      return !this.r ? fik.a(E) : fik.a(H, xl.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      xl $$13 = this.m();
      int $$14;
      if ($$13 == xk.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fhy.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends fiv> aF_() {
      return this.l;
   }

   @Override
   public List<? extends fkt> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID d() {
      return this.m;
   }

   public Supplier<gpu> h() {
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

   private void a(boolean $$0, xl $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aX().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   xz a(xz $$0) {
      xl $$1 = this.m();
      return $$1 == xk.a ? xl.b(this.n).f(", ").b($$0) : xl.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private xl m() {
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
         return this.p ? B : xk.a;
      }
   }
}
