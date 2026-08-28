import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class crl {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final crl c = a("empty").a(0, crj.b).a();
   public static final crl d = a("simple").a(5000, crj.c).a(11000, crj.e).a();
   public static final crl e = a("villager_baby").a(10, crj.b).a(3000, crj.d).a(6000, crj.b).a(10000, crj.d).a(12000, crj.e).a();
   public static final crl f = a("villager_default").a(10, crj.b).a(2000, crj.c).a(9000, crj.f).a(11000, crj.b).a(12000, crj.e).a();
   private final Map<crj, crn> g = Maps.newHashMap();

   protected static crm a(String $$0) {
      crl $$1 = kd.a(ma.B, $$0, new crl());
      return new crm($$1);
   }

   protected void a(crj $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new crn());
      }
   }

   protected crn b(crj $$0) {
      return this.g.get($$0);
   }

   protected List<crn> c(crj $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public crj a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(crj.b);
   }
}
