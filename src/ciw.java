import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ciw {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ciw c = a("empty").a(0, ciu.b).a();
   public static final ciw d = a("simple").a(5000, ciu.c).a(11000, ciu.e).a();
   public static final ciw e = a("villager_baby").a(10, ciu.b).a(3000, ciu.d).a(6000, ciu.b).a(10000, ciu.d).a(12000, ciu.e).a();
   public static final ciw f = a("villager_default").a(10, ciu.b).a(2000, ciu.c).a(9000, ciu.f).a(11000, ciu.b).a(12000, ciu.e).a();
   private final Map<ciu, ciy> g = Maps.newHashMap();

   protected static cix a(String $$0) {
      ciw $$1 = iv.a(kf.D, $$0, new ciw());
      return new cix($$1);
   }

   protected void a(ciu $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ciy());
      }
   }

   protected ciy b(ciu $$0) {
      return this.g.get($$0);
   }

   protected List<ciy> c(ciu $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ciu a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ciu.b);
   }
}
