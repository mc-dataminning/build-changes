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

public class foj extends awq {
   private final Map<dfc, dfb> b = new HashMap<>();
   private final Set<dfc> c = new HashSet<>();
   private Map<ddm, List<gce>> d = Map.of();
   private List<gce> e = List.of();

   public void a(dfb $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dfc $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dfc $$0) {
      return this.c.contains($$0);
   }

   public void c(dfc $$0) {
      this.c.remove($$0);
   }

   public void d(dfc $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<ddx, List<List<dfb>>> $$0 = a(this.b.values());
      Map<ddm, List<gce>> $$1 = new HashMap<>();
      Builder<gce> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gce::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gcg $$3 : gcg.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<ddx, List<List<dfb>>> a(Iterable<dfb> $$0) {
      Map<ddx, List<List<dfb>>> $$1 = new HashMap<>();
      Table<ddx, Integer, List<dfb>> $$2 = HashBasedTable.create();

      for (dfb $$3 : $$0) {
         ddx $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dfb> $$6 = (List<dfb>)$$2.get($$4, $$5.getAsInt());
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

   public List<gce> d() {
      return this.e;
   }

   public List<gce> a(ddm $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
