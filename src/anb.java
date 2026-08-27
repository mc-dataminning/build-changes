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

public class anb implements ank {
   static final Logger b = LogUtils.getLogger();
   protected final List<anb.d> a = Lists.newArrayList();
   private final alz c;
   private final String d;

   public anb(alz $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(aly $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(aly $$0, Predicate<aep> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<aep> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable aly $$1, @Nullable Predicate<aep> $$2) {
      this.a.add(new anb.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<ani> getResource(aep $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         anb.d $$2 = this.a.get($$1);
         aly $$3 = $$2.b;
         if ($$3 != null) {
            anc<InputStream> $$4 = $$3.a(this.c, $$0);
            if ($$4 != null) {
               anc<anm> $$5 = this.a($$0, $$1);
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

   private static ani a(aly $$0, aep $$1, anc<InputStream> $$2, anc<anm> $$3) {
      return new ani($$0, a($$1, $$0, $$2), $$3);
   }

   private static anc<InputStream> a(aep $$0, aly $$1, anc<InputStream> $$2) {
      return b.isDebugEnabled() ? () -> new anb.c($$2.get(), $$0, $$1.a()) : $$2;
   }

   @Override
   public List<ani> a(aep $$0) {
      aep $$1 = d($$0);
      List<ani> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         anb.d $$6 = this.a.get($$5);
         aly $$7 = $$6.b;
         if ($$7 != null) {
            anc<InputStream> $$8 = $$7.a(this.c, $$0);
            if ($$8 != null) {
               anc<anm> $$9;
               if ($$3) {
                  $$9 = anm.b;
               } else {
                  $$9 = () -> {
                     anc<InputStream> $$2x = $$7.a(this.c, $$1);
                     return $$2x != null ? b($$2x) : anm.a;
                  };
               }

               $$2.add(new ani($$7, $$8, $$9));
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

   private static boolean b(aep $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static aep c(aep $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.c($$1);
   }

   static aep d(aep $$0) {
      return $$0.c($$0.a() + ".mcmeta");
   }

   @Override
   public Map<aep, ani> b(String $$0, Predicate<aep> $$1) {
      record a(aly a, anc<InputStream> b, int c) {
      }

      Map<aep, a> $$2 = new HashMap<>();
      Map<aep, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         anb.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         aly $$7 = $$6.b;
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

      Map<aep, ani> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         aep $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         anc<anm> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = anm.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private anc<anm> a(aep $$0, int $$1) {
      return () -> {
         aep $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            anb.d $$4 = this.a.get($$3);
            aly $$5 = $$4.b;
            if ($$5 != null) {
               anc<InputStream> $$6 = $$5.a(this.c, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return anm.a;
      };
   }

   private static anc<anm> a(anc<InputStream> $$0) {
      return () -> b($$0);
   }

   private static anm b(anc<InputStream> $$0) throws IOException {
      anm var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = anm.a($$1);
      }

      return var2;
   }

   private static void a(anb.d $$0, Map<aep, anb.b> $$1) {
      for (anb.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(anb.d $$0, String $$1, Predicate<aep> $$2, Map<aep, anb.b> $$3) {
      aly $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.c, this.d, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               aep $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, anb.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, anb.b::new).c.add(new anb.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<aep, List<ani>> c(String $$0, Predicate<aep> $$1) {
      Map<aep, anb.b> $$2 = Maps.newHashMap();

      for (anb.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<aep, List<ani>> $$4 = Maps.newTreeMap();

      for (anb.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<ani> $$6 = new ArrayList<>();

            for (anb.e $$7 : $$5.c) {
               aly $$8 = $$7.a;
               anc<InputStream> $$9 = $$5.d.get($$8);
               anc<anm> $$10 = $$9 != null ? a($$9) : anm.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<aly> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(aep a, aep b, List<anb.e> c, Map<aly, anc<InputStream>> d) {

      b(aep $$0) {
         this($$0, anb.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, aep $$1, String $$2) {
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
            anb.b.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable aly b, @Nullable Predicate<aep> c) {

      public void a(Collection<aep> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(aep $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(aly a, anc<InputStream> b) {
   }
}
