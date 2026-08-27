import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class che {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final che c = a("empty").a(0, chc.b).a();
   public static final che d = a("simple").a(5000, chc.c).a(11000, chc.e).a();
   public static final che e = a("villager_baby").a(10, chc.b).a(3000, chc.d).a(6000, chc.b).a(10000, chc.d).a(12000, chc.e).a();
   public static final che f = a("villager_default").a(10, chc.b).a(2000, chc.c).a(9000, chc.f).a(11000, chc.b).a(12000, chc.e).a();
   private final Map<chc, chg> g = Maps.newHashMap();

   protected static chf a(String $$0) {
      che $$1 = it.a(kd.D, $$0, new che());
      return new chf($$1);
   }

   protected void a(chc $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new chg());
      }
   }

   protected chg b(chc $$0) {
      return this.g.get($$0);
   }

   protected List<chg> c(chc $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public chc a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(chc.b);
   }
}
