import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cmc {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cmc c = a("empty").a(0, cma.b).a();
   public static final cmc d = a("simple").a(5000, cma.c).a(11000, cma.e).a();
   public static final cmc e = a("villager_baby").a(10, cma.b).a(3000, cma.d).a(6000, cma.b).a(10000, cma.d).a(12000, cma.e).a();
   public static final cmc f = a("villager_default").a(10, cma.b).a(2000, cma.c).a(9000, cma.f).a(11000, cma.b).a(12000, cma.e).a();
   private final Map<cma, cme> g = Maps.newHashMap();

   protected static cmd a(String $$0) {
      cmc $$1 = ji.a(lc.D, $$0, new cmc());
      return new cmd($$1);
   }

   protected void a(cma $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cme());
      }
   }

   protected cme b(cma $$0) {
      return this.g.get($$0);
   }

   protected List<cme> c(cma $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cma a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cma.b);
   }
}
