import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cuv extends ctx {
   public static final Predicate<cuc> c = $$0 -> $$0.a(awf.aU);
   public static final Predicate<cuc> j = c.or($$0 -> $$0.a(cuf.uu));

   public cuv(ctx.a $$0) {
      super($$0);
   }

   public Predicate<cuc> d() {
      return this.b();
   }

   public abstract Predicate<cuc> b();

   public static cuc a(btb $$0, Predicate<cuc> $$1) {
      if ($$1.test($$0.b(bqf.b))) {
         return $$0.b(bqf.b);
      } else {
         return $$1.test($$0.b(bqf.a)) ? $$0.b(bqf.a) : cuc.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(aqm $$0, btb $$1, bqf $$2, cuc $$3, List<cuc> $$4, float $$5, float $$6, boolean $$7, @Nullable btb $$8) {
      float $$9 = czn.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuc $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.j($$14), $$1, btb.d($$2));
            cnc $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int j(cuc $$0) {
      return 1;
   }

   protected abstract void a(btb var1, cnc var2, int var3, float var4, float var5, float var6, @Nullable btb var7);

   protected cnc a(dcf $$0, btb $$1, cuc $$2, cuc $$3, boolean $$4) {
      crw $$6 = $$3.g() instanceof crw $$5 ? $$5 : (crw)cuf.ow;
      cmq $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cuc> a(cuc $$0, cuc $$1, btb $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$4 = $$2.dQ() instanceof aqm $$3 ? czn.a($$3, $$0, $$2, 1) : 1;
         List<cuc> $$5 = new ArrayList<>($$4);
         cuc $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cuc a(cuc $$0, cuc $$1, btb $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fM() && $$2.dQ() instanceof aqm $$4 ? czn.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.H()) {
         return cuc.l;
      } else if ($$5 == 0) {
         cuc $$6 = $$1.c(1);
         $$6.b(kn.u, azk.a);
         return $$6;
      } else {
         cuc $$7 = $$1.a($$5);
         if ($$1.e() && $$2 instanceof cmk $$8) {
            $$8.fZ().h($$1);
         }

         return $$7;
      }
   }
}
