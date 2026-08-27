import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ckp extends cmx implements cob {
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

   public ckp(cmc.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cmh> e() {
      return d;
   }

   @Override
   public Predicate<cmh> b() {
      return c;
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      cmh $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bjm.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bjm.b($$3);
      } else {
         return bjm.d($$3);
      }
   }

   private static float o(cmh $$0) {
      return a($$0, cmk.un) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cmh $$0, csy $$1, blv $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         ard $$6 = $$2 instanceof cer ? ard.h : ard.f;
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), arc.fL, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(blv $$0, cmh $$1) {
      int $$2 = cqu.a(cqw.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cer && ((cer)$$0).fT().d;
      cmh $$5 = $$0.g($$1);
      cmh $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new cmh(cmk.os);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(blv $$0, cmh $$1, cmh $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cjv;
         cmh $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cer) {
               ((cer)$$0).fS().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cmh $$0) {
      sj $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cmh $$0, boolean $$1) {
      sj $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(cmh $$0, cmh $$1) {
      sj $$2 = $$0.w();
      sp $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new sp();
      }

      sj $$5 = new sj();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cmh> p(cmh $$0) {
      List<cmh> $$1 = Lists.newArrayList();
      sj $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         sp $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sj $$5 = $$3.a($$4);
               $$1.add(cmh.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cmh $$0) {
      sj $$1 = $$0.v();
      if ($$1 != null) {
         sp $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cmh $$0, cmc $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(csy $$0, blv $$1, bjk $$2, cmh $$3, cmh $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cmk.un);
         cfj $$11;
         if ($$10) {
            $$11 = new cfe($$0, $$4, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cex)$$11).d = cex.a.c;
            }
         }

         if ($$1 instanceof cbm $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            elb $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            elb $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.fR, ard.h, 1.0F, $$5);
      }
   }

   private static cex a(csy $$0, blv $$1, cmh $$2, cmh $$3) {
      cjv $$4 = (cjv)($$3.d() instanceof cjv ? $$3.d() : cmk.os);
      cex $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cer) {
         $$5.a(true);
      }

      $$5.b(arc.fK);
      $$5.q(true);
      int $$6 = cqu.a(cqw.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(csy $$0, blv $$1, bjk $$2, cmh $$3, float $$4, float $$5) {
      List<cmh> $$6 = p($$3);
      float[] $$7 = a($$1.eg());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cmh $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cer && ((cer)$$1).fT().d;
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

   private static float[] a(auf $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, auf $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(csy $$0, blv $$1, cmh $$2) {
      if ($$1 instanceof amq $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(arm.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(csy $$0, blv $$1, cmh $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cqu.a(cqw.J, $$2);
         arb $$5 = this.a($$4);
         arb $$6 = $$4 == 0 ? arc.fM : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$5, ard.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$6, ard.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cmh $$0) {
      return k($$0) + 3;
   }

   public static int k(cmh $$0) {
      int $$1 = cqu.a(cqw.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public coa c(cmh $$0) {
      return coa.g;
   }

   private arb a(int $$0) {
      switch ($$0) {
         case 1:
            return arc.fO;
         case 2:
            return arc.fP;
         case 3:
            return arc.fQ;
         default:
            return arc.fN;
      }
   }

   private static float a(int $$0, cmh $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      List<cmh> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cmh $$5 = $$4.get(0);
         $$2.add(vb.c("item.minecraft.crossbow.projectile").b(va.u).b($$5.J()));
         if ($$3.a() && $$5.a(cmk.un)) {
            List<vb> $$6 = Lists.newArrayList();
            cmk.un.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vb.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cmh $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
