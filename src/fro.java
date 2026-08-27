import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fro {
   private final List<fri> a;
   private final frh b;
   private final Map<String, fro> c = Maps.newHashMap();

   fro(List<fri> $$0, frh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fro a(String $$0, frk $$1, frh $$2) {
      fro $$3 = new fro($$1.b(), $$2);
      fro $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public frf a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, frf> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fro)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<frf.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      frf $$4 = new frf($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fro a(String $$0) {
      return this.c.get($$0);
   }
}
