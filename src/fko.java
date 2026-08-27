import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fko extends faq.a<fko> {
   private static final ajc f = new ajc("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fbx h = new fbx(
      new ajc("social_interactions/report_button"),
      new ajc("social_interactions/report_button_disabled"),
      new ajc("social_interactions/report_button_highlighted")
   );
   private static final fbx i = new fbx(new ajc("social_interactions/mute_button"), new ajc("social_interactions/mute_button_highlighted"));
   private static final fbx j = new fbx(new ajc("social_interactions/unmute_button"), new ajc("social_interactions/unmute_button_highlighted"));
   private final eyk k;
   private final List<fai> l;
   private final UUID m;
   private final String n;
   private final Supplier<giy> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private fak v;
   @Nullable
   private fak w;
   @Nullable
   private fak x;
   private float y;
   private static final vs z = vs.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vs A = vs.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vs B = vs.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vs C = vs.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vs D = vs.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vs E = vs.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vs F = vs.c("gui.socialInteractions.tooltip.hide");
   private static final vs G = vs.c("gui.socialInteractions.tooltip.show");
   private static final vs H = vs.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = avw.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = avw.b.a(255, 74, 74, 74);
   public static final int c = avw.b.a(255, 48, 48, 48);
   public static final int d = avw.b.a(255, 255, 255, 255);
   public static final int e = avw.b.a(140, 255, 255, 255);

   public fko(eyk $$0, fkr $$1, UUID $$2, String $$3, Supplier<giy> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fsg $$6 = $$0.aZ();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vs $$7 = vs.a("gui.socialInteractions.narration.hide", $$3);
      vs $$8 = vs.a("gui.socialInteractions.narration.show", $$3);
      fkp $$9 = $$0.aL();
      boolean $$10 = $$0.I().a($$0.S());
      boolean $$11 = !$$0.s.ct().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new faw(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fkk($$1, $$6, this)), false), vs.c("gui.socialInteractions.report")) {
            @Override
            protected wg aM_() {
               return fko.this.a(super.aM_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.k());
         this.x.a(g);
         this.v = new faw(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vs.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vs.c("gui.socialInteractions.hide")) {
            @Override
            protected wg aM_() {
               return fko.this.a(super.aM_());
            }
         };
         this.v.a(fbv.a(F, $$7));
         this.v.a(g);
         this.w = new faw(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vs.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vs.c("gui.socialInteractions.show")) {
            @Override
            protected wg aM_() {
               return fko.this.a(super.aM_());
            }
         };
         this.w.a(fbv.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fbv k() {
      return !this.r ? fbv.a(E) : fbv.a(H, vs.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vs $$13 = this.m();
      int $$14;
      if ($$13 == vr.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fbj.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.m($$3 + ($$4 - this.v.w() - 4) - 20 - 4);
         this.v.n($$2 + ($$5 - this.v.u()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.m($$3 + ($$4 - this.w.w() - 4) - 20 - 4);
         this.w.n($$2 + ($$5 - this.w.u()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.m($$3 + ($$4 - this.w.w() - 4));
         this.x.n($$2 + ($$5 - this.w.u()) / 2);
         this.x.a($$0, $$6, $$7, $$9);
         if ($$16 == this.y) {
            this.y = 0.0F;
         }
      }

      if (this.t && this.x != null) {
         $$0.a(f, this.x.B() + 5, this.x.C() + 1, 15, 15);
      }
   }

   @Override
   public List<? extends fcg> l() {
      return this.l;
   }

   @Override
   public List<? extends fed> a() {
      return this.l;
   }

   public String b() {
      return this.n;
   }

   public UUID c() {
      return this.m;
   }

   public Supplier<giy> d() {
      return this.o;
   }

   public void c(boolean $$0) {
      this.p = $$0;
   }

   public boolean e() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.q = $$0;
   }

   public boolean i() {
      return this.q;
   }

   public boolean j() {
      return this.u;
   }

   private void a(boolean $$0, vs $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aX().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   wg a(wg $$0) {
      vs $$1 = this.m();
      return $$1 == vr.a ? vs.b(this.n).f(", ").b($$0) : vs.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vs m() {
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
         return this.p ? B : vr.a;
      }
   }
}
