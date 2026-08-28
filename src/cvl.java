import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvl extends cuj {
   public static final Predicate<cuo> c = $$0 -> $$0.a(awm.aT);
   public static final Predicate<cuo> j = c.or($$0 -> $$0.a(cur.uu));

   public cvl(cuj.a $$0) {
      super($$0);
   }

   public Predicate<cuo> d() {
      return this.b();
   }

   public abstract Predicate<cuo> b();

   public static cuo a(btl $$0, Predicate<cuo> $$1) {
      if ($$1.test($$0.b(bqp.b))) {
         return $$0.b(bqp.b);
      } else {
         return $$1.test($$0.b(bqp.a)) ? $$0.b(bqp.a) : cuo.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(aqt $$0, btl $$1, bqp $$2, cuo $$3, List<cuo> $$4, float $$5, float $$6, boolean $$7, @Nullable btl $$8) {
      float $$9 = dac.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuo $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.j($$14), $$1, btl.d($$2));
            cnn $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int j(cuo $$0) {
      return 1;
   }

   protected abstract void a(btl var1, cnn var2, int var3, float var4, float var5, float var6, @Nullable btl var7);

   protected cnn a(dcu $$0, btl $$1, cuo $$2, cuo $$3, boolean $$4) {
      csh $$6 = $$3.g() instanceof csh $$5 ? $$5 : (csh)cur.ow;
      cnb $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cuo> a(cuo $$0, cuo $$1, btl $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$4 = $$2.dQ() instanceof aqt $$3 ? dac.a($$3, $$0, $$2, 1) : 1;
         List<cuo> $$5 = new ArrayList<>($$4);
         cuo $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cuo $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.e()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cuo a(cuo $$0, cuo $$1, btl $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fM() && $$2.dQ() instanceof aqt $$4 ? dac.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.H()) {
         return cuo.l;
      } else if ($$5 == 0) {
         cuo $$6 = $$1.c(1);
         $$6.b(kq.u, azr.a);
         return $$6;
      } else {
         cuo $$7 = $$1.a($$5);
         if ($$1.e() && $$2 instanceof cmv $$8) {
            $$8.fZ().h($$1);
         }

         return $$7;
      }
   }
}
