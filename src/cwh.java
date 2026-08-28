import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cwh implements cwf {
   a(awp.bN, 59, 2.0F, 0.0F, 15, () -> cyt.a(awy.b)),
   b(awp.bL, 131, 4.0F, 1.0F, 5, () -> cyt.a(awy.aY)),
   c(awp.bK, 250, 6.0F, 2.0F, 14, () -> cyt.a(cut.oE)),
   d(awp.bJ, 1561, 8.0F, 3.0F, 10, () -> cyt.a(cut.oy)),
   e(awp.bM, 32, 12.0F, 0.0F, 22, () -> cyt.a(cut.oI)),
   f(awp.bI, 2031, 9.0F, 4.0F, 15, () -> cyt.a(cut.oJ));

   private final axf<dfa> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyt> l;

   private cwh(final axf<dfa> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyt> $$5) {
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
   public axf<dfa> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyt f() {
      return this.l.get();
   }
}
