import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class daf extends czg {
   public static final Predicate<czk> c = $$0 -> $$0.a(axk.aY);
   public static final Predicate<czk> d = c.or($$0 -> $$0.a(czo.vE));

   public daf(czg.a $$0) {
      super($$0);
   }

   public Predicate<czk> c() {
      return this.a();
   }

   public abstract Predicate<czk> a();

   public static czk a(bxj $$0, Predicate<czk> $$1) {
      if ($$1.test($$0.b(buf.b))) {
         return $$0.b(buf.b);
      } else {
         return $$1.test($$0.b(buf.a)) ? $$0.b(buf.a) : czk.k;
      }
   }

   public abstract int b();

   protected void a(arq $$0, bxj $$1, buf $$2, czk $$3, List<czk> $$4, float $$5, float $$6, boolean $$7, @Nullable bxj $$8) {
      float $$9 = dfz.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         czk $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cse.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bxj.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(czk $$0) {
      return 1;
   }

   protected abstract void a(bxj var1, cse var2, int var3, float var4, float var5, float var6, @Nullable bxj var7);

   protected cse a(djh $$0, bxj $$1, czk $$2, czk $$3, boolean $$4) {
      cxo $$6 = $$3.h() instanceof cxo $$5 ? $$5 : (cxo)czo.pk;
      crr $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<czk> a(czk $$0, czk $$1, bxj $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dU() instanceof arq $$3 ? dfz.a($$3, $$0, $$2, 1) : 1;
         List<czk> $$5 = new ArrayList<>($$4);
         czk $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            czk $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static czk a(czk $$0, czk $$1, bxj $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fU() && $$2.dU() instanceof arq $$4 ? dfz.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return czk.k;
      } else if ($$5 == 0) {
         czk $$6 = $$1.c(1);
         $$6.b(kk.u, bau.a);
         return $$6;
      } else {
         czk $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof crj $$8) {
            $$8.gi().i($$1);
         }

         return $$7;
      }
   }
}
