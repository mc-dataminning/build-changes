import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fue {
   private final List<fty> a;
   private final ftx b;
   private final Map<String, fue> c = Maps.newHashMap();

   fue(List<fty> $$0, ftx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fue a(String $$0, fua $$1, ftx $$2) {
      fue $$3 = new fue($$1.b(), $$2);
      fue $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public ftv a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, ftv> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fue)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<ftv.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      ftv $$4 = new ftv($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fue a(String $$0) {
      return this.c.get($$0);
   }
}
