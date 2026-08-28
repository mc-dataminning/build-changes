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

public class fpe extends awq {
   private final Map<dfm, dfl> b = new HashMap<>();
   private final Set<dfm> c = new HashSet<>();
   private Map<ddw, List<gcv>> d = Map.of();
   private List<gcv> e = List.of();

   public void a(dfl $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dfm $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dfm $$0) {
      return this.c.contains($$0);
   }

   public void c(dfm $$0) {
      this.c.remove($$0);
   }

   public void d(dfm $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<deh, List<List<dfl>>> $$0 = a(this.b.values());
      Map<ddw, List<gcv>> $$1 = new HashMap<>();
      Builder<gcv> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gcv::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gcx $$3 : gcx.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<deh, List<List<dfl>>> a(Iterable<dfl> $$0) {
      Map<deh, List<List<dfl>>> $$1 = new HashMap<>();
      Table<deh, Integer, List<dfl>> $$2 = HashBasedTable.create();

      for (dfl $$3 : $$0) {
         deh $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dfl> $$6 = (List<dfl>)$$2.get($$4, $$5.getAsInt());
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

   public List<gcv> d() {
      return this.e;
   }

   public List<gcv> a(ddw $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
