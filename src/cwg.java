import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cwg implements cwe {
   a(awe.bQ, 59, 2.0F, 0.0F, 15, () -> cyv.a(awm.b)),
   b(awe.bO, 131, 4.0F, 1.0F, 5, () -> cyv.a(awm.aZ)),
   c(awe.bN, 250, 6.0F, 2.0F, 14, () -> cyv.a(cuk.pX)),
   d(awe.bM, 1561, 8.0F, 3.0F, 10, () -> cyv.a(cuk.pO)),
   e(awe.bP, 32, 12.0F, 0.0F, 22, () -> cyv.a(cuk.qb)),
   f(awe.bL, 2031, 9.0F, 4.0F, 15, () -> cyv.a(cuk.qc));

   private final awt<dfc> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyv> l;

   private cwg(awt<dfc> $$0, int $$1, float $$2, float $$3, int $$4, Supplier<cyv> $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = Suppliers.memoize($$5::get);
   }

   @Override
   public int a() {
      return this.h;
   }

   @Override
   public float b() {
      return this.i;
   }

   @Override
   public float c() {
      return this.j;
   }

   @Override
   public awt<dfc> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyv f() {
      return this.l.get();
   }
}
