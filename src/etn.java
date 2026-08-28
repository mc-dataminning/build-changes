import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record etn<T>(ald<kb<T>> d, Codec<T> e, etn.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final etn<eww> a = new etn<>(lw.bg, eww.e, e());
   public static final etn<euz> b = new etn<>(lw.bf, evb.c, e());
   public static final etn<etq> c = new etn<>(lw.be, etq.d, f());

   public void a(etr $$0, ald<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ale $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<etn<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends etm> etn.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static etn.a<etq> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ald<kb<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public etn.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(etr var1, ald<T> var2, T var3);
   }
}
