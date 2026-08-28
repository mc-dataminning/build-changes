import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class csy {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final csy c = a("empty").a(0, csw.b).a();
   public static final csy d = a("simple").a(5000, csw.c).a(11000, csw.e).a();
   public static final csy e = a("villager_baby").a(10, csw.b).a(3000, csw.d).a(6000, csw.b).a(10000, csw.d).a(12000, csw.e).a();
   public static final csy f = a("villager_default").a(10, csw.b).a(2000, csw.c).a(9000, csw.f).a(11000, csw.b).a(12000, csw.e).a();
   private final Map<csw, cta> g = Maps.newHashMap();

   protected static csz a(String $$0) {
      csy $$1 = jr.a(mf.B, $$0, new csy());
      return new csz($$1);
   }

   protected void a(csw $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cta());
      }
   }

   protected cta b(csw $$0) {
      return this.g.get($$0);
   }

   protected List<cta> c(csw $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public csw a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(csw.b);
   }
}
