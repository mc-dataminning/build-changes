import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqb {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqb c = a("empty").a(0, cpz.b).a();
   public static final cqb d = a("simple").a(5000, cpz.c).a(11000, cpz.e).a();
   public static final cqb e = a("villager_baby").a(10, cpz.b).a(3000, cpz.d).a(6000, cpz.b).a(10000, cpz.d).a(12000, cpz.e).a();
   public static final cqb f = a("villager_default").a(10, cpz.b).a(2000, cpz.c).a(9000, cpz.f).a(11000, cpz.b).a(12000, cpz.e).a();
   private final Map<cpz, cqd> g = Maps.newHashMap();

   protected static cqc a(String $$0) {
      cqb $$1 = kc.a(lx.B, $$0, new cqb());
      return new cqc($$1);
   }

   protected void a(cpz $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqd());
      }
   }

   protected cqd b(cpz $$0) {
      return this.g.get($$0);
   }

   protected List<cqd> c(cpz $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cpz a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cpz.b);
   }
}
