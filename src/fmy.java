import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fmy {
   private final List<fms> a;
   private final fmr b;
   private final Map<String, fmy> c = Maps.newHashMap();

   fmy(List<fms> $$0, fmr $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmy a(String $$0, fmu $$1, fmr $$2) {
      fmy $$3 = new fmy($$1.b(), $$2);
      fmy $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fmp a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fmp> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fmy)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fmp.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fmp $$4 = new fmp($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fmy a(String $$0) {
      return this.c.get($$0);
   }
}
