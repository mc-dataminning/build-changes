import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class fag extends ezd<cfj> {
   private static final aeu x = new aeu("container/loom/banner_slot");
   private static final aeu y = new aeu("container/loom/dye_slot");
   private static final aeu z = new aeu("container/loom/pattern_slot");
   private static final aeu A = new aeu("container/loom/scroller");
   private static final aeu B = new aeu("container/loom/scroller_disabled");
   private static final aeu C = new aeu("container/loom/pattern_selected");
   private static final aeu D = new aeu("container/loom/pattern_highlighted");
   private static final aeu E = new aeu("container/loom/pattern");
   private static final aeu F = new aeu("textures/gui/container/loom.png");
   private static final int G = 4;
   private static final int H = 4;
   private static final int I = 12;
   private static final int J = 15;
   private static final int K = 14;
   private static final int L = 56;
   private static final int M = 60;
   private static final int N = 13;
   private fhx O;
   @Nullable
   private List<Pair<hg<dch>, cho>> P;
   private cja Q = cja.b;
   private cja R = cja.b;
   private cja S = cja.b;
   private boolean T;
   private boolean U;
   private float V;
   private boolean W;
   private int X;

   public fag(cfj $$0, cbo $$1, ti $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.m -= 2;
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.O = this.f.aP().a(fhw.f).b("flag");
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return ars.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(esa $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(F, $$4, $$5, 0, 0, this.c, this.k);
      cfy $$6 = this.p.n();
      cfy $$7 = this.p.o();
      cfy $$8 = this.p.p();
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
      aeu $$10 = this.T ? A : B;
      $$0.a($$10, $$4 + 119, $$5 + 13 + $$9, 12, 15);
      ekg.a();
      if (this.P != null && !this.U) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$11 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.O.e = 0.0F;
         this.O.c = -32.0F;
         fpu.a($$0.c(), $$0.d(), 15728880, fyq.d, this.O, gbf.f, true, this.P);
         $$0.c().b();
         $$0.e();
      }

      if (this.T) {
         int $$12 = $$4 + 60;
         int $$13 = $$5 + 13;
         List<hg<dch>> $$14 = this.p.l();

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
               aeu $$22;
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

      ekg.b();
   }

   private void a(esa $$0, hg<dch> $$1, int $$2, int $$3) {
      qu $$4 = new qu();
      ra $$5 = new dch.a().a(dci.a, cho.h).a($$1, cho.a).a();
      $$4.a("Patterns", $$5);
      cja $$6 = new cja(cjd.uc);
      cgt.a($$6, dcs.t, $$4);
      elk $$7 = new elk();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.O.e = 0.0F;
      this.O.c = -32.0F;
      List<Pair<hg<dch>, cho>> $$9 = dcg.a(cho.h, dcg.a($$6));
      fpu.a($$7, $$0.d(), 15728880, fyq.d, this.O, gbf.f, true, $$9);
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
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.p.b(this.f.s, $$10)) {
                  eqq.O().ai().a(gcc.a(aoz.yv, 1.0F));
                  this.f.q.a(this.p.j, $$10);
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
      int $$5 = this.E() - 4;
      if (this.W && this.T && $$5 > 0) {
         int $$6 = this.u + 13;
         int $$7 = $$6 + 56;
         this.V = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.V = ars.a(this.V, 0.0F, 1.0F);
         this.X = Math.max((int)((double)(this.V * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.T && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.V = ars.a(this.V - $$5, 0.0F, 1.0F);
         this.X = Math.max((int)(this.V * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void F() {
      cja $$0 = this.p.q().e();
      if ($$0.b()) {
         this.P = null;
      } else {
         this.P = dcg.a(((cgq)$$0.d()).b(), dcg.a($$0));
      }

      cja $$1 = this.p.n().e();
      cja $$2 = this.p.o().e();
      cja $$3 = this.p.p().e();
      qu $$4 = cgt.a($$1);
      this.U = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.U) {
         this.P = null;
      }

      if (!cja.a($$1, this.Q) || !cja.a($$2, this.R) || !cja.a($$3, this.S)) {
         this.T = !$$1.b() && !$$2.b() && !this.U && !this.p.l().isEmpty();
      }

      if (this.X >= this.E()) {
         this.X = 0;
         this.V = 0.0F;
      }

      this.Q = $$1.p();
      this.R = $$2.p();
      this.S = $$3.p();
   }
}
