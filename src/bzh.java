import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzh<T extends btc> extends caa {
   protected final btl a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected eox d;
   protected final cco e;
   protected final Class<T> f;
   protected final Predicate<btc> g;
   protected final Predicate<btc> h;
   private final cdt k;

   public bzh(btl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bsm.e::test);
   }

   public bzh(btl $$0, Class<T> $$1, Predicate<btc> $$2, float $$3, double $$4, double $$5, Predicate<btc> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.J();
      this.a(EnumSet.of(caa.a.a));
      this.k = cdt.a().a((double)$$3).a($$6.and($$2));
   }

   public bzh(btl $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<btc> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .dR()
         .a(this.a.dR().a(this.f, this.a.cM().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.dw(), this.a.dy(), this.a.dC());
      if (this.b == null) {
         return false;
      } else {
         ewh $$0 = cdx.a(this.a, 16, 7, this.b.dp());
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
      if (this.a.g((bsh)this.b) < 49.0) {
         this.a.J().a(this.j);
      } else {
         this.a.J().a(this.i);
      }
   }
}
