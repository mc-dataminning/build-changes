import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cuh extends ctj {
   public static final Predicate<cto> c = $$0 -> $$0.a(awe.aU);
   public static final Predicate<cto> j = c.or($$0 -> $$0.a(ctr.uu));

   public cuh(ctj.a $$0) {
      super($$0);
   }

   public Predicate<cto> d() {
      return this.b();
   }

   public abstract Predicate<cto> b();

   public static cto a(bso $$0, Predicate<cto> $$1) {
      if ($$1.test($$0.b(bpt.b))) {
         return $$0.b(bpt.b);
      } else {
         return $$1.test($$0.b(bpt.a)) ? $$0.b(bpt.a) : cto.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dax $$0, bso $$1, bpt $$2, cto $$3, List<cto> $$4, float $$5, float $$6, boolean $$7, @Nullable bso $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cto $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bso.d($$2));
            cmo $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cto $$0) {
      return 1;
   }

   protected abstract void a(bso var1, cmo var2, int var3, float var4, float var5, float var6, @Nullable bso var7);

   protected cmo a(dax $$0, bso $$1, cto $$2, cto $$3, boolean $$4) {
      crh $$6 = $$3.g() instanceof crh $$5 ? $$5 : (crh)ctr.ov;
      cmc $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = cza.a(czc.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = cza.a(czc.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (cza.a(czc.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = cza.a(czc.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cto $$0, cto $$1, boolean $$2) {
      return $$2 || $$1.a(ctr.ov) && cza.a(czc.B, $$0) > 0;
   }

   protected static List<cto> a(cto $$0, cto $$1, bso $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = cza.a(czc.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cto> $$5 = new ArrayList<>($$4);
         cto $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cto a(cto $$0, cto $$1, bso $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cto $$5 = $$1.c(1);
         $$5.b(kb.t, azf.a);
         return $$5;
      } else {
         cto $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof clw $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
