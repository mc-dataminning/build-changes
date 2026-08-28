import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cvr implements cvp {
   a(avu.bN, 59, 2.0F, 0.0F, 15, () -> cyd.a(awd.b)),
   b(avu.bL, 131, 4.0F, 1.0F, 5, () -> cyd.a(awd.aY)),
   c(avu.bK, 250, 6.0F, 2.0F, 14, () -> cyd.a(cud.oE)),
   d(avu.bJ, 1561, 8.0F, 3.0F, 10, () -> cyd.a(cud.oy)),
   e(avu.bM, 32, 12.0F, 0.0F, 22, () -> cyd.a(cud.oI)),
   f(avu.bI, 2031, 9.0F, 4.0F, 15, () -> cyd.a(cud.oJ));

   private final awk<dff> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyd> l;

   private cvr(final awk<dff> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyd> $$5) {
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
   public awk<dff> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyd f() {
      return this.l.get();
   }
}
