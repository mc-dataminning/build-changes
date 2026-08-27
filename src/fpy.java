import javax.annotation.Nullable;

public class fpy {
   public static class a implements fqq<ka> {
      private final fri a;

      public a(fri $$0) {
         this.a = $$0;
      }

      public fqn a(ka $$0, fnk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fpy.b $$8 = new fpy.b($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b extends frn {
      b(fnk $$0, double $$1, double $$2, double $$3) {
         super($$0, $$1, $$2, $$3);
         this.t = 4;
      }

      @Override
      public fqr b() {
         return fqr.c;
      }

      @Override
      public void a(epx $$0, eul $$1, float $$2) {
         this.e(0.6F - ((float)this.s + $$2 - 1.0F) * 0.25F * 0.5F);
         super.a($$0, $$1, $$2);
      }

      @Override
      public float b(float $$0) {
         return 7.1F * aui.a(((float)this.s + $$0 - 1.0F) * 0.25F * (float) Math.PI);
      }
   }

   static class c extends fqz {
      private boolean b;
      private boolean F;
      private final fqp G;
      private float H;
      private float I;
      private float J;
      private boolean K;

      c(fnk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fqp $$7, fri $$8) {
         super($$0, $$1, $$2, $$3, $$8, 0.1F);
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
         this.G = $$7;
         this.D *= 0.75F;
         this.t = 48 + this.r.a(12);
         this.b($$8);
      }

      public void a(boolean $$0) {
         this.b = $$0;
      }

      public void b(boolean $$0) {
         this.F = $$0;
      }

      @Override
      public void a(epx $$0, eul $$1, float $$2) {
         if (!this.F || this.s < this.t / 3 || (this.s + this.t) / 3 % 2 == 0) {
            super.a($$0, $$1, $$2);
         }
      }

      @Override
      public void a() {
         super.a();
         if (this.b && this.s < this.t / 2 && (this.s + this.t) % 2 == 0) {
            fpy.c $$0 = new fpy.c(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.G, this.a);
            $$0.e(0.99F);
            $$0.a(this.v, this.w, this.x);
            $$0.s = $$0.t / 2;
            if (this.K) {
               $$0.K = true;
               $$0.H = this.H;
               $$0.I = this.I;
               $$0.J = this.J;
            }

            $$0.F = this.F;
            this.G.a($$0);
         }
      }
   }

   public static class d implements fqq<ka> {
      private final fri a;

      public d(fri $$0) {
         this.a = $$0;
      }

      public fqn a(ka $$0, fnk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fpy.c $$8 = new fpy.c($$1, $$2, $$3, $$4, $$5, $$6, $$7, eva.N().g, this.a);
         $$8.e(0.99F);
         return $$8;
      }
   }

   public static class e extends fql {
      private int a;
      private final fqp b;
      private sr D;
      private boolean E;

      public e(fnk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fqp $$7, @Nullable sl $$8) {
         super($$0, $$1, $$2, $$3);
         this.j = $$4;
         this.k = $$5;
         this.l = $$6;
         this.b = $$7;
         this.t = 8;
         if ($$8 != null) {
            this.D = $$8.c("Explosions", 10);
            if (this.D.isEmpty()) {
               this.D = null;
            } else {
               this.t = this.D.size() * 2 - 1;

               for (int $$9 = 0; $$9 < this.D.size(); $$9++) {
                  sl $$10 = this.D.a($$9);
                  if ($$10.q("Flicker")) {
                     this.E = true;
                     this.t += 15;
                     break;
                  }
               }
            }
         }
      }

      @Override
      public void a() {
         if (this.a == 0 && this.D != null) {
            boolean $$0 = this.c();
            boolean $$1 = false;
            if (this.D.size() >= 3) {
               $$1 = true;
            } else {
               for (int $$2 = 0; $$2 < this.D.size(); $$2++) {
                  sl $$3 = this.D.a($$2);
                  if (clv.a.a($$3.f("Type")) == clv.a.b) {
                     $$1 = true;
                     break;
                  }
               }
            }

            arl $$4;
            if ($$1) {
               $$4 = $$0 ? arm.ik : arm.ij;
            } else {
               $$4 = $$0 ? arm.ii : arm.ih;
            }

            this.c.a(this.g, this.h, this.i, $$4, arn.i, 20.0F, 0.95F + this.r.i() * 0.1F, true);
         }

         if (this.a % 2 == 0 && this.D != null && this.a / 2 < this.D.size()) {
            int $$6 = this.a / 2;
            sl $$7 = this.D.a($$6);
            clv.a $$8 = clv.a.a($$7.f("Type"));
            boolean $$9 = $$7.q("Trail");
            boolean $$10 = $$7.q("Flicker");
            int[] $$11 = $$7.n("Colors");
            int[] $$12 = $$7.n("FadeColors");
            if ($$11.length == 0) {
               $$11 = new int[]{clf.p.f()};
            }

            switch ($$8) {
               case a:
               default:
                  this.a(0.25, 2, $$11, $$12, $$9, $$10);
                  break;
               case b:
                  this.a(0.5, 4, $$11, $$12, $$9, $$10);
                  break;
               case c:
                  this.a(
                     0.5,
                     new double[][]{
                        {0.0, 1.0},
                        {0.3455, 0.309},
                        {0.9511, 0.309},
                        {0.3795918367346939, -0.12653061224489795},
                        {0.6122448979591837, -0.8040816326530612},
                        {0.0, -0.35918367346938773}
                     },
                     $$11,
                     $$12,
                     $$9,
                     $$10,
                     false
                  );
                  break;
               case d:
                  this.a(
                     0.5,
                     new double[][]{
                        {0.0, 0.2},
                        {0.2, 0.2},
                        {0.2, 0.6},
                        {0.6, 0.6},
                        {0.6, 0.2},
                        {0.2, 0.2},
                        {0.2, 0.0},
                        {0.4, 0.0},
                        {0.4, -0.6},
                        {0.2, -0.6},
                        {0.2, -0.4},
                        {0.0, -0.4}
                     },
                     $$11,
                     $$12,
                     $$9,
                     $$10,
                     true
                  );
                  break;
               case e:
                  this.a($$11, $$12, $$9, $$10);
            }

            int $$13 = $$11[0];
            float $$14 = (float)(($$13 & 0xFF0000) >> 16) / 255.0F;
            float $$15 = (float)(($$13 & 0xFF00) >> 8) / 255.0F;
            float $$16 = (float)(($$13 & 0xFF) >> 0) / 255.0F;
            fqn $$17 = this.b.a(jx.L, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            $$17.a($$14, $$15, $$16);
         }

         this.a++;
         if (this.a > this.t) {
            if (this.E) {
               boolean $$18 = this.c();
               arl $$19 = $$18 ? arm.io : arm.in;
               this.c.a(this.g, this.h, this.i, $$19, arn.i, 20.0F, 0.9F + this.r.i() * 0.15F, true);
            }

            this.k();
         }
      }

      private boolean c() {
         eva $$0 = eva.N();
         return $$0.j.m().b().c(this.g, this.h, this.i) >= 256.0;
      }

      private void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int[] $$6, int[] $$7, boolean $$8, boolean $$9) {
         fpy.c $$10 = (fpy.c)this.b.a(jx.C, $$0, $$1, $$2, $$3, $$4, $$5);
         $$10.a($$8);
         $$10.b($$9);
         $$10.e(0.99F);
         int $$11 = this.r.a($$6.length);
         $$10.b($$6[$$11]);
         if ($$7.length > 0) {
            $$10.c(ac.a($$7, this.r));
         }
      }

      private void a(double $$0, int $$1, int[] $$2, int[] $$3, boolean $$4, boolean $$5) {
         double $$6 = this.g;
         double $$7 = this.h;
         double $$8 = this.i;

         for (int $$9 = -$$1; $$9 <= $$1; $$9++) {
            for (int $$10 = -$$1; $$10 <= $$1; $$10++) {
               for (int $$11 = -$$1; $$11 <= $$1; $$11++) {
                  double $$12 = (double)$$10 + (this.r.j() - this.r.j()) * 0.5;
                  double $$13 = (double)$$9 + (this.r.j() - this.r.j()) * 0.5;
                  double $$14 = (double)$$11 + (this.r.j() - this.r.j()) * 0.5;
                  double $$15 = Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) / $$0 + this.r.k() * 0.05;
                  this.a($$6, $$7, $$8, $$12 / $$15, $$13 / $$15, $$14 / $$15, $$2, $$3, $$4, $$5);
                  if ($$9 != -$$1 && $$9 != $$1 && $$10 != -$$1 && $$10 != $$1) {
                     $$11 += $$1 * 2 - 1;
                  }
               }
            }
         }
      }

      private void a(double $$0, double[][] $$1, int[] $$2, int[] $$3, boolean $$4, boolean $$5, boolean $$6) {
         double $$7 = $$1[0][0];
         double $$8 = $$1[0][1];
         this.a(this.g, this.h, this.i, $$7 * $$0, $$8 * $$0, 0.0, $$2, $$3, $$4, $$5);
         float $$9 = this.r.i() * (float) Math.PI;
         double $$10 = $$6 ? 0.034 : 0.34;

         for (int $$11 = 0; $$11 < 3; $$11++) {
            double $$12 = (double)$$9 + (double)((float)$$11 * (float) Math.PI) * $$10;
            double $$13 = $$7;
            double $$14 = $$8;

            for (int $$15 = 1; $$15 < $$1.length; $$15++) {
               double $$16 = $$1[$$15][0];
               double $$17 = $$1[$$15][1];

               for (double $$18 = 0.25; $$18 <= 1.0; $$18 += 0.25) {
                  double $$19 = aui.d($$18, $$13, $$16) * $$0;
                  double $$20 = aui.d($$18, $$14, $$17) * $$0;
                  double $$21 = $$19 * Math.sin($$12);
                  $$19 *= Math.cos($$12);

                  for (double $$22 = -1.0; $$22 <= 1.0; $$22 += 2.0) {
                     this.a(this.g, this.h, this.i, $$19 * $$22, $$20, $$21 * $$22, $$2, $$3, $$4, $$5);
                  }
               }

               $$13 = $$16;
               $$14 = $$17;
            }
         }
      }

      private void a(int[] $$0, int[] $$1, boolean $$2, boolean $$3) {
         double $$4 = this.r.k() * 0.05;
         double $$5 = this.r.k() * 0.05;

         for (int $$6 = 0; $$6 < 70; $$6++) {
            double $$7 = this.j * 0.5 + this.r.k() * 0.15 + $$4;
            double $$8 = this.l * 0.5 + this.r.k() * 0.15 + $$5;
            double $$9 = this.k * 0.5 + this.r.j() * 0.5;
            this.a(this.g, this.h, this.i, $$7, $$9, $$8, $$0, $$1, $$2, $$3);
         }
      }
   }
}
