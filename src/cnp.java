import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cnp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cnp c = a("empty").a(0, cnn.b).a();
   public static final cnp d = a("simple").a(5000, cnn.c).a(11000, cnn.e).a();
   public static final cnp e = a("villager_baby").a(10, cnn.b).a(3000, cnn.d).a(6000, cnn.b).a(10000, cnn.d).a(12000, cnn.e).a();
   public static final cnp f = a("villager_default").a(10, cnn.b).a(2000, cnn.c).a(9000, cnn.f).a(11000, cnn.b).a(12000, cnn.e).a();
   private final Map<cnn, cnr> g = Maps.newHashMap();

   protected static cnq a(String $$0) {
      cnp $$1 = jk.a(le.D, $$0, new cnp());
      return new cnq($$1);
   }

   protected void a(cnn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cnr());
      }
   }

   protected cnr b(cnn $$0) {
      return this.g.get($$0);
   }

   protected List<cnr> c(cnn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cnn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cnn.b);
   }
}
