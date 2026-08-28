import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record evr<T>(akt<ke<T>> d, Codec<T> e, evr.a<T> f) {
   public static final evr<eyy> a = new evr<>(mc.bi, eyy.e, e());
   public static final evr<exd> b = new evr<>(mc.bh, exf.c, e());
   public static final evr<evu> c = new evr<>(mc.bg, evu.d, f());

   public void a(evv $$0, akt<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<evr<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends evq> evr.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static evr.a<evu> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akt<ke<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public evr.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(evv var1, akt<T> var2, T var3);
   }
}
