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

public class foc extends awq {
   private final Map<dex, dew> b = new HashMap<>();
   private final Set<dex> c = new HashSet<>();
   private Map<ddh, List<gbx>> d = Map.of();
   private List<gbx> e = List.of();

   public void a(dew $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dex $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dex $$0) {
      return this.c.contains($$0);
   }

   public void c(dex $$0) {
      this.c.remove($$0);
   }

   public void d(dex $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dds, List<List<dew>>> $$0 = a(this.b.values());
      Map<ddh, List<gbx>> $$1 = new HashMap<>();
      Builder<gbx> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gbx::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gbz $$3 : gbz.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dds, List<List<dew>>> a(Iterable<dew> $$0) {
      Map<dds, List<List<dew>>> $$1 = new HashMap<>();
      Table<dds, Integer, List<dew>> $$2 = HashBasedTable.create();

      for (dew $$3 : $$0) {
         dds $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dew> $$6 = (List<dew>)$$2.get($$4, $$5.getAsInt());
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

   public List<gbx> d() {
      return this.e;
   }

   public List<gbx> a(ddh $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
