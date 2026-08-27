import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cdc {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cdc c = a("empty").a(0, cda.b).a();
   public static final cdc d = a("simple").a(5000, cda.c).a(11000, cda.e).a();
   public static final cdc e = a("villager_baby").a(10, cda.b).a(3000, cda.d).a(6000, cda.b).a(10000, cda.d).a(12000, cda.e).a();
   public static final cdc f = a("villager_default").a(10, cda.b).a(2000, cda.c).a(9000, cda.f).a(11000, cda.b).a(12000, cda.e).a();
   private final Map<cda, cde> g = Maps.newHashMap();

   protected static cdd a(String $$0) {
      cdc $$1 = ht.a(jd.E, $$0, new cdc());
      return new cdd($$1);
   }

   protected void a(cda $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cde());
      }
   }

   protected cde b(cda $$0) {
      return this.g.get($$0);
   }

   protected List<cde> c(cda $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cda a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cda.b);
   }
}
