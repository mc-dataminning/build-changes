import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cek {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cek c = a("empty").a(0, cei.b).a();
   public static final cek d = a("simple").a(5000, cei.c).a(11000, cei.e).a();
   public static final cek e = a("villager_baby").a(10, cei.b).a(3000, cei.d).a(6000, cei.b).a(10000, cei.d).a(12000, cei.e).a();
   public static final cek f = a("villager_default").a(10, cei.b).a(2000, cei.c).a(9000, cei.f).a(11000, cei.b).a(12000, cei.e).a();
   private final Map<cei, cem> g = Maps.newHashMap();

   protected static cel a(String $$0) {
      cek $$1 = io.a(jy.E, $$0, new cek());
      return new cel($$1);
   }

   protected void a(cei $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cem());
      }
   }

   protected cem b(cei $$0) {
      return this.g.get($$0);
   }

   protected List<cem> c(cei $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cei a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cei.b);
   }
}
