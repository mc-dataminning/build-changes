import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cox extends crc {
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

   public cox(cqh.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cqm> d() {
      return d;
   }

   @Override
   public Predicate<cqm> b() {
      return c;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bne.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bne.b($$3);
      } else {
         return bne.d($$3);
      }
   }

   private static float o(cqm $$0) {
      return a($$0, cqp.us) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cqm $$0, cxb $$1, bpp $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         atz $$6 = $$2 instanceof ciu ? atz.h : atz.f;
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), aty.gi, $$6, 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bpp $$0, cqm $$1) {
      int $$2 = cux.a(cuz.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0.fM();
      cqm $$5 = $$0.g($$1);
      cqm $$6 = $$5.q();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.q();
         }

         if ($$5.b() && $$4) {
            $$5 = new cqm(cqp.ou);
            $$6 = $$5.q();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bpp $$0, cqm $$1, cqm $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof coc;
         cqm $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof ciu) {
               ((ciu)$$0).fZ().g($$2);
            }
         } else {
            $$6 = $$2.q();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cqm $$0) {
      ta $$1 = $$0.w();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cqm $$0, boolean $$1) {
      ta $$2 = $$0.x();
      $$2.a("Charged", $$1);
   }

   private static void b(cqm $$0, cqm $$1) {
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

   private static List<cqm> p(cqm $$0) {
      List<cqm> $$1 = Lists.newArrayList();
      ta $$2 = $$0.w();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         tg $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               ta $$5 = $$3.a($$4);
               $$1.add(cqm.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cqm $$0) {
      ta $$1 = $$0.w();
      if ($$1 != null) {
         tg $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cqm $$0, cqh $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cxb $$0, bpp $$1, bnc $$2, cqm $$3, cqm $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cqp.us);
         cjm $$11;
         if ($$10) {
            $$11 = new cjh($$0, $$4, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cja)$$11).d = cja.a.c;
            }
         }

         if ($$1 instanceof cfn $$13) {
            $$13.a($$13.p(), $$3, $$11, $$9);
         } else {
            ept $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            ept $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, bpp.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.go, atz.h, 1.0F, $$5);
      }
   }

   private static cja a(cxb $$0, bpp $$1, cqm $$2, cqm $$3) {
      coc $$4 = (coc)($$3.d() instanceof coc ? $$3.d() : cqp.ou);
      cja $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof ciu) {
         $$5.a(true);
      }

      $$5.b(aty.gh);
      $$5.q(true);
      int $$6 = cux.a(cuz.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cxb $$0, bpp $$1, bnc $$2, cqm $$3, float $$4, float $$5) {
      List<cqm> $$6 = p($$3);
      float[] $$7 = a($$1.ei());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cqm $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof ciu && ((ciu)$$1).ga().d;
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

   private static void a(cxb $$0, bpp $$1, cqm $$2) {
      if ($$1 instanceof apg $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(aui.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cxb $$0, bpp $$1, cqm $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cux.a(cuz.J, $$2);
         atx $$5 = this.a($$4);
         atx $$6 = $$4 == 0 ? aty.gj : null;
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
   public int b(cqm $$0) {
      return k($$0) + 3;
   }

   public static int k(cqm $$0) {
      int $$1 = cux.a(cuz.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public csf c(cqm $$0) {
      return csf.g;
   }

   private atx a(int $$0) {
      switch ($$0) {
         case 1:
            return aty.gl;
         case 2:
            return aty.gm;
         case 3:
            return aty.gn;
         default:
            return aty.gk;
      }
   }

   private static float a(int $$0, cqm $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      List<cqm> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cqm $$5 = $$4.get(0);
         $$2.add(vu.c("item.minecraft.crossbow.projectile").b(vt.v).b($$5.K()));
         if ($$3.a() && $$5.a(cqp.us)) {
            List<vu> $$6 = Lists.newArrayList();
            cqp.us.a($$5, $$1, $$6, $$3);
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
   public boolean l(cqm $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
