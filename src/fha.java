import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fha extends exe.a<fha> {
   private static final ahd f = new ahd("icon/draft_report");
   private static final int g = 10;
   private static final eyl h = new eyl(
      new ahd("social_interactions/report_button"),
      new ahd("social_interactions/report_button_disabled"),
      new ahd("social_interactions/report_button_highlighted")
   );
   private static final eyl i = new eyl(new ahd("social_interactions/mute_button"), new ahd("social_interactions/mute_button_highlighted"));
   private static final eyl j = new eyl(new ahd("social_interactions/unmute_button"), new ahd("social_interactions/unmute_button_highlighted"));
   private final eva k;
   private final List<eww> l;
   private final UUID m;
   private final String n;
   private final Supplier<gff> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private ewy v;
   @Nullable
   private ewy w;
   @Nullable
   private ewy x;
   private float y;
   private static final vd z = vd.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vd A = vd.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vd B = vd.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vd C = vd.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vd D = vd.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vd E = vd.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vd F = vd.c("gui.socialInteractions.tooltip.hide");
   private static final vd G = vd.c("gui.socialInteractions.tooltip.show");
   private static final vd H = vd.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = ats.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = ats.b.a(255, 74, 74, 74);
   public static final int c = ats.b.a(255, 48, 48, 48);
   public static final int d = ats.b.a(255, 255, 255, 255);
   public static final int e = ats.b.a(140, 255, 255, 255);

   public fha(eva $$0, fhd $$1, UUID $$2, String $$3, Supplier<gff> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fon $$6 = $$0.aW();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vd $$7 = vd.a("gui.socialInteractions.narration.hide", $$3);
      vd $$8 = vd.a("gui.socialInteractions.narration.show", $$3);
      fhb $$9 = $$0.aJ();
      boolean $$10 = $$0.G().a($$0.Q());
      boolean $$11 = !$$0.s.cw().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new exk(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fgw($$1, $$6, this)), false), vd.c("gui.socialInteractions.report")) {
            @Override
            protected vr aK_() {
               return fha.this.a(super.aK_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.k());
         this.x.j(10);
         this.v = new exk(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vd.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vd.c("gui.socialInteractions.hide")) {
            @Override
            protected vr aK_() {
               return fha.this.a(super.aK_());
            }
         };
         this.v.a(eyj.a(F, $$7));
         this.v.j(10);
         this.w = new exk(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vd.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vd.c("gui.socialInteractions.show")) {
            @Override
            protected vr aK_() {
               return fha.this.a(super.aK_());
            }
         };
         this.w.a(eyj.a(G, $$8));
         this.w.j(10);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private eyj k() {
      return !this.r ? eyj.a(E) : eyj.a(H, vd.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vd $$13 = this.m();
      int $$14;
      if ($$13 == vc.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      exx.a($$0, this.o.get(), $$10, $$11, 24);
      $$0.a(this.k.h, this.n, $$12, $$14, d, false);
      if (this.p) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.v != null && this.w != null && this.x != null) {
         float $$16 = this.y;
         this.v.n($$3 + ($$4 - this.v.w() - 4) - 20 - 4);
         this.v.o($$2 + ($$5 - this.v.u()) / 2);
         this.v.a($$0, $$6, $$7, $$9);
         this.w.n($$3 + ($$4 - this.w.w() - 4) - 20 - 4);
         this.w.o($$2 + ($$5 - this.w.u()) / 2);
         this.w.a($$0, $$6, $$7, $$9);
         this.x.n($$3 + ($$4 - this.w.w() - 4));
         this.x.o($$2 + ($$5 - this.w.u()) / 2);
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
   public List<? extends eyt> l() {
      return this.l;
   }

   @Override
   public List<? extends fap> a() {
      return this.l;
   }

   public String b() {
      return this.n;
   }

   public UUID c() {
      return this.m;
   }

   public Supplier<gff> d() {
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

   private void a(boolean $$0, vd $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aU().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   vr a(vr $$0) {
      vd $$1 = this.m();
      return $$1 == vc.a ? vd.b(this.n).f(", ").b($$0) : vd.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vd m() {
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
         return this.p ? B : vc.a;
      }
   }
}
