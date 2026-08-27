import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public enum ass {
   a(ayp.a),
   b(ayp.b),
   c(ayp.c),
   d(ayp.d),
   e(ayp.e),
   f(ayp.f),
   g(ayp.g),
   h(ayp.h),
   i(ayp.i),
   j(ayp.j),
   k(ayp.k),
   l(ayp.l),
   m(ayp.m),
   n(ayp.o),
   o(ayp.n),
   p(ayp.p),
   q(ayp.q),
   r(ayp.I),
   s(ayp.r);

   public static final Set<TypeReference> t;
   private final TypeReference u;

   private ass(TypeReference $$0) {
      this.u = $$0;
   }

   private static int a() {
      return aa.b().d().c();
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
      return $$0.update(this.u, $$1, $$2, $$3);
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   public qr a(DataFixer $$0, qr $$1, int $$2, int $$3) {
      return (qr)this.a($$0, new Dynamic(rc.a, $$1), $$2, $$3).getValue();
   }

   public qr a(DataFixer $$0, qr $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      t = Set.of(a.u);
   }
}
