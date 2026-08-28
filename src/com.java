import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class com {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final com c = a("empty").a(0, cok.b).a();
   public static final com d = a("simple").a(5000, cok.c).a(11000, cok.e).a();
   public static final com e = a("villager_baby").a(10, cok.b).a(3000, cok.d).a(6000, cok.b).a(10000, cok.d).a(12000, cok.e).a();
   public static final com f = a("villager_default").a(10, cok.b).a(2000, cok.c).a(9000, cok.f).a(11000, cok.b).a(12000, cok.e).a();
   private final Map<cok, cop> g = Maps.newHashMap();

   protected static coo a(String $$0) {
      com $$1 = jv.a(lp.D, $$0, new com());
      return new coo($$1);
   }

   protected void a(cok $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cop());
      }
   }

   protected cop b(cok $$0) {
      return this.g.get($$0);
   }

   protected List<cop> c(cok $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cok a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cok.b);
   }
}
