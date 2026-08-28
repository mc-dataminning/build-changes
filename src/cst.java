import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cst {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cst c = a("empty").a(0, csr.b).a();
   public static final cst d = a("simple").a(5000, csr.c).a(11000, csr.e).a();
   public static final cst e = a("villager_baby").a(10, csr.b).a(3000, csr.d).a(6000, csr.b).a(10000, csr.d).a(12000, csr.e).a();
   public static final cst f = a("villager_default").a(10, csr.b).a(2000, csr.c).a(9000, csr.f).a(11000, csr.b).a(12000, csr.e).a();
   private final Map<csr, csv> g = Maps.newHashMap();

   protected static csu a(String $$0) {
      cst $$1 = jr.a(mf.B, $$0, new cst());
      return new csu($$1);
   }

   protected void a(csr $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new csv());
      }
   }

   protected csv b(csr $$0) {
      return this.g.get($$0);
   }

   protected List<csv> c(csr $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public csr a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(csr.b);
   }
}
