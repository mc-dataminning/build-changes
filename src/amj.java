import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amj {
   private static final Logger a = LogUtils.getLogger();
   private static final Codec<Map<alg, ami.a>> b = Codec.unboundedMap(alg.a, ami.a.a);
   private final Map<alg, ami> c = Maps.newHashMap();

   @Nullable
   public ami a(alg $$0) {
      return this.c.get($$0);
   }

   public ami a(alg $$0, wy $$1) {
      ami $$2 = new ami($$0, $$1);
      this.c.put($$0, $$2);
      return $$2;
   }

   public void a(ami $$0) {
      this.c.remove($$0.a());
   }

   public Collection<alg> a() {
      return this.c.keySet();
   }

   public Collection<ami> b() {
      return this.c.values();
   }

   public tz a(jh.a $$0) {
      Map<alg, ami.a> $$1 = ag.a(this.c, ami::f);
      return (tz)b.encodeStart($$0.a(un.a), $$1).getOrThrow();
   }

   public void a(tz $$0, jh.a $$1) {
      Map<alg, ami.a> $$2 = b.parse($$1.a(un.a), $$0).resultOrPartial($$0x -> a.error("Failed to parse boss bar events: {}", $$0x)).orElse(Map.of());
      $$2.forEach(($$0x, $$1x) -> this.c.put($$0x, ami.a($$0x, $$1x)));
   }

   public void a(arr $$0) {
      for (ami $$1 : this.c.values()) {
         $$1.c($$0);
      }
   }

   public void b(arr $$0) {
      for (ami $$1 : this.c.values()) {
         $$1.d($$0);
      }
   }
}
