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

public class ann implements ank {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, anl> b;
   private final List<ami> c;

   public ann(amj $$0, List<ami> $$1) {
      this.c = List.copyOf($$1);
      Map<String, anl> $$2 = new HashMap<>();
      List<String> $$3 = $$1.stream().flatMap($$1x -> $$1x.a($$0).stream()).distinct().toList();

      for (ami $$4 : $$1) {
         ant $$5 = this.a($$4);
         Set<String> $$6 = $$4.a($$0);
         Predicate<aex> $$7 = $$5 != null ? $$1x -> $$5.b($$1x.a()) : null;

         for (String $$8 : $$3) {
            boolean $$9 = $$6.contains($$8);
            boolean $$10 = $$5 != null && $$5.a($$8);
            if ($$9 || $$10) {
               anl $$11 = $$2.get($$8);
               if ($$11 == null) {
                  $$11 = new anl($$0, $$8);
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
   private ant a(ami $$0) {
      try {
         return $$0.a(ant.a);
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
   public Optional<ans> getResource(aex $$0) {
      anu $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.getResource($$0) : Optional.empty();
   }

   @Override
   public List<ans> a(aex $$0) {
      anu $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.a($$0) : List.of();
   }

   @Override
   public Map<aex, ans> b(String $$0, Predicate<aex> $$1) {
      a($$0);
      Map<aex, ans> $$2 = new TreeMap<>();

      for (anl $$3 : this.b.values()) {
         $$2.putAll($$3.b($$0, $$1));
      }

      return $$2;
   }

   @Override
   public Map<aex, List<ans>> c(String $$0, Predicate<aex> $$1) {
      a($$0);
      Map<aex, List<ans>> $$2 = new TreeMap<>();

      for (anl $$3 : this.b.values()) {
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
   public Stream<ami> b() {
      return this.c.stream();
   }

   @Override
   public void close() {
      this.c.forEach(ami::close);
   }
}
