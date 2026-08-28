import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyc extends cxc {
   public static final Predicate<cxg> c = $$0 -> $$0.a(axt.aZ);
   public static final Predicate<cxg> d = c.or($$0 -> $$0.a(cxk.vt));

   public cyc(cxc.a $$0) {
      super($$0);
   }

   public Predicate<cxg> d() {
      return this.b();
   }

   public abstract Predicate<cxg> b();

   public static cxg a(bvx $$0, Predicate<cxg> $$1) {
      if ($$1.test($$0.b(bsz.b))) {
         return $$0.b(bsz.b);
      } else {
         return $$1.test($$0.b(bsz.a)) ? $$0.b(bsz.a) : cxg.j;
      }
   }

   public abstract int c();

   protected void a(arx $$0, bvx $$1, bsz $$2, cxg $$3, List<cxg> $$4, float $$5, float $$6, boolean $$7, @Nullable bvx $$8) {
      float $$9 = dds.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxg $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cqh.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvx.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxg $$0) {
      return 1;
   }

   protected abstract void a(bvx var1, cqh var2, int var3, float var4, float var5, float var6, @Nullable bvx var7);

   protected cqh a(dgz $$0, bvx $$1, cxg $$2, cxg $$3, boolean $$4) {
      cvh $$6 = $$3.h() instanceof cvh $$5 ? $$5 : (cvh)cxk.pb;
      cpv $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cxg> a(cxg $$0, cxg $$1, bvx $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dW() instanceof arx $$3 ? dds.a($$3, $$0, $$2, 1) : 1;
         List<cxg> $$5 = new ArrayList<>($$4);
         cxg $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxg $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxg a(cxg $$0, cxg $$1, bvx $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dW() instanceof arx $$4 ? dds.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cxg.j;
      } else if ($$5 == 0) {
         cxg $$6 = $$1.c(1);
         $$6.b(ku.v, bba.a);
         return $$6;
      } else {
         cxg $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cpo $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
