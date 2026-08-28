import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cta extends cvg {
   private static final int k = 25;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;

   public cta(cui.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cun> d() {
      return j;
   }

   @Override
   public Predicate<cun> b() {
      return c;
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      cxb $$4 = $$3.a(km.D);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bqt.b($$3);
      } else if (!$$1.g($$3).e()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bqt.b($$3);
      } else {
         return bqt.d($$3);
      }
   }

   private static float a(cxb $$0) {
      return $$0.a(cuq.uu) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cun $$0, dbw $$1, btn $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !j($$0) && a($$2, $$0)) {
         $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), avz.go, $$2.de(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(btn $$0, cun $$1) {
      List<cun> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(km.D, cxb.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean j(cun $$0) {
      cxb $$1 = $$0.a(km.D, cxb.a);
      return !$$1.b();
   }

   @Override
   protected void a(btn $$0, cnn $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btn $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.du() - $$0.du();
         double $$8 = $$6.dA() - $$0.dA();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dw() + $$9 * 0.2F;
         $$11 = a($$0, new evp($$7, $$10, $$8), $$5);
      } else {
         evp $$12 = $$0.i(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         evp $$14 = $$0.f(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.el(), $$2);
      $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), avz.gu, $$0.de(), 1.0F, $$16);
   }

   private static Vector3f a(btn $$0, evp $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         evp $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cnn a(dbw $$0, btn $$1, cun $$2, cun $$3, boolean $$4) {
      if ($$3.a(cuq.uu)) {
         return new cni($$0, $$3, $$1, $$1.du(), $$1.dy() - 0.15F, $$1.dA(), true);
      } else {
         cnn $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cnb $$6) {
            $$6.q(true);
            $$6.b(avz.gn);
         }

         return $$5;
      }
   }

   @Override
   protected int k(cun $$0) {
      return $$0.a(cuq.uu) ? 3 : 1;
   }

   public void a(dbw $$0, btn $$1, bqr $$2, cun $$3, float $$4, float $$5, @Nullable btn $$6) {
      if (!$$0.x_()) {
         cxb $$7 = $$3.b(km.D, cxb.a);
         if ($$7 != null && !$$7.b()) {
            this.a($$0, $$1, $$2, $$3, $$7.a(), $$4, $$5, $$1 instanceof cmv, $$6);
            if ($$1 instanceof arf $$8) {
               am.G.a($$8, $$3);
               $$8.b(awj.c.b($$3.g()));
            }
         }
      }
   }

   private static float a(azf $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azf $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dbw $$0, btn $$1, cun $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = czz.a(dab.J, $$2);
         avy $$5 = this.a($$4);
         avy $$6 = $$4 == 0 ? avz.gp : null;
         float $$7 = (float)($$2.u() - $$3) / (float)l($$2);
         if ($$7 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$7 >= 0.2F && !this.l) {
            this.l = true;
            $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), $$5, awa.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.m) {
            this.m = true;
            $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), $$6, awa.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cun $$0) {
      return l($$0) + 3;
   }

   public static int l(cun $$0) {
      int $$1 = czz.a(dab.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cwi c(cun $$0) {
      return cwi.g;
   }

   private avy a(int $$0) {
      switch ($$0) {
         case 1:
            return avz.gr;
         case 2:
            return avz.gs;
         case 3:
            return avz.gt;
         default:
            return avz.gq;
      }
   }

   private static float a(int $$0, cun $$1) {
      float $$2 = (float)$$0 / (float)l($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cxb $$4 = $$0.a(km.D);
      if ($$4 != null && !$$4.b()) {
         cun $$5 = $$4.a().get(0);
         $$2.add(xo.c("item.minecraft.crossbow.projectile").b(xn.v).b($$5.G()));
         if ($$3.a() && $$5.a(cuq.uu)) {
            List<xo> $$6 = Lists.newArrayList();
            cuq.uu.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xo.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean m(cun $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
