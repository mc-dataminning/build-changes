import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class crh {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final crh c = a("empty").a(0, crf.b).a();
   public static final crh d = a("simple").a(5000, crf.c).a(11000, crf.e).a();
   public static final crh e = a("villager_baby").a(10, crf.b).a(3000, crf.d).a(6000, crf.b).a(10000, crf.d).a(12000, crf.e).a();
   public static final crh f = a("villager_default").a(10, crf.b).a(2000, crf.c).a(9000, crf.f).a(11000, crf.b).a(12000, crf.e).a();
   private final Map<crf, crj> g = Maps.newHashMap();

   protected static cri a(String $$0) {
      crh $$1 = kd.a(ma.B, $$0, new crh());
      return new cri($$1);
   }

   protected void a(crf $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new crj());
      }
   }

   protected crj b(crf $$0) {
      return this.g.get($$0);
   }

   protected List<crj> c(crf $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public crf a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(crf.b);
   }
}
