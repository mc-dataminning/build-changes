import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fjf {
   private final List<fiz> a;
   private final fiy b;
   private final Map<String, fjf> c = Maps.newHashMap();

   fjf(List<fiz> $$0, fiy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fjf a(String $$0, fjb $$1, fiy $$2) {
      fjf $$3 = new fjf($$1.b(), $$2);
      fjf $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fiw a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fiw> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fjf)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fiw.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fiw $$4 = new fiw($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fjf a(String $$0) {
      return this.c.get($$0);
   }
}
