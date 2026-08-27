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

public class anl implements anu {
   static final Logger b = LogUtils.getLogger();
   protected final List<anl.d> a = Lists.newArrayList();
   private final amj c;
   private final String d;

   public anl(amj $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(ami $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(ami $$0, Predicate<aex> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<aex> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable ami $$1, @Nullable Predicate<aex> $$2) {
      this.a.add(new anl.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<ans> getResource(aex $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         anl.d $$2 = this.a.get($$1);
         ami $$3 = $$2.b;
         if ($$3 != null) {
            anm<InputStream> $$4 = $$3.a(this.c, $$0);
            if ($$4 != null) {
               anm<anw> $$5 = this.a($$0, $$1);
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

   private static ans a(ami $$0, aex $$1, anm<InputStream> $$2, anm<anw> $$3) {
      return new ans($$0, a($$1, $$0, $$2), $$3);
   }

   private static anm<InputStream> a(aex $$0, ami $$1, anm<InputStream> $$2) {
      return b.isDebugEnabled() ? () -> new anl.c($$2.get(), $$0, $$1.a()) : $$2;
   }

   @Override
   public List<ans> a(aex $$0) {
      aex $$1 = d($$0);
      List<ans> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         anl.d $$6 = this.a.get($$5);
         ami $$7 = $$6.b;
         if ($$7 != null) {
            anm<InputStream> $$8 = $$7.a(this.c, $$0);
            if ($$8 != null) {
               anm<anw> $$9;
               if ($$3) {
                  $$9 = anw.b;
               } else {
                  $$9 = () -> {
                     anm<InputStream> $$2x = $$7.a(this.c, $$1);
                     return $$2x != null ? b($$2x) : anw.a;
                  };
               }

               $$2.add(new ans($$7, $$8, $$9));
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

   private static boolean b(aex $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static aex c(aex $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.c($$1);
   }

   static aex d(aex $$0) {
      return $$0.c($$0.a() + ".mcmeta");
   }

   @Override
   public Map<aex, ans> b(String $$0, Predicate<aex> $$1) {
      record a(ami a, anm<InputStream> b, int c) {
      }

      Map<aex, a> $$2 = new HashMap<>();
      Map<aex, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         anl.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         ami $$7 = $$6.b;
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

      Map<aex, ans> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         aex $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         anm<anw> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = anw.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private anm<anw> a(aex $$0, int $$1) {
      return () -> {
         aex $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            anl.d $$4 = this.a.get($$3);
            ami $$5 = $$4.b;
            if ($$5 != null) {
               anm<InputStream> $$6 = $$5.a(this.c, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return anw.a;
      };
   }

   private static anm<anw> a(anm<InputStream> $$0) {
      return () -> b($$0);
   }

   private static anw b(anm<InputStream> $$0) throws IOException {
      anw var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = anw.a($$1);
      }

      return var2;
   }

   private static void a(anl.d $$0, Map<aex, anl.b> $$1) {
      for (anl.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(anl.d $$0, String $$1, Predicate<aex> $$2, Map<aex, anl.b> $$3) {
      ami $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.c, this.d, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               aex $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, anl.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, anl.b::new).c.add(new anl.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<aex, List<ans>> c(String $$0, Predicate<aex> $$1) {
      Map<aex, anl.b> $$2 = Maps.newHashMap();

      for (anl.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<aex, List<ans>> $$4 = Maps.newTreeMap();

      for (anl.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<ans> $$6 = new ArrayList<>();

            for (anl.e $$7 : $$5.c) {
               ami $$8 = $$7.a;
               anm<InputStream> $$9 = $$5.d.get($$8);
               anm<anw> $$10 = $$9 != null ? a($$9) : anw.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<ami> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(aex a, aex b, List<anl.e> c, Map<ami, anm<InputStream>> d) {

      b(aex $$0) {
         this($$0, anl.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, aex $$1, String $$2) {
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
            anl.b.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable ami b, @Nullable Predicate<aex> c) {

      public void a(Collection<aex> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(aex $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(ami a, anm<InputStream> b) {
   }
}
