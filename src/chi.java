import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class chi extends cjq implements cku {
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

   public chi(civ.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cja> e() {
      return d;
   }

   @Override
   public Predicate<cja> b() {
      return c;
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bgu.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bgu.b($$3);
      } else {
         return bgu.d($$3);
      }
   }

   private static float o(cja $$0) {
      return a($$0, cjd.tA) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cja $$0, cpq $$1, bjb $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         apa $$6 = $$2 instanceof cbp ? apa.h : apa.f;
         $$1.a(null, $$2.dp(), $$2.dr(), $$2.dv(), aoz.fk, $$6, 1.0F, 1.0F / ($$1.y_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bjb $$0, cja $$1) {
      int $$2 = cnl.a(cnn.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof cbp && ((cbp)$$0).fR().d;
      cja $$5 = $$0.g($$1);
      cja $$6 = $$5.p();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.p();
         }

         if ($$5.b() && $$4) {
            $$5 = new cja(cjd.nH);
            $$6 = $$5.p();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bjb $$0, cja $$1, cja $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cgo;
         cja $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof cbp) {
               ((cbp)$$0).fQ().g($$2);
            }
         } else {
            $$6 = $$2.p();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cja $$0) {
      qu $$1 = $$0.v();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cja $$0, boolean $$1) {
      qu $$2 = $$0.w();
      $$2.a("Charged", $$1);
   }

   private static void b(cja $$0, cja $$1) {
      qu $$2 = $$0.w();
      ra $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new ra();
      }

      qu $$5 = new qu();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cja> p(cja $$0) {
      List<cja> $$1 = Lists.newArrayList();
      qu $$2 = $$0.v();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         ra $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               qu $$5 = $$3.a($$4);
               $$1.add(cja.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cja $$0) {
      qu $$1 = $$0.v();
      if ($$1 != null) {
         ra $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cja $$0, civ $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cpq $$0, bjb $$1, bgs $$2, cja $$3, cja $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cjd.tA);
         cch $$11;
         if ($$10) {
            $$11 = new ccc($$0, $$4, $$1, $$1.dp(), $$1.dt() - 0.15F, $$1.dv(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((cbv)$$11).d = cbv.a.c;
            }
         }

         if ($$1 instanceof byq $$13) {
            $$13.a($$13.j(), $$3, $$11, $$9);
         } else {
            ehi $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            ehi $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.fq, apa.h, 1.0F, $$5);
      }
   }

   private static cbv a(cpq $$0, bjb $$1, cja $$2, cja $$3) {
      cgo $$4 = (cgo)($$3.d() instanceof cgo ? $$3.d() : cjd.nH);
      cbv $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof cbp) {
         $$5.a(true);
      }

      $$5.b(aoz.fj);
      $$5.q(true);
      int $$6 = cnl.a(cnn.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cpq $$0, bjb $$1, bgs $$2, cja $$3, float $$4, float $$5) {
      List<cja> $$6 = p($$3);
      float[] $$7 = a($$1.ee());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cja $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof cbp && ((cbp)$$1).fR().d;
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

   private static float[] a(arx $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, arx $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cpq $$0, bjb $$1, cja $$2) {
      if ($$1 instanceof ako $$3) {
         if (!$$0.B) {
            al.F.a($$3, $$2);
         }

         $$3.b(apj.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cpq $$0, bjb $$1, cja $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = cnl.a(cnn.J, $$2);
         aoy $$5 = this.a($$4);
         aoy $$6 = $$4 == 0 ? aoz.fl : null;
         float $$7 = (float)($$2.r() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$5, apa.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), $$6, apa.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cja $$0) {
      return k($$0) + 3;
   }

   public static int k(cja $$0) {
      int $$1 = cnl.a(cnn.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public ckt c(cja $$0) {
      return ckt.g;
   }

   private aoy a(int $$0) {
      switch ($$0) {
         case 1:
            return aoz.fn;
         case 2:
            return aoz.fo;
         case 3:
            return aoz.fp;
         default:
            return aoz.fm;
      }
   }

   private static float a(int $$0, cja $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cja $$0, @Nullable cpq $$1, List<ti> $$2, ckr $$3) {
      List<cja> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cja $$5 = $$4.get(0);
         $$2.add(ti.c("item.minecraft.crossbow.projectile").b(th.u).b($$5.J()));
         if ($$3.a() && $$5.a(cjd.tA)) {
            List<ti> $$6 = Lists.newArrayList();
            cjd.tA.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, ti.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cja $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
