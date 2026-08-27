import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ctq extends csu {
   public static final Predicate<csz> c = $$0 -> $$0.a(avz.aU);
   public static final Predicate<csz> j = c.or($$0 -> $$0.a(ctc.uu));

   public ctq(csu.a $$0) {
      super($$0);
   }

   public Predicate<csz> d() {
      return this.b();
   }

   public abstract Predicate<csz> b();

   public static csz a(bsa $$0, Predicate<csz> $$1) {
      if ($$1.test($$0.b(bpl.b))) {
         return $$0.b(bpl.b);
      } else {
         return $$1.test($$0.b(bpl.a)) ? $$0.b(bpl.a) : csz.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dad $$0, bsa $$1, bpl $$2, csz $$3, List<csz> $$4, float $$5, float $$6, boolean $$7, @Nullable bsa $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         csz $$14 = $$4.get($$13);
         if (!$$14.d()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bsa.d($$2));
            clz $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(csz $$0) {
      return 1;
   }

   protected abstract void a(bsa var1, clz var2, int var3, float var4, float var5, float var6, @Nullable bsa var7);

   protected clz a(dad $$0, bsa $$1, csz $$2, csz $$3, boolean $$4) {
      cqs $$6 = $$3.f() instanceof cqs $$5 ? $$5 : (cqs)ctc.ov;
      cln $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = cyh.a(cyj.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = cyh.a(cyj.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (cyh.a(cyj.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = cyh.a(cyj.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(csz $$0, csz $$1, boolean $$2) {
      return $$2 || $$1.a(ctc.ov) && cyh.a(cyj.B, $$0) > 0;
   }

   protected static List<csz> a(csz $$0, csz $$1, bsa $$2) {
      if ($$1.d()) {
         return List.of();
      } else {
         int $$3 = cyh.a(cyj.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<csz> $$5 = new ArrayList<>($$4);
         csz $$6 = $$1.r();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static csz a(csz $$0, csz $$1, bsa $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fN());
      if (!$$4) {
         csz $$5 = $$1.c(1);
         $$5.b(ka.s, azb.a);
         return $$5;
      } else {
         csz $$6 = $$1.a(1);
         if ($$1.d() && $$2 instanceof clh $$7) {
            $$7.ga().h($$1);
         }

         return $$6;
      }
   }
}
