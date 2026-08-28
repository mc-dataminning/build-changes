import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cwb implements cvz {
   a(awl.bN, 59, 2.0F, 0.0F, 15, () -> cyn.a(awu.b)),
   b(awl.bL, 131, 4.0F, 1.0F, 5, () -> cyn.a(awu.aY)),
   c(awl.bK, 250, 6.0F, 2.0F, 14, () -> cyn.a(cun.oE)),
   d(awl.bJ, 1561, 8.0F, 3.0F, 10, () -> cyn.a(cun.oy)),
   e(awl.bM, 32, 12.0F, 0.0F, 22, () -> cyn.a(cun.oI)),
   f(awl.bI, 2031, 9.0F, 4.0F, 15, () -> cyn.a(cun.oJ));

   private final axb<deu> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyn> l;

   private cwb(final axb<deu> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyn> $$5) {
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
   public axb<deu> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyn f() {
      return this.l.get();
   }
}
