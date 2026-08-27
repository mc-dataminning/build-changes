import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ckj {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final ckj c = a("empty").a(0, ckh.b).a();
   public static final ckj d = a("simple").a(5000, ckh.c).a(11000, ckh.e).a();
   public static final ckj e = a("villager_baby").a(10, ckh.b).a(3000, ckh.d).a(6000, ckh.b).a(10000, ckh.d).a(12000, ckh.e).a();
   public static final ckj f = a("villager_default").a(10, ckh.b).a(2000, ckh.c).a(9000, ckh.f).a(11000, ckh.b).a(12000, ckh.e).a();
   private final Map<ckh, ckl> g = Maps.newHashMap();

   protected static ckk a(String $$0) {
      ckj $$1 = iy.a(ki.D, $$0, new ckj());
      return new ckk($$1);
   }

   protected void a(ckh $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new ckl());
      }
   }

   protected ckl b(ckh $$0) {
      return this.g.get($$0);
   }

   protected List<ckl> c(ckh $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public ckh a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(ckh.b);
   }
}
