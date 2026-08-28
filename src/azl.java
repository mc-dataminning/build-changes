import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Set;

public enum azl {
   a(bgd.a),
   b(bgd.b),
   c(bgd.c),
   d(bgd.d),
   e(bgd.e),
   f(bgd.f),
   g(bgd.g),
   h(bgd.h),
   i(bgd.i),
   j(bgd.j),
   k(bgd.k),
   l(bgd.l),
   m(bgd.m),
   n(bgd.o),
   o(bgd.n),
   p(bgd.p),
   q(bgd.q),
   r(bgd.M),
   s(bgd.r);

   public static final Set<TypeReference> t;
   private final TypeReference u;

   private azl(final TypeReference $$0) {
      this.u = $$0;
   }

   static int a() {
      return aa.b().d().c();
   }

   public <A> Codec<A> a(final Codec<A> $$0, final DataFixer $$1, final int $$2) {
      return new Codec<A>() {
         public <T> DataResult<T> encode(A $$0x, DynamicOps<T> $$1x, T $$2x) {
            return $$0.encode($$0, $$1, $$2).flatMap($$1xxx -> $$1.mergeToMap($$1xxx, $$1.createString("DataVersion"), $$1.createInt(azl.a())));
         }

         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            int $$2 = $$0.get($$1, "DataVersion").flatMap($$0::getNumberValue).map(Number::intValue).result().orElse($$2);
            Dynamic<T> $$3 = new Dynamic($$0, $$0.remove($$1, "DataVersion"));
            Dynamic<T> $$4 = azl.this.a($$1, $$3, $$2);
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

   public tx a(DataFixer $$0, tx $$1, int $$2, int $$3) {
      return (tx)this.a($$0, new Dynamic(ul.a, $$1), $$2, $$3).getValue();
   }

   public tx a(DataFixer $$0, tx $$1, int $$2) {
      return this.a($$0, $$1, $$2, a());
   }

   static {
      t = Set.of(a.u);
   }
}
