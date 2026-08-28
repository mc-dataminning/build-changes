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

public class aus implements aup {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, auq> c;
   private final List<atl> d;

   public aus(atn $$0, List<atl> $$1) {
      this.d = List.copyOf($$1);
      Map<String, auq> $$2 = new HashMap<>();
      List<String> $$3 = $$1.stream().flatMap($$1x -> $$1x.a($$0).stream()).distinct().toList();

      for (atl $$4 : $$1) {
         auz $$5 = this.a($$4);
         Set<String> $$6 = $$4.a($$0);
         Predicate<alh> $$7 = $$5 != null ? $$1x -> $$5.b($$1x.a()) : null;

         for (String $$8 : $$3) {
            boolean $$9 = $$6.contains($$8);
            boolean $$10 = $$5 != null && $$5.a($$8);
            if ($$9 || $$10) {
               auq $$11 = $$2.get($$8);
               if ($$11 == null) {
                  $$11 = new auq($$0, $$8);
                  $$2.put($$8, $$11);
               }

               if ($$9 && $$10) {
                  $$11.a($$4, $$7);
               } else if ($$9) {
                  $$11.a($$4);
               } else {
                  $$11.a($$4.b(), $$7);
               }
            }
         }
      }

      this.c = $$2;
   }

   @Nullable
   private auz a(atl $$0) {
      try {
         return $$0.a(auz.a);
      } catch (IOException var3) {
         a.error("Failed to get filter section from pack {}", $$0.b());
         return null;
      }
   }

   @Override
   public Set<String> a() {
      return this.c.keySet();
   }

   @Override
   public Optional<auy> getResource(alh $$0) {
      ava $$1 = this.c.get($$0.b());
      return $$1 != null ? $$1.getResource($$0) : Optional.empty();
   }

   @Override
   public List<auy> a(alh $$0) {
      ava $$1 = this.c.get($$0.b());
      return $$1 != null ? $$1.a($$0) : List.of();
   }

   @Override
   public Map<alh, auy> b(String $$0, Predicate<alh> $$1) {
      a($$0);
      Map<alh, auy> $$2 = new TreeMap<>();

      for (auq $$3 : this.c.values()) {
         $$2.putAll($$3.b($$0, $$1));
      }

      return $$2;
   }

   @Override
   public Map<alh, List<auy>> c(String $$0, Predicate<alh> $$1) {
      a($$0);
      Map<alh, List<auy>> $$2 = new TreeMap<>();

      for (auq $$3 : this.c.values()) {
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
   public Stream<atl> b() {
      return this.d.stream();
   }

   @Override
   public void close() {
      this.d.forEach(atl::close);
   }
}
