import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqo {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqo c = a("empty").a(0, cqm.b).a();
   public static final cqo d = a("simple").a(5000, cqm.c).a(11000, cqm.e).a();
   public static final cqo e = a("villager_baby").a(10, cqm.b).a(3000, cqm.d).a(6000, cqm.b).a(10000, cqm.d).a(12000, cqm.e).a();
   public static final cqo f = a("villager_default").a(10, cqm.b).a(2000, cqm.c).a(9000, cqm.f).a(11000, cqm.b).a(12000, cqm.e).a();
   private final Map<cqm, cqq> g = Maps.newHashMap();

   protected static cqp a(String $$0) {
      cqo $$1 = ke.a(mb.B, $$0, new cqo());
      return new cqp($$1);
   }

   protected void a(cqm $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqq());
      }
   }

   protected cqq b(cqm $$0) {
      return this.g.get($$0);
   }

   protected List<cqq> c(cqm $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqm a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqm.b);
   }
}
