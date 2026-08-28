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

public class auf implements auo {
   static final Logger c = LogUtils.getLogger();
   protected final List<auf.d> a = Lists.newArrayList();
   private final atd d;
   private final String e;

   public auf(atd $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(atb $$0) {
      this.a($$0.b(), $$0, null);
   }

   public void a(atb $$0, Predicate<aku> $$1) {
      this.a($$0.b(), $$0, $$1);
   }

   public void a(String $$0, Predicate<aku> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable atb $$1, @Nullable Predicate<aku> $$2) {
      this.a.add(new auf.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.e);
   }

   @Override
   public Optional<aum> getResource(aku $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         auf.d $$2 = this.a.get($$1);
         atb $$3 = $$2.b;
         if ($$3 != null) {
            aug<InputStream> $$4 = $$3.a(this.d, $$0);
            if ($$4 != null) {
               aug<auq> $$5 = this.a($$0, $$1);
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

   private static aum a(atb $$0, aku $$1, aug<InputStream> $$2, aug<auq> $$3) {
      return new aum($$0, a($$1, $$0, $$2), $$3);
   }

   private static aug<InputStream> a(aku $$0, atb $$1, aug<InputStream> $$2) {
      return c.isDebugEnabled() ? () -> new auf.c($$2.get(), $$0, $$1.b()) : $$2;
   }

   @Override
   public List<aum> a(aku $$0) {
      aku $$1 = d($$0);
      List<aum> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         auf.d $$6 = this.a.get($$5);
         atb $$7 = $$6.b;
         if ($$7 != null) {
            aug<InputStream> $$8 = $$7.a(this.d, $$0);
            if ($$8 != null) {
               aug<auq> $$9;
               if ($$3) {
                  $$9 = auq.b;
               } else {
                  $$9 = () -> {
                     aug<InputStream> $$2x = $$7.a(this.d, $$1);
                     return $$2x != null ? b($$2x) : auq.a;
                  };
               }

               $$2.add(new aum($$7, $$8, $$9));
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

   private static boolean b(aku $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static aku c(aku $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.e($$1);
   }

   static aku d(aku $$0) {
      return $$0.e($$0.a() + ".mcmeta");
   }

   @Override
   public Map<aku, aum> b(String $$0, Predicate<aku> $$1) {
      record a(atb a, aug<InputStream> b, int c) {
      }

      Map<aku, a> $$2 = new HashMap<>();
      Map<aku, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         auf.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         atb $$7 = $$6.b;
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

      Map<aku, aum> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         aku $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         aug<auq> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = auq.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private aug<auq> a(aku $$0, int $$1) {
      return () -> {
         aku $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            auf.d $$4 = this.a.get($$3);
            atb $$5 = $$4.b;
            if ($$5 != null) {
               aug<InputStream> $$6 = $$5.a(this.d, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return auq.a;
      };
   }

   private static aug<auq> a(aug<InputStream> $$0) {
      return () -> b($$0);
   }

   private static auq b(aug<InputStream> $$0) throws IOException {
      auq var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = auq.a($$1);
      }

      return var2;
   }

   private static void a(auf.d $$0, Map<aku, auf.b> $$1) {
      for (auf.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(auf.d $$0, String $$1, Predicate<aku> $$2, Map<aku, auf.b> $$3) {
      atb $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.d, this.e, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               aku $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, auf.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, auf.b::new).c.add(new auf.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<aku, List<aum>> c(String $$0, Predicate<aku> $$1) {
      Map<aku, auf.b> $$2 = Maps.newHashMap();

      for (auf.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<aku, List<aum>> $$4 = Maps.newTreeMap();

      for (auf.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<aum> $$6 = new ArrayList<>();

            for (auf.e $$7 : $$5.c) {
               atb $$8 = $$7.a;
               aug<InputStream> $$9 = $$5.d.get($$8);
               aug<auq> $$10 = $$9 != null ? a($$9) : auq.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<atb> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(aku a, aku b, List<auf.e> c, Map<atb, aug<InputStream>> d) {

      b(aku $$0) {
         this($$0, auf.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, aku $$1, String $$2) {
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
            auf.c.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable atb b, @Nullable Predicate<aku> c) {

      public void a(Collection<aku> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(aku $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(atb a, aug<InputStream> b) {
   }
}
