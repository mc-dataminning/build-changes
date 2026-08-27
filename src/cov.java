import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cov extends cra {
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

   public cov(cqf.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cqk> d() {
      return d;
   }

   @Override
   public Predicate<cqk> b() {
      return c;
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bnd.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bnd.b($$3);
      } else {
         return bnd.d($$3);
      }
   }

   private static float o(cqk $$0) {
      return a($$0, cqn.ur) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cqk $$0, cwz $$1, bpo $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         atz $$6 = $$2 instanceof cis ? atz.h : atz.f;
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), aty.ge, $$6, 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bpo $$0, cqk $$1) {
      int $$2 = cuv.a(cux.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0.fM();
      cqk $$5 = $$0.g($$1);
      cqk $$6 = $$5.q();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.q();
         }

         if ($$5.b() && $$4) {
            $$5 = new cqk(cqn.ou);
            $$6 = $$5.q();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bpo $$0, cqk $$1, cqk $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof coa;
         cqk $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cis) {
               ((cis)$$0).fZ().g($$2);
            }
         } else {
            $$6 = $$2.q();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cqk $$0) {
      ta $$1 = $$0.w();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cqk $$0, boolean $$1) {
      ta $$2 = $$0.x();
      $$2.a("Charged", $$1);
   }

   private static void b(cqk $$0, cqk $$1) {
      ta $$2 = $$0.x();
      tg $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new tg();
      }

      ta $$5 = new ta();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cqk> p(cqk $$0) {
      List<cqk> $$1 = Lists.newArrayList();
      ta $$2 = $$0.w();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         tg $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ta $$5 = $$3.a($$4);
               $$1.add(cqk.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cqk $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null) {
         tg $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cqk $$0, cqf $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cwz $$0, bpo $$1, bnb $$2, cqk $$3, cqk $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cqn.ur);
         cjk $$11;
         if ($$10) {
            $$11 = new cjf($$0, $$4, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((ciy)$$11).d = ciy.a.c;
            }
         }

         if ($$1 instanceof cfl $$13) {
            $$13.a($$13.p(), $$3, $$11, $$9);
         } else {
            epr $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            epr $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, bpo.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.gk, atz.h, 1.0F, $$5);
      }
   }

   private static ciy a(cwz $$0, bpo $$1, cqk $$2, cqk $$3) {
      coa $$4 = (coa)($$3.d() instanceof coa ? $$3.d() : cqn.ou);
      ciy $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cis) {
         $$5.a(true);
      }

      $$5.b(aty.gd);
      $$5.q(true);
      int $$6 = cuv.a(cux.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cwz $$0, bpo $$1, bnb $$2, cqk $$3, float $$4, float $$5) {
      List<cqk> $$6 = p($$3);
      float[] $$7 = a($$1.ei());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cqk $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cis && ((cis)$$1).ga().d;
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

   private static float[] a(axd $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, axd $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cwz $$0, bpo $$1, cqk $$2) {
      if ($$1 instanceof apg $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(aui.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cwz $$0, bpo $$1, cqk $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cuv.a(cux.J, $$2);
         atx $$5 = this.a($$4);
         atx $$6 = $$4 == 0 ? aty.gf : null;
         float $$7 = (float)($$2.s() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$5, atz.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$6, atz.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cqk $$0) {
      return k($$0) + 3;
   }

   public static int k(cqk $$0) {
      int $$1 = cuv.a(cux.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public csd c(cqk $$0) {
      return csd.g;
   }

   private atx a(int $$0) {
      switch ($$0) {
         case 1:
            return aty.gh;
         case 2:
            return aty.gi;
         case 3:
            return aty.gj;
         default:
            return aty.gg;
      }
   }

   private static float a(int $$0, cqk $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cqk $$0, @Nullable cwz $$1, List<vu> $$2, csb $$3) {
      List<cqk> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cqk $$5 = $$4.get(0);
         $$2.add(vu.c("item.minecraft.crossbow.projectile").b(vt.v).b($$5.K()));
         if ($$3.a() && $$5.a(cqn.ur)) {
            List<vu> $$6 = Lists.newArrayList();
            cqn.ur.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vu.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cqk $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
