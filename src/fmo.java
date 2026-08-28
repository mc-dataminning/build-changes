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

public class fmo extends awn {
   private final Map<ddt, dds> b = new HashMap<>();
   private final Set<ddt> c = new HashSet<>();
   private Map<dcd, List<gai>> d = Map.of();
   private List<gai> e = List.of();

   public void a(dds $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(ddt $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(ddt $$0) {
      return this.c.contains($$0);
   }

   public void c(ddt $$0) {
      this.c.remove($$0);
   }

   public void d(ddt $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dco, List<List<dds>>> $$0 = a(this.b.values());
      Map<dcd, List<gai>> $$1 = new HashMap<>();
      Builder<gai> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(gai::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gak $$3 : gak.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dco, List<List<dds>>> a(Iterable<dds> $$0) {
      Map<dco, List<List<dds>>> $$1 = new HashMap<>();
      Table<dco, Integer, List<dds>> $$2 = HashBasedTable.create();

      for (dds $$3 : $$0) {
         dco $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dds> $$6 = (List<dds>)$$2.get($$4, $$5.getAsInt());
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

   public List<gai> d() {
      return this.e;
   }

   public List<gai> a(dcd $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
