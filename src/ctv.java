import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ctv {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ctv c = a("empty").a(0, ctt.b).a();
   public static final ctv d = a("simple").a(5000, ctt.c).a(11000, ctt.e).a();
   public static final ctv e = a("villager_baby").a(10, ctt.b).a(3000, ctt.d).a(6000, ctt.b).a(10000, ctt.d).a(12000, ctt.e).a();
   public static final ctv f = a("villager_default").a(10, ctt.b).a(2000, ctt.c).a(9000, ctt.f).a(11000, ctt.b).a(12000, ctt.e).a();
   private final Map<ctt, ctx> g = Maps.newHashMap();

   protected static ctw a(String $$0) {
      ctv $$1 = jt.a(mh.B, $$0, new ctv());
      return new ctw($$1);
   }

   protected void a(ctt $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ctx());
      }
   }

   protected ctx b(ctt $$0) {
      return this.g.get($$0);
   }

   protected List<ctx> c(ctt $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ctt a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ctt.b);
   }
}
