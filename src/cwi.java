import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cwi implements cwg {
   a(awd.bN, 59, 2.0F, 0.0F, 15, () -> cyu.a(awm.b)),
   b(awd.bL, 131, 4.0F, 1.0F, 5, () -> cyu.a(awm.aX)),
   c(awd.bK, 250, 6.0F, 2.0F, 14, () -> cyu.a(cur.oF)),
   d(awd.bJ, 1561, 8.0F, 3.0F, 10, () -> cyu.a(cur.oz)),
   e(awd.bM, 32, 12.0F, 0.0F, 22, () -> cyu.a(cur.oJ)),
   f(awd.bI, 2031, 9.0F, 4.0F, 15, () -> cyu.a(cur.oK));

   private final awt<dfw> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyu> l;

   private cwi(final awt<dfw> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyu> $$5) {
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
   public awt<dfw> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyu f() {
      return this.l.get();
   }
}
