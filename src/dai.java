import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class dai extends czj {
   public static final Predicate<czn> c = $$0 -> $$0.a(axk.aY);
   public static final Predicate<czn> d = c.or($$0 -> $$0.a(czr.vE));

   public dai(czj.a $$0) {
      super($$0);
   }

   public Predicate<czn> c() {
      return this.a();
   }

   public abstract Predicate<czn> a();

   public static czn a(bxj $$0, Predicate<czn> $$1) {
      if ($$1.test($$0.b(buf.b))) {
         return $$0.b(buf.b);
      } else {
         return $$1.test($$0.b(buf.a)) ? $$0.b(buf.a) : czn.k;
      }
   }

   public abstract int b();

   protected void a(arq $$0, bxj $$1, buf $$2, czn $$3, List<czn> $$4, float $$5, float $$6, boolean $$7, @Nullable bxj $$8) {
      float $$9 = dgc.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         czn $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            csh.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bxj.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(czn $$0) {
      return 1;
   }

   protected abstract void a(bxj var1, csh var2, int var3, float var4, float var5, float var6, @Nullable bxj var7);

   protected csh a(djm $$0, bxj $$1, czn $$2, czn $$3, boolean $$4) {
      cxr $$6 = $$3.h() instanceof cxr $$5 ? $$5 : (cxr)czr.pk;
      cru $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<czn> a(czn $$0, czn $$1, bxj $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dU() instanceof arq $$3 ? dgc.a($$3, $$0, $$2, 1) : 1;
         List<czn> $$5 = new ArrayList<>($$4);
         czn $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            czn $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static czn a(czn $$0, czn $$1, bxj $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fU() && $$2.dU() instanceof arq $$4 ? dgc.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return czn.k;
      } else if ($$5 == 0) {
         czn $$6 = $$1.c(1);
         $$6.b(kk.u, bau.a);
         return $$6;
      } else {
         czn $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof crm $$8) {
            $$8.gi().i($$1);
         }

         return $$7;
      }
   }
}
