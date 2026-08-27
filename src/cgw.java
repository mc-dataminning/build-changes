import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cgw {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cgw c = a("empty").a(0, cgu.b).a();
   public static final cgw d = a("simple").a(5000, cgu.c).a(11000, cgu.e).a();
   public static final cgw e = a("villager_baby").a(10, cgu.b).a(3000, cgu.d).a(6000, cgu.b).a(10000, cgu.d).a(12000, cgu.e).a();
   public static final cgw f = a("villager_default").a(10, cgu.b).a(2000, cgu.c).a(9000, cgu.f).a(11000, cgu.b).a(12000, cgu.e).a();
   private final Map<cgu, cgy> g = Maps.newHashMap();

   protected static cgx a(String $$0) {
      cgw $$1 = it.a(kd.D, $$0, new cgw());
      return new cgx($$1);
   }

   protected void a(cgu $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cgy());
      }
   }

   protected cgy b(cgu $$0) {
      return this.g.get($$0);
   }

   protected List<cgy> c(cgu $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cgu a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cgu.b);
   }
}
