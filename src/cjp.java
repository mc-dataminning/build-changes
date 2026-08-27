import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cjp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cjp c = a("empty").a(0, cjn.b).a();
   public static final cjp d = a("simple").a(5000, cjn.c).a(11000, cjn.e).a();
   public static final cjp e = a("villager_baby").a(10, cjn.b).a(3000, cjn.d).a(6000, cjn.b).a(10000, cjn.d).a(12000, cjn.e).a();
   public static final cjp f = a("villager_default").a(10, cjn.b).a(2000, cjn.c).a(9000, cjn.f).a(11000, cjn.b).a(12000, cjn.e).a();
   private final Map<cjn, cjr> g = Maps.newHashMap();

   protected static cjq a(String $$0) {
      cjp $$1 = ix.a(kh.D, $$0, new cjp());
      return new cjq($$1);
   }

   protected void a(cjn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cjr());
      }
   }

   protected cjr b(cjn $$0) {
      return this.g.get($$0);
   }

   protected List<cjr> c(cjn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cjn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cjn.b);
   }
}
