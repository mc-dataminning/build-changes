import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class css extends cvi {
   private static final int l = 25;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;

   public css(cuc.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cuh> d() {
      return j;
   }

   @Override
   public Predicate<cuh> b() {
      return c;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      cxe $$4 = $$3.a(ke.C);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bqb.b($$3);
      } else if (!$$1.g($$3).d()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bqb.b($$3);
      } else {
         return bqb.d($$3);
      }
   }

   private static float a(cxe $$0) {
      return $$0.a(cuk.wf) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cuh $$0, dca $$1, bso $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !j($$0) && a($$2, $$0)) {
         $$1.a(null, $$2.dz(), $$2.dB(), $$2.dF(), avo.go, $$2.dj(), 1.0F, 1.0F / ($$1.F_().i() * 0.5F + 1.0F) + 0.2F);
      }
   }

   private static boolean a(bso $$0, cuh $$1) {
      List<cuh> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ke.C, cxe.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean j(cuh $$0) {
      cxe $$1 = $$0.a(ke.C, cxe.a);
      return !$$1.b();
   }

   @Override
   protected void a(bso $$0, cms $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bso $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dz() - $$0.dz();
         double $$8 = $$6.dF() - $$0.dF();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dB() + $$9 * 0.2F;
         $$11 = a($$0, new ewu($$7, $$10, $$8), $$5);
      } else {
         ewu $$12 = $$0.i(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         ewu $$14 = $$0.f(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.et(), $$2);
      $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), avo.gu, $$0.dj(), 1.0F, $$16);
   }

   private static Vector3f a(bso $$0, ewu $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ewu $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cms a(dca $$0, bso $$1, cuh $$2, cuh $$3, boolean $$4) {
      if ($$3.a(cuk.wf)) {
         return new cmm($$0, $$3, $$1, $$1.dz(), $$1.dD() - 0.15F, $$1.dF(), true);
      } else {
         cms $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cme $$6) {
            $$6.q(true);
            $$6.b(avo.gn);
         }

         return $$5;
      }
   }

   @Override
   protected int k(cuh $$0) {
      return $$0.a(cuk.wf) ? 3 : 1;
   }

   public void a(dca $$0, bso $$1, bpz $$2, cuh $$3, float $$4, float $$5, @Nullable bso $$6) {
      if (!$$0.x_()) {
         cxe $$7 = $$3.b(ke.C, cxe.a);
         if ($$7 != null && !$$7.b()) {
            this.a($$0, $$1, $$2, $$3, $$7.a(), $$4, $$5, $$1 instanceof cly, $$6);
            if ($$1 instanceof aqu $$8) {
               an.G.a($$8, $$3);
               $$8.b(avz.c.b($$3.f()));
            }
         }
      }
   }

   private static float a(ayt $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, ayt $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dca $$0, bso $$1, cuh $$2, int $$3) {
      if (!$$0.C) {
         int $$4 = dae.a(dag.K, $$2);
         avn $$5 = this.a($$4);
         avn $$6 = $$4 == 0 ? avo.gp : null;
         float $$7 = (float)($$2.t() - $$3) / (float)l($$2);
         if ($$7 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$7 >= 0.2F && !this.m) {
            this.m = true;
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$5, avq.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.n) {
            this.n = true;
            $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$6, avq.h, 0.5F, 1.0F);
         }
      }
   }

   @Override
   public int b(cuh $$0) {
      return l($$0) + 3;
   }

   public static int l(cuh $$0) {
      int $$1 = dae.a(dag.K, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.g;
   }

   private avn a(int $$0) {
      switch ($$0) {
         case 1:
            return avo.gr;
         case 2:
            return avo.gs;
         case 3:
            return avo.gt;
         default:
            return avo.gq;
      }
   }

   private static float a(int $$0, cuh $$1) {
      float $$2 = (float)$$0 / (float)l($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cxe $$4 = $$0.a(ke.C);
      if ($$4 != null && !$$4.b()) {
         cuh $$5 = $$4.a().get(0);
         $$2.add(xe.c("item.minecraft.crossbow.projectile").a(xd.v).a($$5.E()));
         if ($$3.a() && $$5.a(cuk.wf)) {
            List<xe> $$6 = Lists.newArrayList();
            cuk.wf.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xe.b("  ").a($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean m(cuh $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }
}
