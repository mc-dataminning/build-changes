import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fkk {
   private final List<fke> a;
   private final fkd b;
   private final Map<String, fkk> c = Maps.newHashMap();

   fkk(List<fke> $$0, fkd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fkk a(String $$0, fkg $$1, fkd $$2) {
      fkk $$3 = new fkk($$1.b(), $$2);
      fkk $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fkb a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fkb> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fkk)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fkb.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fkb $$4 = new fkb($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fkk a(String $$0) {
      return this.c.get($$0);
   }
}
