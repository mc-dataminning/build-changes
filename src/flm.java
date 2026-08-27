import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flm extends fbm.a<flm> {
   private static final ajh f = new ajh("icon/draft_report");
   private static final Duration g = Duration.ofMillis(500L);
   private static final fct h = new fct(
      new ajh("social_interactions/report_button"),
      new ajh("social_interactions/report_button_disabled"),
      new ajh("social_interactions/report_button_highlighted")
   );
   private static final fct i = new fct(new ajh("social_interactions/mute_button"), new ajh("social_interactions/mute_button_highlighted"));
   private static final fct j = new fct(new ajh("social_interactions/unmute_button"), new ajh("social_interactions/unmute_button_highlighted"));
   private final ezg k;
   private final List<fbe> l;
   private final UUID m;
   private final String n;
   private final Supplier<gjy> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private fbg v;
   @Nullable
   private fbg w;
   @Nullable
   private fbg x;
   private float y;
   private static final vu z = vu.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vu A = vu.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vu B = vu.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vu C = vu.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vu D = vu.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vu E = vu.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vu F = vu.c("gui.socialInteractions.tooltip.hide");
   private static final vu G = vu.c("gui.socialInteractions.tooltip.show");
   private static final vu H = vu.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = awg.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = awg.b.a(255, 74, 74, 74);
   public static final int c = awg.b.a(255, 48, 48, 48);
   public static final int d = awg.b.a(255, 255, 255, 255);
   public static final int e = awg.b.a(140, 255, 255, 255);

   public flm(ezg $$0, flp $$1, UUID $$2, String $$3, Supplier<gjy> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      ftg $$6 = $$0.ba();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vu $$7 = vu.a("gui.socialInteractions.narration.hide", $$3);
      vu $$8 = vu.a("gui.socialInteractions.narration.show", $$3);
      fln $$9 = $$0.aM();
      boolean $$10 = $$0.J().a($$0.T());
      boolean $$11 = !$$0.s.cw().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new fbs(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fli($$1, $$6, this)), false), vu.c("gui.socialInteractions.report")) {
            @Override
            protected wi aL_() {
               return flm.this.a(super.aL_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.k());
         this.x.a(g);
         this.v = new fbs(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vu.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vu.c("gui.socialInteractions.hide")) {
            @Override
            protected wi aL_() {
               return flm.this.a(super.aL_());
            }
         };
         this.v.a(fcr.a(F, $$7));
         this.v.a(g);
         this.w = new fbs(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vu.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vu.c("gui.socialInteractions.show")) {
            @Override
            protected wi aL_() {
               return flm.this.a(super.aL_());
            }
         };
         this.w.a(fcr.a(G, $$8));
         this.w.a(g);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private fcr k() {
      return !this.r ? fcr.a(E) : fcr.a(H, vu.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vu $$13 = this.m();
      int $$14;
      if ($$13 == vt.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      fcf.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends fdc> l() {
      return this.l;
   }

   @Override
   public List<? extends ffa> a() {
      return this.l;
   }

   public String b() {
      return this.n;
   }

   public UUID c() {
      return this.m;
   }

   public Supplier<gjy> d() {
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

   private void a(boolean $$0, vu $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aY().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   wi a(wi $$0) {
      vu $$1 = this.m();
      return $$1 == vt.a ? vu.b(this.n).f(", ").b($$0) : vu.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vu m() {
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
         return this.p ? B : vt.a;
      }
   }
}
