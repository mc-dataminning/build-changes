import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ety<T>(alg<kc<T>> d, Codec<T> e, ety.a<T> f) {
   public static final ety<exh> a = new ety<>(ly.bf, exh.e, e());
   public static final ety<evk> b = new ety<>(ly.be, evm.c, e());
   public static final ety<eub> c = new ety<>(ly.bd, eub.d, f());

   public void a(euc $$0, alg<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ety<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends etx> ety.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ety.a<eub> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alg<kc<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ety.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(euc var1, alg<T> var2, T var3);
   }
}
