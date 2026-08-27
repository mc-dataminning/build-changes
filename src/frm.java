import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class frm {
   private final List<frg> a;
   private final frf b;
   private final Map<String, frm> c = Maps.newHashMap();

   frm(List<frg> $$0, frf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public frm a(String $$0, fri $$1, frf $$2) {
      frm $$3 = new frm($$1.b(), $$2);
      frm $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public frd a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, frd> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((frm)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<frd.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      frd $$4 = new frd($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public frm a(String $$0) {
      return this.c.get($$0);
   }
}
