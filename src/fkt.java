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

public class fkt extends awd {
   private final Map<dck, dcj> b = new HashMap<>();
   private final Set<dck> c = new HashSet<>();
   private Map<dav, List<fyl>> d = Map.of();
   private List<fyl> e = List.of();

   public void a(dcj $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(dck $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(dck $$0) {
      return this.c.contains($$0);
   }

   public void c(dck $$0) {
      this.c.remove($$0);
   }

   public void d(dck $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dbg, List<List<dcj>>> $$0 = a(this.b.values());
      Map<dav, List<fyl>> $$1 = new HashMap<>();
      Builder<fyl> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, $$3x.stream().map(fyl::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (fyn $$3 : fyn.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dbg, List<List<dcj>>> a(Iterable<dcj> $$0) {
      Map<dbg, List<List<dcj>>> $$1 = new HashMap<>();
      Table<dbg, Integer, List<dcj>> $$2 = HashBasedTable.create();

      for (dcj $$3 : $$0) {
         dbg $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dcj> $$6 = (List<dcj>)$$2.get($$4, $$5.getAsInt());
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

   public List<fyl> d() {
      return this.e;
   }

   public List<fyl> a(dav $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
