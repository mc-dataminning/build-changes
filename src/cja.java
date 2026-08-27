import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cja {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cja c = a("empty").a(0, ciy.b).a();
   public static final cja d = a("simple").a(5000, ciy.c).a(11000, ciy.e).a();
   public static final cja e = a("villager_baby").a(10, ciy.b).a(3000, ciy.d).a(6000, ciy.b).a(10000, ciy.d).a(12000, ciy.e).a();
   public static final cja f = a("villager_default").a(10, ciy.b).a(2000, ciy.c).a(9000, ciy.f).a(11000, ciy.b).a(12000, ciy.e).a();
   private final Map<ciy, cjc> g = Maps.newHashMap();

   protected static cjb a(String $$0) {
      cja $$1 = iv.a(kf.D, $$0, new cja());
      return new cjb($$1);
   }

   protected void a(ciy $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cjc());
      }
   }

   protected cjc b(ciy $$0) {
      return this.g.get($$0);
   }

   protected List<cjc> c(ciy $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ciy a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ciy.b);
   }
}
