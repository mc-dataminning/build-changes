import javax.annotation.Nullable;

public class fsl {
   public static class a implements ftc<kc> {
      private final ftu a;

      public a(ftu $$0) {
         this.a = $$0;
      }

      public fsz a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fsl.b $$8 = new fsl.b($$1, $$2, $$3, $$4);
         $$8.a(this.a);
         return $$8;
      }
   }

   public static class b extends ftz {
      b(fpx $$0, double $$1, double $$2, double $$3) {
         super($$0, $$1, $$2, $$3);
         this.t = 4;
      }

      @Override
      public ftd b() {
         return ftd.c;
      }

      @Override
      public void a(ese $$0, ews $$1, float $$2) {
         this.e(0.6F - ((float)this.s + $$2 - 1.0F) * 0.25F * 0.5F);
         super.a($$0, $$1, $$2);
      }

      @Override
      public float b(float $$0) {
         return 7.1F * awh.a(((float)this.s + $$0 - 1.0F) * 0.25F * (float) Math.PI);
      }
   }

   static class c extends ftl {
      private boolean b;
      private boolean F;
      private final ftb G;
      private float H;
      private float I;
      private float J;
      private boolean K;

      c(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftb $$7, ftu $$8) {
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
      public void a(ese $$0, ews $$1, float $$2) {
         if (!this.F || this.s < this.t / 3 || (this.s + this.t) / 3 % 2 == 0) {
            super.a($$0, $$1, $$2);
         }
      }

      @Override
      public void a() {
         super.a();
         if (this.b && this.s < this.t / 2 && (this.s + this.t) % 2 == 0) {
            fsl.c $$0 = new fsl.c(this.c, this.g, this.h, this.i, 0.0, 0.0, 0.0, this.G, this.a);
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

   public static class d implements ftc<kc> {
      private final ftu a;

      public d(ftu $$0) {
         this.a = $$0;
      }

      public fsz a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fsl.c $$8 = new fsl.c($$1, $$2, $$3, $$4, $$5, $$6, $$7, exh.O().g, this.a);
         $$8.e(0.99F);
         return $$8;
      }
   }

   public static class e extends fsx {
      private int a;
      private final ftb b;
      private tc D;
      private boolean E;

      public e(fpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftb $$7, @Nullable sw $$8) {
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
                  sw $$10 = this.D.a($$9);
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
                  sw $$3 = this.D.a($$2);
                  if (cod.a.a($$3.f("Type")) == cod.a.b) {
                     $$1 = true;
                     break;
                  }
               }
            }

            atj $$4;
            if ($$1) {
               $$4 = $$0 ? atk.iz : atk.iy;
            } else {
               $$4 = $$0 ? atk.ix : atk.iw;
            }

            this.c.a(this.g, this.h, this.i, $$4, atl.i, 20.0F, 0.95F + this.r.i() * 0.1F, true);
         }

         if (this.a % 2 == 0 && this.D != null && this.a / 2 < this.D.size()) {
            int $$6 = this.a / 2;
            sw $$7 = this.D.a($$6);
            cod.a $$8 = cod.a.a($$7.f("Type"));
            boolean $$9 = $$7.q("Trail");
            boolean $$10 = $$7.q("Flicker");
            int[] $$11 = $$7.n("Colors");
            int[] $$12 = $$7.n("FadeColors");
            if ($$11.length == 0) {
               $$11 = new int[]{cnn.p.f()};
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
            fsz $$17 = this.b.a(jz.L, this.g, this.h, this.i, 0.0, 0.0, 0.0);
            $$17.a($$14, $$15, $$16);
         }

         this.a++;
         if (this.a > this.t) {
            if (this.E) {
               boolean $$18 = this.c();
               atj $$19 = $$18 ? atk.iD : atk.iC;
               this.c.a(this.g, this.h, this.i, $$19, atl.i, 20.0F, 0.9F + this.r.i() * 0.15F, true);
            }

            this.k();
         }
      }

      private boolean c() {
         exh $$0 = exh.O();
         return $$0.j.m().b().c(this.g, this.h, this.i) >= 256.0;
      }

      private void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int[] $$6, int[] $$7, boolean $$8, boolean $$9) {
         fsl.c $$10 = (fsl.c)this.b.a(jz.C, $$0, $$1, $$2, $$3, $$4, $$5);
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
                  double $$19 = awh.d($$18, $$13, $$16) * $$0;
                  double $$20 = awh.d($$18, $$14, $$17) * $$0;
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
