import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cqr {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cqr c = a("empty").a(0, cqp.b).a();
   public static final cqr d = a("simple").a(5000, cqp.c).a(11000, cqp.e).a();
   public static final cqr e = a("villager_baby").a(10, cqp.b).a(3000, cqp.d).a(6000, cqp.b).a(10000, cqp.d).a(12000, cqp.e).a();
   public static final cqr f = a("villager_default").a(10, cqp.b).a(2000, cqp.c).a(9000, cqp.f).a(11000, cqp.b).a(12000, cqp.e).a();
   private final Map<cqp, cqt> g = Maps.newHashMap();

   protected static cqs a(String $$0) {
      cqr $$1 = ke.a(mb.B, $$0, new cqr());
      return new cqs($$1);
   }

   protected void a(cqp $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cqt());
      }
   }

   protected cqt b(cqp $$0) {
      return this.g.get($$0);
   }

   protected List<cqt> c(cqp $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cqp a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cqp.b);
   }
}
