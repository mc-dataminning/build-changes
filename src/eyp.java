import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eyp<T>(ald<jr<T>> d, Codec<T> e, eyp.a<T> f) {
   public static final eyp<fbw> a = new eyp<>(mg.bq, fbw.e, e());
   public static final eyp<fab> b = new eyp<>(mg.bp, fad.c, e());
   public static final eyp<eys> c = new eyp<>(mg.bo, eys.d, f());

   public void a(eyt $$0, ald<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<eyp<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eyo> eyp.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eyp.a<eys> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ald<jr<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public eyp.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eyt var1, ald<T> var2, T var3);
   }
}
