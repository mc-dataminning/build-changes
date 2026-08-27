import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ccz {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ccz c = a("empty").a(0, ccx.b).a();
   public static final ccz d = a("simple").a(5000, ccx.c).a(11000, ccx.e).a();
   public static final ccz e = a("villager_baby").a(10, ccx.b).a(3000, ccx.d).a(6000, ccx.b).a(10000, ccx.d).a(12000, ccx.e).a();
   public static final ccz f = a("villager_default").a(10, ccx.b).a(2000, ccx.c).a(9000, ccx.f).a(11000, ccx.b).a(12000, ccx.e).a();
   private final Map<ccx, cdb> g = Maps.newHashMap();

   protected static cda a(String $$0) {
      ccz $$1 = hr.a(jb.E, $$0, new ccz());
      return new cda($$1);
   }

   protected void a(ccx $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cdb());
      }
   }

   protected cdb b(ccx $$0) {
      return this.g.get($$0);
   }

   protected List<cdb> c(ccx $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ccx a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ccx.b);
   }
}
