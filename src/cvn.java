import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvn extends cul {
   public static final Predicate<cuq> c = $$0 -> $$0.a(awn.aT);
   public static final Predicate<cuq> j = c.or($$0 -> $$0.a(cut.uu));

   public cvn(cul.a $$0) {
      super($$0);
   }

   public Predicate<cuq> d() {
      return this.b();
   }

   public abstract Predicate<cuq> b();

   public static cuq a(btn $$0, Predicate<cuq> $$1) {
      if ($$1.test($$0.b(bqq.b))) {
         return $$0.b(bqq.b);
      } else {
         return $$1.test($$0.b(bqq.a)) ? $$0.b(bqq.a) : cuq.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(aqu $$0, btn $$1, bqq $$2, cuq $$3, List<cuq> $$4, float $$5, float $$6, boolean $$7, @Nullable btn $$8) {
      float $$9 = dae.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuq $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            cnp $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
            $$3.a(this.j($$14), $$1, btn.d($$2));
            if ($$3.e()) {
               break;
            }
         }
      }
   }

   protected int j(cuq $$0) {
      return 1;
   }

   protected abstract void a(btn var1, cnp var2, int var3, float var4, float var5, float var6, @Nullable btn var7);

   protected cnp a(dcw $$0, btn $$1, cuq $$2, cuq $$3, boolean $$4) {
      csj $$6 = $$3.g() instanceof csj $$5 ? $$5 : (csj)cut.ow;
      cnd $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cuq> a(cuq $$0, cuq $$1, btn $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$4 = $$2.dO() instanceof aqu $$3 ? dae.a($$3, $$0, $$2, 1) : 1;
         List<cuq> $$5 = new ArrayList<>($$4);
         cuq $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cuq $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.e()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cuq a(cuq $$0, cuq $$1, btn $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fL() && $$2.dO() instanceof aqu $$4 ? dae.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.H()) {
         return cuq.l;
      } else if ($$5 == 0) {
         cuq $$6 = $$1.c(1);
         $$6.b(kq.u, azs.a);
         return $$6;
      } else {
         cuq $$7 = $$1.a($$5);
         if ($$1.e() && $$2 instanceof cmx $$8) {
            $$8.fY().h($$1);
         }

         return $$7;
      }
   }
}
