import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class faa extends eyx<cfh> {
   private static final aer x = new aer("container/loom/banner_slot");
   private static final aer y = new aer("container/loom/dye_slot");
   private static final aer z = new aer("container/loom/pattern_slot");
   private static final aer A = new aer("container/loom/scroller");
   private static final aer B = new aer("container/loom/scroller_disabled");
   private static final aer C = new aer("container/loom/pattern_selected");
   private static final aer D = new aer("container/loom/pattern_highlighted");
   private static final aer E = new aer("container/loom/pattern");
   private static final aer F = new aer("textures/gui/container/loom.png");
   private static final int G = 4;
   private static final int H = 4;
   private static final int I = 12;
   private static final int J = 15;
   private static final int K = 14;
   private static final int L = 56;
   private static final int M = 60;
   private static final int N = 13;
   private fhn O;
   @Nullable
   private List<Pair<he<dcd>, chm>> P;
   private ciy Q = ciy.b;
   private ciy R = ciy.b;
   private ciy S = ciy.b;
   private boolean T;
   private boolean U;
   private float V;
   private boolean W;
   private int X;

   public faa(cfh $$0, cbm $$1, tf $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::E);
      this.m -= 2;
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.O = this.f.aP().a(fhm.f).b("flag");
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int D() {
      return arp.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(F, $$4, $$5, 0, 0, this.c, this.k);
      cfw $$6 = this.p.n();
      cfw $$7 = this.p.o();
      cfw $$8 = this.p.p();
      if (!$$6.f()) {
         $$0.a(x, $$4 + $$6.f, $$5 + $$6.g, 16, 16);
      }

      if (!$$7.f()) {
         $$0.a(y, $$4 + $$7.f, $$5 + $$7.g, 16, 16);
      }

      if (!$$8.f()) {
         $$0.a(z, $$4 + $$8.f, $$5 + $$8.g, 16, 16);
      }

      int $$9 = (int)(41.0F * this.V);
      aer $$10 = this.T ? A : B;
      $$0.a($$10, $$4 + 119, $$5 + 13 + $$9, 12, 15);
      ekc.a();
      if (this.P != null && !this.U) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$11 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.O.e = 0.0F;
         this.O.c = -32.0F;
         fpg.a($$0.c(), $$0.d(), 15728880, fyc.d, this.O, gar.f, true, this.P);
         $$0.c().b();
         $$0.e();
      }

      if (this.T) {
         int $$12 = $$4 + 60;
         int $$13 = $$5 + 13;
         List<he<dcd>> $$14 = this.p.l();

         label64:
         for (int $$15 = 0; $$15 < 4; $$15++) {
            for (int $$16 = 0; $$16 < 4; $$16++) {
               int $$17 = $$15 + this.X;
               int $$18 = $$17 * 4 + $$16;
               if ($$18 >= $$14.size()) {
                  break label64;
               }

               int $$19 = $$12 + $$16 * 14;
               int $$20 = $$13 + $$15 * 14;
               boolean $$21 = $$2 >= $$19 && $$3 >= $$20 && $$2 < $$19 + 14 && $$3 < $$20 + 14;
               aer $$22;
               if ($$18 == this.p.m()) {
                  $$22 = C;
               } else if ($$21) {
                  $$22 = D;
               } else {
                  $$22 = E;
               }

               $$0.a($$22, $$19, $$20, 14, 14);
               this.a($$0, $$14.get($$18), $$19, $$20);
            }
         }
      }

      ekc.b();
   }

   private void a(erw $$0, he<dcd> $$1, int $$2, int $$3) {
      qr $$4 = new qr();
      qx $$5 = new dcd.a().a(dce.a, chm.h).a($$1, chm.a).a();
      $$4.a("Patterns", $$5);
      ciy $$6 = new ciy(cjb.uc);
      cgr.a($$6, dco.t, $$4);
      elg $$7 = new elg();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.O.e = 0.0F;
      this.O.c = -32.0F;
      List<Pair<he<dcd>, chm>> $$9 = dcc.a(chm.h, dcc.a($$6));
      fpg.a($$7, $$0.d(), 15728880, fyc.d, this.O, gar.f, true, $$9);
      $$7.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.W = false;
      if (this.T) {
         int $$3 = this.t + 60;
         int $$4 = this.u + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.X;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.p.b(this.f.v, $$10)) {
                  eqm.O().ai().a(gbo.a(aow.yq, 1.0F));
                  this.f.t.a(this.p.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.t + 119;
         $$4 = this.u + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.W = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.D() - 4;
      if (this.W && this.T && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.V = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.V = arp.a(this.V, 0.0F, 1.0F);
         this.X = Math.max((int)((double)(this.V * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.D() - 4;
      if (this.T && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.V = arp.a(this.V - $$5, 0.0F, 1.0F);
         this.X = Math.max((int)(this.V * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void E() {
      ciy $$0 = this.p.q().e();
      if ($$0.b()) {
         this.P = null;
      } else {
         this.P = dcc.a(((cgo)$$0.d()).b(), dcc.a($$0));
      }

      ciy $$1 = this.p.n().e();
      ciy $$2 = this.p.o().e();
      ciy $$3 = this.p.p().e();
      qr $$4 = cgr.a($$1);
      this.U = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.U) {
         this.P = null;
      }

      if (!ciy.a($$1, this.Q) || !ciy.a($$2, this.R) || !ciy.a($$3, this.S)) {
         this.T = !$$1.b() && !$$2.b() && !this.U && !this.p.l().isEmpty();
      }

      if (this.X >= this.D()) {
         this.X = 0;
         this.V = 0.0F;
      }

      this.Q = $$1.p();
      this.R = $$2.p();
      this.S = $$3.p();
   }
}
