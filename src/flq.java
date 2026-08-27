import java.util.List;
import javax.annotation.Nullable;

public class flq extends fkm<cnu> {
   private static final ajt A = new ajt("container/loom/banner_slot");
   private static final ajt B = new ajt("container/loom/dye_slot");
   private static final ajt C = new ajt("container/loom/pattern_slot");
   private static final ajt D = new ajt("container/loom/scroller");
   private static final ajt E = new ajt("container/loom/scroller_disabled");
   private static final ajt F = new ajt("container/loom/pattern_selected");
   private static final ajt G = new ajt("container/loom/pattern_highlighted");
   private static final ajt H = new ajt("container/loom/pattern");
   private static final ajt I = new ajt("container/loom/error");
   private static final ajt J = new ajt("textures/gui/container/loom.png");
   private static final int K = 4;
   private static final int L = 4;
   private static final int M = 12;
   private static final int N = 15;
   private static final int O = 14;
   private static final int P = 56;
   private static final int Q = 60;
   private static final int R = 13;
   private ftm S;
   @Nullable
   private dlw T;
   private crj U = crj.i;
   private crj V = crj.i;
   private crj W = crj.i;
   private boolean X;
   private boolean Y;
   private float Z;
   private boolean aa;
   private int ab;

   public flq(cnu $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.p -= 2;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.S = this.j.aR().a(ftl.g).b("flag");
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return axk.e(this.s.l().size(), 4);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.w;
      int $$5 = this.x;
      $$0.a(J, $$4, $$5, 0, 0, this.c, this.d);
      cok $$6 = this.s.n();
      cok $$7 = this.s.o();
      cok $$8 = this.s.p();
      cok $$9 = this.s.q();
      if (!$$6.h()) {
         $$0.a(A, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(B, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(C, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$10 = (int)(41.0F * this.Z);
      ajt $$11 = this.X ? D : E;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      eve.c();
      if (this.T != null && !this.Y) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, -0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         this.S.e = 0.0F;
         this.S.c = -32.0F;
         gbu.a($$0.c(), $$0.d(), 15728880, gla.d, this.S, gno.f, true, this.T);
         $$0.c().b();
         $$0.e();
      } else if (this.Y) {
         $$0.a(I, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.X) {
         int $$13 = $$4 + 60;
         int $$14 = $$5 + 13;
         List<il<dlv>> $$15 = this.s.l();

         label64:
         for (int $$16 = 0; $$16 < 4; $$16++) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               int $$18 = $$16 + this.ab;
               int $$19 = $$18 * 4 + $$17;
               if ($$19 >= $$15.size()) {
                  break label64;
               }

               int $$20 = $$13 + $$17 * 14;
               int $$21 = $$14 + $$16 * 14;
               boolean $$22 = $$2 >= $$20 && $$3 >= $$21 && $$2 < $$20 + 14 && $$3 < $$21 + 14;
               ajt $$23;
               if ($$19 == this.s.m()) {
                  $$23 = F;
               } else if ($$22) {
                  $$23 = G;
               } else {
                  $$23 = H;
               }

               $$0.a($$23, $$20, $$21, 14, 14);
               this.a($$0, $$15.get($$19), $$20, $$21);
            }
         }
      }

      eve.d();
   }

   private void a(fdc $$0, il<dlv> $$1, int $$2, int $$3) {
      ewi $$4 = new ewi();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.5F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.S.e = 0.0F;
      this.S.c = -32.0F;
      dlw $$6 = new dlw.a().a(dlx.a, cqc.h).a($$1, cqc.a).a();
      gbu.a($$4, $$0.d(), 15728880, gla.d, this.S, gno.f, true, $$6);
      $$4.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.aa = false;
      if (this.X) {
         int $$3 = this.w + 60;
         int $$4 = this.x + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.ab;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.s.b(this.j.s, $$10)) {
                  fbp.Q().ak().a(gor.a(aum.zW, 1.0F));
                  this.j.q.a(this.s.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.w + 119;
         $$4 = this.x + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.aa = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.E() - 4;
      if (this.aa && this.X && $$5 > 0) {
         int $$6 = this.x + 13;
         int $$7 = $$6 + 56;
         this.Z = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.Z = axk.a(this.Z, 0.0F, 1.0F);
         this.ab = Math.max((int)((double)(this.Z * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.X && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.Z = axk.a(this.Z - $$5, 0.0F, 1.0F);
         this.ab = Math.max((int)(this.Z * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   private void F() {
      crj $$0 = this.s.q().g();
      if ($$0.d()) {
         this.T = null;
      } else {
         this.T = $$0.a(jp.N, dlw.a).a(((cpe)$$0.f()).b());
      }

      crj $$1 = this.s.n().g();
      crj $$2 = this.s.o().g();
      crj $$3 = this.s.p().g();
      dlw $$4 = $$1.a(jp.N, dlw.a);
      this.Y = $$4.b().size() >= 6;
      if (this.Y) {
         this.T = null;
      }

      if (!crj.a($$1, this.U) || !crj.a($$2, this.V) || !crj.a($$3, this.W)) {
         this.X = !$$1.d() && !$$2.d() && !this.Y && !this.s.l().isEmpty();
      }

      if (this.ab >= this.E()) {
         this.ab = 0;
         this.Z = 0.0F;
      }

      this.U = $$1.r();
      this.V = $$2.r();
      this.W = $$3.r();
   }
}
