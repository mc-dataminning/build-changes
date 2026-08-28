import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzr<T extends btl> extends cak {
   protected final btu a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected epm d;
   protected final ccy e;
   protected final Class<T> f;
   protected final Predicate<btl> g;
   protected final Predicate<btl> h;
   private final ced k;

   public bzr(btu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bsv.e::test);
   }

   public bzr(btu $$0, Class<T> $$1, Predicate<btl> $$2, float $$3, double $$4, double $$5, Predicate<btl> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.J();
      this.a(EnumSet.of(cak.a.a));
      this.k = ced.a().a((double)$$3).a($$6.and($$2));
   }

   public bzr(btu $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<btl> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b() {
      this.b = this.a
         .dQ()
         .a(this.a.dQ().a(this.f, this.a.cL().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dv(), this.a.dx(), this.a.dB());
      if (this.b == null) {
         return false;
      } else {
         eww $$0 = ceh.a(this.a, 16, 7, this.b.do());
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
   public boolean c() {
      return !this.e.l();
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
      if (this.a.g((bsq)this.b) < 49.0) {
         this.a.J().a(this.j);
      } else {
         this.a.J().a(this.i);
      }
   }
}
