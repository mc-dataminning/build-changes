import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cnl extends cpt {
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

   public cnl(coy.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cpd> e() {
      return d;
   }

   @Override
   public Predicate<cpd> b() {
      return c;
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return blx.b($$3);
      } else if (!$$1.g($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return blx.b($$3);
      } else {
         return blx.d($$3);
      }
   }

   private static float o(cpd $$0) {
      return a($$0, cpg.uq) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cpd $$0, cvr $$1, boi $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         atm $$6 = $$2 instanceof chl ? atm.h : atm.f;
         $$1.a(null, $$2.dr(), $$2.dt(), $$2.dx(), atl.gb, $$6, 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(boi $$0, cpd $$1) {
      int $$2 = ctn.a(ctp.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof chl && ((chl)$$0).fU().d;
      cpd $$5 = $$0.g($$1);
      cpd $$6 = $$5.q();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         if ($$7 > 0) {
            $$5 = $$6.q();
         }

         if ($$5.b() && $$4) {
            $$5 = new cpd(cpg.ou);
            $$6 = $$5.q();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(boi $$0, cpd $$1, cpd $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.d() instanceof cmr;
         cpd $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof chl) {
               ((chl)$$0).fT().g($$2);
            }
         } else {
            $$6 = $$2.q();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cpd $$0) {
      sw $$1 = $$0.w();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cpd $$0, boolean $$1) {
      sw $$2 = $$0.x();
      $$2.a("Charged", $$1);
   }

   private static void b(cpd $$0, cpd $$1) {
      sw $$2 = $$0.x();
      tc $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new tc();
      }

      sw $$5 = new sw();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", $$3);
   }

   private static List<cpd> p(cpd $$0) {
      List<cpd> $$1 = Lists.newArrayList();
      sw $$2 = $$0.w();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         tc $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
               sw $$5 = $$3.a($$4);
               $$1.add(cpd.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cpd $$0) {
      sw $$1 = $$0.w();
      if ($$1 != null) {
         tc $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", $$2);
      }
   }

   public static boolean a(cpd $$0, coy $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cvr $$0, boi $$1, blv $$2, cpd $$3, cpd $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.B) {
         boolean $$10 = $$4.a(cpg.uq);
         cid $$11;
         if ($$10) {
            $$11 = new chy($$0, $$4, $$1, $$1.dr(), $$1.dv() - 0.15F, $$1.dx(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((chr)$$11).d = chr.a.c;
            }
         }

         if ($$1 instanceof cee $$13) {
            $$13.a($$13.q(), $$3, $$11, $$9);
         } else {
            enz $$14 = $$1.i(1.0F);
            Quaternionf $$15 = new Quaternionf().setAngleAxis((double)($$9 * (float) (Math.PI / 180.0)), $$14.c, $$14.d, $$14.e);
            enz $$16 = $$1.f(1.0F);
            Vector3f $$17 = $$16.j().rotate($$15);
            $$11.c((double)$$17.x(), (double)$$17.y(), (double)$$17.z(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, boi.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.gh, atm.h, 1.0F, $$5);
      }
   }

   private static chr a(cvr $$0, boi $$1, cpd $$2, cpd $$3) {
      cmr $$4 = (cmr)($$3.d() instanceof cmr ? $$3.d() : cpg.ou);
      chr $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof chl) {
         $$5.a(true);
      }

      $$5.b(atl.ga);
      $$5.q(true);
      int $$6 = ctn.a(ctp.K, $$2);
      if ($$6 > 0) {
         $$5.a((byte)$$6);
      }

      return $$5;
   }

   public static void a(cvr $$0, boi $$1, blv $$2, cpd $$3, float $$4, float $$5) {
      List<cpd> $$6 = p($$3);
      float[] $$7 = a($$1.eh());

      for (int $$8 = 0; $$8 < $$6.size(); $$8++) {
         cpd $$9 = $$6.get($$8);
         boolean $$10 = $$1 instanceof chl && ((chl)$$1).fU().d;
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

   private static float[] a(awp $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, awp $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cvr $$0, boi $$1, cpd $$2) {
      if ($$1 instanceof aox $$3) {
         if (!$$0.B) {
            am.G.a($$3, $$2);
         }

         $$3.b(atv.c.b($$2.d()));
      }

      q($$2);
   }

   @Override
   public void a(cvr $$0, boi $$1, cpd $$2, int $$3) {
      if (!$$0.B) {
         int $$4 = ctn.a(ctp.J, $$2);
         atk $$5 = this.a($$4);
         atk $$6 = $$4 == 0 ? atl.gc : null;
         float $$7 = (float)($$2.s() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$5, atm.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), $$6, atm.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cpd $$0) {
      return k($$0) + 3;
   }

   public static int k(cpd $$0) {
      int $$1 = ctn.a(ctp.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cqw c(cpd $$0) {
      return cqw.g;
   }

   private atk a(int $$0) {
      switch ($$0) {
         case 1:
            return atl.ge;
         case 2:
            return atl.gf;
         case 3:
            return atl.gg;
         default:
            return atl.gd;
      }
   }

   private static float a(int $$0, cpd $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      List<cpd> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cpd $$5 = $$4.get(0);
         $$2.add(vq.c("item.minecraft.crossbow.projectile").b(vp.v).b($$5.K()));
         if ($$3.a() && $$5.a(cpg.uq)) {
            List<vq> $$6 = Lists.newArrayList();
            cpg.uq.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, vq.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cpd $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
