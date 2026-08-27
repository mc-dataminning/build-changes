import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class fib {
   private final List<fhv> a;
   private final fhu b;
   private final Map<String, fib> c = Maps.newHashMap();

   fib(List<fhv> $$0, fhu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public fib a(String $$0, fhx $$1, fhu $$2) {
      fib $$3 = new fib($$1.b(), $$2);
      fib $$4 = this.c.put($$0, $$3);
      if ($$4 != null) {
         $$3.c.putAll($$4.c);
      }

      return $$3;
   }

   public fhs a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, fhs> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((fib)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<fhs.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).collect(ImmutableList.toImmutableList());
      fhs $$4 = new fhs($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public fib a(String $$0) {
      return this.c.get($$0);
   }
}
