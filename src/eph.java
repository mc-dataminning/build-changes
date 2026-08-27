import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eph<T>(akl<jk<T>> d, Codec<T> e, String f, eph.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eph<esl> a = new eph<>(lf.aW, esn.a, "predicates", f());
   public static final eph<eqr> b = new eph<>(lf.aV, eqt.c, "item_modifiers", f());
   public static final eph<epk> c = new eph<>(lf.aU, epk.d, "loot_tables", g());

   public void a(epl $$0, akl<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akm $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eph<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends epg> eph.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eph.a<epk> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akl<jk<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public eph.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(epl var1, akl<T> var2, T var3);
   }
}
