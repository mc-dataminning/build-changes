import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqq {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqq c = a("empty").a(0, cqo.b).a();
   public static final cqq d = a("simple").a(5000, cqo.c).a(11000, cqo.e).a();
   public static final cqq e = a("villager_baby").a(10, cqo.b).a(3000, cqo.d).a(6000, cqo.b).a(10000, cqo.d).a(12000, cqo.e).a();
   public static final cqq f = a("villager_default").a(10, cqo.b).a(2000, cqo.c).a(9000, cqo.f).a(11000, cqo.b).a(12000, cqo.e).a();
   private final Map<cqo, cqs> g = Maps.newHashMap();

   protected static cqr a(String $$0) {
      cqq $$1 = ke.a(mb.B, $$0, new cqq());
      return new cqr($$1);
   }

   protected void a(cqo $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqs());
      }
   }

   protected cqs b(cqo $$0) {
      return this.g.get($$0);
   }

   protected List<cqs> c(cqo $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqo a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqo.b);
   }
}
