import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cgf {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cgf c = a("empty").a(0, cgd.b).a();
   public static final cgf d = a("simple").a(5000, cgd.c).a(11000, cgd.e).a();
   public static final cgf e = a("villager_baby").a(10, cgd.b).a(3000, cgd.d).a(6000, cgd.b).a(10000, cgd.d).a(12000, cgd.e).a();
   public static final cgf f = a("villager_default").a(10, cgd.b).a(2000, cgd.c).a(9000, cgd.f).a(11000, cgd.b).a(12000, cgd.e).a();
   private final Map<cgd, cgh> g = Maps.newHashMap();

   protected static cgg a(String $$0) {
      cgf $$1 = ir.a(kb.D, $$0, new cgf());
      return new cgg($$1);
   }

   protected void a(cgd $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cgh());
      }
   }

   protected cgh b(cgd $$0) {
      return this.g.get($$0);
   }

   protected List<cgh> c(cgd $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cgd a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cgd.b);
   }
}
