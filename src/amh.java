import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amh {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
   private final awi c;
   private final Path d;
   private am e;
   private final Map<ah, aj> f = new LinkedHashMap<>();
   private final Set<ah> g = new HashSet<>();
   private final Set<ah> h = new HashSet<>();
   private final Set<ai> i = new HashSet<>();
   private asi j;
   @Nullable
   private ah k;
   private boolean l = true;
   private final Codec<amh.a> m;

   public amh(DataFixer $$0, awi $$1, amm $$2, Path $$3, asi $$4) {
      this.c = $$1;
      this.d = $$3;
      this.j = $$4;
      this.e = $$2.a();
      int $$5 = 1343;
      this.m = bbs.p.a(amh.a.a, $$0, 1343);
      this.d($$2);
   }

   public void a(asi $$0) {
      this.j = $$0;
   }

   public void a() {
      for (ar<?> $$0 : ma.am) {
         $$0.a(this);
      }
   }

   public void a(amm $$0) {
      this.a();
      this.f.clear();
      this.g.clear();
      this.i.clear();
      this.h.clear();
      this.l = true;
      this.k = null;
      this.e = $$0.a();
      this.d($$0);
   }

   private void b(amm $$0) {
      for (ah $$1 : $$0.b()) {
         this.d($$1);
      }
   }

   private void c(amm $$0) {
      for (ah $$1 : $$0.b()) {
         ag $$2 = $$1.b();
         if ($$2.e().isEmpty()) {
            this.a($$1, "");
            $$2.d().a(this.j);
         }
      }
   }

   private void d(amm $$0) {
      if (Files.isRegularFile(this.d)) {
         try {
            JsonReader $$1 = new JsonReader(Files.newBufferedReader(this.d, StandardCharsets.UTF_8));

            try {
               $$1.setLenient(false);
               JsonElement $$2 = Streams.parse($$1);
               amh.a $$3 = (amh.a)this.m.parse(JsonOps.INSTANCE, $$2).getOrThrow(JsonParseException::new);
               this.a($$0, $$3);
            } catch (Throwable var6) {
               try {
                  $$1.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }

               throw var6;
            }

            $$1.close();
         } catch (JsonIOException | IOException var7) {
            a.error("Couldn't access player advancements in {}", this.d, var7);
         } catch (JsonParseException var8) {
            a.error("Couldn't parse player advancements in {}", this.d, var8);
         }
      }

      this.c($$0);
      this.b($$0);
   }

   public void b() {
      JsonElement $$0 = (JsonElement)this.m.encodeStart(JsonOps.INSTANCE, this.c()).getOrThrow();

      try {
         v.c(this.d.getParent());

         try (Writer $$1 = Files.newBufferedWriter(this.d, StandardCharsets.UTF_8)) {
            b.toJson($$0, b.newJsonWriter($$1));
         }
      } catch (JsonIOException | IOException var7) {
         a.error("Couldn't save player advancements to {}", this.d, var7);
      }
   }

   private void a(amm $$0, amh.a $$1) {
      $$1.a(($$1x, $$2) -> {
         ah $$3 = $$0.a($$1x);
         if ($$3 == null) {
            a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", $$1x, this.d);
         } else {
            this.a($$3, $$2);
            this.h.add($$3);
            this.c($$3);
         }
      });
   }

   private amh.a c() {
      Map<alz, aj> $$0 = new LinkedHashMap<>();
      this.f.forEach(($$1, $$2) -> {
         if ($$2.b()) {
            $$0.put($$1.a(), $$2);
         }
      });
      return new amh.a($$0);
   }

   public boolean a(ah $$0, String $$1) {
      boolean $$2 = false;
      aj $$3 = this.b($$0);
      boolean $$4 = $$3.a();
      if ($$3.a($$1)) {
         this.e($$0);
         this.h.add($$0);
         $$2 = true;
         if (!$$4 && $$3.a()) {
            $$0.b().d().a(this.j);
            $$0.b().c().ifPresent($$1x -> {
               if ($$1x.i() && this.j.y().N().b(dhe.B)) {
                  this.c.a($$1x.e().a($$0, this.j), false);
               }
            });
         }
      }

      if (!$$4 && $$3.a()) {
         this.c($$0);
      }

      return $$2;
   }

   public boolean b(ah $$0, String $$1) {
      boolean $$2 = false;
      aj $$3 = this.b($$0);
      boolean $$4 = $$3.a();
      if ($$3.b($$1)) {
         this.d($$0);
         this.h.add($$0);
         $$2 = true;
      }

      if ($$4 && !$$3.a()) {
         this.c($$0);
      }

      return $$2;
   }

   private void c(ah $$0) {
      ai $$1 = this.e.a($$0);
      if ($$1 != null) {
         this.i.add($$1.d());
      }
   }

   private void d(ah $$0) {
      aj $$1 = this.b($$0);
      if (!$$1.a()) {
         for (Entry<String, ap<?>> $$2 : $$0.b().e().entrySet()) {
            aq $$3 = $$1.c($$2.getKey());
            if ($$3 != null && !$$3.a()) {
               this.a($$0, $$2.getKey(), $$2.getValue());
            }
         }
      }
   }

   private <T extends as> void a(ah $$0, String $$1, ap<T> $$2) {
      $$2.a().a(this, new ar.a<>($$2.b(), $$0, $$1));
   }

   private void e(ah $$0) {
      aj $$1 = this.b($$0);

      for (Entry<String, ap<?>> $$2 : $$0.b().e().entrySet()) {
         aq $$3 = $$1.c($$2.getKey());
         if ($$3 != null && ($$3.a() || $$1.a())) {
            this.b($$0, $$2.getKey(), $$2.getValue());
         }
      }
   }

   private <T extends as> void b(ah $$0, String $$1, ap<T> $$2) {
      $$2.a().b(this, new ar.a<>($$2.b(), $$0, $$1));
   }

   public void b(asi $$0) {
      if (this.l || !this.i.isEmpty() || !this.h.isEmpty()) {
         Map<alz, aj> $$1 = new HashMap<>();
         Set<ah> $$2 = new HashSet<>();
         Set<alz> $$3 = new HashSet<>();

         for (ai $$4 : this.i) {
            this.a($$4, $$2, $$3);
         }

         this.i.clear();

         for (ah $$5 : this.h) {
            if (this.g.contains($$5)) {
               $$1.put($$5.a(), this.f.get($$5));
            }
         }

         this.h.clear();
         if (!$$1.isEmpty() || !$$2.isEmpty() || !$$3.isEmpty()) {
            $$0.f.b(new ahd(this.l, $$2, $$3, $$1));
         }
      }

      this.l = false;
   }

   public void a(@Nullable ah $$0) {
      ah $$1 = this.k;
      if ($$0 != null && $$0.b().a() && $$0.b().c().isPresent()) {
         this.k = $$0;
      } else {
         this.k = null;
      }

      if ($$1 != this.k) {
         this.j.f.b(new afn(this.k == null ? null : this.k.a()));
      }
   }

   public aj b(ah $$0) {
      aj $$1 = this.f.get($$0);
      if ($$1 == null) {
         $$1 = new aj();
         this.a($$0, $$1);
      }

      return $$1;
   }

   private void a(ah $$0, aj $$1) {
      $$1.a($$0.b().f());
      this.f.put($$0, $$1);
   }

   private void a(ai $$0, Set<ah> $$1, Set<alz> $$2) {
      amz.a($$0, $$0x -> this.b($$0x.b()).a(), ($$2x, $$3) -> {
         ah $$4 = $$2x.b();
         if ($$3) {
            if (this.g.add($$4)) {
               $$1.add($$4);
               if (this.f.containsKey($$4)) {
                  this.h.add($$4);
               }
            }
         } else if (this.g.remove($$4)) {
            $$2.add($$4.a());
         }
      });
   }

   static record a(Map<alz, aj> b) {
      public static final Codec<amh.a> a = Codec.unboundedMap(alz.a, aj.a).xmap(amh.a::new, amh.a::a);

      public void a(BiConsumer<alz, aj> $$0) {
         this.b.entrySet().stream().sorted(Entry.comparingByValue()).forEach($$1 -> $$0.accept($$1.getKey(), $$1.getValue()));
      }

      public Map<alz, aj> a() {
         return this.b;
      }
   }
}
