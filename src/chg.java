import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class chg extends cjo implements cks {
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

   public chg(cit.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<ciy> e() {
      return d;
   }

   @Override
   public Predicate<ciy> b() {
      return c;
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      ciy $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bgr.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bgr.b($$3);
      } else {
         return bgr.d($$3);
      }
   }

   private static float o(ciy $$0) {
      return a($$0, cjb.tA) ? 1.6F : 3.15F;
   }

   @Override
   public void a(ciy $$0, cpm $$1, biy $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         aox $$6 = $$2 instanceof cbn ? aox.h : aox.f;
         $$1.a(null, $$2.dp(), $$2.dr(), $$2.dv(), aow.fk, $$6, 1.0F, 1.0F / ($$1.y_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(biy $$0, ciy $$1) {
      int $$2 = cnh.a(cnj.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cbn && ((cbn)$$0).fR().d;
      ciy $$5 = $$0.g($$1);
      ciy $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new ciy(cjb.nH);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(biy $$0, ciy $$1, ciy $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cgm;
         ciy $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cbn) {
               ((cbn)$$0).fQ().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(ciy $$0) {
      qr $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(ciy $$0, boolean $$1) {
      qr $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(ciy $$0, ciy $$1) {
      qr $$2 = $$0.w();
      qx $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new qx();
      }

      qr $$5 = new qr();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<ciy> p(ciy $$0) {
      List<ciy> $$1 = Lists.newArrayList();
      qr $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         qx $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qr $$5 = $$3.a($$4);
               $$1.add(ciy.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(ciy $$0) {
      qr $$1 = $$0.v();
      if ($$1 != null) {
         qx $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(ciy $$0, cit $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cpm $$0, biy $$1, bgp $$2, ciy $$3, ciy $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cjb.tA);
         ccf $$11;
         if ($$10) {
            $$11 = new cca($$0, $$4, $$1, $$1.dp(), $$1.dt() - 0.15F, $$1.dv(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cbt)$$11).d = cbt.a.c;
            }
         }

         if ($$1 instanceof byo $$13) {
            $$13.a($$13.j(), $$3, $$11, $$9);
         } else {
            ehe $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            ehe $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.fq, aox.h, 1.0F, $$5);
      }
   }

   private static cbt a(cpm $$0, biy $$1, ciy $$2, ciy $$3) {
      cgm $$4 = (cgm)($$3.d() instanceof cgm ? $$3.d() : cjb.nH);
      cbt $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cbn) {
         $$5.a(true);
      }

      $$5.b(aow.fj);
      $$5.q(true);
      int $$6 = cnh.a(cnj.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cpm $$0, biy $$1, bgp $$2, ciy $$3, float $$4, float $$5) {
      List<ciy> $$6 = p($$3);
      float[] $$7 = a($$1.ee());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         ciy $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cbn && ((cbn)$$1).fR().d;
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

   private static float[] a(aru $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, aru $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cpm $$0, biy $$1, ciy $$2) {
      if ($$1 instanceof akl $$3) {
         if (!$$0.B) {
            ai.F.a($$3, $$2);
         }

         $$3.b(apg.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cpm $$0, biy $$1, ciy $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cnh.a(cnj.J, $$2);
         aov $$5 = this.a($$4);
         aov $$6 = $$4 == 0 ? aow.fl : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$5, aox.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$6, aox.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(ciy $$0) {
      return k($$0) + 3;
   }

   public static int k(ciy $$0) {
      int $$1 = cnh.a(cnj.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public ckr c(ciy $$0) {
      return ckr.g;
   }

   private aov a(int $$0) {
      switch ($$0) {
         case 1:
            return aow.fn;
         case 2:
            return aow.fo;
         case 3:
            return aow.fp;
         default:
            return aow.fm;
      }
   }

   private static float a(int $$0, ciy $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(ciy $$0, @Nullable cpm $$1, List<tf> $$2, ckp $$3) {
      List<ciy> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         ciy $$5 = $$4.get(0);
         $$2.add(tf.c("item.minecraft.crossbow.projectile").b(te.u).b($$5.J()));
         if ($$3.a() && $$5.a(cjb.tA)) {
            List<tf> $$6 = Lists.newArrayList();
            cjb.tA.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, tf.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(ciy $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
