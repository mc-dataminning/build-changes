import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class fqq extends awu {
   private final Map<dfz, dfy> b = new HashMap<>();
   private final Set<dfz> c = new HashSet<>();
   private Map<dej, List<gei>> d = Map.of();
   private List<gei> e = List.of();

   public void a(dfy $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dfz $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dfz $$0) {
      return this.c.contains($$0);
   }

   public void c(dfz $$0) {
      this.c.remove($$0);
   }

   public void d(dfz $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<deu, List<List<dfy>>> $$0 = a(this.b.values());
      Map<dej, List<gei>> $$1 = new HashMap<>();
      Builder<gei> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gei::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gek $$3 : gek.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<deu, List<List<dfy>>> a(Iterable<dfy> $$0) {
      Map<deu, List<List<dfy>>> $$1 = new HashMap<>();
      Table<deu, Integer, List<dfy>> $$2 = HashBasedTable.create();

      for (dfy $$3 : $$0) {
         deu $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dfy> $$6 = (List<dfy>)$$2.get($$4, $$5.getAsInt());
            if ($$6 == null) {
               $$6 = new ArrayList<>();
               $$2.put($$4, $$5.getAsInt(), $$6);
               $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add($$6);
            }

            $$6.add($$3);
         }
      }

      return $$1;
   }

   public List<gei> d() {
      return this.e;
   }

   public List<gei> a(dej $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
