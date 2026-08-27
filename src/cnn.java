import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cnn {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cnn c = a("empty").a(0, cnl.b).a();
   public static final cnn d = a("simple").a(5000, cnl.c).a(11000, cnl.e).a();
   public static final cnn e = a("villager_baby").a(10, cnl.b).a(3000, cnl.d).a(6000, cnl.b).a(10000, cnl.d).a(12000, cnl.e).a();
   public static final cnn f = a("villager_default").a(10, cnl.b).a(2000, cnl.c).a(9000, cnl.f).a(11000, cnl.b).a(12000, cnl.e).a();
   private final Map<cnl, cnp> g = Maps.newHashMap();

   protected static cno a(String $$0) {
      cnn $$1 = jk.a(le.D, $$0, new cnn());
      return new cno($$1);
   }

   protected void a(cnl $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cnp());
      }
   }

   protected cnp b(cnl $$0) {
      return this.g.get($$0);
   }

   protected List<cnp> c(cnl $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cnl a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cnl.b);
   }
}
