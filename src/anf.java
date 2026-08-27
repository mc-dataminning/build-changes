import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anf implements anc {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, and> b;
   private final List<ama> c;

   public anf(amb $$0, List<ama> $$1) {
      this.c = List.copyOf($$1);
      Map<String, and> $$2 = new HashMap<>();
      List<String> $$3 = $$1.stream().flatMap($$1x -> $$1x.a($$0).stream()).distinct().toList();

      for (ama $$4 : $$1) {
         anl $$5 = this.a($$4);
         Set<String> $$6 = $$4.a($$0);
         Predicate<aer> $$7 = $$5 != null ? $$1x -> $$5.b($$1x.a()) : null;

         for (String $$8 : $$3) {
            boolean $$9 = $$6.contains($$8);
            boolean $$10 = $$5 != null && $$5.a($$8);
            if ($$9 || $$10) {
               and $$11 = $$2.get($$8);
               if ($$11 == null) {
                  $$11 = new and($$0, $$8);
                  $$2.put($$8, $$11);
               }

               if ($$9 && $$10) {
                  $$11.a($$4, $$7);
               } else if ($$9) {
                  $$11.a($$4);
               } else {
                  $$11.a($$4.a(), $$7);
               }
            }
         }
      }

      this.b = $$2;
   }

   @Nullable
   private anl a(ama $$0) {
      try {
         return $$0.a(anl.a);
      } catch (IOException var3) {
         a.error("Failed to get filter section from pack {}", $$0.a());
         return null;
      }
   }

   @Override
   public Set<String> a() {
      return this.b.keySet();
   }

   @Override
   public Optional<ank> getResource(aer $$0) {
      anm $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.getResource($$0) : Optional.empty();
   }

   @Override
   public List<ank> a(aer $$0) {
      anm $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.a($$0) : List.of();
   }

   @Override
   public Map<aer, ank> b(String $$0, Predicate<aer> $$1) {
      a($$0);
      Map<aer, ank> $$2 = new TreeMap<>();

      for (and $$3 : this.b.values()) {
         $$2.putAll($$3.b($$0, $$1));
      }

      return $$2;
   }

   @Override
   public Map<aer, List<ank>> c(String $$0, Predicate<aer> $$1) {
      a($$0);
      Map<aer, List<ank>> $$2 = new TreeMap<>();

      for (and $$3 : this.b.values()) {
         $$2.putAll($$3.c($$0, $$1));
      }

      return $$2;
   }

   private static void a(String $$0) {
      if ($$0.endsWith("/")) {
         throw new IllegalArgumentException("Trailing slash in path " + $$0);
      }
   }

   @Override
   public Stream<ama> b() {
      return this.c.stream();
   }

   @Override
   public void close() {
      this.c.forEach(ama::close);
   }
}
