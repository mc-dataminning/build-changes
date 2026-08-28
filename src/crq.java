import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class crq {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final crq c = a("empty").a(0, cro.b).a();
   public static final crq d = a("simple").a(5000, cro.c).a(11000, cro.e).a();
   public static final crq e = a("villager_baby").a(10, cro.b).a(3000, cro.d).a(6000, cro.b).a(10000, cro.d).a(12000, cro.e).a();
   public static final crq f = a("villager_default").a(10, cro.b).a(2000, cro.c).a(9000, cro.f).a(11000, cro.b).a(12000, cro.e).a();
   private final Map<cro, crs> g = Maps.newHashMap();

   protected static crr a(String $$0) {
      crq $$1 = kd.a(ma.B, $$0, new crq());
      return new crr($$1);
   }

   protected void a(cro $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new crs());
      }
   }

   protected crs b(cro $$0) {
      return this.g.get($$0);
   }

   protected List<crs> c(cro $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cro a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cro.b);
   }
}
