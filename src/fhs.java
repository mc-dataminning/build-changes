import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fhs {
   private final List<fhm> a;
   private final fhl b;
   private final Map<String, fhs> c = Maps.newHashMap();

   fhs(List<fhm> $$0, fhl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fhs a(String $$0, fho $$1, fhl $$2) {
      fhs $$3 = new fhs($$1.b(), $$2);
      fhs $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fhj a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fhj> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fhs)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fhj.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fhj $$4 = new fhj($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fhs a(String $$0) {
      return this.c.get($$0);
   }
}
