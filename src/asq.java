import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public enum asq {
   a(aym.a),
   b(aym.b),
   c(aym.c),
   d(aym.d),
   e(aym.e),
   f(aym.f),
   g(aym.g),
   h(aym.h),
   i(aym.i),
   j(aym.j),
   k(aym.k),
   l(aym.l),
   m(aym.m),
   n(aym.o),
   o(aym.n),
   p(aym.p),
   q(aym.q),
   r(aym.I),
   s(aym.r);

   public static final Set<TypeReference> t;
   private final TypeReference u;

   private asq(TypeReference $$0) {
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

   public qs a(DataFixer $$0, qs $$1, int $$2, int $$3) {
      return (qs)this.a($$0, new Dynamic(rd.a, $$1), $$2, $$3).getValue();
   }

   public qs a(DataFixer $$0, qs $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      t = Set.of(a.u);
   }
}
