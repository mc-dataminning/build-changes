import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxb extends cwb {
   public static final Predicate<cwf> c = $$0 -> $$0.a(axm.aY);
   public static final Predicate<cwf> d = c.or($$0 -> $$0.a(cwj.uM));

   public cxb(cwb.a $$0) {
      super($$0);
   }

   public Predicate<cwf> d() {
      return this.b();
   }

   public abstract Predicate<cwf> b();

   public static cwf a(bve $$0, Predicate<cwf> $$1) {
      if ($$1.test($$0.b(bsg.b))) {
         return $$0.b(bsg.b);
      } else {
         return $$1.test($$0.b(bsg.a)) ? $$0.b(bsg.a) : cwf.k;
      }
   }

   public abstract int c();

   protected void a(arq $$0, bve $$1, bsg $$2, cwf $$3, List<cwf> $$4, float $$5, float $$6, boolean $$7, @Nullable bve $$8) {
      float $$9 = dby.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwf $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpk.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bve.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwf $$0) {
      return 1;
   }

   protected abstract void a(bve var1, cpk var2, int var3, float var4, float var5, float var6, @Nullable bve var7);

   protected cpk a(dff $$0, bve $$1, cwf $$2, cwf $$3, boolean $$4) {
      cug $$6 = $$3.h() instanceof cug $$5 ? $$5 : (cug)cwj.ox;
      coy $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cwf> a(cwf $$0, cwf $$1, bve $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dY() instanceof arq $$3 ? dby.a($$3, $$0, $$2, 1) : 1;
         List<cwf> $$5 = new ArrayList<>($$4);
         cwf $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwf $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwf a(cwf $$0, cwf $$1, bve $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fY() && $$2.dY() instanceof arq $$4 ? dby.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cwf.k;
      } else if ($$5 == 0) {
         cwf $$6 = $$1.c(1);
         $$6.b(ku.v, bat.a);
         return $$6;
      } else {
         cwf $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cor $$8) {
            $$8.gl().h($$1);
         }

         return $$7;
      }
   }
}
