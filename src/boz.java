import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boz<T extends biw> extends bps {
   protected final bjf a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected eaq d;
   protected final bsg e;
   protected final Class<T> f;
   protected final Predicate<biw> g;
   protected final Predicate<biw> h;
   private final btj k;

   public boz(bjf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bij.e::test);
   }

   public boz(bjf $$0, Class<T> $$1, Predicate<biw> $$2, float $$3, double $$4, double $$5, Predicate<biw> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.H();
      this.a(EnumSet.of(bps.a.a));
      this.k = btj.a().a((double)$$3).a($$6.and($$2));
   }

   public boz(bjf $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<biw> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dK()
         .a(this.a.dK().a(this.f, this.a.cG().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dp(), this.a.dr(), this.a.dv());
      if (this.b == null) {
         return false;
      } else {
         ehf $$0 = btn.a(this.a, 16, 7, this.b.di());
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
      if (this.a.f((big)this.b) < 49.0) {
         this.a.H().a(this.j);
      } else {
         this.a.H().a(this.i);
      }
   }
}
