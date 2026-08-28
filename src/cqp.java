import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqp c = a("empty").a(0, cqn.b).a();
   public static final cqp d = a("simple").a(5000, cqn.c).a(11000, cqn.e).a();
   public static final cqp e = a("villager_baby").a(10, cqn.b).a(3000, cqn.d).a(6000, cqn.b).a(10000, cqn.d).a(12000, cqn.e).a();
   public static final cqp f = a("villager_default").a(10, cqn.b).a(2000, cqn.c).a(9000, cqn.f).a(11000, cqn.b).a(12000, cqn.e).a();
   private final Map<cqn, cqr> g = Maps.newHashMap();

   protected static cqq a(String $$0) {
      cqp $$1 = ke.a(mb.B, $$0, new cqp());
      return new cqq($$1);
   }

   protected void a(cqn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqr());
      }
   }

   protected cqr b(cqn $$0) {
      return this.g.get($$0);
   }

   protected List<cqr> c(cqn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqn.b);
   }
}
