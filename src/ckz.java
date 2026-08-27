import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ckz extends cnh implements col {
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

   public ckz(cmm.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cmr> e() {
      return d;
   }

   @Override
   public Predicate<cmr> b() {
      return c;
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      cmr $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bjw.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bjw.b($$3);
      } else {
         return bjw.d($$3);
      }
   }

   private static float o(cmr $$0) {
      return a($$0, cmu.un) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cmr $$0, cti $$1, bmf $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         arn $$6 = $$2 instanceof cfb ? arn.h : arn.f;
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), arm.fL, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bmf $$0, cmr $$1) {
      int $$2 = cre.a(crg.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cfb && ((cfb)$$0).fT().d;
      cmr $$5 = $$0.g($$1);
      cmr $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new cmr(cmu.os);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bmf $$0, cmr $$1, cmr $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof ckf;
         cmr $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cfb) {
               ((cfb)$$0).fS().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cmr $$0) {
      sl $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cmr $$0, boolean $$1) {
      sl $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(cmr $$0, cmr $$1) {
      sl $$2 = $$0.w();
      sr $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new sr();
      }

      sl $$5 = new sl();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cmr> p(cmr $$0) {
      List<cmr> $$1 = Lists.newArrayList();
      sl $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         sr $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sl $$5 = $$3.a($$4);
               $$1.add(cmr.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cmr $$0) {
      sl $$1 = $$0.v();
      if ($$1 != null) {
         sr $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cmr $$0, cmm $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cti $$0, bmf $$1, bju $$2, cmr $$3, cmr $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cmu.un);
         cft $$11;
         if ($$10) {
            $$11 = new cfo($$0, $$4, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cfh)$$11).d = cfh.a.c;
            }
         }

         if ($$1 instanceof cbw $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            elm $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            elm $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.fR, arn.h, 1.0F, $$5);
      }
   }

   private static cfh a(cti $$0, bmf $$1, cmr $$2, cmr $$3) {
      ckf $$4 = (ckf)($$3.d() instanceof ckf ? $$3.d() : cmu.os);
      cfh $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cfb) {
         $$5.a(true);
      }

      $$5.b(arm.fK);
      $$5.q(true);
      int $$6 = cre.a(crg.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cti $$0, bmf $$1, bju $$2, cmr $$3, float $$4, float $$5) {
      List<cmr> $$6 = p($$3);
      float[] $$7 = a($$1.eg());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cmr $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cfb && ((cfb)$$1).fT().d;
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

   private static float[] a(aup $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, aup $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cti $$0, bmf $$1, cmr $$2) {
      if ($$1 instanceof ana $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(arw.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cti $$0, bmf $$1, cmr $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cre.a(crg.J, $$2);
         arl $$5 = this.a($$4);
         arl $$6 = $$4 == 0 ? arm.fM : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$5, arn.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$6, arn.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cmr $$0) {
      return k($$0) + 3;
   }

   public static int k(cmr $$0) {
      int $$1 = cre.a(crg.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cok c(cmr $$0) {
      return cok.g;
   }

   private arl a(int $$0) {
      switch ($$0) {
         case 1:
            return arm.fO;
         case 2:
            return arm.fP;
         case 3:
            return arm.fQ;
         default:
            return arm.fN;
      }
   }

   private static float a(int $$0, cmr $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cmr $$0, @Nullable cti $$1, List<vd> $$2, coi $$3) {
      List<cmr> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cmr $$5 = $$4.get(0);
         $$2.add(vd.c("item.minecraft.crossbow.projectile").b(vc.u).b($$5.J()));
         if ($$3.a() && $$5.a(cmu.un)) {
            List<vd> $$6 = Lists.newArrayList();
            cmu.un.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vd.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cmr $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
