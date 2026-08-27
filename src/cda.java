import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cda {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cda c = a("empty").a(0, ccy.b).a();
   public static final cda d = a("simple").a(5000, ccy.c).a(11000, ccy.e).a();
   public static final cda e = a("villager_baby").a(10, ccy.b).a(3000, ccy.d).a(6000, ccy.b).a(10000, ccy.d).a(12000, ccy.e).a();
   public static final cda f = a("villager_default").a(10, ccy.b).a(2000, ccy.c).a(9000, ccy.f).a(11000, ccy.b).a(12000, ccy.e).a();
   private final Map<ccy, cdc> g = Maps.newHashMap();

   protected static cdb a(String $$0) {
      cda $$1 = hr.a(jb.E, $$0, new cda());
      return new cdb($$1);
   }

   protected void a(ccy $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cdc());
      }
   }

   protected cdc b(ccy $$0) {
      return this.g.get($$0);
   }

   protected List<cdc> c(ccy $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ccy a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ccy.b);
   }
}
