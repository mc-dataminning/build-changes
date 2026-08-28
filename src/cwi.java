import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwi extends cvg {
   public static final Predicate<cvl> c = $$0 -> $$0.a(axb.aT);
   public static final Predicate<cvl> d = c.or($$0 -> $$0.a(cvo.uw));

   public cwi(cvg.a $$0) {
      super($$0);
   }

   public Predicate<cvl> d() {
      return this.b();
   }

   public abstract Predicate<cvl> b();

   public static cvl a(buf $$0, Predicate<cvl> $$1) {
      if ($$1.test($$0.b(brj.b))) {
         return $$0.b(brj.b);
      } else {
         return $$1.test($$0.b(brj.a)) ? $$0.b(brj.a) : cvl.k;
      }
   }

   public abstract int c();

   protected void a(arg $$0, buf $$1, brj $$2, cvl $$3, List<cvl> $$4, float $$5, float $$6, boolean $$7, @Nullable buf $$8) {
      float $$9 = day.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cvl $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            coi.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.i($$14), $$1, buf.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int i(cvl $$0) {
      return 1;
   }

   protected abstract void a(buf var1, coi var2, int var3, float var4, float var5, float var6, @Nullable buf var7);

   protected coi a(dds $$0, buf $$1, cvl $$2, cvl $$3, boolean $$4) {
      ctg $$6 = $$3.h() instanceof ctg $$5 ? $$5 : (ctg)cvo.ox;
      cnw $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cvl> a(cvl $$0, cvl $$1, buf $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dS() instanceof arg $$3 ? day.a($$3, $$0, $$2, 1) : 1;
         List<cvl> $$5 = new ArrayList<>($$4);
         cvl $$6 = $$1.u();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cvl $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cvl a(cvl $$0, cvl $$1, buf $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fP() && $$2.dS() instanceof arg $$4 ? day.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.J()) {
         return cvl.k;
      } else if ($$5 == 0) {
         cvl $$6 = $$1.c(1);
         $$6.b(kr.u, bah.a);
         return $$6;
      } else {
         cvl $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cnp $$8) {
            $$8.gc().h($$1);
         }

         return $$7;
      }
   }
}
