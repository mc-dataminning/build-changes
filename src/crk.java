import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class crk {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final crk c = a("empty").a(0, cri.b).a();
   public static final crk d = a("simple").a(5000, cri.c).a(11000, cri.e).a();
   public static final crk e = a("villager_baby").a(10, cri.b).a(3000, cri.d).a(6000, cri.b).a(10000, cri.d).a(12000, cri.e).a();
   public static final crk f = a("villager_default").a(10, cri.b).a(2000, cri.c).a(9000, cri.f).a(11000, cri.b).a(12000, cri.e).a();
   private final Map<cri, crm> g = Maps.newHashMap();

   protected static crl a(String $$0) {
      crk $$1 = ke.a(mb.B, $$0, new crk());
      return new crl($$1);
   }

   protected void a(cri $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new crm());
      }
   }

   protected crm b(cri $$0) {
      return this.g.get($$0);
   }

   protected List<crm> c(cri $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cri a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cri.b);
   }
}
