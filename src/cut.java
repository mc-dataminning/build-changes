import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cut extends ctv {
   public static final Predicate<cua> c = $$0 -> $$0.a(awd.aU);
   public static final Predicate<cua> j = c.or($$0 -> $$0.a(cud.uu));

   public cut(ctv.a $$0) {
      super($$0);
   }

   public Predicate<cua> d() {
      return this.b();
   }

   public abstract Predicate<cua> b();

   public static cua a(bsy $$0, Predicate<cua> $$1) {
      if ($$1.test($$0.b(bqc.b))) {
         return $$0.b(bqc.b);
      } else {
         return $$1.test($$0.b(bqc.a)) ? $$0.b(bqc.a) : cua.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(aqk $$0, bsy $$1, bqc $$2, cua $$3, List<cua> $$4, float $$5, float $$6, boolean $$7, @Nullable bsy $$8) {
      float $$9 = czl.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cua $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.j($$14), $$1, bsy.d($$2));
            cmz $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int j(cua $$0) {
      return 1;
   }

   protected abstract void a(bsy var1, cmz var2, int var3, float var4, float var5, float var6, @Nullable bsy var7);

   protected cmz a(dcd $$0, bsy $$1, cua $$2, cua $$3, boolean $$4) {
      crt $$6 = $$3.g() instanceof crt $$5 ? $$5 : (crt)cud.ov;
      cmn $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cua> a(cua $$0, cua $$1, bsy $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$4 = $$2.dP() instanceof aqk $$3 ? czl.a($$3, $$0, $$2, 1) : 1;
         List<cua> $$5 = new ArrayList<>($$4);
         cua $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cua a(cua $$0, cua $$1, bsy $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fL() && $$2.dP() instanceof aqk $$4 ? czl.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.H()) {
         return cua.l;
      } else if ($$5 == 0) {
         cua $$6 = $$1.c(1);
         $$6.b(kn.u, azh.a);
         return $$6;
      } else {
         cua $$7 = $$1.a($$5);
         if ($$1.e() && $$2 instanceof cmh $$8) {
            $$8.fY().h($$1);
         }

         return $$7;
      }
   }
}
