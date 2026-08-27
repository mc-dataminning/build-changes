import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmc<T extends bfz> extends bmv {
   protected final bgi a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected dxt d;
   protected final bpj e;
   protected final Class<T> f;
   protected final Predicate<bfz> g;
   protected final Predicate<bfz> h;
   private final bqm k;

   public bmc(bgi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bfm.e::test);
   }

   public bmc(bgi $$0, Class<T> $$1, Predicate<bfz> $$2, float $$3, double $$4, double $$5, Predicate<bfz> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.J();
      this.a(EnumSet.of(bmv.a.a));
      this.k = bqm.a().a((double)$$3).a($$6.and($$2));
   }

   public bmc(bgi $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bfz> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dI()
         .a(this.a.dI().a(this.f, this.a.cE().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dn(), this.a.dp(), this.a.dt());
      if (this.b == null) {
         return false;
      } else {
         eei $$0 = bqq.a(this.a, 16, 7, this.b.dg());
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
      if (this.a.f((bfj)this.b) < 49.0) {
         this.a.J().a(this.j);
      } else {
         this.a.J().a(this.i);
      }
   }
}
