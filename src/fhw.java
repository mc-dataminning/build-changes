import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fhw {
   private final List<fhq> a;
   private final fhp b;
   private final Map<String, fhw> c = Maps.newHashMap();

   fhw(List<fhq> $$0, fhp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fhw a(String $$0, fhs $$1, fhp $$2) {
      fhw $$3 = new fhw($$1.b(), $$2);
      fhw $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fhn a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fhn> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fhw)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fhn.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fhn $$4 = new fhn($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fhw a(String $$0) {
      return this.c.get($$0);
   }
}
