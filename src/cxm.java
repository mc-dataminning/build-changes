import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxm extends cwm {
   public static final Predicate<cwq> c = $$0 -> $$0.a(awy.aX);
   public static final Predicate<cwq> d = c.or($$0 -> $$0.a(cwu.vt));

   public cxm(cwm.a $$0) {
      super($$0);
   }

   public Predicate<cwq> d() {
      return this.b();
   }

   public abstract Predicate<cwq> b();

   public static cwq a(bvi $$0, Predicate<cwq> $$1) {
      if ($$1.test($$0.b(bsk.b))) {
         return $$0.b(bsk.b);
      } else {
         return $$1.test($$0.b(bsk.a)) ? $$0.b(bsk.a) : cwq.j;
      }
   }

   public abstract int c();

   protected void a(ard $$0, bvi $$1, bsk $$2, cwq $$3, List<cwq> $$4, float $$5, float $$6, boolean $$7, @Nullable bvi $$8) {
      float $$9 = ddc.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwq $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpr.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvi.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwq $$0) {
      return 1;
   }

   protected abstract void a(bvi var1, cpr var2, int var3, float var4, float var5, float var6, @Nullable bvi var7);

   protected cpr a(dgj $$0, bvi $$1, cwq $$2, cwq $$3, boolean $$4) {
      cur $$6 = $$3.h() instanceof cur $$5 ? $$5 : (cur)cwu.pb;
      cpf $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cwq> a(cwq $$0, cwq $$1, bvi $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof ard $$3 ? ddc.a($$3, $$0, $$2, 1) : 1;
         List<cwq> $$5 = new ArrayList<>($$4);
         cwq $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwq $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwq a(cwq $$0, cwq $$1, bvi $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof ard $$4 ? ddc.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cwq.j;
      } else if ($$5 == 0) {
         cwq $$6 = $$1.c(1);
         $$6.b(kv.v, baf.a);
         return $$6;
      } else {
         cwq $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof coy $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
