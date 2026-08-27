import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class clr {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final clr c = a("empty").a(0, clp.b).a();
   public static final clr d = a("simple").a(5000, clp.c).a(11000, clp.e).a();
   public static final clr e = a("villager_baby").a(10, clp.b).a(3000, clp.d).a(6000, clp.b).a(10000, clp.d).a(12000, clp.e).a();
   public static final clr f = a("villager_default").a(10, clp.b).a(2000, clp.c).a(9000, clp.f).a(11000, clp.b).a(12000, clp.e).a();
   private final Map<clp, clt> g = Maps.newHashMap();

   protected static cls a(String $$0) {
      clr $$1 = ja.a(kt.D, $$0, new clr());
      return new cls($$1);
   }

   protected void a(clp $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new clt());
      }
   }

   protected clt b(clp $$0) {
      return this.g.get($$0);
   }

   protected List<clt> c(clp $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public clp a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(clp.b);
   }
}
