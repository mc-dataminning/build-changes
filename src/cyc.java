import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyc extends cxd {
   public static final Predicate<cxh> c = $$0 -> $$0.a(awy.aX);
   public static final Predicate<cxh> d = c.or($$0 -> $$0.a(cxl.vv));

   public cyc(cxd.a $$0) {
      super($$0);
   }

   public Predicate<cxh> d() {
      return this.b();
   }

   public abstract Predicate<cxh> b();

   public static cxh a(bvy $$0, Predicate<cxh> $$1) {
      if ($$1.test($$0.b(bsx.b))) {
         return $$0.b(bsx.b);
      } else {
         return $$1.test($$0.b(bsx.a)) ? $$0.b(bsx.a) : cxh.k;
      }
   }

   public abstract int c();

   protected void a(ard $$0, bvy $$1, bsx $$2, cxh $$3, List<cxh> $$4, float $$5, float $$6, boolean $$7, @Nullable bvy $$8) {
      float $$9 = ddt.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxh $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cqk.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvy.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxh $$0) {
      return 1;
   }

   protected abstract void a(bvy var1, cqk var2, int var3, float var4, float var5, float var6, @Nullable bvy var7);

   protected cqk a(dgz $$0, bvy $$1, cxh $$2, cxh $$3, boolean $$4) {
      cvj $$6 = $$3.h() instanceof cvj $$5 ? $$5 : (cvj)cxl.pd;
      cpy $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cxh> a(cxh $$0, cxh $$1, bvy $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dU() instanceof ard $$3 ? ddt.a($$3, $$0, $$2, 1) : 1;
         List<cxh> $$5 = new ArrayList<>($$4);
         cxh $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxh $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxh a(cxh $$0, cxh $$1, bvy $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fX() && $$2.dU() instanceof ard $$4 ? ddt.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cxh.k;
      } else if ($$5 == 0) {
         cxh $$6 = $$1.c(1);
         $$6.b(kv.v, baf.a);
         return $$6;
      } else {
         cxh $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cpr $$8) {
            $$8.gl().h($$1);
         }

         return $$7;
      }
   }
}
