import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class fcx extends fbt<chr> {
   private static final agi x = new agi("container/loom/banner_slot");
   private static final agi y = new agi("container/loom/dye_slot");
   private static final agi z = new agi("container/loom/pattern_slot");
   private static final agi A = new agi("container/loom/scroller");
   private static final agi B = new agi("container/loom/scroller_disabled");
   private static final agi C = new agi("container/loom/pattern_selected");
   private static final agi D = new agi("container/loom/pattern_highlighted");
   private static final agi E = new agi("container/loom/pattern");
   private static final agi F = new agi("container/loom/error");
   private static final agi G = new agi("textures/gui/container/loom.png");
   private static final int H = 4;
   private static final int I = 4;
   private static final int J = 12;
   private static final int K = 15;
   private static final int L = 14;
   private static final int M = 56;
   private static final int N = 60;
   private static final int O = 13;
   private fko P;
   @Nullable
   private List<Pair<ib<deu>, cjx>> Q;
   private clj R = clj.b;
   private clj S = clj.b;
   private clj T = clj.b;
   private boolean U;
   private boolean V;
   private float W;
   private boolean X;
   private int Y;

   public fcx(chr $$0, cdt $$1, ur $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.m -= 2;
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.P = this.f.aO().a(fkn.f).b("flag");
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return atm.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(euo $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(G, $$4, $$5, 0, 0, this.c, this.k);
      cih $$6 = this.p.n();
      cih $$7 = this.p.o();
      cih $$8 = this.p.p();
      cih $$9 = this.p.q();
      if (!$$6.g()) {
         $$0.a(x, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.g()) {
         $$0.a(y, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.g()) {
         $$0.a(z, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$10 = (int)(41.0F * this.W);
      agi $$11 = this.U ? A : B;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      ems.a();
      if (this.Q != null && !this.V) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.P.e = 0.0F;
         this.P.c = -32.0F;
         fsp.a($$0.c(), $$0.d(), 15728880, gbl.d, this.P, gea.f, true, this.Q);
         $$0.c().b();
         $$0.e();
      } else if (this.V) {
         $$0.a(F, $$4 + $$9.f - 5, $$5 + $$9.g - 5, 26, 26);
      }

      if (this.U) {
         int $$13 = $$4 + 60;
         int $$14 = $$5 + 13;
         List<ib<deu>> $$15 = this.p.l();

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
               agi $$23;
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

      ems.b();
   }

   private void a(euo $$0, ib<deu> $$1, int $$2, int $$3) {
      rz $$4 = new rz();
      sf $$5 = new deu.a().a(dev.a, cjx.h).a($$1, cjx.a).a();
      $$4.a("Patterns", $$5);
      clj $$6 = new clj(clm.uO);
      cjc.a($$6, dff.t, $$4);
      enw $$7 = new enw();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.P.e = 0.0F;
      this.P.c = -32.0F;
      List<Pair<ib<deu>, cjx>> $$9 = det.a(cjx.h, det.a($$6));
      fsp.a($$7, $$0.d(), 15728880, gbl.d, this.P, gea.f, true, $$9);
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
                  etd.N().ah().a(gex.a(aqr.za, 1.0F));
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
      int $$5 = this.E() - 4;
      if (this.X && this.U && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.W = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.W = atm.a(this.W, 0.0F, 1.0F);
         this.Y = Math.max((int)((double)(this.W * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.U && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.W = atm.a(this.W - $$5, 0.0F, 1.0F);
         this.Y = Math.max((int)(this.W * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void F() {
      clj $$0 = this.p.q().f();
      if ($$0.b()) {
         this.Q = null;
      } else {
         this.Q = det.a(((ciz)$$0.d()).b(), det.a($$0));
      }

      clj $$1 = this.p.n().f();
      clj $$2 = this.p.o().f();
      clj $$3 = this.p.p().f();
      rz $$4 = cjc.a($$1);
      this.V = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.V) {
         this.Q = null;
      }

      if (!clj.a($$1, this.R) || !clj.a($$2, this.S) || !clj.a($$3, this.T)) {
         this.U = !$$1.b() && !$$2.b() && !this.V && !this.p.l().isEmpty();
      }

      if (this.Y >= this.E()) {
         this.Y = 0;
         this.W = 0.0F;
      }

      this.R = $$1.p();
      this.S = $$2.p();
      this.T = $$3.p();
   }
}
