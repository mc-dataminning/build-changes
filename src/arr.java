import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class arr implements asa {
   static final Logger b = LogUtils.getLogger();
   protected final List<arr.d> a = Lists.newArrayList();
   private final aqp c;
   private final String d;

   public arr(aqp $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(aqo $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(aqo $$0, Predicate<aiy> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<aiy> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable aqo $$1, @Nullable Predicate<aiy> $$2) {
      this.a.add(new arr.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<ary> getResource(aiy $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         arr.d $$2 = this.a.get($$1);
         aqo $$3 = $$2.b;
         if ($$3 != null) {
            ars<InputStream> $$4 = $$3.a(this.c, $$0);
            if ($$4 != null) {
               ars<asc> $$5 = this.a($$0, $$1);
               return Optional.of(a($$3, $$0, $$4, $$5));
            }
         }

         if ($$2.a($$0)) {
            b.warn("Resource {} not found, but was filtered by pack {}", $$0, $$2.a);
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static ary a(aqo $$0, aiy $$1, ars<InputStream> $$2, ars<asc> $$3) {
      return new ary($$0, a($$1, $$0, $$2), $$3);
   }

   private static ars<InputStream> a(aiy $$0, aqo $$1, ars<InputStream> $$2) {
      return b.isDebugEnabled() ? () -> new arr.c($$2.get(), $$0, $$1.a()) : $$2;
   }

   @Override
   public List<ary> a(aiy $$0) {
      aiy $$1 = d($$0);
      List<ary> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         arr.d $$6 = this.a.get($$5);
         aqo $$7 = $$6.b;
         if ($$7 != null) {
            ars<InputStream> $$8 = $$7.a(this.c, $$0);
            if ($$8 != null) {
               ars<asc> $$9;
               if ($$3) {
                  $$9 = asc.b;
               } else {
                  $$9 = () -> {
                     ars<InputStream> $$2x = $$7.a(this.c, $$1);
                     return $$2x != null ? b($$2x) : asc.a;
                  };
               }

               $$2.add(new ary($$7, $$8, $$9));
            }
         }

         if ($$6.a($$0)) {
            $$4 = $$6.a;
            break;
         }

         if ($$6.a($$1)) {
            $$3 = true;
         }
      }

      if ($$2.isEmpty() && $$4 != null) {
         b.warn("Resource {} not found, but was filtered by pack {}", $$0, $$4);
      }

      return Lists.reverse($$2);
   }

   private static boolean b(aiy $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static aiy c(aiy $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.c($$1);
   }

   static aiy d(aiy $$0) {
      return $$0.c($$0.a() + ".mcmeta");
   }

   @Override
   public Map<aiy, ary> b(String $$0, Predicate<aiy> $$1) {
      record a(aqo a, ars<InputStream> b, int c) {
      }

      Map<aiy, a> $$2 = new HashMap<>();
      Map<aiy, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         arr.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         aqo $$7 = $$6.b;
         if ($$7 != null) {
            int $$8 = $$5;
            $$7.a(this.c, this.d, $$0, ($$5x, $$6x) -> {
               if (b($$5x)) {
                  if ($$1.test(c($$5x))) {
                     $$3.put($$5x, new a($$7, $$6x, $$8));
                  }
               } else if ($$1.test($$5x)) {
                  $$2.put($$5x, new a($$7, $$6x, $$8));
               }
            });
         }
      }

      Map<aiy, ary> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         aiy $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         ars<asc> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = asc.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private ars<asc> a(aiy $$0, int $$1) {
      return () -> {
         aiy $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            arr.d $$4 = this.a.get($$3);
            aqo $$5 = $$4.b;
            if ($$5 != null) {
               ars<InputStream> $$6 = $$5.a(this.c, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return asc.a;
      };
   }

   private static ars<asc> a(ars<InputStream> $$0) {
      return () -> b($$0);
   }

   private static asc b(ars<InputStream> $$0) throws IOException {
      asc var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = asc.a($$1);
      }

      return var2;
   }

   private static void a(arr.d $$0, Map<aiy, arr.b> $$1) {
      for (arr.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(arr.d $$0, String $$1, Predicate<aiy> $$2, Map<aiy, arr.b> $$3) {
      aqo $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.c, this.d, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               aiy $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, arr.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, arr.b::new).c.add(new arr.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<aiy, List<ary>> c(String $$0, Predicate<aiy> $$1) {
      Map<aiy, arr.b> $$2 = Maps.newHashMap();

      for (arr.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<aiy, List<ary>> $$4 = Maps.newTreeMap();

      for (arr.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<ary> $$6 = new ArrayList<>();

            for (arr.e $$7 : $$5.c) {
               aqo $$8 = $$7.a;
               ars<InputStream> $$9 = $$5.d.get($$8);
               ars<asc> $$10 = $$9 != null ? a($$9) : asc.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<aqo> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(aiy a, aiy b, List<arr.e> c, Map<aqo, ars<InputStream>> d) {

      b(aiy $$0) {
         this($$0, arr.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, aiy $$1, String $$2) {
         super($$0);
         Exception $$3 = new Exception("Stacktrace");
         this.a = () -> {
            StringWriter $$3x = new StringWriter();
            $$3.printStackTrace(new PrintWriter($$3x));
            return "Leaked resource: '" + $$1 + "' loaded from pack: '" + $$2 + "'\n" + $$3x;
         };
      }

      @Override
      public void close() throws IOException {
         super.close();
         this.b = true;
      }

      @Override
      protected void finalize() throws Throwable {
         if (!this.b) {
            arr.b.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable aqo b, @Nullable Predicate<aiy> c) {

      public void a(Collection<aiy> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(aiy $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(aqo a, ars<InputStream> b) {
   }
}
