import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class csu extends cry {
   public static final Predicate<csd> c = $$0 -> $$0.a(avw.at);
   public static final Predicate<csd> j = c.or($$0 -> $$0.a(csg.uu));

   public csu(cry.a $$0) {
      super($$0);
   }

   public Predicate<csd> d() {
      return this.b();
   }

   public abstract Predicate<csd> b();

   public static csd a(bre $$0, Predicate<csd> $$1) {
      if ($$1.test($$0.b(bop.b))) {
         return $$0.b(bop.b);
      } else {
         return $$1.test($$0.b(bop.a)) ? $$0.b(bop.a) : csd.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(czu $$0, bre $$1, bop $$2, csd $$3, List<csd> $$4, float $$5, float $$6, boolean $$7, @Nullable bre $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         csd $$14 = $$4.get($$13);
         if (!$$14.d()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bre.d($$2));
            cld $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(csd $$0) {
      return 1;
   }

   protected abstract void a(bre var1, cld var2, int var3, float var4, float var5, float var6, @Nullable bre var7);

   protected cld a(czu $$0, bre $$1, csd $$2, csd $$3, boolean $$4) {
      cpw $$6 = $$3.f() instanceof cpw $$5 ? $$5 : (cpw)csg.ov;
      ckr $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = cxo.a(cxq.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = cxo.a(cxq.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (cxo.a(cxq.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = cxo.a(cxq.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(csd $$0, csd $$1, boolean $$2) {
      return $$2 || $$1.a(csg.ov) && cxo.a(cxq.B, $$0) > 0;
   }

   protected static List<csd> a(csd $$0, csd $$1, bre $$2) {
      if ($$1.d()) {
         return List.of();
      } else {
         int $$3 = cxo.a(cxq.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<csd> $$5 = new ArrayList<>($$4);
         csd $$6 = $$1.r();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static csd a(csd $$0, csd $$1, bre $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fN());
      if (!$$4) {
         csd $$5 = $$1.c(1);
         $$5.b(jz.o, ayy.a);
         return $$5;
      } else {
         csd $$6 = $$1.a(1);
         if ($$1.d() && $$2 instanceof ckl $$7) {
            $$7.ga().g($$1);
         }

         return $$6;
      }
   }
}
