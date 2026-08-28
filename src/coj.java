import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class coj {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final coj c = a("empty").a(0, coh.b).a();
   public static final coj d = a("simple").a(5000, coh.c).a(11000, coh.e).a();
   public static final coj e = a("villager_baby").a(10, coh.b).a(3000, coh.d).a(6000, coh.b).a(10000, coh.d).a(12000, coh.e).a();
   public static final coj f = a("villager_default").a(10, coh.b).a(2000, coh.c).a(9000, coh.f).a(11000, coh.b).a(12000, coh.e).a();
   private final Map<coh, col> g = Maps.newHashMap();

   protected static cok a(String $$0) {
      coj $$1 = jv.a(lp.D, $$0, new coj());
      return new cok($$1);
   }

   protected void a(coh $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new col());
      }
   }

   protected col b(coh $$0) {
      return this.g.get($$0);
   }

   protected List<col> c(coh $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public coh a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(coh.b);
   }
}
