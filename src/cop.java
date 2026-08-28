import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cop {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cop c = a("empty").a(0, com.b).a();
   public static final cop d = a("simple").a(5000, com.c).a(11000, com.e).a();
   public static final cop e = a("villager_baby").a(10, com.b).a(3000, com.d).a(6000, com.b).a(10000, com.d).a(12000, com.e).a();
   public static final cop f = a("villager_default").a(10, com.b).a(2000, com.c).a(9000, com.f).a(11000, com.b).a(12000, com.e).a();
   private final Map<com, cor> g = Maps.newHashMap();

   protected static coq a(String $$0) {
      cop $$1 = jv.a(lp.D, $$0, new cop());
      return new coq($$1);
   }

   protected void a(com $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cor());
      }
   }

   protected cor b(com $$0) {
      return this.g.get($$0);
   }

   protected List<cor> c(com $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public com a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(com.b);
   }
}
