import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cgp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cgp c = a("empty").a(0, cgn.b).a();
   public static final cgp d = a("simple").a(5000, cgn.c).a(11000, cgn.e).a();
   public static final cgp e = a("villager_baby").a(10, cgn.b).a(3000, cgn.d).a(6000, cgn.b).a(10000, cgn.d).a(12000, cgn.e).a();
   public static final cgp f = a("villager_default").a(10, cgn.b).a(2000, cgn.c).a(9000, cgn.f).a(11000, cgn.b).a(12000, cgn.e).a();
   private final Map<cgn, cgr> g = Maps.newHashMap();

   protected static cgq a(String $$0) {
      cgp $$1 = it.a(kd.D, $$0, new cgp());
      return new cgq($$1);
   }

   protected void a(cgn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cgr());
      }
   }

   protected cgr b(cgn $$0) {
      return this.g.get($$0);
   }

   protected List<cgr> c(cgn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cgn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cgn.b);
   }
}
