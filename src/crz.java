import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class crz extends cre {
   public static final Predicate<crj> c = $$0 -> $$0.a(avk.at);
   public static final Predicate<crj> j = c.or($$0 -> $$0.a(crm.us));

   public crz(cre.a $$0) {
      super($$0);
   }

   public Predicate<crj> d() {
      return this.b();
   }

   public abstract Predicate<crj> b();

   public static crj a(bqo $$0, Predicate<crj> $$1) {
      if ($$1.test($$0.b(bnz.b))) {
         return $$0.b(bnz.b);
      } else {
         return $$1.test($$0.b(bnz.a)) ? $$0.b(bnz.a) : crj.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(cyx $$0, bqo $$1, bnz $$2, crj $$3, List<crj> $$4, float $$5, float $$6, boolean $$7, @Nullable bqo $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         crj $$14 = $$4.get($$13);
         if (!$$14.d()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bqo.d($$2));
            ckl $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(crj $$0) {
      return 1;
   }

   protected abstract void a(bqo var1, ckl var2, int var3, float var4, float var5, float var6, @Nullable bqo var7);

   protected ckl a(cyx $$0, bqo $$1, crj $$2, crj $$3, boolean $$4) {
      cpc $$6 = $$3.f() instanceof cpc $$5 ? $$5 : (cpc)crm.ou;
      cjz $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = cwr.a(cwt.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = cwr.a(cwt.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (cwr.a(cwt.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = cwr.a(cwt.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(crj $$0, crj $$1, boolean $$2) {
      return $$2 || $$1.a(crm.ou) && cwr.a(cwt.B, $$0) > 0;
   }

   protected static List<crj> a(crj $$0, crj $$1, bqo $$2) {
      if ($$1.d()) {
         return List.of();
      } else {
         int $$3 = cwr.a(cwt.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<crj> $$5 = new ArrayList<>($$4);
         crj $$6 = $$1.r();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static crj a(crj $$0, crj $$1, bqo $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fM());
      if (!$$4) {
         crj $$5 = $$1.c(1);
         $$5.b(jp.o, aym.a);
         return $$5;
      } else {
         crj $$6 = $$1.a(1);
         if ($$1.d() && $$2 instanceof cjt $$7) {
            $$7.fZ().g($$1);
         }

         return $$6;
      }
   }
}
