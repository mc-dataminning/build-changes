import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fdj extends etp.a<fdj> {
   private static final afw f = new afw("icon/draft_report");
   private static final int g = 10;
   private static final euw h = new euw(
      new afw("social_interactions/report_button"),
      new afw("social_interactions/report_button_disabled"),
      new afw("social_interactions/report_button_highlighted")
   );
   private static final euw i = new euw(new afw("social_interactions/mute_button"), new afw("social_interactions/mute_button_highlighted"));
   private static final euw j = new euw(new afw("social_interactions/unmute_button"), new afw("social_interactions/unmute_button_highlighted"));
   private final ero k;
   private final List<eth> l;
   private final UUID m;
   private final String n;
   private final Supplier<gba> o;
   private boolean p;
   private boolean q;
   private final boolean s;
   private final boolean t;
   private final boolean u;
   @Nullable
   private etj v;
   @Nullable
   private etj w;
   @Nullable
   private etj x;
   private float y;
   private static final ui z = ui.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final ui A = ui.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final ui B = ui.c("gui.socialInteractions.status_offline").a(n.u);
   private static final ui C = ui.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final ui D = ui.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final ui E = ui.c("gui.socialInteractions.tooltip.report.disabled");
   private static final ui F = ui.c("gui.socialInteractions.tooltip.hide");
   private static final ui G = ui.c("gui.socialInteractions.tooltip.show");
   private static final ui H = ui.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = asi.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = asi.b.a(255, 74, 74, 74);
   public static final int c = asi.b.a(255, 48, 48, 48);
   public static final int d = asi.b.a(255, 255, 255, 255);
   public static final int e = asi.b.a(140, 255, 255, 255);

   public fdj(ero $$0, fdm $$1, UUID $$2, String $$3, Supplier<gba> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fku $$6 = $$0.aX();
      this.s = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      ui $$7 = ui.a("gui.socialInteractions.narration.hide", $$3);
      ui $$8 = ui.a("gui.socialInteractions.narration.show", $$3);
      fdk $$9 = $$0.aK();
      boolean $$10 = $$0.H().a($$0.R());
      boolean $$11 = !$$0.s.cv().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new etv(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fdf($$1, $$6, this)), false), ui.c("gui.socialInteractions.report")) {
            @Override
            protected uw aI_() {
               return fdj.this.a(super.aI_());
            }
         };
         this.x.i = this.s;
         this.x.a(this.k());
         this.x.b(10);
         this.v = new etv(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, ui.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, ui.c("gui.socialInteractions.hide")) {
            @Override
            protected uw aI_() {
               return fdj.this.a(super.aI_());
            }
         };
         this.v.a(euu.a(F, $$7));
         this.v.b(10);
         this.w = new etv(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, ui.a("gui.socialInteractions.shown_in_chat", $$3));
         }, ui.c("gui.socialInteractions.show")) {
            @Override
            protected uw aI_() {
               return fdj.this.a(super.aI_());
            }
         };
         this.w.a(euu.a(G, $$8));
         this.w.b(10);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private euu k() {
      return !this.s ? euu.a(E) : euu.a(H, ui.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      ui $$13 = this.l();
      int $$14;
      if ($$13 == uh.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      eui.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends eve> i() {
      return this.l;
   }

   @Override
   public List<? extends exa> b() {
      return this.l;
   }

   public String c() {
      return this.n;
   }

   public UUID e() {
      return this.m;
   }

   public Supplier<gba> f() {
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

   private void a(boolean $$0, ui $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aV().c($$1);
   }

   private void e(boolean $$0) {
      this.w.j = $$0;
      this.v.j = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   uw a(uw $$0) {
      ui $$1 = this.l();
      return $$1 == uh.a ? ui.b(this.n).f(", ").b($$0) : ui.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private ui l() {
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
         return this.p ? B : uh.a;
      }
   }
}
