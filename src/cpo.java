import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cpo {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cpo c = a("empty").a(0, cpm.b).a();
   public static final cpo d = a("simple").a(5000, cpm.c).a(11000, cpm.e).a();
   public static final cpo e = a("villager_baby").a(10, cpm.b).a(3000, cpm.d).a(6000, cpm.b).a(10000, cpm.d).a(12000, cpm.e).a();
   public static final cpo f = a("villager_default").a(10, cpm.b).a(2000, cpm.c).a(9000, cpm.f).a(11000, cpm.b).a(12000, cpm.e).a();
   private final Map<cpm, cpq> g = Maps.newHashMap();

   protected static cpp a(String $$0) {
      cpo $$1 = ka.a(lu.B, $$0, new cpo());
      return new cpp($$1);
   }

   protected void a(cpm $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cpq());
      }
   }

   protected cpq b(cpm $$0) {
      return this.g.get($$0);
   }

   protected List<cpq> c(cpm $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cpm a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cpm.b);
   }
}
