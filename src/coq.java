import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class coq {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final coq c = a("empty").a(0, coo.b).a();
   public static final coq d = a("simple").a(5000, coo.c).a(11000, coo.e).a();
   public static final coq e = a("villager_baby").a(10, coo.b).a(3000, coo.d).a(6000, coo.b).a(10000, coo.d).a(12000, coo.e).a();
   public static final coq f = a("villager_default").a(10, coo.b).a(2000, coo.c).a(9000, coo.f).a(11000, coo.b).a(12000, coo.e).a();
   private final Map<coo, cos> g = Maps.newHashMap();

   protected static cor a(String $$0) {
      coq $$1 = jv.a(lp.D, $$0, new coq());
      return new cor($$1);
   }

   protected void a(coo $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cos());
      }
   }

   protected cos b(coo $$0) {
      return this.g.get($$0);
   }

   protected List<cos> c(coo $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public coo a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(coo.b);
   }
}
