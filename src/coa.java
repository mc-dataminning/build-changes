import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class coa extends cqg {
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

   public coa(cpl.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cpq> d() {
      return d;
   }

   @Override
   public Predicate<cpq> b() {
      return c;
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bmm.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bmm.b($$3);
      } else {
         return bmm.d($$3);
      }
   }

   private static float o(cpq $$0) {
      return a($$0, cpt.uq) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cpq $$0, cwe $$1, box $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         atq $$6 = $$2 instanceof cia ? atq.h : atq.f;
         $$1.a(null, $$2.do(), $$2.dq(), $$2.du(), atp.gb, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(box $$0, cpq $$1) {
      int $$2 = cua.a(cuc.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cia && ((cia)$$0).fW().d;
      cpq $$5 = $$0.g($$1);
      cpq $$6 = $$5.q();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.q();
         }

         if ($$5.b() && $$4) {
            $$5 = new cpq(cpt.ou);
            $$6 = $$5.q();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(box $$0, cpq $$1, cpq $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cng;
         cpq $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cia) {
               ((cia)$$0).fV().g($$2);
            }
         } else {
            $$6 = $$2.q();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cpq $$0) {
      sy $$1 = $$0.w();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cpq $$0, boolean $$1) {
      sy $$2 = $$0.x();
      $$2.a("Charged", $$1);
   }

   private static void b(cpq $$0, cpq $$1) {
      sy $$2 = $$0.x();
      te $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new te();
      }

      sy $$5 = new sy();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cpq> p(cpq $$0) {
      List<cpq> $$1 = Lists.newArrayList();
      sy $$2 = $$0.w();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         te $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sy $$5 = $$3.a($$4);
               $$1.add(cpq.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cpq $$0) {
      sy $$1 = $$0.w();
      if ($$1 != null) {
         te $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cpq $$0, cpl $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cwe $$0, box $$1, bmk $$2, cpq $$3, cpq $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cpt.uq);
         cis $$11;
         if ($$10) {
            $$11 = new cin($$0, $$4, $$1, $$1.do(), $$1.ds() - 0.15F, $$1.du(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cig)$$11).d = cig.a.c;
            }
         }

         if ($$1 instanceof cet $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            eov $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            eov $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, box.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.gh, atq.h, 1.0F, $$5);
      }
   }

   private static cig a(cwe $$0, box $$1, cpq $$2, cpq $$3) {
      cng $$4 = (cng)($$3.d() instanceof cng ? $$3.d() : cpt.ou);
      cig $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cia) {
         $$5.a(true);
      }

      $$5.b(atp.ga);
      $$5.q(true);
      int $$6 = cua.a(cuc.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cwe $$0, box $$1, bmk $$2, cpq $$3, float $$4, float $$5) {
      List<cpq> $$6 = p($$3);
      float[] $$7 = a($$1.ef());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cpq $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cia && ((cia)$$1).fW().d;
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

   private static float[] a(awt $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, awt $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cwe $$0, box $$1, cpq $$2) {
      if ($$1 instanceof apb $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(atz.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cwe $$0, box $$1, cpq $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cua.a(cuc.J, $$2);
         ato $$5 = this.a($$4);
         ato $$6 = $$4 == 0 ? atp.gc : null;
         float $$7 = (float)($$2.s() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), $$5, atq.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), $$6, atq.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cpq $$0) {
      return k($$0) + 3;
   }

   public static int k(cpq $$0) {
      int $$1 = cua.a(cuc.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public crj c(cpq $$0) {
      return crj.g;
   }

   private ato a(int $$0) {
      switch ($$0) {
         case 1:
            return atp.ge;
         case 2:
            return atp.gf;
         case 3:
            return atp.gg;
         default:
            return atp.gd;
      }
   }

   private static float a(int $$0, cpq $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      List<cpq> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cpq $$5 = $$4.get(0);
         $$2.add(vs.c("item.minecraft.crossbow.projectile").b(vr.v).b($$5.K()));
         if ($$3.a() && $$5.a(cpt.uq)) {
            List<vs> $$6 = Lists.newArrayList();
            cpt.uq.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vs.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cpq $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
