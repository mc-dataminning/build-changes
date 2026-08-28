import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cwf implements cwd {
   a(awo.bN, 59, 2.0F, 0.0F, 15, () -> cyr.a(awx.b)),
   b(awo.bL, 131, 4.0F, 1.0F, 5, () -> cyr.a(awx.aY)),
   c(awo.bK, 250, 6.0F, 2.0F, 14, () -> cyr.a(cur.oE)),
   d(awo.bJ, 1561, 8.0F, 3.0F, 10, () -> cyr.a(cur.oy)),
   e(awo.bM, 32, 12.0F, 0.0F, 22, () -> cyr.a(cur.oI)),
   f(awo.bI, 2031, 9.0F, 4.0F, 15, () -> cyr.a(cur.oJ));

   private final axe<dey> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyr> l;

   private cwf(final axe<dey> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyr> $$5) {
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
   public axe<dey> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyr f() {
      return this.l.get();
   }
}
