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

public class flk extends axi {
   private final Map<dde, ddd> b = new HashMap<>();
   private final Set<dde> c = new HashSet<>();
   private Map<dcb, List<fxs>> d = Map.of();
   private List<fxs> e = List.of();

   public void a(ddd $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dde $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public boolean b(dde $$0) {
      return this.c.contains($$0);
   }

   public void c(dde $$0) {
      this.c.remove($$0);
   }

   public void d(dde $$0) {
      this.c.add($$0);
   }

   public void b() {
      Map<dbi, List<List<ddd>>> $$0 = a(this.b.values());
      Map<dcb, List<fxs>> $$1 = new HashMap<>();
      Builder<fxs> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fxs::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fxu $$3 : fxu.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dbi, List<List<ddd>>> a(Iterable<ddd> $$0) {
      Map<dbi, List<List<ddd>>> $$1 = new HashMap<>();
      Table<dbi, Integer, List<ddd>> $$2 = HashBasedTable.create();

      for (ddd $$3 : $$0) {
         dbi $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<ddd> $$6 = (List<ddd>)$$2.get($$4, $$5.getAsInt());
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

   public List<fxs> c() {
      return this.e;
   }

   public List<fxs> a(dcb $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
