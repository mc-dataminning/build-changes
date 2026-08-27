import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fnf {
   private final List<fmz> a;
   private final fmy b;
   private final Map<String, fnf> c = Maps.newHashMap();

   fnf(List<fmz> $$0, fmy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fnf a(String $$0, fnb $$1, fmy $$2) {
      fnf $$3 = new fnf($$1.b(), $$2);
      fnf $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fmw a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fmw> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fnf)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fmw.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fmw $$4 = new fmw($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fnf a(String $$0) {
      return this.c.get($$0);
   }
}
