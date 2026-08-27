import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record epj<T>(akm<jk<T>> d, Codec<T> e, String f, epj.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final epj<esn> a = new epj<>(lf.aW, esp.a, "predicates", f());
   public static final epj<eqt> b = new epj<>(lf.aV, eqv.c, "item_modifiers", f());
   public static final epj<epm> c = new epj<>(lf.aU, epm.d, "loot_tables", g());

   public void a(epn $$0, akm<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akn $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<epj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends epi> epj.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static epj.a<epm> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akm<jk<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public epj.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(epn var1, akm<T> var2, T var3);
   }
}
