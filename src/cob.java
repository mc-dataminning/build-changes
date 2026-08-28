import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cob {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cob c = a("empty").a(0, cnz.b).a();
   public static final cob d = a("simple").a(5000, cnz.c).a(11000, cnz.e).a();
   public static final cob e = a("villager_baby").a(10, cnz.b).a(3000, cnz.d).a(6000, cnz.b).a(10000, cnz.d).a(12000, cnz.e).a();
   public static final cob f = a("villager_default").a(10, cnz.b).a(2000, cnz.c).a(9000, cnz.f).a(11000, cnz.b).a(12000, cnz.e).a();
   private final Map<cnz, cod> g = Maps.newHashMap();

   protected static coc a(String $$0) {
      cob $$1 = jw.a(lq.B, $$0, new cob());
      return new coc($$1);
   }

   protected void a(cnz $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cod());
      }
   }

   protected cod b(cnz $$0) {
      return this.g.get($$0);
   }

   protected List<cod> c(cnz $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cnz a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cnz.b);
   }
}
