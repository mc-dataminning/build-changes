import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cpr {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cpr c = a("empty").a(0, cpp.b).a();
   public static final cpr d = a("simple").a(5000, cpp.c).a(11000, cpp.e).a();
   public static final cpr e = a("villager_baby").a(10, cpp.b).a(3000, cpp.d).a(6000, cpp.b).a(10000, cpp.d).a(12000, cpp.e).a();
   public static final cpr f = a("villager_default").a(10, cpp.b).a(2000, cpp.c).a(9000, cpp.f).a(11000, cpp.b).a(12000, cpp.e).a();
   private final Map<cpp, cpt> g = Maps.newHashMap();

   protected static cps a(String $$0) {
      cpr $$1 = kb.a(lv.B, $$0, new cpr());
      return new cps($$1);
   }

   protected void a(cpp $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cpt());
      }
   }

   protected cpt b(cpp $$0) {
      return this.g.get($$0);
   }

   protected List<cpt> c(cpp $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cpp a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cpp.b);
   }
}
