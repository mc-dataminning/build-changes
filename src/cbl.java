import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbl<T extends bvg> extends cce {
   protected final bvo a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected etn d;
   protected final ces e;
   protected final Class<T> f;
   protected final Predicate<bvg> g;
   protected final Predicate<bvg> h;
   private final cfx k;

   public cbl(bvo $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bup.e::test);
   }

   public cbl(bvo $$0, Class<T> $$1, Predicate<bvg> $$2, float $$3, double $$4, double $$5, Predicate<bvg> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.L();
      this.a(EnumSet.of(cce.a.a));
      this.k = cfx.a().a((double)$$3).a(($$2x, $$3x) -> $$6.test($$2x) && $$2.test($$2x));
   }

   public cbl(bvo $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bvg> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = a(this.a)
         .a(this.a.dW().a(this.f, this.a.cR().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dB(), this.a.dD(), this.a.dH());
      if (this.b == null) {
         return false;
      } else {
         fba $$0 = cgb.a(this.a, 16, 7, this.b.du());
         if ($$0 == null) {
            return false;
         } else if (this.b.i($$0.d, $$0.e, $$0.f) < this.b.g(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.d, $$0.e, $$0.f, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return !this.e.k();
   }

   @Override
   public void d() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void e() {
      this.b = null;
   }

   @Override
   public void a() {
      if (this.a.g((buk)this.b) < 49.0) {
         this.a.L().a(this.j);
      } else {
         this.a.L().a(this.i);
      }
   }
}
