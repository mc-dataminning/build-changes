import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class csb {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final csb c = a("empty").a(0, crz.b).a();
   public static final csb d = a("simple").a(5000, crz.c).a(11000, crz.e).a();
   public static final csb e = a("villager_baby").a(10, crz.b).a(3000, crz.d).a(6000, crz.b).a(10000, crz.d).a(12000, crz.e).a();
   public static final csb f = a("villager_default").a(10, crz.b).a(2000, crz.c).a(9000, crz.f).a(11000, crz.b).a(12000, crz.e).a();
   private final Map<crz, csd> g = Maps.newHashMap();

   protected static csc a(String $$0) {
      csb $$1 = kf.a(md.B, $$0, new csb());
      return new csc($$1);
   }

   protected void a(crz $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new csd());
      }
   }

   protected csd b(crz $$0) {
      return this.g.get($$0);
   }

   protected List<csd> c(crz $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public crz a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(crz.b);
   }
}
