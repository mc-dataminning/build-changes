import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eue<T>(alh<kd<T>> d, Codec<T> e, eue.a<T> f) {
   public static final eue<exn> a = new eue<>(lz.bf, exn.e, e());
   public static final eue<evq> b = new eue<>(lz.be, evs.c, e());
   public static final eue<euh> c = new eue<>(lz.bd, euh.d, f());

   public void a(eui $$0, alh<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<eue<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eud> eue.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eue.a<euh> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alh<kd<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public eue.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eui var1, alh<T> var2, T var3);
   }
}
