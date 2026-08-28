import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aml {
   private static final Logger a = LogUtils.getLogger();
   private static final Codec<Map<ali, amk.a>> b = Codec.unboundedMap(ali.a, amk.a.a);
   private final Map<ali, amk> c = Maps.newHashMap();

   @Nullable
   public amk a(ali $$0) {
      return this.c.get($$0);
   }

   public amk a(ali $$0, xa $$1) {
      amk $$2 = new amk($$0, $$1);
      this.c.put($$0, $$2);
      return $$2;
   }

   public void a(amk $$0) {
      this.c.remove($$0.a());
   }

   public Collection<ali> a() {
      return this.c.keySet();
   }

   public Collection<amk> b() {
      return this.c.values();
   }

   public tz a(jh.a $$0) {
      Map<ali, amk.a> $$1 = ag.a(this.c, amk::f);
      return (tz)b.encodeStart($$0.a(un.a), $$1).getOrThrow();
   }

   public void a(tz $$0, jh.a $$1) {
      Map<ali, amk.a> $$2 = b.parse($$1.a(un.a), $$0).resultOrPartial($$0x -> a.error("Failed to parse boss bar events: {}", $$0x)).orElse(Map.of());
      $$2.forEach(($$0x, $$1x) -> this.c.put($$0x, amk.a($$0x, $$1x)));
   }

   public void a(art $$0) {
      for (amk $$1 : this.c.values()) {
         $$1.c($$0);
      }
   }

   public void b(art $$0) {
      for (amk $$1 : this.c.values()) {
         $$1.d($$0);
      }
   }
}
