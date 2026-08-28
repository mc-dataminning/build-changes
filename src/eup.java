import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eup<T>(ali<kd<T>> d, Codec<T> e, eup.a<T> f) {
   public static final eup<exy> a = new eup<>(ma.bf, exy.e, e());
   public static final eup<ewb> b = new eup<>(ma.be, ewd.c, e());
   public static final eup<eus> c = new eup<>(ma.bd, eus.d, f());

   public void a(eut $$0, ali<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<eup<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends euo> eup.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eup.a<eus> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ali<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public eup.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eut var1, ali<T> var2, T var3);
   }
}
