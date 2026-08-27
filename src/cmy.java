import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cmy {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cmy c = a("empty").a(0, cmw.b).a();
   public static final cmy d = a("simple").a(5000, cmw.c).a(11000, cmw.e).a();
   public static final cmy e = a("villager_baby").a(10, cmw.b).a(3000, cmw.d).a(6000, cmw.b).a(10000, cmw.d).a(12000, cmw.e).a();
   public static final cmy f = a("villager_default").a(10, cmw.b).a(2000, cmw.c).a(9000, cmw.f).a(11000, cmw.b).a(12000, cmw.e).a();
   private final Map<cmw, cna> g = Maps.newHashMap();

   protected static cmz a(String $$0) {
      cmy $$1 = jj.a(ld.D, $$0, new cmy());
      return new cmz($$1);
   }

   protected void a(cmw $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cna());
      }
   }

   protected cna b(cmw $$0) {
      return this.g.get($$0);
   }

   protected List<cna> c(cmw $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cmw a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cmw.b);
   }
}
