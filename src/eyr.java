import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eyr extends epo.a<eyr> {
   private static final acq f = new acq("textures/gui/report_button.png");
   private static final int g = 10;
   private final enn h;
   private final List<epf> i;
   private final UUID j;
   private final String k;
   private final Supplier<acq> l;
   private boolean m;
   private boolean n;
   private final boolean o;
   private final boolean p;
   private final boolean q;
   @Nullable
   private epi r;
   @Nullable
   private epi s;
   @Nullable
   private epi t;
   private float u;
   private static final sw v = sw.c("gui.socialInteractions.status_hidden").a(n.u);
   private static final sw w = sw.c("gui.socialInteractions.status_blocked").a(n.u);
   private static final sw x = sw.c("gui.socialInteractions.status_offline").a(n.u);
   private static final sw y = sw.c("gui.socialInteractions.status_hidden_offline").a(n.u);
   private static final sw z = sw.c("gui.socialInteractions.status_blocked_offline").a(n.u);
   private static final sw A = sw.c("gui.socialInteractions.tooltip.report.disabled");
   private static final sw C = sw.c("gui.socialInteractions.tooltip.report.not_reportable");
   private static final sw D = sw.c("gui.socialInteractions.tooltip.hide");
   private static final sw E = sw.c("gui.socialInteractions.tooltip.show");
   private static final sw F = sw.c("gui.socialInteractions.tooltip.report");
   private static final int G = 24;
   private static final int H = 4;
   private static final int I = 20;
   private static final int J = 0;
   private static final int K = 38;
   public static final int a = aok.b.a(190, 0, 0, 0);
   public static final int b = aok.b.a(255, 74, 74, 74);
   public static final int c = aok.b.a(255, 48, 48, 48);
   public static final int d = aok.b.a(255, 255, 255, 255);
   public static final int e = aok.b.a(140, 255, 255, 255);

   public eyr(enn $$0, eyu $$1, UUID $$2, String $$3, Supplier<acq> $$4, boolean $$5) {
      this.h = $$0;
      this.j = $$2;
      this.k = $$3;
      this.l = $$4;
      ffs $$6 = $$0.aW();
      this.o = $$6.a().a();
      this.p = $$5;
      this.q = $$6.a($$2);
      sw $$7 = sw.a("gui.socialInteractions.narration.hide", $$3);
      sw $$8 = sw.a("gui.socialInteractions.narration.show", $$3);
      eys $$9 = $$0.aK();
      boolean $$10 = $$0.G().a($$0.Q());
      boolean $$11 = !$$0.t.ct().equals($$2);
      if ($$11 && $$10 && !$$9.e($$2)) {
         this.t = new ept(
            0, 0, 20, 20, 0, 0, 20, f, 64, 64, $$4x -> $$6.a($$0, $$1, () -> $$0.a(new eym($$1, $$6, $$2)), false), sw.c("gui.socialInteractions.report")
         ) {
            @Override
            protected tj aE_() {
               return eyr.this.a(super.aE_());
            }
         };
         this.t.a(this.h());
         this.t.b(10);
         this.r = new ept(0, 0, 20, 20, 0, 38, 20, eyu.a, 256, 256, $$3x -> {
            $$9.a($$2);
            this.a(true, sw.a("gui.socialInteractions.hidden_in_chat", $$3));
         }, sw.c("gui.socialInteractions.hide")) {
            @Override
            protected tj aE_() {
               return eyr.this.a(super.aE_());
            }
         };
         this.r.a(eqp.a(D, $$7));
         this.r.b(10);
         this.s = new ept(0, 0, 20, 20, 20, 38, 20, eyu.a, 256, 256, $$3x -> {
            $$9.b($$2);
            this.a(false, sw.a("gui.socialInteractions.shown_in_chat", $$3));
         }, sw.c("gui.socialInteractions.show")) {
            @Override
            protected tj aE_() {
               return eyr.this.a(super.aE_());
            }
         };
         this.s.a(eqp.a(E, $$8));
         this.s.b(10);
         this.t.r = false;
         this.i = new ArrayList<>();
         this.i.add(this.r);
         this.i.add(this.t);
         this.e($$9.d(this.j));
      } else {
         this.i = ImmutableList.of();
      }
   }

   private eqp h() {
      if (!this.p) {
         return eqp.a(C);
      } else if (!this.o) {
         return eqp.a(A);
      } else {
         return !this.n
            ? eqp.a(sw.a("gui.socialInteractions.tooltip.report.no_messages", this.k))
            : eqp.a(F, sw.a("gui.socialInteractions.narration.report", this.k));
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
      int $$10 = $$3 + 4;
      int $$11 = $$2 + ($$5 - 24) / 2;
      int $$12 = $$10 + 24 + 4;
      sw $$13 = this.j();
      int $$14;
      if ($$13 == sv.a) {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, b);
         $$14 = $$2 + ($$5 - 9) / 2;
      } else {
         $$0.a($$3, $$2, $$3 + $$4, $$2 + $$5, c);
         $$14 = $$2 + ($$5 - (9 + 9)) / 2;
         $$0.a(this.h.h, $$13, $$12, $$14 + 12, e, false);
      }

      eqf.a($$0, this.l.get(), $$10, $$11, 24);
      $$0.a(this.h.h, this.k, $$12, $$14, d, false);
      if (this.m) {
         $$0.a($$10, $$11, $$10 + 24, $$11 + 24, a);
      }

      if (this.r != null && this.s != null && this.t != null) {
         float $$16 = this.u;
         this.r.e($$3 + ($$4 - this.r.k() - 4) - 20 - 4);
         this.r.f($$2 + ($$5 - this.r.h()) / 2);
         this.r.a($$0, $$6, $$7, $$9);
         this.s.e($$3 + ($$4 - this.s.k() - 4) - 20 - 4);
         this.s.f($$2 + ($$5 - this.s.h()) / 2);
         this.s.a($$0, $$6, $$7, $$9);
         this.t.e($$3 + ($$4 - this.s.k() - 4));
         this.t.f($$2 + ($$5 - this.s.h()) / 2);
         this.t.a($$0, $$6, $$7, $$9);
         if ($$16 == this.u) {
            this.u = 0.0F;
         }
      }

      if (this.q && this.t != null) {
         $$0.a(epf.m, this.t.p() + 5, this.t.r() + 1, 182.0F, 24.0F, 15, 15, 256, 256);
      }
   }

   @Override
   public List<? extends eqt> i() {
      return this.i;
   }

   @Override
   public List<? extends esn> b() {
      return this.i;
   }

   public String d() {
      return this.k;
   }

   public UUID e() {
      return this.j;
   }

   public void c(boolean $$0) {
      this.m = $$0;
   }

   public boolean f() {
      return this.m;
   }

   public void d(boolean $$0) {
      this.n = $$0;
      if (this.t != null) {
         this.t.r = this.o && this.p && $$0;
         this.t.a(this.h());
      }
   }

   public boolean g() {
      return this.n;
   }

   private void a(boolean $$0, sw $$1) {
      this.e($$0);
      this.h.l.d().a($$1);
      this.h.aU().c($$1);
   }

   private void e(boolean $$0) {
      this.s.s = $$0;
      this.r.s = !$$0;
      this.i.set(0, $$0 ? this.s : this.r);
   }

   tj a(tj $$0) {
      sw $$1 = this.j();
      return $$1 == sv.a ? sw.b(this.k).f(", ").b($$0) : sw.b(this.k).f(", ").b($$1).f(", ").b($$0);
   }

   private sw j() {
      boolean $$0 = this.h.aK().d(this.j);
      boolean $$1 = this.h.aK().e(this.j);
      if ($$1 && this.m) {
         return z;
      } else if ($$0 && this.m) {
         return y;
      } else if ($$1) {
         return w;
      } else if ($$0) {
         return v;
      } else {
         return this.m ? x : sv.a;
      }
   }
}
