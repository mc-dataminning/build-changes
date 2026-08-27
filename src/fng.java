import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fng {
   private final List<fna> a;
   private final fmz b;
   private final Map<String, fng> c = Maps.newHashMap();

   fng(List<fna> $$0, fmz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fng a(String $$0, fnc $$1, fmz $$2) {
      fng $$3 = new fng($$1.b(), $$2);
      fng $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fmx a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fmx> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fng)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fmx.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fmx $$4 = new fmx($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fng a(String $$0) {
      return this.c.get($$0);
   }
}
