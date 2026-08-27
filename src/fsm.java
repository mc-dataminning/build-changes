import com.google.common.collect.ImmutableMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fsm implements ann {
   private static final fnt e = fnt.n(new aer("textures/misc/shadow.png"));
   private static final float f = 32.0F;
   private static final float g = 0.5F;
   private Map<bim<?>, fsn<?>> h = ImmutableMap.of();
   private Map<fzl.a, fsn<? extends cbn>> i = Map.of();
   public final fym a;
   private cpm j;
   public epx b;
   private Quaternionf k;
   public bii c;
   private final ftm l;
   private final foe m;
   private final fnh n;
   private final eru o;
   public final eqq d;
   private final fhj p;
   private boolean q = true;
   private boolean r;

   public <E extends bii> int a(E $$0, float $$1) {
      return this.a($$0).b($$0, $$1);
   }

   public fsm(eqm $$0, fym $$1, ftm $$2, foe $$3, eru $$4, eqq $$5, fhj $$6) {
      this.a = $$1;
      this.l = $$2;
      this.n = new fnh($$0, this, $$2);
      this.m = $$3;
      this.o = $$4;
      this.d = $$5;
      this.p = $$6;
   }

   public <T extends bii> fsn<? super T> a(T $$0) {
      if ($$0 instanceof fmk $$1) {
         fzl.a $$2 = $$1.b().d();
         fsn<? extends cbn> $$3 = this.i.get($$2);
         return (fsn<? super T>)($$3 != null ? $$3 : this.i.get(fzl.a.b));
      } else {
         return (fsn<? super T>)this.h.get($$0.ag());
      }
   }

   public void a(cpm $$0, epx $$1, bii $$2) {
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

   public <E extends bii> boolean a(E $$0, fqn $$1, double $$2, double $$3, double $$4) {
      fsn<? super E> $$5 = this.a($$0);
      return $$5.a($$0, $$1, $$2, $$3, $$4);
   }

   public <E extends bii> void a(E $$0, double $$1, double $$2, double $$3, float $$4, float $$5, elg $$6, fnl $$7, int $$8) {
      fsn<? super E> $$9 = this.a($$0);

      try {
         ehe $$10 = $$9.a($$0, $$5);
         double $$11 = $$1 + $$10.a();
         double $$12 = $$2 + $$10.b();
         double $$13 = $$3 + $$10.c();
         $$6.a();
         $$6.a($$11, $$12, $$13);
         $$9.a($$0, $$4, $$5, $$6, $$7, $$8);
         if ($$0.cu()) {
            this.a($$6, $$7, $$0);
         }

         $$6.a(-$$10.a(), -$$10.b(), -$$10.c());
         if (this.d.K().c() && this.q && $$9.d > 0.0F && !$$0.cd()) {
            double $$14 = this.a($$0.dp(), $$0.dr(), $$0.dv());
            float $$15 = (float)((1.0 - $$14 / 256.0) * (double)$$9.e);
            if ($$15 > 0.0F) {
               a($$6, $$7, $$0, $$15, $$5, this.j, Math.min($$9.d, 32.0F));
            }
         }

         if (this.r && !$$0.cd() && !eqm.O().ay()) {
            a($$6, $$7.getBuffer(fnt.x()), $$0, $$5);
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

   private static void a(elg $$0, elk $$1, bii $$2, float $$3) {
      egz $$4 = $$2.cG().d(-$$2.dp(), -$$2.dr(), -$$2.dv());
      fnj.a($$0, $$1, $$4, 1.0F, 1.0F, 1.0F, 1.0F);
      if ($$2 instanceof bxa) {
         double $$5 = -arp.d((double)$$3, $$2.ac, $$2.dp());
         double $$6 = -arp.d((double)$$3, $$2.ad, $$2.dr());
         double $$7 = -arp.d((double)$$3, $$2.ae, $$2.dv());

         for (bwy $$8 : ((bxa)$$2).fV()) {
            $$0.a();
            double $$9 = $$5 + arp.d((double)$$3, $$8.ac, $$8.dp());
            double $$10 = $$6 + arp.d((double)$$3, $$8.ad, $$8.dr());
            double $$11 = $$7 + arp.d((double)$$3, $$8.ae, $$8.dv());
            $$0.a($$9, $$10, $$11);
            fnj.a($$0, $$1, $$8.cG().d(-$$8.dp(), -$$8.dr(), -$$8.dv()), 0.25F, 1.0F, 0.0F, 1.0F);
            $$0.b();
         }
      }

      if ($$2 instanceof biy) {
         float $$12 = 0.01F;
         fnj.a($$0, $$1, $$4.a, (double)($$2.cH() - 0.01F), $$4.c, $$4.d, (double)($$2.cH() + 0.01F), $$4.f, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      bii $$13 = $$2.cY();
      if ($$13 != null) {
         float $$14 = Math.min($$13.df(), $$2.df()) / 2.0F;
         float $$15 = 0.0625F;
         ehe $$16 = $$13.m($$2).d($$2.di());
         fnj.a(
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

      ehe $$17 = $$2.f($$3);
      Matrix4f $$18 = $$0.c().a();
      Matrix3f $$19 = $$0.c().b();
      $$1.a($$18, 0.0F, $$2.cH(), 0.0F).a(0, 0, 255, 255).a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e).e();
      $$1.a($$18, (float)($$17.c * 2.0), (float)((double)$$2.cH() + $$17.d * 2.0), (float)($$17.e * 2.0))
         .a(0, 0, 255, 255)
         .a($$19, (float)$$17.c, (float)$$17.d, (float)$$17.e)
         .e();
   }

   private void a(elg $$0, fnl $$1, bii $$2) {
      fyl $$3 = gar.a.c();
      fyl $$4 = gar.b.c();
      $$0.a();
      float $$5 = $$2.df() * 1.4F;
      $$0.b($$5, $$5, $$5);
      float $$6 = 0.5F;
      float $$7 = 0.0F;
      float $$8 = $$2.dg() / $$5;
      float $$9 = 0.0F;
      $$0.a(a.d.rotationDegrees(-this.b.e()));
      $$0.a(0.0F, 0.0F, -0.3F + (float)((int)$$8) * 0.02F);
      float $$10 = 0.0F;
      int $$11 = 0;
      elk $$12 = $$1.getBuffer(fnz.j());

      for (elg.a $$13 = $$0.c(); $$8 > 0.0F; $$11++) {
         fyl $$14 = $$11 % 2 == 0 ? $$3 : $$4;
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

   private static void a(elg.a $$0, elk $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      $$1.a($$0.a(), $$2, $$3, $$4).a(255, 255, 255, 255).a($$5, $$6).a(0, 10).b(240).a($$0.b(), 0.0F, 1.0F, 0.0F).e();
   }

   private static void a(elg $$0, fnl $$1, bii $$2, float $$3, float $$4, cpp $$5, float $$6) {
      float $$7 = $$6;
      if ($$2 instanceof bja $$8 && $$8.i_()) {
         $$7 = $$6 * 0.5F;
      }

      double $$9 = arp.d((double)$$4, $$2.ac, $$2.dp());
      double $$10 = arp.d((double)$$4, $$2.ad, $$2.dr());
      double $$11 = arp.d((double)$$4, $$2.ae, $$2.dv());
      float $$12 = Math.min($$3 / 0.5F, $$7);
      int $$13 = arp.a($$9 - (double)$$7);
      int $$14 = arp.a($$9 + (double)$$7);
      int $$15 = arp.a($$10 - (double)$$12);
      int $$16 = arp.a($$10);
      int $$17 = arp.a($$11 - (double)$$7);
      int $$18 = arp.a($$11 + (double)$$7);
      elg.a $$19 = $$0.c();
      elk $$20 = $$1.getBuffer(e);
      gu.a $$21 = new gu.a();

      for (int $$22 = $$17; $$22 <= $$18; $$22++) {
         for (int $$23 = $$13; $$23 <= $$14; $$23++) {
            $$21.d($$23, 0, $$22);
            dgw $$24 = $$5.x($$21);

            for (int $$25 = $$15; $$25 <= $$16; $$25++) {
               $$21.q($$25);
               float $$26 = $$3 - (float)($$10 - (double)$$21.v()) * 0.5F;
               a($$19, $$20, $$24, $$5, $$21, $$9, $$10, $$11, $$7, $$26);
            }
         }
      }
   }

   private static void a(elg.a $$0, elk $$1, dgw $$2, cpp $$3, gu $$4, double $$5, double $$6, double $$7, float $$8, float $$9) {
      gu $$10 = $$4.d();
      dfa $$11 = $$2.a_($$10);
      if ($$11.l() != cyr.a && $$3.z($$4) > 3) {
         if ($$11.r($$2, $$10)) {
            ehx $$12 = $$11.j($$2, $$10);
            if (!$$12.c()) {
               float $$13 = fnk.a($$3.x_(), $$3.z($$4));
               float $$14 = $$9 * 0.5F * $$13;
               if ($$14 >= 0.0F) {
                  if ($$14 > 1.0F) {
                     $$14 = 1.0F;
                  }

                  egz $$15 = $$12.a();
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

   private static void a(elg.a $$0, elk $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      Vector3f $$8 = $$0.a().transformPosition($$3, $$4, $$5, new Vector3f());
      $$1.a($$8.x(), $$8.y(), $$8.z(), 1.0F, 1.0F, 1.0F, $$2, $$6, $$7, fyc.d, 15728880, 0.0F, 1.0F, 0.0F);
   }

   public void a(@Nullable cpm $$0) {
      this.j = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   public double b(bii $$0) {
      return this.b.b().g($$0.di());
   }

   public double a(double $$0, double $$1, double $$2) {
      return this.b.b().c($$0, $$1, $$2);
   }

   public Quaternionf b() {
      return this.k;
   }

   public fnh d() {
      return this.n;
   }

   @Override
   public void a(anm $$0) {
      fso.a $$1 = new fso.a(this, this.l, this.m, this.n, $$0, this.p, this.o);
      this.h = fsp.a($$1);
      this.i = fsp.b($$1);
   }
}
