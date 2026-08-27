import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brn<T extends bll> extends bsg {
   protected final blu a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected edm d;
   protected final buu e;
   protected final Class<T> f;
   protected final Predicate<bll> g;
   protected final Predicate<bll> h;
   private final bvx k;

   public brn(blu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bky.e::test);
   }

   public brn(blu $$0, Class<T> $$1, Predicate<bll> $$2, float $$3, double $$4, double $$5, Predicate<bll> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.N();
      this.a(EnumSet.of(bsg.a.a));
      this.k = bvx.a().a((double)$$3).a($$6.and($$2));
   }

   public brn(blu $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bll> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dN()
         .a(this.a.dN().a(this.f, this.a.cH().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.ds(), this.a.du(), this.a.dy());
      if (this.b == null) {
         return false;
      } else {
         ejz $$0 = bwb.a(this.a, 16, 7, this.b.dl());
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
      if (this.a.f((bkv)this.b) < 49.0) {
         this.a.N().a(this.j);
      } else {
         this.a.N().a(this.i);
      }
   }
}
