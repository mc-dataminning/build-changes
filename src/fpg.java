import java.util.List;
import javax.annotation.Nullable;

public class fpg extends fob<cqz> {
   private static final alf D = new alf("container/loom/banner_slot");
   private static final alf E = new alf("container/loom/dye_slot");
   private static final alf F = new alf("container/loom/pattern_slot");
   private static final alf G = new alf("container/loom/scroller");
   private static final alf H = new alf("container/loom/scroller_disabled");
   private static final alf I = new alf("container/loom/pattern_selected");
   private static final alf J = new alf("container/loom/pattern_highlighted");
   private static final alf K = new alf("container/loom/pattern");
   private static final alf L = new alf("container/loom/error");
   private static final alf M = new alf("textures/gui/container/loom.png");
   private static final int N = 4;
   private static final int O = 4;
   private static final int P = 12;
   private static final int Q = 15;
   private static final int R = 14;
   private static final int S = 56;
   private static final int T = 60;
   private static final int U = 13;
   private fxa V;
   @Nullable
   private doy W;
   private cup X = cup.l;
   private cup Y = cup.l;
   private cup Z = cup.l;
   private boolean aa;
   private boolean ab;
   private float ac;
   private boolean ad;
   private int ae;

   public fpg(cqz $$0, cmw $$1, xp $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::J);
      this.s -= 2;
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.V = this.m.aR().a(fwz.g).b("flag");
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int I() {
      return ayz.e(this.w.l().size(), 4);
   }

   @Override
   protected void a(fgr $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(M, $$4, $$5, 0, 0, this.c, this.d);
      crp $$6 = this.w.n();
      crp $$7 = this.w.o();
      crp $$8 = this.w.p();
      crp $$9 = this.w.q();
      if (!$$6.h()) {
         $$0.a(D, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(E, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(F, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
      }

      int $$10 = (int)(41.0F * this.ac);
      alf $$11 = this.aa ? G : H;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      eyu.c();
      if (this.W != null && !this.ab) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, -0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         this.V.e = 0.0F;
         this.V.c = -32.0F;
         cti $$13 = ((csk)$$9.g().g()).b();
         gfj.a($$0.c(), $$0.d(), 15728880, goq.d, this.V, grf.f, true, $$13, this.W);
         $$0.c().b();
         $$0.e();
      } else if (this.ab) {
         $$0.a(L, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
      }

      if (this.aa) {
         int $$14 = $$4 + 60;
         int $$15 = $$5 + 13;
         List<ji<dox>> $$16 = this.w.l();

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
               alf $$24;
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

      eyu.d();
   }

   private void a(fgr $$0, ji<dox> $$1, int $$2, int $$3) {
      ezy $$4 = new ezy();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.5F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.V.e = 0.0F;
      this.V.c = -32.0F;
      doy $$6 = new doy.a().a($$1, cti.a).a();
      gfj.a($$4, $$0.d(), 15728880, goq.d, this.V, grf.f, true, cti.h, $$6);
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
                  fff.Q().aj().a(gsi.a(awa.Ap, 1.0F));
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
      int $$5 = this.I() - 4;
      if (this.ad && this.aa && $$5 > 0) {
         int $$6 = this.A + 13;
         int $$7 = $$6 + 56;
         this.ac = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.ac = ayz.a(this.ac, 0.0F, 1.0F);
         this.ae = Math.max((int)((double)(this.ac * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.I() - 4;
      if (this.aa && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.ac = ayz.a(this.ac - $$5, 0.0F, 1.0F);
         this.ae = Math.max((int)(this.ac * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
   }

   private void J() {
      cup $$0 = this.w.q().g();
      if ($$0.e()) {
         this.W = null;
      } else {
         this.W = $$0.a(km.X, doy.a);
      }

      cup $$1 = this.w.n().g();
      cup $$2 = this.w.o().g();
      cup $$3 = this.w.p().g();
      doy $$4 = $$1.a(km.X, doy.a);
      this.ab = $$4.b().size() >= 6;
      if (this.ab) {
         this.W = null;
      }

      if (!cup.a($$1, this.X) || !cup.a($$2, this.Y) || !cup.a($$3, this.Z)) {
         this.aa = !$$1.e() && !$$2.e() && !this.ab && !this.w.l().isEmpty();
      }

      if (this.ae >= this.I()) {
         this.ae = 0;
         this.ac = 0.0F;
      }

      this.X = $$1.s();
      this.Y = $$2.s();
      this.Z = $$3.s();
   }
}
