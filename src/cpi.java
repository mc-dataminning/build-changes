import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cpi {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cpi c = a("empty").a(0, cpg.b).a();
   public static final cpi d = a("simple").a(5000, cpg.c).a(11000, cpg.e).a();
   public static final cpi e = a("villager_baby").a(10, cpg.b).a(3000, cpg.d).a(6000, cpg.b).a(10000, cpg.d).a(12000, cpg.e).a();
   public static final cpi f = a("villager_default").a(10, cpg.b).a(2000, cpg.c).a(9000, cpg.f).a(11000, cpg.b).a(12000, cpg.e).a();
   private final Map<cpg, cpk> g = Maps.newHashMap();

   protected static cpj a(String $$0) {
      cpi $$1 = ka.a(lu.B, $$0, new cpi());
      return new cpj($$1);
   }

   protected void a(cpg $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cpk());
      }
   }

   protected cpk b(cpg $$0) {
      return this.g.get($$0);
   }

   protected List<cpk> c(cpg $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cpg a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cpg.b);
   }
}
