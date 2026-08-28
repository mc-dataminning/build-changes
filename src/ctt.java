import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ctt {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ctt c = a("empty").a(0, ctr.b).a();
   public static final ctt d = a("simple").a(5000, ctr.c).a(11000, ctr.e).a();
   public static final ctt e = a("villager_baby").a(10, ctr.b).a(3000, ctr.d).a(6000, ctr.b).a(10000, ctr.d).a(12000, ctr.e).a();
   public static final ctt f = a("villager_default").a(10, ctr.b).a(2000, ctr.c).a(9000, ctr.f).a(11000, ctr.b).a(12000, ctr.e).a();
   private final Map<ctr, ctv> g = Maps.newHashMap();

   protected static ctu a(String $$0) {
      ctt $$1 = js.a(mg.B, $$0, new ctt());
      return new ctu($$1);
   }

   protected void a(ctr $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ctv());
      }
   }

   protected ctv b(ctr $$0) {
      return this.g.get($$0);
   }

   protected List<ctv> c(ctr $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ctr a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ctr.b);
   }
}
