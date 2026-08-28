import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class dbf extends dag {
   public static final Predicate<dak> c = $$0 -> $$0.a(axv.aZ);
   public static final Predicate<dak> d = c.or($$0 -> $$0.a(dao.vE));

   public dbf(dag.a $$0) {
      super($$0);
   }

   public Predicate<dak> c() {
      return this.a();
   }

   public abstract Predicate<dak> a();

   public static dak a(byf $$0, Predicate<dak> $$1) {
      if ($$1.test($$0.b(bvb.b))) {
         return $$0.b(bvb.b);
      } else {
         return $$1.test($$0.b(bvb.a)) ? $$0.b(bvb.a) : dak.l;
      }
   }

   public abstract int b();

   protected void a(asb $$0, byf $$1, bvb $$2, dak $$3, List<dak> $$4, float $$5, float $$6, boolean $$7, @Nullable byf $$8) {
      float $$9 = dgz.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         dak $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            ctd.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, byf.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(dak $$0) {
      return 1;
   }

   protected abstract void a(byf var1, ctd var2, int var3, float var4, float var5, float var6, @Nullable byf var7);

   protected ctd a(dkj $$0, byf $$1, dak $$2, dak $$3, boolean $$4) {
      cyo $$6 = $$3.h() instanceof cyo $$5 ? $$5 : (cyo)dao.pk;
      csq $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<dak> a(dak $$0, dak $$1, byf $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof asb $$3 ? dgz.a($$3, $$0, $$2, 1) : 1;
         List<dak> $$5 = new ArrayList<>($$4);
         dak $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            dak $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static dak a(dak $$0, dak $$1, byf $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof asb $$4 ? dgz.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return dak.l;
      } else if ($$5 == 0) {
         dak $$6 = $$1.c(1);
         $$6.b(kl.u, bbh.a);
         return $$6;
      } else {
         dak $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof csi $$8) {
            $$8.gj().i($$1);
         }

         return $$7;
      }
   }
}
