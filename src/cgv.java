import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cgv {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cgv c = a("empty").a(0, cgt.b).a();
   public static final cgv d = a("simple").a(5000, cgt.c).a(11000, cgt.e).a();
   public static final cgv e = a("villager_baby").a(10, cgt.b).a(3000, cgt.d).a(6000, cgt.b).a(10000, cgt.d).a(12000, cgt.e).a();
   public static final cgv f = a("villager_default").a(10, cgt.b).a(2000, cgt.c).a(9000, cgt.f).a(11000, cgt.b).a(12000, cgt.e).a();
   private final Map<cgt, cgx> g = Maps.newHashMap();

   protected static cgw a(String $$0) {
      cgv $$1 = it.a(kd.D, $$0, new cgv());
      return new cgw($$1);
   }

   protected void a(cgt $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cgx());
      }
   }

   protected cgx b(cgt $$0) {
      return this.g.get($$0);
   }

   protected List<cgx> c(cgt $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cgt a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cgt.b);
   }
}
