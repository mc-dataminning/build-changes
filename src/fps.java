import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fps {
   private final List<fpm> a;
   private final fpl b;
   private final Map<String, fps> c = Maps.newHashMap();

   fps(List<fpm> $$0, fpl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fps a(String $$0, fpo $$1, fpl $$2) {
      fps $$3 = new fps($$1.b(), $$2);
      fps $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fpj a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fpj> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fps)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fpj.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fpj $$4 = new fpj($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fps a(String $$0) {
      return this.c.get($$0);
   }
}
