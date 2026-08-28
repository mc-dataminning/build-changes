import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxl extends cwl {
   public static final Predicate<cwp> c = $$0 -> $$0.a(awy.aX);
   public static final Predicate<cwp> d = c.or($$0 -> $$0.a(cwt.vt));

   public cxl(cwl.a $$0) {
      super($$0);
   }

   public Predicate<cwp> d() {
      return this.b();
   }

   public abstract Predicate<cwp> b();

   public static cwp a(bvh $$0, Predicate<cwp> $$1) {
      if ($$1.test($$0.b(bsj.b))) {
         return $$0.b(bsj.b);
      } else {
         return $$1.test($$0.b(bsj.a)) ? $$0.b(bsj.a) : cwp.j;
      }
   }

   public abstract int c();

   protected void a(ard $$0, bvh $$1, bsj $$2, cwp $$3, List<cwp> $$4, float $$5, float $$6, boolean $$7, @Nullable bvh $$8) {
      float $$9 = ddb.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwp $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpq.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvh.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwp $$0) {
      return 1;
   }

   protected abstract void a(bvh var1, cpq var2, int var3, float var4, float var5, float var6, @Nullable bvh var7);

   protected cpq a(dgi $$0, bvh $$1, cwp $$2, cwp $$3, boolean $$4) {
      cuq $$6 = $$3.h() instanceof cuq $$5 ? $$5 : (cuq)cwt.pb;
      cpe $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cwp> a(cwp $$0, cwp $$1, bvh $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof ard $$3 ? ddb.a($$3, $$0, $$2, 1) : 1;
         List<cwp> $$5 = new ArrayList<>($$4);
         cwp $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwp $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwp a(cwp $$0, cwp $$1, bvh $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof ard $$4 ? ddb.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cwp.j;
      } else if ($$5 == 0) {
         cwp $$6 = $$1.c(1);
         $$6.b(kv.v, baf.a);
         return $$6;
      } else {
         cwp $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cox $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
