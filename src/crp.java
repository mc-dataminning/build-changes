import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class crp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final crp c = a("empty").a(0, crn.b).a();
   public static final crp d = a("simple").a(5000, crn.c).a(11000, crn.e).a();
   public static final crp e = a("villager_baby").a(10, crn.b).a(3000, crn.d).a(6000, crn.b).a(10000, crn.d).a(12000, crn.e).a();
   public static final crp f = a("villager_default").a(10, crn.b).a(2000, crn.c).a(9000, crn.f).a(11000, crn.b).a(12000, crn.e).a();
   private final Map<crn, crr> g = Maps.newHashMap();

   protected static crq a(String $$0) {
      crp $$1 = kd.a(ma.B, $$0, new crp());
      return new crq($$1);
   }

   protected void a(crn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new crr());
      }
   }

   protected crr b(crn $$0) {
      return this.g.get($$0);
   }

   protected List<crr> c(crn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public crn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(crn.b);
   }
}
