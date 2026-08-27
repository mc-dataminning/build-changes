import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fil {
   private final List<fif> a;
   private final fie b;
   private final Map<String, fil> c = Maps.newHashMap();

   fil(List<fif> $$0, fie $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fil a(String $$0, fih $$1, fie $$2) {
      fil $$3 = new fil($$1.b(), $$2);
      fil $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fic a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fic> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fil)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fic.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fic $$4 = new fic($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fil a(String $$0) {
      return this.c.get($$0);
   }
}
