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

public class auv implements aus {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, aut> c;
   private final List<atp> d;

   public auv(atr $$0, List<atp> $$1) {
      this.d = List.copyOf($$1);
      Map<String, aut> $$2 = new HashMap<>();
      List<String> $$3 = $$1.stream().flatMap($$1x -> $$1x.a($$0).stream()).distinct().toList();

      for (atp $$4 : $$1) {
         avc $$5 = this.a($$4);
         Set<String> $$6 = $$4.a($$0);
         Predicate<alg> $$7 = $$5 != null ? $$1x -> $$5.b($$1x.a()) : null;

         for (String $$8 : $$3) {
            boolean $$9 = $$6.contains($$8);
            boolean $$10 = $$5 != null && $$5.a($$8);
            if ($$9 || $$10) {
               aut $$11 = $$2.get($$8);
               if ($$11 == null) {
                  $$11 = new aut($$0, $$8);
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
   private avc a(atp $$0) {
      try {
         return $$0.a(avc.a);
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
   public Optional<avb> getResource(alg $$0) {
      avd $$1 = this.c.get($$0.b());
      return $$1 != null ? $$1.getResource($$0) : Optional.empty();
   }

   @Override
   public List<avb> a(alg $$0) {
      avd $$1 = this.c.get($$0.b());
      return $$1 != null ? $$1.a($$0) : List.of();
   }

   @Override
   public Map<alg, avb> b(String $$0, Predicate<alg> $$1) {
      a($$0);
      Map<alg, avb> $$2 = new TreeMap<>();

      for (aut $$3 : this.c.values()) {
         $$2.putAll($$3.b($$0, $$1));
      }

      return $$2;
   }

   @Override
   public Map<alg, List<avb>> c(String $$0, Predicate<alg> $$1) {
      a($$0);
      Map<alg, List<avb>> $$2 = new TreeMap<>();

      for (aut $$3 : this.c.values()) {
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
   public Stream<atp> b() {
      return this.d.stream();
   }

   @Override
   public void close() {
      this.d.forEach(atp::close);
   }
}
