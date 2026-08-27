import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cdn {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cdn c = a("empty").a(0, cdl.b).a();
   public static final cdn d = a("simple").a(5000, cdl.c).a(11000, cdl.e).a();
   public static final cdn e = a("villager_baby").a(10, cdl.b).a(3000, cdl.d).a(6000, cdl.b).a(10000, cdl.d).a(12000, cdl.e).a();
   public static final cdn f = a("villager_default").a(10, cdl.b).a(2000, cdl.c).a(9000, cdl.f).a(11000, cdl.b).a(12000, cdl.e).a();
   private final Map<cdl, cdp> g = Maps.newHashMap();

   protected static cdo a(String $$0) {
      cdn $$1 = hq.a(jb.E, $$0, new cdn());
      return new cdo($$1);
   }

   protected void a(cdl $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cdp());
      }
   }

   protected cdp b(cdl $$0) {
      return this.g.get($$0);
   }

   protected List<cdp> c(cdl $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cdl a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cdl.b);
   }
}
