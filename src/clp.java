import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class clp extends cnw implements cpb {
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

   public clp(cnb.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cng> e() {
      return d;
   }

   @Override
   public Predicate<cng> b() {
      return c;
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bkd.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bkd.b($$3);
      } else {
         return bkd.d($$3);
      }
   }

   private static float o(cng $$0) {
      return a($$0, cnj.uq) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cng $$0, ctx $$1, bmo $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         aru $$6 = $$2 instanceof cfq ? aru.h : aru.f;
         $$1.a(null, $$2.dq(), $$2.ds(), $$2.dw(), art.ga, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bmo $$0, cng $$1) {
      int $$2 = crt.a(crv.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cfq && ((cfq)$$0).fT().d;
      cng $$5 = $$0.g($$1);
      cng $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new cng(cnj.ou);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bmo $$0, cng $$1, cng $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof ckv;
         cng $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cfq) {
               ((cfq)$$0).fS().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cng $$0) {
      so $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cng $$0, boolean $$1) {
      so $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(cng $$0, cng $$1) {
      so $$2 = $$0.w();
      su $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new su();
      }

      so $$5 = new so();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cng> p(cng $$0) {
      List<cng> $$1 = Lists.newArrayList();
      so $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         su $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               so $$5 = $$3.a($$4);
               $$1.add(cng.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cng $$0) {
      so $$1 = $$0.v();
      if ($$1 != null) {
         su $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cng $$0, cnb $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(ctx $$0, bmo $$1, bkb $$2, cng $$3, cng $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cnj.uq);
         cgi $$11;
         if ($$10) {
            $$11 = new cgd($$0, $$4, $$1, $$1.dq(), $$1.du() - 0.15F, $$1.dw(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cfw)$$11).d = cfw.a.c;
            }
         }

         if ($$1 instanceof ccj $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            emc $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            emc $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.gg, aru.h, 1.0F, $$5);
      }
   }

   private static cfw a(ctx $$0, bmo $$1, cng $$2, cng $$3) {
      ckv $$4 = (ckv)($$3.d() instanceof ckv ? $$3.d() : cnj.ou);
      cfw $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cfq) {
         $$5.a(true);
      }

      $$5.b(art.fZ);
      $$5.q(true);
      int $$6 = crt.a(crv.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(ctx $$0, bmo $$1, bkb $$2, cng $$3, float $$4, float $$5) {
      List<cng> $$6 = p($$3);
      float[] $$7 = a($$1.eg());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cng $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cfq && ((cfq)$$1).fT().d;
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

   private static float[] a(auw $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, auw $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(ctx $$0, bmo $$1, cng $$2) {
      if ($$1 instanceof anf $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(asd.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(ctx $$0, bmo $$1, cng $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = crt.a(crv.J, $$2);
         ars $$5 = this.a($$4);
         ars $$6 = $$4 == 0 ? art.gb : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), $$5, aru.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), $$6, aru.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cng $$0) {
      return k($$0) + 3;
   }

   public static int k(cng $$0) {
      int $$1 = crt.a(crv.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cpa c(cng $$0) {
      return cpa.g;
   }

   private ars a(int $$0) {
      switch ($$0) {
         case 1:
            return art.gd;
         case 2:
            return art.ge;
         case 3:
            return art.gf;
         default:
            return art.gc;
      }
   }

   private static float a(int $$0, cng $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      List<cng> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cng $$5 = $$4.get(0);
         $$2.add(vg.c("item.minecraft.crossbow.projectile").b(vf.u).b($$5.J()));
         if ($$3.a() && $$5.a(cnj.uq)) {
            List<vg> $$6 = Lists.newArrayList();
            cnj.uq.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vg.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cng $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
