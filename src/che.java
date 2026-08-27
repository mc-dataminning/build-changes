import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class che extends cjm implements ckq {
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

   public che(cir.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<ciw> e() {
      return d;
   }

   @Override
   public Predicate<ciw> b() {
      return c;
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bgp.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bgp.b($$3);
      } else {
         return bgp.d($$3);
      }
   }

   private static float o(ciw $$0) {
      return a($$0, ciz.tA) ? 1.6F : 3.15F;
   }

   @Override
   public void a(ciw $$0, cpk $$1, biw $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         aov $$6 = $$2 instanceof cbl ? aov.h : aov.f;
         $$1.a(null, $$2.dp(), $$2.dr(), $$2.dv(), aou.fk, $$6, 1.0F, 1.0F / ($$1.y_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(biw $$0, ciw $$1) {
      int $$2 = cnf.a(cnh.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cbl && ((cbl)$$0).fR().d;
      ciw $$5 = $$0.g($$1);
      ciw $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new ciw(ciz.nH);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(biw $$0, ciw $$1, ciw $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cgk;
         ciw $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cbl) {
               ((cbl)$$0).fQ().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(ciw $$0) {
      qs $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(ciw $$0, boolean $$1) {
      qs $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(ciw $$0, ciw $$1) {
      qs $$2 = $$0.w();
      qy $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new qy();
      }

      qs $$5 = new qs();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<ciw> p(ciw $$0) {
      List<ciw> $$1 = Lists.newArrayList();
      qs $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         qy $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qs $$5 = $$3.a($$4);
               $$1.add(ciw.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(ciw $$0) {
      qs $$1 = $$0.v();
      if ($$1 != null) {
         qy $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(ciw $$0, cir $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cpk $$0, biw $$1, bgn $$2, ciw $$3, ciw $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(ciz.tA);
         ccd $$11;
         if ($$10) {
            $$11 = new cby($$0, $$4, $$1, $$1.dp(), $$1.dt() - 0.15F, $$1.dv(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cbr)$$11).d = cbr.a.c;
            }
         }

         if ($$1 instanceof bym $$13) {
            $$13.a($$13.j(), $$3, $$11, $$9);
         } else {
            ehf $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            ehf $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aou.fq, aov.h, 1.0F, $$5);
      }
   }

   private static cbr a(cpk $$0, biw $$1, ciw $$2, ciw $$3) {
      cgk $$4 = (cgk)($$3.d() instanceof cgk ? $$3.d() : ciz.nH);
      cbr $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cbl) {
         $$5.a(true);
      }

      $$5.b(aou.fj);
      $$5.q(true);
      int $$6 = cnf.a(cnh.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cpk $$0, biw $$1, bgn $$2, ciw $$3, float $$4, float $$5) {
      List<ciw> $$6 = p($$3);
      float[] $$7 = a($$1.ee());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         ciw $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cbl && ((cbl)$$1).fR().d;
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

   private static float[] a(art $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, art $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cpk $$0, biw $$1, ciw $$2) {
      if ($$1 instanceof akj $$3) {
         if (!$$0.B) {
            ai.F.a($$3, $$2);
         }

         $$3.b(ape.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cpk $$0, biw $$1, ciw $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cnf.a(cnh.J, $$2);
         aot $$5 = this.a($$4);
         aot $$6 = $$4 == 0 ? aou.fl : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$5, aov.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$6, aov.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(ciw $$0) {
      return k($$0) + 3;
   }

   public static int k(ciw $$0) {
      int $$1 = cnf.a(cnh.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public ckp c(ciw $$0) {
      return ckp.g;
   }

   private aot a(int $$0) {
      switch ($$0) {
         case 1:
            return aou.fn;
         case 2:
            return aou.fo;
         case 3:
            return aou.fp;
         default:
            return aou.fm;
      }
   }

   private static float a(int $$0, ciw $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      List<ciw> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         ciw $$5 = $$4.get(0);
         $$2.add(te.c("item.minecraft.crossbow.projectile").b(td.u).b($$5.J()));
         if ($$3.a() && $$5.a(ciz.tA)) {
            List<te> $$6 = Lists.newArrayList();
            ciz.tA.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, te.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(ciw $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
