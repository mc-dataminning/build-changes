import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxk extends cwk {
   public static final Predicate<cwo> c = $$0 -> $$0.a(awy.aX);
   public static final Predicate<cwo> d = c.or($$0 -> $$0.a(cws.vt));

   public cxk(cwk.a $$0) {
      super($$0);
   }

   public Predicate<cwo> d() {
      return this.b();
   }

   public abstract Predicate<cwo> b();

   public static cwo a(bvg $$0, Predicate<cwo> $$1) {
      if ($$1.test($$0.b(bsi.b))) {
         return $$0.b(bsi.b);
      } else {
         return $$1.test($$0.b(bsi.a)) ? $$0.b(bsi.a) : cwo.j;
      }
   }

   public abstract int c();

   protected void a(ard $$0, bvg $$1, bsi $$2, cwo $$3, List<cwo> $$4, float $$5, float $$6, boolean $$7, @Nullable bvg $$8) {
      float $$9 = dda.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwo $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpp.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvg.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwo $$0) {
      return 1;
   }

   protected abstract void a(bvg var1, cpp var2, int var3, float var4, float var5, float var6, @Nullable bvg var7);

   protected cpp a(dgh $$0, bvg $$1, cwo $$2, cwo $$3, boolean $$4) {
      cup $$6 = $$3.h() instanceof cup $$5 ? $$5 : (cup)cws.pb;
      cpd $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cwo> a(cwo $$0, cwo $$1, bvg $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof ard $$3 ? dda.a($$3, $$0, $$2, 1) : 1;
         List<cwo> $$5 = new ArrayList<>($$4);
         cwo $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwo $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwo a(cwo $$0, cwo $$1, bvg $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof ard $$4 ? dda.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cwo.j;
      } else if ($$5 == 0) {
         cwo $$6 = $$1.c(1);
         $$6.b(kv.v, baf.a);
         return $$6;
      } else {
         cwo $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cow $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
