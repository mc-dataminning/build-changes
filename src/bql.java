import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bql<T extends bkj> extends bre {
   protected final bks a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected ebt d;
   protected final bts e;
   protected final Class<T> f;
   protected final Predicate<bkj> g;
   protected final Predicate<bkj> h;
   private final buv k;

   public bql(bks $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bjw.e::test);
   }

   public bql(bks $$0, Class<T> $$1, Predicate<bkj> $$2, float $$3, double $$4, double $$5, Predicate<bkj> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.L();
      this.a(EnumSet.of(bre.a.a));
      this.k = buv.a().a((double)$$3).a($$6.and($$2));
   }

   public bql(bks $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bkj> $$5) {
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
         eif $$0 = buz.a(this.a, 16, 7, this.b.dj());
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
      if (this.a.f((bjt)this.b) < 49.0) {
         this.a.L().a(this.j);
      } else {
         this.a.L().a(this.i);
      }
   }
}
