import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cdh {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cdh c = a("empty").a(0, cdf.b).a();
   public static final cdh d = a("simple").a(5000, cdf.c).a(11000, cdf.e).a();
   public static final cdh e = a("villager_baby").a(10, cdf.b).a(3000, cdf.d).a(6000, cdf.b).a(10000, cdf.d).a(12000, cdf.e).a();
   public static final cdh f = a("villager_default").a(10, cdf.b).a(2000, cdf.c).a(9000, cdf.f).a(11000, cdf.b).a(12000, cdf.e).a();
   private final Map<cdf, cdj> g = Maps.newHashMap();

   protected static cdi a(String $$0) {
      cdh $$1 = hq.a(jb.E, $$0, new cdh());
      return new cdi($$1);
   }

   protected void a(cdf $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cdj());
      }
   }

   protected cdj b(cdf $$0) {
      return this.g.get($$0);
   }

   protected List<cdj> c(cdf $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cdf a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cdf.b);
   }
}
