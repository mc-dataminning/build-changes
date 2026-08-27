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

public class ako implements akx {
   static final Logger b = LogUtils.getLogger();
   protected final List<ako.d> a = Lists.newArrayList();
   private final ajm c;
   private final String d;

   public ako(ajm $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(ajl $$0) {
      this.a($$0.a(), $$0, null);
   }

   public void a(ajl $$0, Predicate<acq> $$1) {
      this.a($$0.a(), $$0, $$1);
   }

   public void a(String $$0, Predicate<acq> $$1) {
      this.a($$0, null, $$1);
   }

   private void a(String $$0, @Nullable ajl $$1, @Nullable Predicate<acq> $$2) {
      this.a.add(new ako.d($$0, $$1, $$2));
   }

   @Override
   public Set<String> a() {
      return ImmutableSet.of(this.d);
   }

   @Override
   public Optional<akv> getResource(acq $$0) {
      for (int $$1 = this.a.size() - 1; $$1 >= 0; $$1--) {
         ako.d $$2 = this.a.get($$1);
         ajl $$3 = $$2.b;
         if ($$3 != null) {
            akp<InputStream> $$4 = $$3.a(this.c, $$0);
            if ($$4 != null) {
               akp<akz> $$5 = this.a($$0, $$1);
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

   private static akv a(ajl $$0, acq $$1, akp<InputStream> $$2, akp<akz> $$3) {
      return new akv($$0, a($$1, $$0, $$2), $$3);
   }

   private static akp<InputStream> a(acq $$0, ajl $$1, akp<InputStream> $$2) {
      return b.isDebugEnabled() ? () -> new ako.c($$2.get(), $$0, $$1.a()) : $$2;
   }

   @Override
   public List<akv> a(acq $$0) {
      acq $$1 = d($$0);
      List<akv> $$2 = new ArrayList<>();
      boolean $$3 = false;
      String $$4 = null;

      for (int $$5 = this.a.size() - 1; $$5 >= 0; $$5--) {
         ako.d $$6 = this.a.get($$5);
         ajl $$7 = $$6.b;
         if ($$7 != null) {
            akp<InputStream> $$8 = $$7.a(this.c, $$0);
            if ($$8 != null) {
               akp<akz> $$9;
               if ($$3) {
                  $$9 = akz.b;
               } else {
                  $$9 = () -> {
                     akp<InputStream> $$2x = $$7.a(this.c, $$1);
                     return $$2x != null ? b($$2x) : akz.a;
                  };
               }

               $$2.add(new akv($$7, $$8, $$9));
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

   private static boolean b(acq $$0) {
      return $$0.a().endsWith(".mcmeta");
   }

   private static acq c(acq $$0) {
      String $$1 = $$0.a().substring(0, $$0.a().length() - ".mcmeta".length());
      return $$0.c($$1);
   }

   static acq d(acq $$0) {
      return $$0.c($$0.a() + ".mcmeta");
   }

   @Override
   public Map<acq, akv> b(String $$0, Predicate<acq> $$1) {
      record a(ajl a, akp<InputStream> b, int c) {
      }

      Map<acq, a> $$2 = new HashMap<>();
      Map<acq, a> $$3 = new HashMap<>();
      int $$4 = this.a.size();

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         ako.d $$6 = this.a.get($$5);
         $$6.a($$2.keySet());
         $$6.a($$3.keySet());
         ajl $$7 = $$6.b;
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

      Map<acq, akv> $$9 = Maps.newTreeMap();
      $$2.forEach(($$2x, $$3x) -> {
         acq $$4x = d($$2x);
         a $$5x = $$3.get($$4x);
         akp<akz> $$6x;
         if ($$5x != null && $$5x.c >= $$3x.c) {
            $$6x = a($$5x.b);
         } else {
            $$6x = akz.b;
         }

         $$9.put($$2x, a($$3x.a, $$2x, $$3x.b, $$6x));
      });
      return $$9;
   }

   private akp<akz> a(acq $$0, int $$1) {
      return () -> {
         acq $$2 = d($$0);

         for (int $$3 = this.a.size() - 1; $$3 >= $$1; $$3--) {
            ako.d $$4 = this.a.get($$3);
            ajl $$5 = $$4.b;
            if ($$5 != null) {
               akp<InputStream> $$6 = $$5.a(this.c, $$2);
               if ($$6 != null) {
                  return b($$6);
               }
            }

            if ($$4.a($$2)) {
               break;
            }
         }

         return akz.a;
      };
   }

   private static akp<akz> a(akp<InputStream> $$0) {
      return () -> b($$0);
   }

   private static akz b(akp<InputStream> $$0) throws IOException {
      akz var2;
      try (InputStream $$1 = $$0.get()) {
         var2 = akz.a($$1);
      }

      return var2;
   }

   private static void a(ako.d $$0, Map<acq, ako.b> $$1) {
      for (ako.b $$2 : $$1.values()) {
         if ($$0.a($$2.a)) {
            $$2.c.clear();
         } else if ($$0.a($$2.b())) {
            $$2.d.clear();
         }
      }
   }

   private void a(ako.d $$0, String $$1, Predicate<acq> $$2, Map<acq, ako.b> $$3) {
      ajl $$4 = $$0.b;
      if ($$4 != null) {
         $$4.a(this.c, this.d, $$1, ($$3x, $$4x) -> {
            if (b($$3x)) {
               acq $$5 = c($$3x);
               if (!$$2.test($$5)) {
                  return;
               }

               $$3.computeIfAbsent($$5, ako.b::new).d.put($$4, $$4x);
            } else {
               if (!$$2.test($$3x)) {
                  return;
               }

               $$3.computeIfAbsent($$3x, ako.b::new).c.add(new ako.e($$4, $$4x));
            }
         });
      }
   }

   @Override
   public Map<acq, List<akv>> c(String $$0, Predicate<acq> $$1) {
      Map<acq, ako.b> $$2 = Maps.newHashMap();

      for (ako.d $$3 : this.a) {
         a($$3, $$2);
         this.a($$3, $$0, $$1, $$2);
      }

      TreeMap<acq, List<akv>> $$4 = Maps.newTreeMap();

      for (ako.b $$5 : $$2.values()) {
         if (!$$5.c.isEmpty()) {
            List<akv> $$6 = new ArrayList<>();

            for (ako.e $$7 : $$5.c) {
               ajl $$8 = $$7.a;
               akp<InputStream> $$9 = $$5.d.get($$8);
               akp<akz> $$10 = $$9 != null ? a($$9) : akz.b;
               $$6.add(a($$8, $$5.a, $$7.b, $$10));
            }

            $$4.put($$5.a, $$6);
         }
      }

      return $$4;
   }

   @Override
   public Stream<ajl> b() {
      return this.a.stream().map($$0 -> $$0.b).filter(Objects::nonNull);
   }

   static record b(acq a, acq b, List<ako.e> c, Map<ajl, akp<InputStream>> d) {

      b(acq $$0) {
         this($$0, ako.d($$0), new ArrayList<>(), new Object2ObjectArrayMap());
      }
   }

   static class c extends FilterInputStream {
      private final Supplier<String> a;
      private boolean b;

      public c(InputStream $$0, acq $$1, String $$2) {
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
            ako.b.warn("{}", this.a.get());
         }

         super.finalize();
      }
   }

   static record d(String a, @Nullable ajl b, @Nullable Predicate<acq> c) {

      public void a(Collection<acq> $$0) {
         if (this.c != null) {
            $$0.removeIf(this.c);
         }
      }

      public boolean a(acq $$0) {
         return this.c != null && this.c.test($$0);
      }
   }

   static record e(ajl a, akp<InputStream> b) {
   }
}
