import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cez {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cez c = a("empty").a(0, cex.b).a();
   public static final cez d = a("simple").a(5000, cex.c).a(11000, cex.e).a();
   public static final cez e = a("villager_baby").a(10, cex.b).a(3000, cex.d).a(6000, cex.b).a(10000, cex.d).a(12000, cex.e).a();
   public static final cez f = a("villager_default").a(10, cex.b).a(2000, cex.c).a(9000, cex.f).a(11000, cex.b).a(12000, cex.e).a();
   private final Map<cex, cfb> g = Maps.newHashMap();

   protected static cfa a(String $$0) {
      cez $$1 = io.a(jy.E, $$0, new cez());
      return new cfa($$1);
   }

   protected void a(cex $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cfb());
      }
   }

   protected cfb b(cex $$0) {
      return this.g.get($$0);
   }

   protected List<cfb> c(cex $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cex a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cex.b);
   }
}
