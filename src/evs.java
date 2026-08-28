import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record evs<T>(aku<ke<T>> d, Codec<T> e, evs.a<T> f) {
   public static final evs<eyz> a = new evs<>(mc.bi, eyz.e, e());
   public static final evs<exe> b = new evs<>(mc.bh, exg.c, e());
   public static final evs<evv> c = new evs<>(mc.bg, evv.d, f());

   public void a(evw $$0, aku<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<evs<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends evr> evs.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static evs.a<evv> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aku<ke<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public evs.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(evw var1, aku<T> var2, T var3);
   }
}
