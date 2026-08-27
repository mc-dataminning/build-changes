import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fjl extends ezn.a<fjl> {
   private static final aiy f = new aiy("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fau h = new fau(
      new aiy("social_interactions/report_button"),
      new aiy("social_interactions/report_button_disabled"),
      new aiy("social_interactions/report_button_highlighted")
   );
   private static final fau i = new fau(new aiy("social_interactions/mute_button"), new aiy("social_interactions/mute_button_highlighted"));
   private static final fau j = new fau(new aiy("social_interactions/unmute_button"), new aiy("social_interactions/unmute_button_highlighted"));
   private final exh k;
   private final List<ezf> l;
   private final UUID m;
   private final String n;
   private final Supplier<ghs> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private ezh v;
   @Nullable
   private ezh w;
   @Nullable
   private ezh x;
   private float y;
   private static final vq z = vq.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vq A = vq.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vq B = vq.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vq C = vq.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vq D = vq.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vq E = vq.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vq F = vq.c("gui.socialInteractions.tooltip.hide");
   private static final vq G = vq.c("gui.socialInteractions.tooltip.show");
   private static final vq H = vq.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = avr.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = avr.b.a(255, 74, 74, 74);
   public static final int c = avr.b.a(255, 48, 48, 48);
   public static final int d = avr.b.a(255, 255, 255, 255);
   public static final int e = avr.b.a(140, 255, 255, 255);

   public fjl(exh $$0, fjo $$1, UUID $$2, String $$3, Supplier<ghs> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      frb $$6 = $$0.aY();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vq $$7 = vq.a("gui.socialInteractions.narration.hide", $$3);
      vq $$8 = vq.a("gui.socialInteractions.narration.show", $$3);
      fjm $$9 = $$0.aK();
      boolean $$10 = $$0.H().a($$0.R());
      boolean $$11 = !$$0.s.cw().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new ezt(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fjh($$1, $$6, this)), false), vq.c("gui.socialInteractions.report")) {
            @Override
            protected we aN_() {
               return fjl.this.a(super.aN_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.k());
         this.x.a(g);
         this.v = new ezt(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vq.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vq.c("gui.socialInteractions.hide")) {
            @Override
            protected we aN_() {
               return fjl.this.a(super.aN_());
            }
         };
         this.v.a(fas.a(F, $$7));
         this.v.a(g);
         this.w = new ezt(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vq.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vq.c("gui.socialInteractions.show")) {
            @Override
            protected we aN_() {
               return fjl.this.a(super.aN_());
            }
         };
         this.w.a(fas.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fas k() {
      return !this.r ? fas.a(E) : fas.a(H, vq.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vq $$13 = this.m();
      int $$14;
      if ($$13 == vp.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fag.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends fbd> l() {
      return this.l;
   }

   @Override
   public List<? extends fda> a() {
      return this.l;
   }

   public String b() {
      return this.n;
   }

   public UUID c() {
      return this.m;
   }

   public Supplier<ghs> d() {
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

   private void a(boolean $$0, vq $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aW().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   we a(we $$0) {
      vq $$1 = this.m();
      return $$1 == vp.a ? vq.b(this.n).f(", ").b($$0) : vq.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vq m() {
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
         return this.p ? B : vp.a;
      }
   }
}
