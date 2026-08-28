import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvk extends cum {
   public static final Predicate<cur> c = $$0 -> $$0.a(awy.aU);
   public static final Predicate<cur> j = c.or($$0 -> $$0.a(cuu.uu));

   public cvk(cum.a $$0) {
      super($$0);
   }

   public Predicate<cur> d() {
      return this.b();
   }

   public abstract Predicate<cur> b();

   public static cur a(btr $$0, Predicate<cur> $$1) {
      if ($$1.test($$0.b(bqv.b))) {
         return $$0.b(bqv.b);
      } else {
         return $$1.test($$0.b(bqv.a)) ? $$0.b(bqv.a) : cur.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dca $$0, btr $$1, bqv $$2, cur $$3, List<cur> $$4, float $$5, float $$6, boolean $$7, @Nullable btr $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cur $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, btr.d($$2));
            cnr $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cur $$0) {
      return 1;
   }

   protected abstract void a(btr var1, cnr var2, int var3, float var4, float var5, float var6, @Nullable btr var7);

   protected cnr a(dca $$0, btr $$1, cur $$2, cur $$3, boolean $$4) {
      csk $$6 = $$3.g() instanceof csk $$5 ? $$5 : (csk)cuu.ov;
      cnf $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = dad.a(daf.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = dad.a(daf.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (dad.a(daf.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = dad.a(daf.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cur $$0, cur $$1, boolean $$2) {
      return $$2 || $$1.a(cuu.ov) && dad.a(daf.B, $$0) > 0;
   }

   protected static List<cur> a(cur $$0, cur $$1, btr $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = dad.a(daf.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cur> $$5 = new ArrayList<>($$4);
         cur $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cur a(cur $$0, cur $$1, btr $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cur $$5 = $$1.c(1);
         $$5.b(km.u, bac.a);
         return $$5;
      } else {
         cur $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cmz $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
