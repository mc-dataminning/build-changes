import java.util.List;
import javax.annotation.Nullable;

public class fnf extends fmb<cpj> {
   private static final akh D = new akh("container/loom/banner_slot");
   private static final akh E = new akh("container/loom/dye_slot");
   private static final akh F = new akh("container/loom/pattern_slot");
   private static final akh G = new akh("container/loom/scroller");
   private static final akh H = new akh("container/loom/scroller_disabled");
   private static final akh I = new akh("container/loom/pattern_selected");
   private static final akh J = new akh("container/loom/pattern_highlighted");
   private static final akh K = new akh("container/loom/pattern");
   private static final akh L = new akh("container/loom/error");
   private static final akh M = new akh("textures/gui/container/loom.png");
   private static final int N = 4;
   private static final int O = 4;
   private static final int P = 12;
   private static final int Q = 15;
   private static final int R = 14;
   private static final int S = 56;
   private static final int T = 60;
   private static final int U = 13;
   private fvb V;
   @Nullable
   private dnd W;
   private csz X = csz.i;
   private csz Y = csz.i;
   private csz Z = csz.i;
   private boolean aa;
   private boolean ab;
   private float ac;
   private boolean ad;
   private int ae;

   public fnf(cpj $$0, clg $$1, wu $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.s -= 2;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.V = this.m.aS().a(fva.g).b("flag");
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return axz.e(this.w.l().size(), 4);
   }

   @Override
   protected void a(fer $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(M, $$4, $$5, 0, 0, this.c, this.d);
      cpz $$6 = this.w.n();
      cpz $$7 = this.w.o();
      cpz $$8 = this.w.p();
      cpz $$9 = this.w.q();
      if (!$$6.h()) {
         $$0.a(D, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(E, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(F, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$10 = (int)(41.0F * this.ac);
      akh $$11 = this.aa ? G : H;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      ewt.c();
      if (this.W != null && !this.ab) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, -0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         this.V.e = 0.0F;
         this.V.c = -32.0F;
         crs $$13 = ((cqu)$$9.g().f()).b();
         gdj.a($$0.c(), $$0.d(), 15728880, gmp.d, this.V, gpe.f, true, $$13, this.W);
         $$0.c().b();
         $$0.e();
      } else if (this.ab) {
         $$0.a(L, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.aa) {
         int $$14 = $$4 + 60;
         int $$15 = $$5 + 13;
         List<iw<dnc>> $$16 = this.w.l();

         label64:
         for (int $$17 = 0; $$17 < 4; $$17++) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               int $$19 = $$17 + this.ae;
               int $$20 = $$19 * 4 + $$18;
               if ($$20 >= $$16.size()) {
                  break label64;
               }

               int $$21 = $$14 + $$18 * 14;
               int $$22 = $$15 + $$17 * 14;
               boolean $$23 = $$2 >= $$21 && $$3 >= $$22 && $$2 < $$21 + 14 && $$3 < $$22 + 14;
               akh $$24;
               if ($$20 == this.w.m()) {
                  $$24 = I;
               } else if ($$23) {
                  $$24 = J;
               } else {
                  $$24 = K;
               }

               $$0.a($$24, $$21, $$22, 14, 14);
               this.a($$0, $$16.get($$20), $$21, $$22);
            }
         }
      }

      ewt.d();
   }

   private void a(fer $$0, iw<dnc> $$1, int $$2, int $$3) {
      exx $$4 = new exx();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.5F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.V.e = 0.0F;
      this.V.c = -32.0F;
      dnd $$6 = new dnd.a().a($$1, crs.a).a();
      gdj.a($$4, $$0.d(), 15728880, gmp.d, this.V, gpe.f, true, crs.h, $$6);
      $$4.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ad = false;
      if (this.aa) {
         int $$3 = this.z + 60;
         int $$4 = this.A + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.ae;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.w.b(this.m.s, $$10)) {
                  fde.Q().ak().a(gqh.a(avc.Ae, 1.0F));
                  this.m.q.a(this.w.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.z + 119;
         $$4 = this.A + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.ad = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.E() - 4;
      if (this.ad && this.aa && $$5 > 0) {
         int $$6 = this.A + 13;
         int $$7 = $$6 + 56;
         this.ac = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.ac = axz.a(this.ac, 0.0F, 1.0F);
         this.ae = Math.max((int)((double)(this.ac * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.aa && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.ac = axz.a(this.ac - $$5, 0.0F, 1.0F);
         this.ae = Math.max((int)(this.ac * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   private void F() {
      csz $$0 = this.w.q().g();
      if ($$0.d()) {
         this.W = null;
      } else {
         this.W = $$0.a(ka.U, dnd.a);
      }

      csz $$1 = this.w.n().g();
      csz $$2 = this.w.o().g();
      csz $$3 = this.w.p().g();
      dnd $$4 = $$1.a(ka.U, dnd.a);
      this.ab = $$4.b().size() >= 6;
      if (this.ab) {
         this.W = null;
      }

      if (!csz.a($$1, this.X) || !csz.a($$2, this.Y) || !csz.a($$3, this.Z)) {
         this.aa = !$$1.d() && !$$2.d() && !this.ab && !this.w.l().isEmpty();
      }

      if (this.ae >= this.E()) {
         this.ae = 0;
         this.ac = 0.0F;
      }

      this.X = $$1.r();
      this.Y = $$2.r();
      this.Z = $$3.r();
   }
}
