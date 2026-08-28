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

public class auk implements aut {
   static final Logger c = LogUtils.getLogger();
   protected final List<auk.d> a = Lists.newArrayList();
   private final ath d;
   private final String e;

   public auk(ath $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(atf $$0) {
      this.a($$0.b(), $$0, null);
   }

   public void a(atf $$0, Predicate<alc> $$1) {
      this.a($$0.b(), $$0, $$1);
   }

   public void a(String $$0, Predicate<alc> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable atf $$1, @Nullable Predicate<alc> $$2) {
      this.a.add(new auk.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.e);
   }

   @Override
   public Optional<aur> getResource(alc $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         auk.d $$2 = this.a.get($$1);
         atf $$3 = $$2.b;
         if ($$3 != null) {
            aul<InputStream> $$4 = $$3.a(this.d, $$0);
            if ($$4 != null) {
               aul<auv> $$5 = this.a($$0, $$1);
               return Optional.of(a($$3, $$0, $$4, $$5));
            }
         }

         if ($$2.a($$0)) {
            c.warn("Resource {} not found, but was filtered by pack {}", $$0, $$2.a);
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static aur a(atf $$0, alc $$1, aul<InputStream> $$2, aul<auv> $$3) {
      return new aur($$0, a($$1, $$0, $$2), $$3);
   }

   private static aul<InputStream> a(alc $$0, atf $$1, aul<InputStream> $$2) {
      return c.isDebugEnabled() ? () -> new auk.c($$2.get(), $$0, $$1.b()) : $$2;
   }

   @Override
   public List<aur> a(alc $$0) {
      alc $$1 = d($$0);
      List<aur> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         auk.d $$6 = this.a.get($$5);
         atf $$7 = $$6.b;
         if ($$7 != null) {
            aul<InputStream> $$8 = $$7.a(this.d, $$0);
            if ($$8 != null) {
               aul<auv> $$9;
               if ($$3) {
                  $$9 = auv.b;
               } else {
                  $$9 = () -> {
                     aul<InputStream> $$2x = $$7.a(this.d, $$1);
                     return $$2x != null ? b($$2x) : auv.a;
                  };
               }

               $$2.add(new aur($$7, $$8, $$9));
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
         c.warn("Resource {} not found, but was filtered by pack {}", $$0, $$4);
      }

      return Lists.reverse($$2);
   }

   private static boolean b(alc $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static alc c(alc $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.e($$1);
   }

   static alc d(alc $$0) {
      return $$0.e($$0.a() + ".mcmeta");
   }

   @Override
   public Map<alc, aur> b(String $$0, Predicate<alc> $$1) {
      record a(atf a, aul<InputStream> b, int c) {
      }

      Map<alc, a> $$2 = new HashMap<>();
      Map<alc, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         auk.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         atf $$7 = $$6.b;
         if ($$7 != null) {
            int $$8 = $$5;
            $$7.a(this.d, this.e, $$0, ($$5x, $$6x) -> {
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

      Map<alc, aur> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         alc $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         aul<auv> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = auv.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private aul<auv> a(alc $$0, int $$1) {
      return () -> {
         alc $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            auk.d $$4 = this.a.get($$3);
            atf $$5 = $$4.b;
            if ($$5 != null) {
               aul<InputStream> $$6 = $$5.a(this.d, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return auv.a;
      };
   }

   private static aul<auv> a(aul<InputStream> $$0) {
      return () -> b($$0);
   }

   private static auv b(aul<InputStream> $$0) throws IOException {
      auv var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = auv.a($$1);
      }

      return var2;
   }

   private static void a(auk.d $$0, Map<alc, auk.b> $$1) {
      for (auk.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(auk.d $$0, String $$1, Predicate<alc> $$2, Map<alc, auk.b> $$3) {
      atf $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.d, this.e, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               alc $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, auk.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, auk.b::new).c.add(new auk.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<alc, List<aur>> c(String $$0, Predicate<alc> $$1) {
      Map<alc, auk.b> $$2 = Maps.newHashMap();

      for (auk.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<alc, List<aur>> $$4 = Maps.newTreeMap();

      for (auk.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<aur> $$6 = new ArrayList<>();

            for (auk.e $$7 : $$5.c) {
               atf $$8 = $$7.a;
               aul<InputStream> $$9 = $$5.d.get($$8);
               aul<auv> $$10 = $$9 != null ? a($$9) : auv.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<atf> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(alc a, alc b, List<auk.e> c, Map<atf, aul<InputStream>> d) {

      b(alc $$0) {
         this($$0, auk.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, alc $$1, String $$2) {
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
            auk.c.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable atf b, @Nullable Predicate<alc> c) {

      public void a(Collection<alc> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(alc $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(atf a, aul<InputStream> b) {
   }
}
