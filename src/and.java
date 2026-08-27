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

public class and implements anm {
   static final Logger b = LogUtils.getLogger();
   protected final List<and.d> a = Lists.newArrayList();
   private final amb c;
   private final String d;

   public and(amb $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(ama $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(ama $$0, Predicate<aer> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<aer> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable ama $$1, @Nullable Predicate<aer> $$2) {
      this.a.add(new and.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<ank> getResource(aer $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         and.d $$2 = this.a.get($$1);
         ama $$3 = $$2.b;
         if ($$3 != null) {
            ane<InputStream> $$4 = $$3.a(this.c, $$0);
            if ($$4 != null) {
               ane<ano> $$5 = this.a($$0, $$1);
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

   private static ank a(ama $$0, aer $$1, ane<InputStream> $$2, ane<ano> $$3) {
      return new ank($$0, a($$1, $$0, $$2), $$3);
   }

   private static ane<InputStream> a(aer $$0, ama $$1, ane<InputStream> $$2) {
      return b.isDebugEnabled() ? () -> new and.c($$2.get(), $$0, $$1.a()) : $$2;
   }

   @Override
   public List<ank> a(aer $$0) {
      aer $$1 = d($$0);
      List<ank> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         and.d $$6 = this.a.get($$5);
         ama $$7 = $$6.b;
         if ($$7 != null) {
            ane<InputStream> $$8 = $$7.a(this.c, $$0);
            if ($$8 != null) {
               ane<ano> $$9;
               if ($$3) {
                  $$9 = ano.b;
               } else {
                  $$9 = () -> {
                     ane<InputStream> $$2x = $$7.a(this.c, $$1);
                     return $$2x != null ? b($$2x) : ano.a;
                  };
               }

               $$2.add(new ank($$7, $$8, $$9));
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

   private static boolean b(aer $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static aer c(aer $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.c($$1);
   }

   static aer d(aer $$0) {
      return $$0.c($$0.a() + ".mcmeta");
   }

   @Override
   public Map<aer, ank> b(String $$0, Predicate<aer> $$1) {
      record a(ama a, ane<InputStream> b, int c) {
      }

      Map<aer, a> $$2 = new HashMap<>();
      Map<aer, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         and.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         ama $$7 = $$6.b;
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

      Map<aer, ank> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         aer $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         ane<ano> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = ano.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private ane<ano> a(aer $$0, int $$1) {
      return () -> {
         aer $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            and.d $$4 = this.a.get($$3);
            ama $$5 = $$4.b;
            if ($$5 != null) {
               ane<InputStream> $$6 = $$5.a(this.c, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return ano.a;
      };
   }

   private static ane<ano> a(ane<InputStream> $$0) {
      return () -> b($$0);
   }

   private static ano b(ane<InputStream> $$0) throws IOException {
      ano var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = ano.a($$1);
      }

      return var2;
   }

   private static void a(and.d $$0, Map<aer, and.b> $$1) {
      for (and.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(and.d $$0, String $$1, Predicate<aer> $$2, Map<aer, and.b> $$3) {
      ama $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.c, this.d, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               aer $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, and.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, and.b::new).c.add(new and.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<aer, List<ank>> c(String $$0, Predicate<aer> $$1) {
      Map<aer, and.b> $$2 = Maps.newHashMap();

      for (and.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<aer, List<ank>> $$4 = Maps.newTreeMap();

      for (and.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<ank> $$6 = new ArrayList<>();

            for (and.e $$7 : $$5.c) {
               ama $$8 = $$7.a;
               ane<InputStream> $$9 = $$5.d.get($$8);
               ane<ano> $$10 = $$9 != null ? a($$9) : ano.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<ama> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(aer a, aer b, List<and.e> c, Map<ama, ane<InputStream>> d) {

      b(aer $$0) {
         this($$0, and.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, aer $$1, String $$2) {
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
            and.b.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable ama b, @Nullable Predicate<aer> c) {

      public void a(Collection<aer> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(aer $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(ama a, ane<InputStream> b) {
   }
}
