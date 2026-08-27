import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class clk {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final clk c = a("empty").a(0, cli.b).a();
   public static final clk d = a("simple").a(5000, cli.c).a(11000, cli.e).a();
   public static final clk e = a("villager_baby").a(10, cli.b).a(3000, cli.d).a(6000, cli.b).a(10000, cli.d).a(12000, cli.e).a();
   public static final clk f = a("villager_default").a(10, cli.b).a(2000, cli.c).a(9000, cli.f).a(11000, cli.b).a(12000, cli.e).a();
   private final Map<cli, clm> g = Maps.newHashMap();

   protected static cll a(String $$0) {
      clk $$1 = iy.a(kr.D, $$0, new clk());
      return new cll($$1);
   }

   protected void a(cli $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new clm());
      }
   }

   protected clm b(cli $$0) {
      return this.g.get($$0);
   }

   protected List<clm> c(cli $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cli a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> (double)$$1.getValue().a($$0))).map(Entry::getKey).orElse(cli.b);
   }
}
