import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwo extends cvn {
   public static final Predicate<cvs> c = $$0 -> $$0.a(axe.aT);
   public static final Predicate<cvs> d = c.or($$0 -> $$0.a(cvw.uw));

   public cwo(cvn.a $$0) {
      super($$0);
   }

   public Predicate<cvs> d() {
      return this.b();
   }

   public abstract Predicate<cvs> b();

   public static cvs a(bun $$0, Predicate<cvs> $$1) {
      if ($$1.test($$0.b(brr.b))) {
         return $$0.b(brr.b);
      } else {
         return $$1.test($$0.b(brr.a)) ? $$0.b(brr.a) : cvs.k;
      }
   }

   public abstract int c();

   protected void a(arj $$0, bun $$1, brr $$2, cvs $$3, List<cvs> $$4, float $$5, float $$6, boolean $$7, @Nullable bun $$8) {
      float $$9 = dbp.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cvs $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cor.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bun.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cvs $$0) {
      return 1;
   }

   protected abstract void a(bun var1, cor var2, int var3, float var4, float var5, float var6, @Nullable bun var7);

   protected cor a(dej $$0, bun $$1, cvs $$2, cvs $$3, boolean $$4) {
      ctp $$6 = $$3.h() instanceof ctp $$5 ? $$5 : (ctp)cvw.ox;
      coe $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cvs> a(cvs $$0, cvs $$1, bun $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dS() instanceof arj $$3 ? dbp.a($$3, $$0, $$2, 1) : 1;
         List<cvs> $$5 = new ArrayList<>($$4);
         cvs $$6 = $$1.u();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cvs $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cvs a(cvs $$0, cvs $$1, bun $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fR() && $$2.dS() instanceof arj $$4 ? dbp.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.K()) {
         return cvs.k;
      } else if ($$5 == 0) {
         cvs $$6 = $$1.c(1);
         $$6.b(ks.u, bak.a);
         return $$6;
      } else {
         cvs $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cnx $$8) {
            $$8.gd().h($$1);
         }

         return $$7;
      }
   }
}
