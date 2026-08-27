import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class crm extends ctq {
   private static final int k = 25;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;

   public crm(csu.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<csz> d() {
      return j;
   }

   @Override
   public Predicate<csz> b() {
      return c;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      cvl $$4 = $$3.a(ka.C);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bpn.b($$3);
      } else if (!$$1.g($$3).d()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bpn.b($$3);
      } else {
         return bpn.d($$3);
      }
   }

   private static float a(cvl $$0) {
      return $$0.a(ctc.uu) ? 1.6F : 3.15F;
   }

   @Override
   public void a(csz $$0, dad $$1, bsa $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !j($$0) && a($$2, $$0)) {
         $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), avc.gj, $$2.dc(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bsa $$0, csz $$1) {
      List<csz> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ka.C, cvl.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean j(csz $$0) {
      cvl $$1 = $$0.a(ka.C, cvl.a);
      return !$$1.b();
   }

   @Override
   protected void a(bsa $$0, clz $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bsa $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.ds() - $$0.ds();
         double $$8 = $$6.dy() - $$0.dy();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.du() + $$9 * 0.2F;
         $$11 = a($$0, new etp($$7, $$10, $$8), $$5);
      } else {
         etp $$12 = $$0.i(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         etp $$14 = $$0.f(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.ej(), $$2);
      $$0.dN().a(null, $$0.ds(), $$0.du(), $$0.dy(), avc.gp, $$0.dc(), 1.0F, $$16);
   }

   private static Vector3f a(bsa $$0, etp $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         etp $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected clz a(dad $$0, bsa $$1, csz $$2, csz $$3, boolean $$4) {
      if ($$3.a(ctc.uu)) {
         return new clu($$0, $$3, $$1, $$1.ds(), $$1.dw() - 0.15F, $$1.dy(), true);
      } else {
         clz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cln $$6) {
            $$6.q(true);
            $$6.b(avc.gi);
         }

         return $$5;
      }
   }

   @Override
   protected int k(csz $$0) {
      return $$0.a(ctc.uu) ? 3 : 1;
   }

   public void a(dad $$0, bsa $$1, bpl $$2, csz $$3, float $$4, float $$5, @Nullable bsa $$6) {
      if (!$$0.x_()) {
         cvl $$7 = $$3.b(ka.C, cvl.a);
         if ($$7 != null && !$$7.b()) {
            this.a($$0, $$1, $$2, $$3, $$7.a(), $$4, $$5, $$1 instanceof clh, $$6);
            if ($$1 instanceof aqi $$8) {
               am.G.a($$8, $$3);
               $$8.b(avm.c.b($$3.f()));
            }
         }
      }
   }

   private static float a(ayg $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, ayg $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dad $$0, bsa $$1, csz $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cyh.a(cyj.J, $$2);
         avb $$5 = this.a($$4);
         avb $$6 = $$4 == 0 ? avc.gk : null;
         float $$7 = (float)($$2.t() - $$3) / (float)l($$2);
         if ($$7 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$7 >= 0.2F && !this.l) {
            this.l = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$5, avd.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.m) {
            this.m = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$6, avd.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(csz $$0) {
      return l($$0) + 3;
   }

   public static int l(csz $$0) {
      int $$1 = cyh.a(cyj.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cus c(csz $$0) {
      return cus.g;
   }

   private avb a(int $$0) {
      switch ($$0) {
         case 1:
            return avc.gm;
         case 2:
            return avc.gn;
         case 3:
            return avc.go;
         default:
            return avc.gl;
      }
   }

   private static float a(int $$0, csz $$1) {
      float $$2 = (float)$$0 / (float)l($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cvl $$4 = $$0.a(ka.C);
      if ($$4 != null && !$$4.b()) {
         csz $$5 = $$4.a().get(0);
         $$2.add(wu.c("item.minecraft.crossbow.projectile").b(wt.v).b($$5.E()));
         if ($$3.a() && $$5.a(ctc.uu)) {
            List<wu> $$6 = Lists.newArrayList();
            ctc.uu.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wu.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean m(csz $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
