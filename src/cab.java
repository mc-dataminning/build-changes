import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cab {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cab c = a("empty").a(0, bzz.b).a();
   public static final cab d = a("simple").a(5000, bzz.c).a(11000, bzz.e).a();
   public static final cab e = a("villager_baby").a(10, bzz.b).a(3000, bzz.d).a(6000, bzz.b).a(10000, bzz.d).a(12000, bzz.e).a();
   public static final cab f = a("villager_default").a(10, bzz.b).a(2000, bzz.c).a(9000, bzz.f).a(11000, bzz.b).a(12000, bzz.e).a();
   private final Map<bzz, cad> g = Maps.newHashMap();

   protected static cac a(String $$0) {
      cab $$1 = hr.a(jb.E, $$0, new cab());
      return new cac($$1);
   }

   protected void a(bzz $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cad());
      }
   }

   protected cad b(bzz $$0) {
      return this.g.get($$0);
   }

   protected List<cad> c(bzz $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public bzz a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(bzz.b);
   }
}
