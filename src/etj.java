import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record etj<T>(alb<ka<T>> d, Codec<T> e, etj.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final etj<ews> a = new etj<>(lv.bf, ews.e, e());
   public static final etj<euv> b = new etj<>(lv.be, eux.c, e());
   public static final etj<etm> c = new etj<>(lv.bd, etm.d, f());

   public void a(etn $$0, alb<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(alc $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<etj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eti> etj.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static etj.a<etm> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alb<ka<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public etj.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(etn var1, alb<T> var2, T var3);
   }
}
