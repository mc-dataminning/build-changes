import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cpw extends crz {
   private static final int k = 25;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;

   public cpw(cre.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<crj> d() {
      return j;
   }

   @Override
   public Predicate<crj> b() {
      return c;
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      cts $$4 = $$3.a(jp.v);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bob.b($$3);
      } else if (!$$1.g($$3).d()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bob.b($$3);
      } else {
         return bob.d($$3);
      }
   }

   private static float a(cts $$0) {
      return $$0.a(crm.us) ? 1.6F : 3.15F;
   }

   @Override
   public void a(crj $$0, cyx $$1, bqo $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !j($$0) && a($$2, $$0)) {
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), aum.gj, $$2.db(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bqo $$0, crj $$1) {
      List<crj> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(jp.v, cts.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean j(crj $$0) {
      cts $$1 = $$0.a(jp.v, cts.a);
      return !$$1.b();
   }

   @Override
   protected void a(bqo $$0, ckl $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bqo $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dr() - $$0.dr();
         double $$8 = $$6.dx() - $$0.dx();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dt() + $$9 * 0.2F;
         $$11 = a($$0, new esa($$7, $$10, $$8), $$5);
      } else {
         esa $$12 = $$0.i(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         esa $$14 = $$0.f(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.ei(), $$2);
      $$0.a(aum.gp, 1.0F, $$16);
   }

   private static Vector3f a(bqo $$0, esa $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         esa $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected ckl a(cyx $$0, bqo $$1, crj $$2, crj $$3, boolean $$4) {
      if ($$3.a(crm.us)) {
         return new ckg($$0, $$3, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
      } else {
         ckl $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cjz $$6) {
            $$6.q(true);
            $$6.b(aum.gi);
         }

         return $$5;
      }
   }

   @Override
   protected int k(crj $$0) {
      return $$0.a(crm.us) ? 3 : 1;
   }

   public void a(cyx $$0, bqo $$1, bnz $$2, crj $$3, float $$4, float $$5, @Nullable bqo $$6) {
      if (!$$0.x_()) {
         cts $$7 = $$3.b(jp.v, cts.a);
         if ($$7 != null && !$$7.b()) {
            this.a($$0, $$1, $$2, $$3, $$7.a(), $$4, $$5, $$1 instanceof cjt, $$6);
            if ($$1 instanceof apt $$8) {
               am.G.a($$8, $$3);
               $$8.b(auw.c.b($$3.f()));
            }
         }
      }
   }

   private static float a(axr $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, axr $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(cyx $$0, bqo $$1, crj $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cwr.a(cwt.J, $$2);
         aul $$5 = this.a($$4);
         aul $$6 = $$4 == 0 ? aum.gk : null;
         float $$7 = (float)($$2.t() - $$3) / (float)l($$2);
         if ($$7 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$7 >= 0.2F && !this.l) {
            this.l = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$5, aun.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.m) {
            this.m = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$6, aun.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(crj $$0) {
      return l($$0) + 3;
   }

   public static int l(crj $$0) {
      int $$1 = cwr.a(cwt.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public ctb c(crj $$0) {
      return ctb.g;
   }

   private aul a(int $$0) {
      switch ($$0) {
         case 1:
            return aum.gm;
         case 2:
            return aum.gn;
         case 3:
            return aum.go;
         default:
            return aum.gl;
      }
   }

   private static float a(int $$0, crj $$1) {
      float $$2 = (float)$$0 / (float)l($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cts $$4 = $$0.a(jp.v);
      if ($$4 != null && !$$4.b()) {
         crj $$5 = $$4.a().get(0);
         $$2.add(wg.c("item.minecraft.crossbow.projectile").b(wf.v).b($$5.E()));
         if ($$3.a() && $$5.a(crm.us)) {
            List<wg> $$6 = Lists.newArrayList();
            crm.us.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wg.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean m(crj $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
