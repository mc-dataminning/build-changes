import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqk {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqk c = a("empty").a(0, cqi.b).a();
   public static final cqk d = a("simple").a(5000, cqi.c).a(11000, cqi.e).a();
   public static final cqk e = a("villager_baby").a(10, cqi.b).a(3000, cqi.d).a(6000, cqi.b).a(10000, cqi.d).a(12000, cqi.e).a();
   public static final cqk f = a("villager_default").a(10, cqi.b).a(2000, cqi.c).a(9000, cqi.f).a(11000, cqi.b).a(12000, cqi.e).a();
   private final Map<cqi, cqm> g = Maps.newHashMap();

   protected static cql a(String $$0) {
      cqk $$1 = kd.a(lz.B, $$0, new cqk());
      return new cql($$1);
   }

   protected void a(cqi $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqm());
      }
   }

   protected cqm b(cqi $$0) {
      return this.g.get($$0);
   }

   protected List<cqm> c(cqi $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqi a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqi.b);
   }
}
