import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class czy extends cyz {
   public static final Predicate<czd> c = $$0 -> $$0.a(axk.aY);
   public static final Predicate<czd> d = c.or($$0 -> $$0.a(czh.vE));

   public czy(cyz.a $$0) {
      super($$0);
   }

   public Predicate<czd> c() {
      return this.a();
   }

   public abstract Predicate<czd> a();

   public static czd a(bxe $$0, Predicate<czd> $$1) {
      if ($$1.test($$0.b(buc.b))) {
         return $$0.b(buc.b);
      } else {
         return $$1.test($$0.b(buc.a)) ? $$0.b(buc.a) : czd.k;
      }
   }

   public abstract int b();

   protected void a(arq $$0, bxe $$1, buc $$2, czd $$3, List<czd> $$4, float $$5, float $$6, boolean $$7, @Nullable bxe $$8) {
      float $$9 = dfs.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         czd $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            crx.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bxe.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(czd $$0) {
      return 1;
   }

   protected abstract void a(bxe var1, crx var2, int var3, float var4, float var5, float var6, @Nullable bxe var7);

   protected crx a(dja $$0, bxe $$1, czd $$2, czd $$3, boolean $$4) {
      cxh $$6 = $$3.h() instanceof cxh $$5 ? $$5 : (cxh)czh.pk;
      crk $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<czd> a(czd $$0, czd $$1, bxe $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof arq $$3 ? dfs.a($$3, $$0, $$2, 1) : 1;
         List<czd> $$5 = new ArrayList<>($$4);
         czd $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            czd $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static czd a(czd $$0, czd $$1, bxe $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof arq $$4 ? dfs.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return czd.k;
      } else if ($$5 == 0) {
         czd $$6 = $$1.c(1);
         $$6.b(kj.u, bau.a);
         return $$6;
      } else {
         czd $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof crc $$8) {
            $$8.gj().i($$1);
         }

         return $$7;
      }
   }
}
