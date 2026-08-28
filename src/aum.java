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

public class aum implements auv {
   static final Logger c = LogUtils.getLogger();
   protected final List<aum.d> a = Lists.newArrayList();
   private final atj d;
   private final String e;

   public aum(atj $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(ath $$0) {
      this.a($$0.b(), $$0, null);
   }

   public void a(ath $$0, Predicate<ale> $$1) {
      this.a($$0.b(), $$0, $$1);
   }

   public void a(String $$0, Predicate<ale> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable ath $$1, @Nullable Predicate<ale> $$2) {
      this.a.add(new aum.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.e);
   }

   @Override
   public Optional<aut> getResource(ale $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         aum.d $$2 = this.a.get($$1);
         ath $$3 = $$2.b;
         if ($$3 != null) {
            aun<InputStream> $$4 = $$3.a(this.d, $$0);
            if ($$4 != null) {
               aun<auy> $$5 = this.a($$0, $$1);
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

   private static aut a(ath $$0, ale $$1, aun<InputStream> $$2, aun<auy> $$3) {
      return new aut($$0, a($$1, $$0, $$2), $$3);
   }

   private static aun<InputStream> a(ale $$0, ath $$1, aun<InputStream> $$2) {
      return c.isDebugEnabled() ? () -> new aum.c($$2.get(), $$0, $$1.b()) : $$2;
   }

   @Override
   public List<aut> a(ale $$0) {
      ale $$1 = d($$0);
      List<aut> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         aum.d $$6 = this.a.get($$5);
         ath $$7 = $$6.b;
         if ($$7 != null) {
            aun<InputStream> $$8 = $$7.a(this.d, $$0);
            if ($$8 != null) {
               aun<auy> $$9;
               if ($$3) {
                  $$9 = auy.b;
               } else {
                  $$9 = () -> {
                     aun<InputStream> $$2x = $$7.a(this.d, $$1);
                     return $$2x != null ? b($$2x) : auy.a;
                  };
               }

               $$2.add(new aut($$7, $$8, $$9));
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

   private static boolean b(ale $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static ale c(ale $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.e($$1);
   }

   static ale d(ale $$0) {
      return $$0.e($$0.a() + ".mcmeta");
   }

   @Override
   public Map<ale, aut> b(String $$0, Predicate<ale> $$1) {
      record a(ath a, aun<InputStream> b, int c) {
      }

      Map<ale, a> $$2 = new HashMap<>();
      Map<ale, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         aum.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         ath $$7 = $$6.b;
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

      Map<ale, aut> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         ale $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         aun<auy> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = auy.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private aun<auy> a(ale $$0, int $$1) {
      return () -> {
         ale $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            aum.d $$4 = this.a.get($$3);
            ath $$5 = $$4.b;
            if ($$5 != null) {
               aun<InputStream> $$6 = $$5.a(this.d, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return auy.a;
      };
   }

   private static aun<auy> a(aun<InputStream> $$0) {
      return () -> b($$0);
   }

   private static auy b(aun<InputStream> $$0) throws IOException {
      auy var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = auy.a($$1);
      }

      return var2;
   }

   private static void a(aum.d $$0, Map<ale, aum.b> $$1) {
      for (aum.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(aum.d $$0, String $$1, Predicate<ale> $$2, Map<ale, aum.b> $$3) {
      ath $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.d, this.e, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               ale $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, aum.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, aum.b::new).c.add(new aum.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<ale, List<aut>> c(String $$0, Predicate<ale> $$1) {
      Map<ale, aum.b> $$2 = Maps.newHashMap();

      for (aum.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<ale, List<aut>> $$4 = Maps.newTreeMap();

      for (aum.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<aut> $$6 = new ArrayList<>();

            for (aum.e $$7 : $$5.c) {
               ath $$8 = $$7.a;
               aun<InputStream> $$9 = $$5.d.get($$8);
               aun<auy> $$10 = $$9 != null ? a($$9) : auy.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<ath> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(ale a, ale b, List<aum.e> c, Map<ath, aun<InputStream>> d) {

      b(ale $$0) {
         this($$0, aum.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, ale $$1, String $$2) {
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
            aum.c.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable ath b, @Nullable Predicate<ale> c) {

      public void a(Collection<ale> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(ale $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(ath a, aun<InputStream> b) {
   }
}
