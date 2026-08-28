import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ctf {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ctf c = a("empty").a(0, ctd.b).a();
   public static final ctf d = a("simple").a(5000, ctd.c).a(11000, ctd.e).a();
   public static final ctf e = a("villager_baby").a(10, ctd.b).a(3000, ctd.d).a(6000, ctd.b).a(10000, ctd.d).a(12000, ctd.e).a();
   public static final ctf f = a("villager_default").a(10, ctd.b).a(2000, ctd.c).a(9000, ctd.f).a(11000, ctd.b).a(12000, ctd.e).a();
   private final Map<ctd, cth> g = Maps.newHashMap();

   protected static ctg a(String $$0) {
      ctf $$1 = js.a(mg.B, $$0, new ctf());
      return new ctg($$1);
   }

   protected void a(ctd $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cth());
      }
   }

   protected cth b(ctd $$0) {
      return this.g.get($$0);
   }

   protected List<cth> c(ctd $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ctd a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ctd.b);
   }
}
