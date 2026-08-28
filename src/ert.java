import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record ert<T>(akq<jz<T>> d, Codec<T> e, ert.a<T> f) {
   private static final Logger g = LogUtils.getLogger();
   public static final ert<evc> a = new ert<>(lu.be, evc.e, e());
   public static final ert<etf> b = new ert<>(lu.bd, eth.c, e());
   public static final ert<erw> c = new ert<>(lu.bc, erw.d, f());

   public void a(erx $$0, akq<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akr $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> g.error("Couldn't parse element {}/{} - {}", new Object[]{this.d.a(), $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<ert<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ers> ert.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ert.a<erw> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akq<jz<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ert.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(erx var1, akq<T> var2, T var3);
   }
}
