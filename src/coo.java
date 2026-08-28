import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class coo {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final coo c = a("empty").a(0, col.b).a();
   public static final coo d = a("simple").a(5000, col.c).a(11000, col.e).a();
   public static final coo e = a("villager_baby").a(10, col.b).a(3000, col.d).a(6000, col.b).a(10000, col.d).a(12000, col.e).a();
   public static final coo f = a("villager_default").a(10, col.b).a(2000, col.c).a(9000, col.f).a(11000, col.b).a(12000, col.e).a();
   private final Map<col, coq> g = Maps.newHashMap();

   protected static cop a(String $$0) {
      coo $$1 = jv.a(lp.D, $$0, new coo());
      return new cop($$1);
   }

   protected void a(col $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new coq());
      }
   }

   protected coq b(col $$0) {
      return this.g.get($$0);
   }

   protected List<coq> c(col $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public col a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(col.b);
   }
}
