import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record esv<T>(ala<ka<T>> d, Codec<T> e, esv.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final esv<ewe> a = new esv<>(lv.be, ewe.e, e());
   public static final esv<euh> b = new esv<>(lv.bd, euj.c, e());
   public static final esv<esy> c = new esv<>(lv.bc, esy.d, f());

   public void a(esz $$0, ala<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(alb $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<esv<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends esu> esv.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static esv.a<esy> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ala<ka<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public esv.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(esz var1, ala<T> var2, T var3);
   }
}
