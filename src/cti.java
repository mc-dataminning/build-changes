import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cti {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cti c = a("empty").a(0, ctg.b).a();
   public static final cti d = a("simple").a(5000, ctg.c).a(11000, ctg.e).a();
   public static final cti e = a("villager_baby").a(10, ctg.b).a(3000, ctg.d).a(6000, ctg.b).a(10000, ctg.d).a(12000, ctg.e).a();
   public static final cti f = a("villager_default").a(10, ctg.b).a(2000, ctg.c).a(9000, ctg.f).a(11000, ctg.b).a(12000, ctg.e).a();
   private final Map<ctg, ctk> g = Maps.newHashMap();

   protected static ctj a(String $$0) {
      cti $$1 = js.a(mg.B, $$0, new cti());
      return new ctj($$1);
   }

   protected void a(ctg $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ctk());
      }
   }

   protected ctk b(ctg $$0) {
      return this.g.get($$0);
   }

   protected List<ctk> c(ctg $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ctg a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ctg.b);
   }
}
