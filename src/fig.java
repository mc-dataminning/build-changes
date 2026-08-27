import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fig {
   private final List<fia> a;
   private final fhz b;
   private final Map<String, fig> c = Maps.newHashMap();

   fig(List<fia> $$0, fhz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fig a(String $$0, fic $$1, fhz $$2) {
      fig $$3 = new fig($$1.b(), $$2);
      fig $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fhx a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fhx> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fig)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fhx.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fhx $$4 = new fhx($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fig a(String $$0) {
      return this.c.get($$0);
   }
}
