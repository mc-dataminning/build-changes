import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class fsg {
   private final arz a = asc.c();
   private final Map<arv, String> b;

   public fsg() {
      this.a.a();
      Builder<arv, String> $$0 = ImmutableMap.builder();
      this.a.c().forEach($$1 -> {
         aqz $$2 = $$1.a();
         $$2.d().ifPresent($$2x -> $$0.put($$2x, $$2.a()));
      });
      this.b = $$0.build();
   }

   public List<arv> a(List<arv> $$0) {
      List<arv> $$1 = new ArrayList<>($$0.size());
      List<String> $$2 = new ArrayList<>($$0.size());

      for (arv $$3 : $$0) {
         String $$4 = this.b.get($$3);
         if ($$4 != null) {
            $$2.add($$4);
            $$1.add($$3);
         }
      }

      this.a.a($$2);
      return $$1;
   }

   public ase a() {
      List<ara> $$0 = this.a.g();
      return new ash(arc.b, $$0);
   }
}
