import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cuw extends cty {
   public static final Predicate<cud> c = $$0 -> $$0.a(awf.aU);
   public static final Predicate<cud> j = c.or($$0 -> $$0.a(cug.uu));

   public cuw(cty.a $$0) {
      super($$0);
   }

   public Predicate<cud> d() {
      return this.b();
   }

   public abstract Predicate<cud> b();

   public static cud a(btc $$0, Predicate<cud> $$1) {
      if ($$1.test($$0.b(bqg.b))) {
         return $$0.b(bqg.b);
      } else {
         return $$1.test($$0.b(bqg.a)) ? $$0.b(bqg.a) : cud.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(aqm $$0, btc $$1, bqg $$2, cud $$3, List<cud> $$4, float $$5, float $$6, boolean $$7, @Nullable btc $$8) {
      float $$9 = czo.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cud $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.j($$14), $$1, btc.d($$2));
            cnd $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int j(cud $$0) {
      return 1;
   }

   protected abstract void a(btc var1, cnd var2, int var3, float var4, float var5, float var6, @Nullable btc var7);

   protected cnd a(dcg $$0, btc $$1, cud $$2, cud $$3, boolean $$4) {
      crx $$6 = $$3.g() instanceof crx $$5 ? $$5 : (crx)cug.ow;
      cmr $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cud> a(cud $$0, cud $$1, btc $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$4 = $$2.dR() instanceof aqm $$3 ? czo.a($$3, $$0, $$2, 1) : 1;
         List<cud> $$5 = new ArrayList<>($$4);
         cud $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cud $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.e()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cud a(cud $$0, cud $$1, btc $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fN() && $$2.dR() instanceof aqm $$4 ? czo.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.H()) {
         return cud.l;
      } else if ($$5 == 0) {
         cud $$6 = $$1.c(1);
         $$6.b(kn.u, azk.a);
         return $$6;
      } else {
         cud $$7 = $$1.a($$5);
         if ($$1.e() && $$2 instanceof cml $$8) {
            $$8.ga().h($$1);
         }

         return $$7;
      }
   }
}
