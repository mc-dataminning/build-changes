import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;

public enum ayq {
   a(bfa.a),
   b(bfa.b),
   c(bfa.c),
   d(bfa.d),
   e(bfa.e),
   f(bfa.f),
   g(bfa.g),
   h(bfa.h),
   i(bfa.i),
   j(bfa.j),
   k(bfa.k),
   l(bfa.l),
   m(bfa.m),
   n(bfa.o),
   o(bfa.n),
   p(bfa.p),
   q(bfa.q),
   r(bfa.K),
   s(bfa.r);

   public static final Set<TypeReference> t;
   private final TypeReference u;

   private ayq(TypeReference $$0) {
      this.u = $$0;
   }

   static int a() {
      return aa.b().d().c();
   }

   public <A> Codec<A> a(final Codec<A> $$0, final DataFixer $$1, final int $$2) {
      return new Codec<A>() {
         public <T> DataResult<T> encode(A $$0x, DynamicOps<T> $$1x, T $$2x) {
            return $$0.encode($$0, $$1, $$2).flatMap($$1xxx -> $$1.mergeToMap($$1xxx, $$1.createString("DataVersion"), $$1.createInt(ayq.a())));
         }

         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            int $$2 = $$0.get($$1, "DataVersion").flatMap($$0::getNumberValue).map(Number::intValue).result().orElse($$2);
            Dynamic<T> $$3 = new Dynamic($$0, $$0.remove($$1, "DataVersion"));
            Dynamic<T> $$4 = ayq.this.a($$1, $$3, $$2);
            return $$0.decode($$4);
         }
      };
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2, int $$3) {
      return $$0.update(this.u, $$1, $$2, $$3);
   }

   public <T> Dynamic<T> a(DataFixer $$0, Dynamic<T> $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   public tm a(DataFixer $$0, tm $$1, int $$2, int $$3) {
      return (tm)this.a($$0, new Dynamic(ua.a, $$1), $$2, $$3).getValue();
   }

   public tm a(DataFixer $$0, tm $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      t = Set.of(a.u);
   }
}
