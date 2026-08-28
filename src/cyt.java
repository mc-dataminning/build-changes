import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyt extends cxu {
   public static final Predicate<cxy> c = $$0 -> $$0.a(axi.aX);
   public static final Predicate<cxy> d = c.or($$0 -> $$0.a(cyc.vx));

   public cyt(cxu.a $$0) {
      super($$0);
   }

   public Predicate<cxy> d() {
      return this.b();
   }

   public abstract Predicate<cxy> b();

   public static cxy a(bwr $$0, Predicate<cxy> $$1) {
      if ($$1.test($$0.b(btp.b))) {
         return $$0.b(btp.b);
      } else {
         return $$1.test($$0.b(btp.a)) ? $$0.b(btp.a) : cxy.k;
      }
   }

   public abstract int c();

   protected void a(arn $$0, bwr $$1, btp $$2, cxy $$3, List<cxy> $$4, float $$5, float $$6, boolean $$7, @Nullable bwr $$8) {
      float $$9 = dej.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxy $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            crb.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bwr.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxy $$0) {
      return 1;
   }

   protected abstract void a(bwr var1, crb var2, int var3, float var4, float var5, float var6, @Nullable bwr var7);

   protected crb a(dhp $$0, bwr $$1, cxy $$2, cxy $$3, boolean $$4) {
      cwa $$6 = $$3.h() instanceof cwa $$5 ? $$5 : (cwa)cyc.pf;
      cqp $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cxy> a(cxy $$0, cxy $$1, bwr $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof arn $$3 ? dej.a($$3, $$0, $$2, 1) : 1;
         List<cxy> $$5 = new ArrayList<>($$4);
         cxy $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxy $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxy a(cxy $$0, cxy $$1, bwr $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fU() && $$2.dV() instanceof arn $$4 ? dej.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cxy.k;
      } else if ($$5 == 0) {
         cxy $$6 = $$1.c(1);
         $$6.b(kx.v, baq.a);
         return $$6;
      } else {
         cxy $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cqi $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
