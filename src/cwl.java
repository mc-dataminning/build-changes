import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwl extends cvk {
   public static final Predicate<cvp> c = $$0 -> $$0.a(axc.aT);
   public static final Predicate<cvp> d = c.or($$0 -> $$0.a(cvt.uw));

   public cwl(cvk.a $$0) {
      super($$0);
   }

   public Predicate<cvp> d() {
      return this.b();
   }

   public abstract Predicate<cvp> b();

   public static cvp a(buk $$0, Predicate<cvp> $$1) {
      if ($$1.test($$0.b(bro.b))) {
         return $$0.b(bro.b);
      } else {
         return $$1.test($$0.b(bro.a)) ? $$0.b(bro.a) : cvp.k;
      }
   }

   public abstract int c();

   protected void a(arh $$0, buk $$1, bro $$2, cvp $$3, List<cvp> $$4, float $$5, float $$6, boolean $$7, @Nullable buk $$8) {
      float $$9 = dbm.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cvp $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            coo.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, buk.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cvp $$0) {
      return 1;
   }

   protected abstract void a(buk var1, coo var2, int var3, float var4, float var5, float var6, @Nullable buk var7);

   protected coo a(deg $$0, buk $$1, cvp $$2, cvp $$3, boolean $$4) {
      ctm $$6 = $$3.h() instanceof ctm $$5 ? $$5 : (ctm)cvt.ox;
      cob $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cvp> a(cvp $$0, cvp $$1, buk $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dS() instanceof arh $$3 ? dbm.a($$3, $$0, $$2, 1) : 1;
         List<cvp> $$5 = new ArrayList<>($$4);
         cvp $$6 = $$1.u();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cvp $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cvp a(cvp $$0, cvp $$1, buk $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fQ() && $$2.dS() instanceof arh $$4 ? dbm.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.J()) {
         return cvp.k;
      } else if ($$5 == 0) {
         cvp $$6 = $$1.c(1);
         $$6.b(kr.u, bai.a);
         return $$6;
      } else {
         cvp $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cnu $$8) {
            $$8.gc().h($$1);
         }

         return $$7;
      }
   }
}
