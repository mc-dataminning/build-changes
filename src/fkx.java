import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fkx {
   private final List<fkr> a;
   private final fkq b;
   private final Map<String, fkx> c = Maps.newHashMap();

   fkx(List<fkr> $$0, fkq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fkx a(String $$0, fkt $$1, fkq $$2) {
      fkx $$3 = new fkx($$1.b(), $$2);
      fkx $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fko a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fko> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fkx)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fko.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fko $$4 = new fko($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fkx a(String $$0) {
      return this.c.get($$0);
   }
}
