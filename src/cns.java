import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cns {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cns c = a("empty").a(0, cnq.b).a();
   public static final cns d = a("simple").a(5000, cnq.c).a(11000, cnq.e).a();
   public static final cns e = a("villager_baby").a(10, cnq.b).a(3000, cnq.d).a(6000, cnq.b).a(10000, cnq.d).a(12000, cnq.e).a();
   public static final cns f = a("villager_default").a(10, cnq.b).a(2000, cnq.c).a(9000, cnq.f).a(11000, cnq.b).a(12000, cnq.e).a();
   private final Map<cnq, cnu> g = Maps.newHashMap();

   protected static cnt a(String $$0) {
      cns $$1 = jn.a(lh.D, $$0, new cns());
      return new cnt($$1);
   }

   protected void a(cnq $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cnu());
      }
   }

   protected cnu b(cnq $$0) {
      return this.g.get($$0);
   }

   protected List<cnu> c(cnq $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cnq a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cnq.b);
   }
}
