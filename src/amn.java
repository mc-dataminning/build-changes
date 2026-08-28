import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amn {
   private static final Logger a = LogUtils.getLogger();
   private static final Codec<Map<alk, amm.a>> b = Codec.unboundedMap(alk.a, amm.a.a);
   private final Map<alk, amm> c = Maps.newHashMap();

   @Nullable
   public amm a(alk $$0) {
      return this.c.get($$0);
   }

   public amm a(alk $$0, xc $$1) {
      amm $$2 = new amm($$0, $$1);
      this.c.put($$0, $$2);
      return $$2;
   }

   public void a(amm $$0) {
      this.c.remove($$0.a());
   }

   public Collection<alk> a() {
      return this.c.keySet();
   }

   public Collection<amm> b() {
      return this.c.values();
   }

   public ua a(ji.a $$0) {
      Map<alk, amm.a> $$1 = ag.a(this.c, amm::f);
      return (ua)b.encodeStart($$0.a(uo.a), $$1).getOrThrow();
   }

   public void a(ua $$0, ji.a $$1) {
      Map<alk, amm.a> $$2 = b.parse($$1.a(uo.a), $$0).resultOrPartial($$0x -> a.error("Failed to parse boss bar events: {}", $$0x)).orElse(Map.of());
      $$2.forEach(($$0x, $$1x) -> this.c.put($$0x, amm.a($$0x, $$1x)));
   }

   public void a(arv $$0) {
      for (amm $$1 : this.c.values()) {
         $$1.c($$0);
      }
   }

   public void b(arv $$0) {
      for (amm $$1 : this.c.values()) {
         $$1.d($$0);
      }
   }
}
