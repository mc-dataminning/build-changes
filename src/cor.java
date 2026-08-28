import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cor {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cor c = a("empty").a(0, cop.b).a();
   public static final cor d = a("simple").a(5000, cop.c).a(11000, cop.e).a();
   public static final cor e = a("villager_baby").a(10, cop.b).a(3000, cop.d).a(6000, cop.b).a(10000, cop.d).a(12000, cop.e).a();
   public static final cor f = a("villager_default").a(10, cop.b).a(2000, cop.c).a(9000, cop.f).a(11000, cop.b).a(12000, cop.e).a();
   private final Map<cop, cot> g = Maps.newHashMap();

   protected static cos a(String $$0) {
      cor $$1 = jv.a(lp.D, $$0, new cor());
      return new cos($$1);
   }

   protected void a(cop $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cot());
      }
   }

   protected cot b(cop $$0) {
      return this.g.get($$0);
   }

   protected List<cot> c(cop $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cop a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cop.b);
   }
}
