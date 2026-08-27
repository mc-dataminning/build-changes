import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cfh {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cfh c = a("empty").a(0, cff.b).a();
   public static final cfh d = a("simple").a(5000, cff.c).a(11000, cff.e).a();
   public static final cfh e = a("villager_baby").a(10, cff.b).a(3000, cff.d).a(6000, cff.b).a(10000, cff.d).a(12000, cff.e).a();
   public static final cfh f = a("villager_default").a(10, cff.b).a(2000, cff.c).a(9000, cff.f).a(11000, cff.b).a(12000, cff.e).a();
   private final Map<cff, cfj> g = Maps.newHashMap();

   protected static cfi a(String $$0) {
      cfh $$1 = io.a(jy.E, $$0, new cfh());
      return new cfi($$1);
   }

   protected void a(cff $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cfj());
      }
   }

   protected cfj b(cff $$0) {
      return this.g.get($$0);
   }

   protected List<cfj> c(cff $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cff a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cff.b);
   }
}
