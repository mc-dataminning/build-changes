import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class fjk extends fig<cmv> {
   private static final ajh x = new ajh("container/loom/banner_slot");
   private static final ajh y = new ajh("container/loom/dye_slot");
   private static final ajh z = new ajh("container/loom/pattern_slot");
   private static final ajh A = new ajh("container/loom/scroller");
   private static final ajh B = new ajh("container/loom/scroller_disabled");
   private static final ajh C = new ajh("container/loom/pattern_selected");
   private static final ajh D = new ajh("container/loom/pattern_highlighted");
   private static final ajh E = new ajh("container/loom/pattern");
   private static final ajh F = new ajh("container/loom/error");
   private static final ajh G = new ajh("textures/gui/container/loom.png");
   private static final int H = 4;
   private static final int I = 4;
   private static final int J = 12;
   private static final int K = 15;
   private static final int L = 14;
   private static final int M = 56;
   private static final int N = 60;
   private static final int O = 13;
   private frf P;
   @Nullable
   private List<Pair<il<djz>, cpd>> Q;
   private cqm R = cqm.h;
   private cqm S = cqm.h;
   private cqm T = cqm.h;
   private boolean U;
   private boolean V;
   private float W;
   private boolean X;
   private int Y;

   public fjk(cmv $$0, cit $$1, vu $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::J);
      this.m -= 2;
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.P = this.f.aR().a(fre.g).b("flag");
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int I() {
      return aww.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.k);
      cnl $$6 = this.p.n();
      cnl $$7 = this.p.o();
      cnl $$8 = this.p.p();
      cnl $$9 = this.p.q();
      if (!$$6.h()) {
         $$0.a(x, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(y, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(z, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$10 = (int)(41.0F * this.W);
      ajh $$11 = this.U ? A : B;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      esx.c();
      if (this.Q != null && !this.V) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, -0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         this.P.e = 0.0F;
         this.P.c = -32.0F;
         fzn.a($$0.c(), $$0.d(), 15728880, git.d, this.P, glh.f, true, this.Q);
         $$0.c().b();
         $$0.e();
      } else if (this.V) {
         $$0.a(F, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.U) {
         int $$13 = $$4 + 60;
         int $$14 = $$5 + 13;
         List<il<djz>> $$15 = this.p.l();

         label64:
         for (int $$16 = 0; $$16 < 4; $$16++) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               int $$18 = $$16 + this.Y;
               int $$19 = $$18 * 4 + $$17;
               if ($$19 >= $$15.size()) {
                  break label64;
               }

               int $$20 = $$13 + $$17 * 14;
               int $$21 = $$14 + $$16 * 14;
               boolean $$22 = $$2 >= $$20 && $$3 >= $$21 && $$2 < $$20 + 14 && $$3 < $$21 + 14;
               ajh $$23;
               if ($$19 == this.p.m()) {
                  $$23 = C;
               } else if ($$22) {
                  $$23 = D;
               } else {
                  $$23 = E;
               }

               $$0.a($$23, $$20, $$21, 14, 14);
               this.a($$0, $$15.get($$19), $$20, $$21);
            }
         }
      }

      esx.d();
   }

   private void a(fav $$0, il<djz> $$1, int $$2, int $$3) {
      ta $$4 = new ta();
      tg $$5 = new djz.a().a(dka.a, cpd.h).a($$1, cpd.a).a();
      $$4.a("Patterns", $$5);
      cqm $$6 = new cqm(cqp.uU);
      coh.a($$6, dkk.t, $$4);
      eub $$7 = new eub();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.P.e = 0.0F;
      this.P.c = -32.0F;
      List<Pair<il<djz>, cpd>> $$9 = djy.a(cpd.h, djy.a($$6));
      fzn.a($$7, $$0.d(), 15728880, git.d, this.P, glh.f, true, $$9);
      $$7.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.X = false;
      if (this.U) {
         int $$3 = this.t + 60;
         int $$4 = this.u + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.Y;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.p.b(this.f.s, $$10)) {
                  ezi.Q().ak().a(gmk.a(aty.zT, 1.0F));
                  this.f.q.a(this.p.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.t + 119;
         $$4 = this.u + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.X = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.I() - 4;
      if (this.X && this.U && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.W = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.W = aww.a(this.W, 0.0F, 1.0F);
         this.Y = Math.max((int)((double)(this.W * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.I() - 4;
      if (this.U && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.W = aww.a(this.W - $$5, 0.0F, 1.0F);
         this.Y = Math.max((int)(this.W * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void J() {
      cqm $$0 = this.p.q().g();
      if ($$0.b()) {
         this.Q = null;
      } else {
         this.Q = djy.a(((coe)$$0.d()).b(), djy.a($$0));
      }

      cqm $$1 = this.p.n().g();
      cqm $$2 = this.p.o().g();
      cqm $$3 = this.p.p().g();
      ta $$4 = coh.a($$1);
      this.V = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.V) {
         this.Q = null;
      }

      if (!cqm.a($$1, this.R) || !cqm.a($$2, this.S) || !cqm.a($$3, this.T)) {
         this.U = !$$1.b() && !$$2.b() && !this.V && !this.p.l().isEmpty();
      }

      if (this.Y >= this.I()) {
         this.Y = 0;
         this.W = 0.0F;
      }

      this.R = $$1.q();
      this.S = $$2.q();
      this.T = $$3.q();
   }
}
