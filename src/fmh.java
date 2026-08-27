import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fmh {
   private final List<fmb> a;
   private final fma b;
   private final Map<String, fmh> c = Maps.newHashMap();

   fmh(List<fmb> $$0, fma $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fmh a(String $$0, fmd $$1, fma $$2) {
      fmh $$3 = new fmh($$1.b(), $$2);
      fmh $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fly a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fly> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fmh)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fly.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fly $$4 = new fly($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fmh a(String $$0) {
      return this.c.get($$0);
   }
}
