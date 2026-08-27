import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fns {
   private final List<fnm> a;
   private final fnl b;
   private final Map<String, fns> c = Maps.newHashMap();

   fns(List<fnm> $$0, fnl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fns a(String $$0, fno $$1, fnl $$2) {
      fns $$3 = new fns($$1.b(), $$2);
      fns $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fnj a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fnj> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fns)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fnj.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fnj $$4 = new fnj($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fns a(String $$0) {
      return this.c.get($$0);
   }
}
