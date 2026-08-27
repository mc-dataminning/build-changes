import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhi extends exm.a<fhi> {
   private static final ahg f = new ahg("icon/draft_report");
   private static final int g = 10;
   private static final eyt h = new eyt(
      new ahg("social_interactions/report_button"),
      new ahg("social_interactions/report_button_disabled"),
      new ahg("social_interactions/report_button_highlighted")
   );
   private static final eyt i = new eyt(new ahg("social_interactions/mute_button"), new ahg("social_interactions/mute_button_highlighted"));
   private static final eyt j = new eyt(new ahg("social_interactions/unmute_button"), new ahg("social_interactions/unmute_button_highlighted"));
   private final evi k;
   private final List<exe> l;
   private final UUID m;
   private final String n;
   private final Supplier<gfm> o;
   private boolean p;
   private boolean q;
   private final boolean r;
   private final boolean t;
   private final boolean u;
   @Nullable
   private exg v;
   @Nullable
   private exg w;
   @Nullable
   private exg x;
   private float y;
   private static final vf z = vf.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final vf A = vf.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final vf B = vf.c("gui.socialInteractions.status_offline").a(n.u);
   private static final vf C = vf.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final vf D = vf.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final vf E = vf.c("gui.socialInteractions.tooltip.report.disabled");
   private static final vf F = vf.c("gui.socialInteractions.tooltip.hide");
   private static final vf G = vf.c("gui.socialInteractions.tooltip.show");
   private static final vf H = vf.c("gui.socialInteractions.tooltip.report");
   private static final int I = 24;
   private static final int J = 4;
   public static final int a = aty.b.a(190, 0, 0, 0);
   private static final int K = 20;
   public static final int b = aty.b.a(255, 74, 74, 74);
   public static final int c = aty.b.a(255, 48, 48, 48);
   public static final int d = aty.b.a(255, 255, 255, 255);
   public static final int e = aty.b.a(140, 255, 255, 255);

   public fhi(evi $$0, fhl $$1, UUID $$2, String $$3, Supplier<gfm> $$4, boolean $$5) {
      this.k = $$0;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      fow $$6 = $$0.aY();
      this.r = $$6.a().a();
      this.u = $$5;
      this.t = $$6.a($$2);
      vf $$7 = vf.a("gui.socialInteractions.narration.hide", $$3);
      vf $$8 = vf.a("gui.socialInteractions.narration.show", $$3);
      fhj $$9 = $$0.aK();
      boolean $$10 = $$0.H().a($$0.R());
      boolean $$11 = !$$0.s.cw().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.x = new exs(0, 0, 20, 20, h, $$3x -> $$6.a($$0, $$1, () -> $$0.a(new fhe($$1, $$6, this)), false), vf.c("gui.socialInteractions.report")) {
            @Override
            protected vt aK_() {
               return fhi.this.a(super.aK_());
            }
         };
         this.x.j = this.r;
         this.x.a(this.k());
         this.x.j(10);
         this.v = new exs(0, 0, 20, 20, i, $$3x -> {
            $$9.a($$2);
            this.a(true, vf.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, vf.c("gui.socialInteractions.hide")) {
            @Override
            protected vt aK_() {
               return fhi.this.a(super.aK_());
            }
         };
         this.v.a(eyr.a(F, $$7));
         this.v.j(10);
         this.w = new exs(0, 0, 20, 20, j, $$3x -> {
            $$9.b($$2);
            this.a(false, vf.a("gui.socialInteractions.shown_in_chat", $$3));
         }, vf.c("gui.socialInteractions.show")) {
            @Override
            protected vt aK_() {
               return fhi.this.a(super.aK_());
            }
         };
         this.w.a(eyr.a(G, $$8));
         this.w.j(10);
         this.l = new ArrayList<>();
         this.l.add(this.v);
         this.l.add(this.x);
         this.e($$9.d(this.m));
      } else {
         this.l = ImmutableList.of();
      }
   }

   private eyr k() {
      return !this.r ? eyr.a(E) : eyr.a(H, vf.a("gui.socialInteractions.narration.report", this.n));
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      vf $$13 = this.m();
      int $$14;
      if ($$13 == ve.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.k.h, $$13, $$12, $$14 + 12, e, false);
      }

      eyf.a($$0, this.o.get(), $$10, $$11, 24);
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
   public List<? extends ezb> l() {
      return this.l;
   }

   @Override
   public List<? extends fax> a() {
      return this.l;
   }

   public String b() {
      return this.n;
   }

   public UUID c() {
      return this.m;
   }

   public Supplier<gfm> d() {
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

   private void a(boolean $$0, vf $$1) {
      this.e($$0);
      this.k.l.d().a($$1);
      this.k.aW().c($$1);
   }

   private void e(boolean $$0) {
      this.w.k = $$0;
      this.v.k = !$$0;
      this.l.set(0, $$0 ? this.w : this.v);
   }

   vt a(vt $$0) {
      vf $$1 = this.m();
      return $$1 == ve.a ? vf.b(this.n).f(", ").b($$0) : vf.b(this.n).f(", ").b($$1).f(", ").b($$0);
   }

   private vf m() {
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
         return this.p ? B : ve.a;
      }
   }
}
