import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzp<T extends btk> extends cai {
   protected final btt a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected eoe d;
   protected final ccw e;
   protected final Class<T> f;
   protected final Predicate<btk> g;
   protected final Predicate<btk> h;
   private final ceb k;

   public bzp(btt $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bsu.e::test);
   }

   public bzp(btt $$0, Class<T> $$1, Predicate<btk> $$2, float $$3, double $$4, double $$5, Predicate<btk> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.K();
      this.a(EnumSet.of(cai.a.a));
      this.k = ceb.a().a((double)$$3).a($$6.and($$2));
   }

   public bzp(btt $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<btk> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dP()
         .a(this.a.dP().a(this.f, this.a.cK().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.du(), this.a.dw(), this.a.dA());
      if (this.b == null) {
         return false;
      } else {
         evm $$0 = cef.a(this.a, 16, 7, this.b.dn());
         if ($$0 == null) {
            return false;
         } else if (this.b.i($$0.c, $$0.d, $$0.e) < this.b.g(this.a)) {
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
      if (this.a.g((bsp)this.b) < 49.0) {
         this.a.K().a(this.j);
      } else {
         this.a.K().a(this.i);
      }
   }
}
