import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fin {
   private final List<fih> a;
   private final fig b;
   private final Map<String, fin> c = Maps.newHashMap();

   fin(List<fih> $$0, fig $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fin a(String $$0, fij $$1, fig $$2) {
      fin $$3 = new fin($$1.b(), $$2);
      fin $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fie a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fie> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fin)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fie.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fie $$4 = new fie($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fin a(String $$0) {
      return this.c.get($$0);
   }
}
