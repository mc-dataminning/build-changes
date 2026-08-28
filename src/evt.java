import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record evt<T>(akt<ke<T>> d, Codec<T> e, evt.a<T> f) {
   public static final evt<eza> a = new evt<>(mc.bi, eza.e, e());
   public static final evt<exf> b = new evt<>(mc.bh, exh.c, e());
   public static final evt<evw> c = new evt<>(mc.bg, evw.d, f());

   public void a(evx $$0, akt<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<evt<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends evs> evt.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static evt.a<evw> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akt<ke<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public evt.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(evx var1, akt<T> var2, T var3);
   }
}
