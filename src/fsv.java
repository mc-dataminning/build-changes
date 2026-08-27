import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import org.joml.Matrix4f;

public class fsv {
   private static final fth a = fth.t(new ahd("textures/map/map_background.png"));
   private static final fth b = fth.t(new ahd("textures/map/map_background_checkerboard.png"));
   private static final float c = -0.4F;
   private static final float d = 0.2F;
   private static final float e = -0.2F;
   private static final float f = -0.6F;
   private static final float g = 0.56F;
   private static final float h = -0.52F;
   private static final float i = -0.72F;
   private static final float j = 45.0F;
   private static final float k = -80.0F;
   private static final float l = -20.0F;
   private static final float m = -20.0F;
   private static final float n = 10.0F;
   private static final float o = 90.0F;
   private static final float p = 30.0F;
   private static final float q = 0.6F;
   private static final float r = -0.5F;
   private static final float s = 0.0F;
   private static final double t = 27.0;
   private static final float u = 0.8F;
   private static final float v = 0.1F;
   private static final float w = -0.3F;
   private static final float x = 0.4F;
   private static final float y = -0.4F;
   private static final float z = 70.0F;
   private static final float A = -20.0F;
   private static final float B = -0.6F;
   private static final float C = 0.8F;
   private static final float D = 0.8F;
   private static final float E = -0.75F;
   private static final float F = -0.9F;
   private static final float G = 45.0F;
   private static final float H = -1.0F;
   private static final float I = 3.6F;
   private static final float J = 3.5F;
   private static final float K = 5.6F;
   private static final int L = 200;
   private static final int M = -135;
   private static final int N = 120;
   private static final float O = -0.4F;
   private static final float P = -0.2F;
   private static final float Q = 0.0F;
   private static final float R = 0.04F;
   private static final float S = -0.72F;
   private static final float T = -1.2F;
   private static final float U = -0.5F;
   private static final float V = 45.0F;
   private static final float W = -85.0F;
   private static final float X = 45.0F;
   private static final float Y = 92.0F;
   private static final float Z = -41.0F;
   private static final float aa = 0.3F;
   private static final float ab = -1.1F;
   private static final float ac = 0.45F;
   private static final float ad = 20.0F;
   private static final float ae = 0.38F;
   private static final float af = -0.5F;
   private static final float ag = -0.5F;
   private static final float ah = 0.0F;
   private static final float ai = 0.0078125F;
   private static final int aj = 7;
   private static final int ak = 128;
   private static final int al = 128;
   private static final float am = 0.0F;
   private static final float an = 0.0F;
   private static final float ao = 0.04F;
   private static final float ap = 0.0F;
   private static final float aq = 0.004F;
   private static final float ar = 0.0F;
   private static final float as = 0.2F;
   private static final float at = 0.1F;
   private final eva au;
   private cmr av = cmr.f;
   private cmr aw = cmr.f;
   private float ax;
   private float ay;
   private float az;
   private float aA;
   private final fyd aB;
   private final fzd aC;

   public fsv(eva $$0, fyd $$1, fzd $$2) {
      this.au = $$0;
      this.aB = $$1;
      this.aC = $$2;
   }

   public void a(bmf $$0, cmr $$1, cmo $$2, boolean $$3, ept $$4, fsz $$5, int $$6) {
      if (!$$1.b()) {
         this.aC.a($$0, $$1, $$2, $$3, $$4, $$5, $$0.dM(), $$6, gdw.d, $$0.aj() + $$2.ordinal());
      }
   }

   private float a(float $$0) {
      float $$1 = 1.0F - $$0 / 45.0F + 0.1F;
      $$1 = aui.a($$1, 0.0F, 1.0F);
      return -aui.b($$1 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void a(ept $$0, fsz $$1, int $$2, blz $$3) {
      gdi $$4 = (gdi)this.aB.<fry>a(this.au.s);
      $$0.a();
      float $$5 = $$3 == blz.b ? 1.0F : -1.0F;
      $$0.a(a.d.rotationDegrees(92.0F));
      $$0.a(a.b.rotationDegrees(45.0F));
      $$0.a(a.f.rotationDegrees($$5 * -41.0F));
      $$0.a($$5 * 0.3F, -1.1F, 0.45F);
      if ($$3 == blz.b) {
         $$4.a($$0, $$1, $$2, this.au.s);
      } else {
         $$4.b($$0, $$1, $$2, this.au.s);
      }

      $$0.b();
   }

   private void a(ept $$0, fsz $$1, int $$2, float $$3, blz $$4, float $$5, cmr $$6) {
      float $$7 = $$4 == blz.b ? 1.0F : -1.0F;
      $$0.a($$7 * 0.125F, -0.125F, 0.0F);
      if (!this.au.s.ce()) {
         $$0.a();
         $$0.a(a.f.rotationDegrees($$7 * 10.0F));
         this.a($$0, $$1, $$2, $$3, $$5, $$4);
         $$0.b();
      }

      $$0.a();
      $$0.a($$7 * 0.51F, -0.08F + $$3 * -1.2F, -0.75F);
      float $$8 = aui.c($$5);
      float $$9 = aui.a($$8 * (float) Math.PI);
      float $$10 = -0.5F * $$9;
      float $$11 = 0.4F * aui.a($$8 * (float) (Math.PI * 2));
      float $$12 = -0.3F * aui.a($$5 * (float) Math.PI);
      $$0.a($$7 * $$10, $$11 - 0.3F * $$9, $$12);
      $$0.a(a.b.rotationDegrees($$9 * -45.0F));
      $$0.a(a.d.rotationDegrees($$7 * $$9 * -30.0F));
      this.a($$0, $$1, $$2, $$6);
      $$0.b();
   }

   private void a(ept $$0, fsz $$1, int $$2, float $$3, float $$4, float $$5) {
      float $$6 = aui.c($$5);
      float $$7 = -0.2F * aui.a($$5 * (float) Math.PI);
      float $$8 = -0.4F * aui.a($$6 * (float) Math.PI);
      $$0.a(0.0F, -$$7 / 2.0F, $$8);
      float $$9 = this.a($$3);
      $$0.a(0.0F, 0.04F + $$4 * -1.2F + $$9 * -0.5F, -0.72F);
      $$0.a(a.b.rotationDegrees($$9 * -85.0F));
      if (!this.au.s.ce()) {
         $$0.a();
         $$0.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$1, $$2, blz.b);
         this.a($$0, $$1, $$2, blz.a);
         $$0.b();
      }

      float $$10 = aui.a($$6 * (float) Math.PI);
      $$0.a(a.b.rotationDegrees($$10 * 20.0F));
      $$0.b(2.0F, 2.0F, 2.0F);
      this.a($$0, $$1, $$2, this.av);
   }

   private void a(ept $$0, fsz $$1, int $$2, cmr $$3) {
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.a(a.f.rotationDegrees(180.0F));
      $$0.b(0.38F, 0.38F, 0.38F);
      $$0.a(-0.5F, -0.5F, 0.0F);
      $$0.b(0.0078125F, 0.0078125F, 0.0078125F);
      Integer $$4 = cmy.d($$3);
      efu $$5 = cmy.a($$4, this.au.r);
      epx $$6 = $$1.getBuffer($$5 == null ? a : b);
      Matrix4f $$7 = $$0.c().a();
      $$6.a($$7, -7.0F, 135.0F, 0.0F).a(255, 255, 255, 255).a(0.0F, 1.0F).b($$2).e();
      $$6.a($$7, 135.0F, 135.0F, 0.0F).a(255, 255, 255, 255).a(1.0F, 1.0F).b($$2).e();
      $$6.a($$7, 135.0F, -7.0F, 0.0F).a(255, 255, 255, 255).a(1.0F, 0.0F).b($$2).e();
      $$6.a($$7, -7.0F, -7.0F, 0.0F).a(255, 255, 255, 255).a(0.0F, 0.0F).b($$2).e();
      if ($$5 != null) {
         this.au.j.j().a($$0, $$1, $$4, $$5, false, $$2);
      }
   }

   private void a(ept $$0, fsz $$1, int $$2, float $$3, float $$4, blz $$5) {
      boolean $$6 = $$5 != blz.a;
      float $$7 = $$6 ? 1.0F : -1.0F;
      float $$8 = aui.c($$4);
      float $$9 = -0.3F * aui.a($$8 * (float) Math.PI);
      float $$10 = 0.4F * aui.a($$8 * (float) (Math.PI * 2));
      float $$11 = -0.4F * aui.a($$4 * (float) Math.PI);
      $$0.a($$7 * ($$9 + 0.64000005F), $$10 + -0.6F + $$3 * -0.6F, $$11 + -0.71999997F);
      $$0.a(a.d.rotationDegrees($$7 * 45.0F));
      float $$12 = aui.a($$4 * $$4 * (float) Math.PI);
      float $$13 = aui.a($$8 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees($$7 * $$13 * 70.0F));
      $$0.a(a.f.rotationDegrees($$7 * $$12 * -20.0F));
      fry $$14 = this.au.s;
      $$0.a($$7 * -1.0F, 3.6F, 3.5F);
      $$0.a(a.f.rotationDegrees($$7 * 120.0F));
      $$0.a(a.b.rotationDegrees(200.0F));
      $$0.a(a.d.rotationDegrees($$7 * -135.0F));
      $$0.a($$7 * 5.6F, 0.0F, 0.0F);
      gdi $$15 = (gdi)this.aB.<fry>a($$14);
      if ($$6) {
         $$15.a($$0, $$1, $$2, $$14);
      } else {
         $$15.b($$0, $$1, $$2, $$14);
      }
   }

   private void a(ept $$0, float $$1, blz $$2, cmr $$3) {
      float $$4 = (float)this.au.s.fq() - $$1 + 1.0F;
      float $$5 = $$4 / (float)$$3.r();
      if ($$5 < 0.8F) {
         float $$6 = aui.e(aui.b($$4 / 4.0F * (float) Math.PI) * 0.1F);
         $$0.a(0.0F, $$6, 0.0F);
      }

      float $$7 = 1.0F - (float)Math.pow((double)$$5, 27.0);
      int $$8 = $$2 == blz.b ? 1 : -1;
      $$0.a($$7 * 0.6F * (float)$$8, $$7 * -0.5F, $$7 * 0.0F);
      $$0.a(a.d.rotationDegrees((float)$$8 * $$7 * 90.0F));
      $$0.a(a.b.rotationDegrees($$7 * 10.0F));
      $$0.a(a.f.rotationDegrees((float)$$8 * $$7 * 30.0F));
   }

   private void a(ept $$0, float $$1, blz $$2, cmr $$3, float $$4) {
      this.b($$0, $$2, $$4);
      float $$5 = (float)(this.au.s.fq() % 10);
      float $$6 = $$5 - $$1 + 1.0F;
      float $$7 = 1.0F - $$6 / 10.0F;
      float $$8 = -90.0F;
      float $$9 = 60.0F;
      float $$10 = 150.0F;
      float $$11 = -15.0F;
      int $$12 = 2;
      float $$13 = -15.0F + 75.0F * aui.b($$7 * 2.0F * (float) Math.PI);
      if ($$2 != blz.b) {
         $$0.a(0.1, 0.83, 0.35);
         $$0.a(a.b.rotationDegrees(-80.0F));
         $$0.a(a.d.rotationDegrees(-90.0F));
         $$0.a(a.b.rotationDegrees($$13));
         $$0.a(-0.3, 0.22, 0.35);
      } else {
         $$0.a(-0.25, 0.22, 0.35);
         $$0.a(a.b.rotationDegrees(-80.0F));
         $$0.a(a.d.rotationDegrees(90.0F));
         $$0.a(a.f.rotationDegrees(0.0F));
         $$0.a(a.b.rotationDegrees($$13));
      }
   }

   private void a(ept $$0, blz $$1, float $$2) {
      int $$3 = $$1 == blz.b ? 1 : -1;
      float $$4 = aui.a($$2 * $$2 * (float) Math.PI);
      $$0.a(a.d.rotationDegrees((float)$$3 * (45.0F + $$4 * -20.0F)));
      float $$5 = aui.a(aui.c($$2) * (float) Math.PI);
      $$0.a(a.f.rotationDegrees((float)$$3 * $$5 * -20.0F));
      $$0.a(a.b.rotationDegrees($$5 * -80.0F));
      $$0.a(a.d.rotationDegrees((float)$$3 * -45.0F));
   }

   private void b(ept $$0, blz $$1, float $$2) {
      int $$3 = $$1 == blz.b ? 1 : -1;
      $$0.a((float)$$3 * 0.56F, -0.52F + $$2 * -0.6F, -0.72F);
   }

   public void a(float $$0, ept $$1, fsz.a $$2, fsb $$3, int $$4) {
      float $$5 = $$3.x($$0);
      bju $$6 = (bju)MoreObjects.firstNonNull($$3.aG, bju.a);
      float $$7 = aui.i($$0, $$3.O, $$3.dE());
      fsv.a $$8 = a($$3);
      float $$9 = aui.i($$0, $$3.cu, $$3.cs);
      float $$10 = aui.i($$0, $$3.ct, $$3.cr);
      $$1.a(a.b.rotationDegrees(($$3.g($$0) - $$9) * 0.1F));
      $$1.a(a.d.rotationDegrees(($$3.h($$0) - $$10) * 0.1F));
      if ($$8.d) {
         float $$11 = $$6 == bju.a ? $$5 : 0.0F;
         float $$12 = 1.0F - aui.i($$0, this.ay, this.ax);
         this.a($$3, $$0, $$7, bju.a, $$11, this.av, $$12, $$1, $$2, $$4);
      }

      if ($$8.e) {
         float $$13 = $$6 == bju.b ? $$5 : 0.0F;
         float $$14 = 1.0F - aui.i($$0, this.aA, this.az);
         this.a($$3, $$0, $$7, bju.b, $$13, this.aw, $$14, $$1, $$2, $$4);
      }

      $$2.b();
   }

   @VisibleForTesting
   static fsv.a a(fsb $$0) {
      cmr $$1 = $$0.eT();
      cmr $$2 = $$0.eU();
      boolean $$3 = $$1.a(cmu.or) || $$2.a(cmu.or);
      boolean $$4 = $$1.a(cmu.vM) || $$2.a(cmu.vM);
      if (!$$3 && !$$4) {
         return fsv.a.a;
      } else if ($$0.fn()) {
         return b($$0);
      } else {
         return a($$1) ? fsv.a.b : fsv.a.a;
      }
   }

   private static fsv.a b(fsb $$0) {
      cmr $$1 = $$0.fp();
      bju $$2 = $$0.fo();
      if (!$$1.a(cmu.or) && !$$1.a(cmu.vM)) {
         return $$2 == bju.a && a($$0.eU()) ? fsv.a.b : fsv.a.a;
      } else {
         return fsv.a.a($$2);
      }
   }

   private static boolean a(cmr $$0) {
      return $$0.a(cmu.vM) && ckz.d($$0);
   }

   private void a(fry $$0, float $$1, float $$2, bju $$3, float $$4, cmr $$5, float $$6, ept $$7, fsz $$8, int $$9) {
      if (!$$0.gq()) {
         boolean $$10 = $$3 == bju.a;
         blz $$11 = $$10 ? $$0.fm() : $$0.fm().e();
         $$7.a();
         if ($$5.b()) {
            if ($$10 && !$$0.ce()) {
               this.a($$7, $$8, $$9, $$6, $$4, $$11);
            }
         } else if ($$5.a(cmu.rR)) {
            if ($$10 && this.aw.b()) {
               this.a($$7, $$8, $$9, $$2, $$6, $$4);
            } else {
               this.a($$7, $$8, $$9, $$6, $$11, $$4, $$5);
            }
         } else if ($$5.a(cmu.vM)) {
            boolean $$12 = ckz.d($$5);
            boolean $$13 = $$11 == blz.b;
            int $$14 = $$13 ? 1 : -1;
            if ($$0.fn() && $$0.fq() > 0 && $$0.fo() == $$3) {
               this.b($$7, $$11, $$6);
               $$7.a((float)$$14 * -0.4785682F, -0.094387F, 0.05731531F);
               $$7.a(a.b.rotationDegrees(-11.935F));
               $$7.a(a.d.rotationDegrees((float)$$14 * 65.3F));
               $$7.a(a.f.rotationDegrees((float)$$14 * -9.785F));
               float $$15 = (float)$$5.r() - ((float)this.au.s.fq() - $$1 + 1.0F);
               float $$16 = $$15 / (float)ckz.k($$5);
               if ($$16 > 1.0F) {
                  $$16 = 1.0F;
               }

               if ($$16 > 0.1F) {
                  float $$17 = aui.a(($$15 - 0.1F) * 1.3F);
                  float $$18 = $$16 - 0.1F;
                  float $$19 = $$17 * $$18;
                  $$7.a($$19 * 0.0F, $$19 * 0.004F, $$19 * 0.0F);
               }

               $$7.a($$16 * 0.0F, $$16 * 0.0F, $$16 * 0.04F);
               $$7.b(1.0F, 1.0F, 1.0F + $$16 * 0.2F);
               $$7.a(a.c.rotationDegrees((float)$$14 * 45.0F));
            } else {
               float $$20 = -0.4F * aui.a(aui.c($$4) * (float) Math.PI);
               float $$21 = 0.2F * aui.a(aui.c($$4) * (float) (Math.PI * 2));
               float $$22 = -0.2F * aui.a($$4 * (float) Math.PI);
               $$7.a((float)$$14 * $$20, $$21, $$22);
               this.b($$7, $$11, $$6);
               this.a($$7, $$11, $$4);
               if ($$12 && $$4 < 0.001F && $$10) {
                  $$7.a((float)$$14 * -0.641864F, 0.0F, 0.0F);
                  $$7.a(a.d.rotationDegrees((float)$$14 * 10.0F));
               }
            }

            this.a($$0, $$5, $$13 ? cmo.e : cmo.d, !$$13, $$7, $$8, $$9);
         } else {
            boolean $$23 = $$11 == blz.b;
            if ($$0.fn() && $$0.fq() > 0 && $$0.fo() == $$3) {
               int $$24 = $$23 ? 1 : -1;
               switch ($$5.s()) {
                  case a:
                     this.b($$7, $$11, $$6);
                     break;
                  case b:
                  case c:
                     this.a($$7, $$1, $$11, $$5);
                     this.b($$7, $$11, $$6);
                     break;
                  case d:
                     this.b($$7, $$11, $$6);
                     break;
                  case e:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$24 * -0.2785682F, 0.18344387F, 0.15731531F);
                     $$7.a(a.b.rotationDegrees(-13.935F));
                     $$7.a(a.d.rotationDegrees((float)$$24 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$24 * -9.785F));
                     float $$25 = (float)$$5.r() - ((float)this.au.s.fq() - $$1 + 1.0F);
                     float $$26 = $$25 / 20.0F;
                     $$26 = ($$26 * $$26 + $$26 * 2.0F) / 3.0F;
                     if ($$26 > 1.0F) {
                        $$26 = 1.0F;
                     }

                     if ($$26 > 0.1F) {
                        float $$27 = aui.a(($$25 - 0.1F) * 1.3F);
                        float $$28 = $$26 - 0.1F;
                        float $$29 = $$27 * $$28;
                        $$7.a($$29 * 0.0F, $$29 * 0.004F, $$29 * 0.0F);
                     }

                     $$7.a($$26 * 0.0F, $$26 * 0.0F, $$26 * 0.04F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$26 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$24 * 45.0F));
                     break;
                  case f:
                     this.b($$7, $$11, $$6);
                     $$7.a((float)$$24 * -0.5F, 0.7F, 0.1F);
                     $$7.a(a.b.rotationDegrees(-55.0F));
                     $$7.a(a.d.rotationDegrees((float)$$24 * 35.3F));
                     $$7.a(a.f.rotationDegrees((float)$$24 * -9.785F));
                     float $$30 = (float)$$5.r() - ((float)this.au.s.fq() - $$1 + 1.0F);
                     float $$31 = $$30 / 10.0F;
                     if ($$31 > 1.0F) {
                        $$31 = 1.0F;
                     }

                     if ($$31 > 0.1F) {
                        float $$32 = aui.a(($$30 - 0.1F) * 1.3F);
                        float $$33 = $$31 - 0.1F;
                        float $$34 = $$32 * $$33;
                        $$7.a($$34 * 0.0F, $$34 * 0.004F, $$34 * 0.0F);
                     }

                     $$7.a(0.0F, 0.0F, $$31 * 0.2F);
                     $$7.b(1.0F, 1.0F, 1.0F + $$31 * 0.2F);
                     $$7.a(a.c.rotationDegrees((float)$$24 * 45.0F));
                     break;
                  case j:
                     this.a($$7, $$1, $$11, $$5, $$6);
               }
            } else if ($$0.fj()) {
               this.b($$7, $$11, $$6);
               int $$35 = $$23 ? 1 : -1;
               $$7.a((float)$$35 * -0.4F, 0.8F, 0.3F);
               $$7.a(a.d.rotationDegrees((float)$$35 * 65.0F));
               $$7.a(a.f.rotationDegrees((float)$$35 * -85.0F));
            } else {
               float $$36 = -0.4F * aui.a(aui.c($$4) * (float) Math.PI);
               float $$37 = 0.2F * aui.a(aui.c($$4) * (float) (Math.PI * 2));
               float $$38 = -0.2F * aui.a($$4 * (float) Math.PI);
               int $$39 = $$23 ? 1 : -1;
               $$7.a((float)$$39 * $$36, $$37, $$38);
               this.b($$7, $$11, $$6);
               this.a($$7, $$11, $$4);
            }

            this.a($$0, $$5, $$23 ? cmo.e : cmo.d, !$$23, $$7, $$8, $$9);
         }

         $$7.b();
      }
   }

   public void a() {
      this.ay = this.ax;
      this.aA = this.az;
      fsb $$0 = this.au.s;
      cmr $$1 = $$0.eT();
      cmr $$2 = $$0.eU();
      if (cmr.a(this.av, $$1)) {
         this.av = $$1;
      }

      if (cmr.a(this.aw, $$2)) {
         this.aw = $$2;
      }

      if ($$0.A()) {
         this.ax = aui.a(this.ax - 0.4F, 0.0F, 1.0F);
         this.az = aui.a(this.az - 0.4F, 0.0F, 1.0F);
      } else {
         float $$3 = $$0.B(1.0F);
         this.ax = this.ax + aui.a((this.av == $$1 ? $$3 * $$3 * $$3 : 0.0F) - this.ax, -0.4F, 0.4F);
         this.az = this.az + aui.a((float)(this.aw == $$2 ? 1 : 0) - this.az, -0.4F, 0.4F);
      }

      if (this.ax < 0.1F) {
         this.av = $$1;
      }

      if (this.az < 0.1F) {
         this.aw = $$2;
      }
   }

   public void a(bju $$0) {
      if ($$0 == bju.a) {
         this.ax = 0.0F;
      } else {
         this.az = 0.0F;
      }
   }

   @VisibleForTesting
   static enum a {
      a(true, true),
      b(true, false),
      c(false, true);

      final boolean d;
      final boolean e;

      private a(boolean $$0, boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public static fsv.a a(bju $$0) {
         return $$0 == bju.a ? b : c;
      }
   }
}
