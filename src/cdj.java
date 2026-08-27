import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cdj {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cdj c = a("empty").a(0, cdh.b).a();
   public static final cdj d = a("simple").a(5000, cdh.c).a(11000, cdh.e).a();
   public static final cdj e = a("villager_baby").a(10, cdh.b).a(3000, cdh.d).a(6000, cdh.b).a(10000, cdh.d).a(12000, cdh.e).a();
   public static final cdj f = a("villager_default").a(10, cdh.b).a(2000, cdh.c).a(9000, cdh.f).a(11000, cdh.b).a(12000, cdh.e).a();
   private final Map<cdh, cdl> g = Maps.newHashMap();

   protected static cdk a(String $$0) {
      cdj $$1 = ht.a(jd.E, $$0, new cdj());
      return new cdk($$1);
   }

   protected void a(cdh $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cdl());
      }
   }

   protected cdl b(cdh $$0) {
      return this.g.get($$0);
   }

   protected List<cdl> c(cdh $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cdh a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cdh.b);
   }
}
