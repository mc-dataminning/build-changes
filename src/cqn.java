import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqn {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqn c = a("empty").a(0, cql.b).a();
   public static final cqn d = a("simple").a(5000, cql.c).a(11000, cql.e).a();
   public static final cqn e = a("villager_baby").a(10, cql.b).a(3000, cql.d).a(6000, cql.b).a(10000, cql.d).a(12000, cql.e).a();
   public static final cqn f = a("villager_default").a(10, cql.b).a(2000, cql.c).a(9000, cql.f).a(11000, cql.b).a(12000, cql.e).a();
   private final Map<cql, cqp> g = Maps.newHashMap();

   protected static cqo a(String $$0) {
      cqn $$1 = kd.a(lz.B, $$0, new cqn());
      return new cqo($$1);
   }

   protected void a(cql $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqp());
      }
   }

   protected cqp b(cql $$0) {
      return this.g.get($$0);
   }

   protected List<cqp> c(cql $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cql a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cql.b);
   }
}
