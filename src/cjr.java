import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cjr extends clz implements cnd {
   private static final String b = "Charged";
   private static final String e = "ChargedProjectiles";
   private static final int f = 25;
   public static final int a = 8;
   private boolean g = false;
   private boolean h = false;
   private static final float i = 0.2F;
   private static final float j = 0.5F;
   private static final float k = 3.15F;
   private static final float r = 1.6F;

   public cjr(cle.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<clj> e() {
      return d;
   }

   @Override
   public Predicate<clj> b() {
      return c;
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return biy.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return biy.b($$3);
      } else {
         return biy.d($$3);
      }
   }

   private static float o(clj $$0) {
      return a($$0, clm.um) ? 1.6F : 3.15F;
   }

   @Override
   public void a(clj $$0, csa $$1, blg $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         aqs $$6 = $$2 instanceof cdu ? aqs.h : aqs.f;
         $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), aqr.fC, $$6, 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(blg $$0, clj $$1) {
      int $$2 = cpw.a(cpy.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cdu && ((cdu)$$0).fU().d;
      clj $$5 = $$0.g($$1);
      clj $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new clj(clm.os);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(blg $$0, clj $$1, clj $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cix;
         clj $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cdu) {
               ((cdu)$$0).fT().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(clj $$0) {
      rz $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(clj $$0, boolean $$1) {
      rz $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(clj $$0, clj $$1) {
      rz $$2 = $$0.w();
      sf $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new sf();
      }

      rz $$5 = new rz();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<clj> p(clj $$0) {
      List<clj> $$1 = Lists.newArrayList();
      rz $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         sf $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               rz $$5 = $$3.a($$4);
               $$1.add(clj.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(clj $$0) {
      rz $$1 = $$0.v();
      if ($$1 != null) {
         sf $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(clj $$0, cle $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(csa $$0, blg $$1, biw $$2, clj $$3, clj $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(clm.um);
         cem $$11;
         if ($$10) {
            $$11 = new ceh($$0, $$4, $$1, $$1.ds(), $$1.dw() - 0.15F, $$1.dy(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cea)$$11).d = cea.a.c;
            }
         }

         if ($$1 instanceof cav $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            eju $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            eju $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqr.fI, aqs.h, 1.0F, $$5);
      }
   }

   private static cea a(csa $$0, blg $$1, clj $$2, clj $$3) {
      cix $$4 = (cix)($$3.d() instanceof cix ? $$3.d() : clm.os);
      cea $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cdu) {
         $$5.a(true);
      }

      $$5.b(aqr.fB);
      $$5.q(true);
      int $$6 = cpw.a(cpy.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(csa $$0, blg $$1, biw $$2, clj $$3, float $$4, float $$5) {
      List<clj> $$6 = p($$3);
      float[] $$7 = a($$1.eh());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         clj $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cdu && ((cdu)$$1).fU().d;
         if (!$$9.b()) {
            if ($$8 == 0) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 0.0F);
            } else if ($$8 == 1) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, -10.0F);
            } else if ($$8 == 2) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 10.0F);
            }
         }
      }

      a($$0, $$1, $$3);
   }

   private static float[] a(ats $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, ats $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(csa $$0, blg $$1, clj $$2) {
      if ($$1 instanceof amf $$3) {
         if (!$$0.B) {
            al.F.a($$3, $$2);
         }

         $$3.b(arb.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(csa $$0, blg $$1, clj $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cpw.a(cpy.J, $$2);
         aqq $$5 = this.a($$4);
         aqq $$6 = $$4 == 0 ? aqr.fD : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$5, aqs.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$6, aqs.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(clj $$0) {
      return k($$0) + 3;
   }

   public static int k(clj $$0) {
      int $$1 = cpw.a(cpy.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cnc c(clj $$0) {
      return cnc.g;
   }

   private aqq a(int $$0) {
      switch ($$0) {
         case 1:
            return aqr.fF;
         case 2:
            return aqr.fG;
         case 3:
            return aqr.fH;
         default:
            return aqr.fE;
      }
   }

   private static float a(int $$0, clj $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(clj $$0, @Nullable csa $$1, List<ur> $$2, cna $$3) {
      List<clj> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         clj $$5 = $$4.get(0);
         $$2.add(ur.c("item.minecraft.crossbow.projectile").b(uq.u).b($$5.J()));
         if ($$3.a() && $$5.a(clm.um)) {
            List<ur> $$6 = Lists.newArrayList();
            clm.um.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, ur.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(clj $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
