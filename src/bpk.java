import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpk<T extends bji> extends bqd {
   protected final bjr a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected ebd d;
   protected final bsr e;
   protected final Class<T> f;
   protected final Predicate<bji> g;
   protected final Predicate<bji> h;
   private final btu k;

   public bpk(bjr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, biv.e::test);
   }

   public bpk(bjr $$0, Class<T> $$1, Predicate<bji> $$2, float $$3, double $$4, double $$5, Predicate<bji> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.L();
      this.a(EnumSet.of(bqd.a.a));
      this.k = btu.a().a((double)$$3).a($$6.and($$2));
   }

   public bpk(bjr $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bji> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dL()
         .a(this.a.dL().a(this.f, this.a.cG().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dq(), this.a.ds(), this.a.dw());
      if (this.b == null) {
         return false;
      } else {
         ehp $$0 = bty.a(this.a, 16, 7, this.b.dj());
         if ($$0 == null) {
            return false;
         } else if (this.b.i($$0.c, $$0.d, $$0.e) < this.b.f(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.c, $$0.d, $$0.e, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.e.l();
   }

   @Override
   public void c() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public void e() {
      if (this.a.f((bis)this.b) < 49.0) {
         this.a.L().a(this.j);
      } else {
         this.a.L().a(this.i);
      }
   }
}
