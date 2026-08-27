import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ftf implements anv {
   private static final fom e = fom.n(new aex("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<biu<?>, ftg<?>> h = ImmutableMap.of();
   private Map<gae.a, ftg<? extends cbu>> i = Map.of();
   public final fzf a;
   private cpv j;
   public eqg b;
   private Quaternionf k;
   public biq c;
   private final fuf l;
   private final foy m;
   private final foa n;
   private final esd o;
   public final eqz d;
   private final fhy p;
   private boolean q = true;
   private boolean r;

   public <E extends biq> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public ftf(eqv $$0, fzf $$1, fuf $$2, foy $$3, esd $$4, eqz $$5, fhy $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new foa($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends biq> ftg<? super T> a(T $$0) {
      if ($$0 instanceof fnd $$1) {
         gae.a $$2 = $$1.b().e();
         ftg<? extends cbu> $$3 = this.i.get($$2);
         return (ftg<? super T>)($$3 != null ? $$3 : this.i.get(gae.a.b));
      } else {
         return (ftg<? super T>)this.h.get($$0.ah());
      }
   }

   public void a(cpv $$0, eqg $$1, biq $$2) {
      this.j = $$0;
      this.b = $$1;
      this.k = $$1.f();
      this.c = $$2;
   }

   public void a(Quaternionf $$0) {
      this.k = $$0;
   }

   public void a(boolean $$0) {
      this.q = $$0;
   }

   public void b(boolean $$0) {
      this.r = $$0;
   }

   public boolean a() {
      return this.r;
   }

   public <E extends biq> boolean a(E $$0, frg $$1, double $$2, double $$3, double $$4) {
      ftg<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends biq> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, elp $$6, foe $$7, int $$8) {
      ftg<? super E> $$9 = this.a($$0);

      try {
         ehn $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cv()) {
            this.a($$6, $$7, $$0);
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.L().c() && this.q && $$9.d > 0.0F && !$$0.ce()) {
            double $$14 = this.a($$0.dq(), $$0.ds(), $$0.dw());
            float $$15 = (float)((1.0 - $$14 / 256.0) * (double)$$9.e);
            if ($$15 > 0.0F) {
               a($$6, $$7, $$0, $$15, $$5, this.j, Math.min($$9.d, 32.0F));
            }
         }

         if (this.r && !$$0.ce() && !eqv.O().ax()) {
            a($$6, $$7.getBuffer(fom.x()), $$0, $$5);
         }

         $$6.b();
      } catch (Throwable var24) {
         o $$17 = o.a(var24, "Rendering entity in world");
         p $$18 = $$17.a("Entity being rendered");
         $$0.a($$18);
         p $$19 = $$17.a("Renderer details");
         $$19.a("Assigned renderer", $$9);
         $$19.a("Location", p.a(this.j, $$1, $$2, $$3));
         $$19.a("Rotation", $$4);
         $$19.a("Delta", $$5);
         throw new y($$17);
      }
   }

   private static void a(elp $$0, elt $$1, biq $$2, float $$3) {
      ehi $$4 = $$2.cH().d(-$$2.dq(), -$$2.ds(), -$$2.dw());
      foc.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof bxh) {
         double $$5 = -arx.d((double)$$3, $$2.ac, $$2.dq());
         double $$6 = -arx.d((double)$$3, $$2.ad, $$2.ds());
         double $$7 = -arx.d((double)$$3, $$2.ae, $$2.dw());

         for (bxf $$8 : ((bxh)$$2).fZ()) {
            $$0.a();
            double $$9 = $$5 + arx.d((double)$$3, $$8.ac, $$8.dq());
            double $$10 = $$6 + arx.d((double)$$3, $$8.ad, $$8.ds());
            double $$11 = $$7 + arx.d((double)$$3, $$8.ae, $$8.dw());
            $$0.a($$9, $$10, $$11);
            foc.a($$0, $$1, $$8.cH().d(-$$8.dq(), -$$8.ds(), -$$8.dw()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof bjg) {
         float $$12 = 0.01F;
         foc.a($$0, $$1, $$4.a, (double)($$2.cI() - 0.01F), $$4.c, $$4.d, (double)($$2.cI() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      biq $$13 = $$2.cZ();
      if ($$13 != null) {
         float $$14 = Math.min($$13.dg(), $$2.dg()) / 2.0F;
         float $$15 = 0.0625F;
         ehn $$16 = $$13.m($$2).d($$2.dj());
         foc.a(
            $$0,
            $$1,
            $$16.c - (double)$$14,
            $$16.d,
            $$16.e - (double)$$14,
            $$16.c + (double)$$14,
            $$16.d + 0.0625,
            $$16.e + (double)$$14,
            1.0F,
            1.0F,
            0.0F,
            1.0F
         );
      }

      ehn $$17 = $$2.f($$3);
      Matrix4f $$18 = $$0.c().a();
      Matrix3f $$19 = $$0.c().b();
      $$1.a($$18, 0.0F, $$2.cI(), 0.0F).a(0, 0, 255, 255).a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cI() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(elp $$0, foe $$1, biq $$2) {
      fze $$3 = gbk.a.c();
      fze $$4 = gbk.b.c();
      $$0.a();
      float $$5 = $$2.dg() * 1.4F;
      $$0.b($$5, $$5, $$5);
      float $$6 = 0.5F;
      float $$7 = 0.0F;
      float $$8 = $$2.dh() / $$5;
      float $$9 = 0.0F;
      $$0.a(a.d.rotationDegrees(-this.b.e()));
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$8) * 0.02F);
      float $$10 = 0.0F;
      int $$11 = 0;
      elt $$12 = $$1.getBuffer(fot.i());

      for (elp.a $$13 = $$0.c(); $$8 > 0.0F; $$11++) {
         fze $$14 = $$11 % 2 == 0 ? $$3 : $$4;
         float $$15 = $$14.c();
         float $$16 = $$14.g();
         float $$17 = $$14.d();
         float $$18 = $$14.h();
         if ($$11 / 2 % 2 == 0) {
            float $$19 = $$17;
            $$17 = $$15;
            $$15 = $$19;
         }

         a($$13, $$12, $$6 - 0.0F, 0.0F - $$9, $$10, $$17, $$18);
         a($$13, $$12, -$$6 - 0.0F, 0.0F - $$9, $$10, $$15, $$18);
         a($$13, $$12, -$$6 - 0.0F, 1.4F - $$9, $$10, $$15, $$16);
         a($$13, $$12, $$6 - 0.0F, 1.4F - $$9, $$10, $$17, $$16);
         $$8 -= 0.45F;
         $$9 -= 0.45F;
         $$6 *= 0.9F;
         $$10 += 0.03F;
      }

      $$0.b();
   }

   private static void a(elp.a $$0, elt $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0.a(), $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).a($$0.b(), 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(elp $$0, foe $$1, biq $$2, float $$3, float $$4, cpy $$5, float $$6) {
      float $$7 = $$6;
      if ($$2 instanceof bji $$8 && $$8.m_()) {
         $$7 = $$6 * 0.5F;
      }

      double $$9 = arx.d((double)$$4, $$2.ac, $$2.dq());
      double $$10 = arx.d((double)$$4, $$2.ad, $$2.ds());
      double $$11 = arx.d((double)$$4, $$2.ae, $$2.dw());
      float $$12 = Math.min($$3 / 0.5F, $$7);
      int $$13 = arx.a($$9 - (double)$$7);
      int $$14 = arx.a($$9 + (double)$$7);
      int $$15 = arx.a($$10 - (double)$$12);
      int $$16 = arx.a($$10);
      int $$17 = arx.a($$11 - (double)$$7);
      int $$18 = arx.a($$11 + (double)$$7);
      elp.a $$19 = $$0.c();
      elt $$20 = $$1.getBuffer(e);
      gw.a $$21 = new gw.a();

      for (int $$22 = $$17; $$22 <= $$18; $$22++) {
         for (int $$23 = $$13; $$23 <= $$14; $$23++) {
            $$21.d($$23, 0, $$22);
            dhf $$24 = $$5.x($$21);

            for (int $$25 = $$15; $$25 <= $$16; $$25++) {
               $$21.q($$25);
               float $$26 = $$3 - (float)($$10 - (double)$$21.v()) * 0.5F;
               a($$19, $$20, $$24, $$5, $$21, $$9, $$10, $$11, $$7, $$26);
            }
         }
      }
   }

   private static void a(elp.a $$0, elt $$1, dhf $$2, cpy $$3, gw $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      gw $$10 = $$4.d();
      dfj $$11 = $$2.a_($$10);
      if ($$11.l() != cza.a && $$3.z($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            eig $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = fod.a($$3.C_(), $$3.z($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  ehi $$15 = $$12.a();
                  double $$16 = (double)$$4.u() + $$15.a;
                  double $$17 = (double)$$4.u() + $$15.d;
                  double $$18 = (double)$$4.v() + $$15.b;
                  double $$19 = (double)$$4.w() + $$15.c;
                  double $$20 = (double)$$4.w() + $$15.f;
                  float $$21 = (float)($$16 - $$5);
                  float $$22 = (float)($$17 - $$5);
                  float $$23 = (float)($$18 - $$6);
                  float $$24 = (float)($$19 - $$7);
                  float $$25 = (float)($$20 - $$7);
                  float $$26 = -$$21 / 2.0F / $$8 + 0.5F;
                  float $$27 = -$$22 / 2.0F / $$8 + 0.5F;
                  float $$28 = -$$24 / 2.0F / $$8 + 0.5F;
                  float $$29 = -$$25 / 2.0F / $$8 + 0.5F;
                  a($$0, $$1, $$14, $$21, $$23, $$24, $$26, $$28);
                  a($$0, $$1, $$14, $$21, $$23, $$25, $$26, $$29);
                  a($$0, $$1, $$14, $$22, $$23, $$25, $$27, $$29);
                  a($$0, $$1, $$14, $$22, $$23, $$24, $$27, $$28);
               }
            }
         }
      }
   }

   private static void a(elp.a $$0, elt $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, fyv.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable cpv $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(biq $$0) {
      return this.b.b().g($$0.dj());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public foa d() {
      return this.n;
   }

   @Override
   public void a(anu $$0) {
      fth.a $$1 = new fth.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = fti.a($$1);
      this.i = fti.b($$1);
   }
}
