import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cjw extends cme implements cni {
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

   public cjw(clj.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<clo> e() {
      return d;
   }

   @Override
   public Predicate<clo> b() {
      return c;
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      clo $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bjc.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bjc.b($$3);
      } else {
         return bjc.d($$3);
      }
   }

   private static float o(clo $$0) {
      return a($$0, clr.um) ? 1.6F : 3.15F;
   }

   @Override
   public void a(clo $$0, csf $$1, bll $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         aqw $$6 = $$2 instanceof cdz ? aqw.h : aqw.f;
         $$1.a(null, $$2.ds(), $$2.du(), $$2.dy(), aqv.fC, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bll $$0, clo $$1) {
      int $$2 = cqb.a(cqd.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cdz && ((cdz)$$0).fU().d;
      clo $$5 = $$0.g($$1);
      clo $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new clo(clr.os);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bll $$0, clo $$1, clo $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cjc;
         clo $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cdz) {
               ((cdz)$$0).fT().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(clo $$0) {
      sd $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(clo $$0, boolean $$1) {
      sd $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(clo $$0, clo $$1) {
      sd $$2 = $$0.w();
      sj $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new sj();
      }

      sd $$5 = new sd();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<clo> p(clo $$0) {
      List<clo> $$1 = Lists.newArrayList();
      sd $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         sj $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sd $$5 = $$3.a($$4);
               $$1.add(clo.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(clo $$0) {
      sd $$1 = $$0.v();
      if ($$1 != null) {
         sj $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(clo $$0, clj $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(csf $$0, bll $$1, bja $$2, clo $$3, clo $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(clr.um);
         cer $$11;
         if ($$10) {
            $$11 = new cem($$0, $$4, $$1, $$1.ds(), $$1.dw() - 0.15F, $$1.dy(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cef)$$11).d = cef.a.c;
            }
         }

         if ($$1 instanceof cba $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            ejz $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            ejz $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.fI, aqw.h, 1.0F, $$5);
      }
   }

   private static cef a(csf $$0, bll $$1, clo $$2, clo $$3) {
      cjc $$4 = (cjc)($$3.d() instanceof cjc ? $$3.d() : clr.os);
      cef $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cdz) {
         $$5.a(true);
      }

      $$5.b(aqv.fB);
      $$5.q(true);
      int $$6 = cqb.a(cqd.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(csf $$0, bll $$1, bja $$2, clo $$3, float $$4, float $$5) {
      List<clo> $$6 = p($$3);
      float[] $$7 = a($$1.eh());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         clo $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cdz && ((cdz)$$1).fU().d;
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

   private static float[] a(atw $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, atw $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(csf $$0, bll $$1, clo $$2) {
      if ($$1 instanceof amj $$3) {
         if (!$$0.B) {
            al.F.a($$3, $$2);
         }

         $$3.b(arf.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(csf $$0, bll $$1, clo $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cqb.a(cqd.J, $$2);
         aqu $$5 = this.a($$4);
         aqu $$6 = $$4 == 0 ? aqv.fD : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$5, aqw.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), $$6, aqw.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(clo $$0) {
      return k($$0) + 3;
   }

   public static int k(clo $$0) {
      int $$1 = cqb.a(cqd.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cnh c(clo $$0) {
      return cnh.g;
   }

   private aqu a(int $$0) {
      switch ($$0) {
         case 1:
            return aqv.fF;
         case 2:
            return aqv.fG;
         case 3:
            return aqv.fH;
         default:
            return aqv.fE;
      }
   }

   private static float a(int $$0, clo $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(clo $$0, @Nullable csf $$1, List<uv> $$2, cnf $$3) {
      List<clo> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         clo $$5 = $$4.get(0);
         $$2.add(uv.c("item.minecraft.crossbow.projectile").b(uu.u).b($$5.J()));
         if ($$3.a() && $$5.a(clr.um)) {
            List<uv> $$6 = Lists.newArrayList();
            clr.um.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, uv.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(clo $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
