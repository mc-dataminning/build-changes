import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvh extends cuj {
   public static final Predicate<cuo> c = $$0 -> $$0.a(awx.aU);
   public static final Predicate<cuo> j = c.or($$0 -> $$0.a(cur.uu));

   public cvh(cuj.a $$0) {
      super($$0);
   }

   public Predicate<cuo> d() {
      return this.b();
   }

   public abstract Predicate<cuo> b();

   public static cuo a(bto $$0, Predicate<cuo> $$1) {
      if ($$1.test($$0.b(bqs.b))) {
         return $$0.b(bqs.b);
      } else {
         return $$1.test($$0.b(bqs.a)) ? $$0.b(bqs.a) : cuo.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dbx $$0, bto $$1, bqs $$2, cuo $$3, List<cuo> $$4, float $$5, float $$6, boolean $$7, @Nullable bto $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuo $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bto.d($$2));
            cno $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cuo $$0) {
      return 1;
   }

   protected abstract void a(bto var1, cno var2, int var3, float var4, float var5, float var6, @Nullable bto var7);

   protected cno a(dbx $$0, bto $$1, cuo $$2, cuo $$3, boolean $$4) {
      csh $$6 = $$3.g() instanceof csh $$5 ? $$5 : (csh)cur.ov;
      cnc $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = daa.a(dac.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = daa.a(dac.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (daa.a(dac.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = daa.a(dac.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cuo $$0, cuo $$1, boolean $$2) {
      return $$2 || $$1.a(cur.ov) && daa.a(dac.B, $$0) > 0;
   }

   protected static List<cuo> a(cuo $$0, cuo $$1, bto $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = daa.a(dac.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cuo> $$5 = new ArrayList<>($$4);
         cuo $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cuo a(cuo $$0, cuo $$1, bto $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cuo $$5 = $$1.c(1);
         $$5.b(km.u, bab.a);
         return $$5;
      } else {
         cuo $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cmw $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
