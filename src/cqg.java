import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqg {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqg c = a("empty").a(0, cqe.b).a();
   public static final cqg d = a("simple").a(5000, cqe.c).a(11000, cqe.e).a();
   public static final cqg e = a("villager_baby").a(10, cqe.b).a(3000, cqe.d).a(6000, cqe.b).a(10000, cqe.d).a(12000, cqe.e).a();
   public static final cqg f = a("villager_default").a(10, cqe.b).a(2000, cqe.c).a(9000, cqe.f).a(11000, cqe.b).a(12000, cqe.e).a();
   private final Map<cqe, cqi> g = Maps.newHashMap();

   protected static cqh a(String $$0) {
      cqg $$1 = kd.a(ly.B, $$0, new cqg());
      return new cqh($$1);
   }

   protected void a(cqe $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqi());
      }
   }

   protected cqi b(cqe $$0) {
      return this.g.get($$0);
   }

   protected List<cqi> c(cqe $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqe a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqe.b);
   }
}
