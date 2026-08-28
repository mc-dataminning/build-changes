import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cny {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cny c = a("empty").a(0, cnw.b).a();
   public static final cny d = a("simple").a(5000, cnw.c).a(11000, cnw.e).a();
   public static final cny e = a("villager_baby").a(10, cnw.b).a(3000, cnw.d).a(6000, cnw.b).a(10000, cnw.d).a(12000, cnw.e).a();
   public static final cny f = a("villager_default").a(10, cnw.b).a(2000, cnw.c).a(9000, cnw.f).a(11000, cnw.b).a(12000, cnw.e).a();
   private final Map<cnw, coa> g = Maps.newHashMap();

   protected static cnz a(String $$0) {
      cny $$1 = jw.a(lq.B, $$0, new cny());
      return new cnz($$1);
   }

   protected void a(cnw $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new coa());
      }
   }

   protected coa b(cnw $$0) {
      return this.g.get($$0);
   }

   protected List<coa> c(cnw $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cnw a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cnw.b);
   }
}
