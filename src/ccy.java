import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ccy {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ccy c = a("empty").a(0, ccw.b).a();
   public static final ccy d = a("simple").a(5000, ccw.c).a(11000, ccw.e).a();
   public static final ccy e = a("villager_baby").a(10, ccw.b).a(3000, ccw.d).a(6000, ccw.b).a(10000, ccw.d).a(12000, ccw.e).a();
   public static final ccy f = a("villager_default").a(10, ccw.b).a(2000, ccw.c).a(9000, ccw.f).a(11000, ccw.b).a(12000, ccw.e).a();
   private final Map<ccw, cda> g = Maps.newHashMap();

   protected static ccz a(String $$0) {
      ccy $$1 = hs.a(jc.E, $$0, new ccy());
      return new ccz($$1);
   }

   protected void a(ccw $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cda());
      }
   }

   protected cda b(ccw $$0) {
      return this.g.get($$0);
   }

   protected List<cda> c(ccw $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ccw a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ccw.b);
   }
}
