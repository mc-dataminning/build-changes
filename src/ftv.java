import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ftv {
   private final List<ftp> a;
   private final fto b;
   private final Map<String, ftv> c = Maps.newHashMap();

   ftv(List<ftp> $$0, fto $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ftv a(String $$0, ftr $$1, fto $$2) {
      ftv $$3 = new ftv($$1.b(), $$2);
      ftv $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public ftm a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, ftm> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((ftv)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<ftm.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      ftm $$4 = new ftm($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public ftv a(String $$0) {
      return this.c.get($$0);
   }
}
