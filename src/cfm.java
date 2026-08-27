import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cfm {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cfm c = a("empty").a(0, cfk.b).a();
   public static final cfm d = a("simple").a(5000, cfk.c).a(11000, cfk.e).a();
   public static final cfm e = a("villager_baby").a(10, cfk.b).a(3000, cfk.d).a(6000, cfk.b).a(10000, cfk.d).a(12000, cfk.e).a();
   public static final cfm f = a("villager_default").a(10, cfk.b).a(2000, cfk.c).a(9000, cfk.f).a(11000, cfk.b).a(12000, cfk.e).a();
   private final Map<cfk, cfo> g = Maps.newHashMap();

   protected static cfn a(String $$0) {
      cfm $$1 = is.a(kc.E, $$0, new cfm());
      return new cfn($$1);
   }

   protected void a(cfk $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cfo());
      }
   }

   protected cfo b(cfk $$0) {
      return this.g.get($$0);
   }

   protected List<cfo> c(cfk $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cfk a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cfk.b);
   }
}
