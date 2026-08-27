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

public class aow implements aot {
   private static final Logger a = LogUtils.getLogger();
   private final Map<String, aou> b;
   private final List<anr> c;

   public aow(ans $$0, List<anr> $$1) {
      this.c = List.copyOf($$1);
      Map<String, aou> $$2 = new HashMap<>();
      List<String> $$3 = $$1.stream().flatMap($$1x -> $$1x.a($$0).stream()).distinct().toList();

      for (anr $$4 : $$1) {
         apc $$5 = this.a($$4);
         Set<String> $$6 = $$4.a($$0);
         Predicate<agg> $$7 = $$5 != null ? $$1x -> $$5.b($$1x.a()) : null;

         for (String $$8 : $$3) {
            boolean $$9 = $$6.contains($$8);
            boolean $$10 = $$5 != null && $$5.a($$8);
            if ($$9 || $$10) {
               aou $$11 = $$2.get($$8);
               if ($$11 == null) {
                  $$11 = new aou($$0, $$8);
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
   private apc a(anr $$0) {
      try {
         return $$0.a(apc.a);
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
   public Optional<apb> getResource(agg $$0) {
      apd $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.getResource($$0) : Optional.empty();
   }

   @Override
   public List<apb> a(agg $$0) {
      apd $$1 = this.b.get($$0.b());
      return $$1 != null ? $$1.a($$0) : List.of();
   }

   @Override
   public Map<agg, apb> b(String $$0, Predicate<agg> $$1) {
      a($$0);
      Map<agg, apb> $$2 = new TreeMap<>();

      for (aou $$3 : this.b.values()) {
         $$2.putAll($$3.b($$0, $$1));
      }

      return $$2;
   }

   @Override
   public Map<agg, List<apb>> c(String $$0, Predicate<agg> $$1) {
      a($$0);
      Map<agg, List<apb>> $$2 = new TreeMap<>();

      for (aou $$3 : this.b.values()) {
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
   public Stream<anr> b() {
      return this.c.stream();
   }

   @Override
   public void close() {
      this.c.forEach(anr::close);
   }
}
