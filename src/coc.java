import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class coc {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final coc c = a("empty").a(0, coa.b).a();
   public static final coc d = a("simple").a(5000, coa.c).a(11000, coa.e).a();
   public static final coc e = a("villager_baby").a(10, coa.b).a(3000, coa.d).a(6000, coa.b).a(10000, coa.d).a(12000, coa.e).a();
   public static final coc f = a("villager_default").a(10, coa.b).a(2000, coa.c).a(9000, coa.f).a(11000, coa.b).a(12000, coa.e).a();
   private final Map<coa, coe> g = Maps.newHashMap();

   protected static cod a(String $$0) {
      coc $$1 = jw.a(lq.B, $$0, new coc());
      return new cod($$1);
   }

   protected void a(coa $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new coe());
      }
   }

   protected coe b(coa $$0) {
      return this.g.get($$0);
   }

   protected List<coe> c(coa $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public coa a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(coa.b);
   }
}
