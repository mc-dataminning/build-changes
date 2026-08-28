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

public class aut implements avd {
   static final Logger c = LogUtils.getLogger();
   protected final List<aut.d> a = Lists.newArrayList();
   private final atr d;
   private final String e;

   public aut(atr $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(atp $$0) {
      this.a($$0.b(), $$0, null);
   }

   public void a(atp $$0, Predicate<alg> $$1) {
      this.a($$0.b(), $$0, $$1);
   }

   public void a(String $$0, Predicate<alg> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable atp $$1, @Nullable Predicate<alg> $$2) {
      this.a.add(new aut.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.e);
   }

   @Override
   public Optional<avb> getResource(alg $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         aut.d $$2 = this.a.get($$1);
         atp $$3 = $$2.b;
         if ($$3 != null) {
            auu<InputStream> $$4 = $$3.a(this.d, $$0);
            if ($$4 != null) {
               auu<avf> $$5 = this.a($$0, $$1);
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

   private static avb a(atp $$0, alg $$1, auu<InputStream> $$2, auu<avf> $$3) {
      return new avb($$0, a($$1, $$0, $$2), $$3);
   }

   private static auu<InputStream> a(alg $$0, atp $$1, auu<InputStream> $$2) {
      return c.isDebugEnabled() ? () -> new aut.c($$2.get(), $$0, $$1.b()) : $$2;
   }

   @Override
   public List<avb> a(alg $$0) {
      alg $$1 = d($$0);
      List<avb> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         aut.d $$6 = this.a.get($$5);
         atp $$7 = $$6.b;
         if ($$7 != null) {
            auu<InputStream> $$8 = $$7.a(this.d, $$0);
            if ($$8 != null) {
               auu<avf> $$9;
               if ($$3) {
                  $$9 = avf.b;
               } else {
                  $$9 = () -> {
                     auu<InputStream> $$2x = $$7.a(this.d, $$1);
                     return $$2x != null ? b($$2x) : avf.a;
                  };
               }

               $$2.add(new avb($$7, $$8, $$9));
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

   private static boolean b(alg $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static alg c(alg $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.e($$1);
   }

   static alg d(alg $$0) {
      return $$0.e($$0.a() + ".mcmeta");
   }

   @Override
   public Map<alg, avb> b(String $$0, Predicate<alg> $$1) {
      record a(atp a, auu<InputStream> b, int c) {
      }

      Map<alg, a> $$2 = new HashMap<>();
      Map<alg, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         aut.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         atp $$7 = $$6.b;
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

      Map<alg, avb> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         alg $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         auu<avf> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = avf.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private auu<avf> a(alg $$0, int $$1) {
      return () -> {
         alg $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            aut.d $$4 = this.a.get($$3);
            atp $$5 = $$4.b;
            if ($$5 != null) {
               auu<InputStream> $$6 = $$5.a(this.d, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return avf.a;
      };
   }

   private static auu<avf> a(auu<InputStream> $$0) {
      return () -> b($$0);
   }

   private static avf b(auu<InputStream> $$0) throws IOException {
      avf var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = avf.a($$1);
      }

      return var2;
   }

   private static void a(aut.d $$0, Map<alg, aut.b> $$1) {
      for (aut.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(aut.d $$0, String $$1, Predicate<alg> $$2, Map<alg, aut.b> $$3) {
      atp $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.d, this.e, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               alg $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, aut.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, aut.b::new).c.add(new aut.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<alg, List<avb>> c(String $$0, Predicate<alg> $$1) {
      Map<alg, aut.b> $$2 = Maps.newHashMap();

      for (aut.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<alg, List<avb>> $$4 = Maps.newTreeMap();

      for (aut.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<avb> $$6 = new ArrayList<>();

            for (aut.e $$7 : $$5.c) {
               atp $$8 = $$7.a;
               auu<InputStream> $$9 = $$5.d.get($$8);
               auu<avf> $$10 = $$9 != null ? a($$9) : avf.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<atp> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(alg a, alg b, List<aut.e> c, Map<atp, auu<InputStream>> d) {

      b(alg $$0) {
         this($$0, aut.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, alg $$1, String $$2) {
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
            aut.c.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable atp b, @Nullable Predicate<alg> c) {

      public void a(Collection<alg> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(alg $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(atp a, auu<InputStream> b) {
   }
}
