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

public class als {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
   private final avu c;
   private final Path d;
   private ao e;
   private final Map<aj, al> f = new LinkedHashMap<>();
   private final Set<aj> g = new HashSet<>();
   private final Set<aj> h = new HashSet<>();
   private final Set<ak> i = new HashSet<>();
   private arv j;
   @Nullable
   private aj k;
   private boolean l = true;
   private final Codec<als.a> m;

   public als(DataFixer $$0, avu $$1, alx $$2, Path $$3, arv $$4) {
      this.c = $$1;
      this.d = $$3;
      this.j = $$4;
      this.e = $$2.a();
      int $$5 = 1343;
      this.m = bbf.p.a(als.a.a, $$0, 1343);
      this.d($$2);
   }

   public void a(arv $$0) {
      this.j = $$0;
   }

   public void a() {
      for (at<?> $$0 : mh.ak) {
         $$0.a(this);
      }
   }

   public void a(alx $$0) {
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

   private void b(alx $$0) {
      for (aj $$1 : $$0.b()) {
         this.d($$1);
      }
   }

   private void c(alx $$0) {
      for (aj $$1 : $$0.b()) {
         ai $$2 = $$1.b();
         if ($$2.e().isEmpty()) {
            this.a($$1, "");
            $$2.d().a(this.j);
         }
      }
   }

   private void d(alx $$0) {
      if (Files.isRegularFile(this.d)) {
         try {
            JsonReader $$1 = new JsonReader(Files.newBufferedReader(this.d, StandardCharsets.UTF_8));

            try {
               $$1.setLenient(false);
               JsonElement $$2 = Streams.parse($$1);
               als.a $$3 = (als.a)this.m.parse(JsonOps.INSTANCE, $$2).getOrThrow(JsonParseException::new);
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
         w.c(this.d.getParent());

         try (Writer $$1 = Files.newBufferedWriter(this.d, StandardCharsets.UTF_8)) {
            b.toJson($$0, b.newJsonWriter($$1));
         }
      } catch (JsonIOException | IOException var7) {
         a.error("Couldn't save player advancements to {}", this.d, var7);
      }
   }

   private void a(alx $$0, als.a $$1) {
      $$1.a(($$1x, $$2) -> {
         aj $$3 = $$0.a($$1x);
         if ($$3 == null) {
            a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", $$1x, this.d);
         } else {
            this.a($$3, $$2);
            this.h.add($$3);
            this.c($$3);
         }
      });
   }

   private als.a c() {
      Map<alk, al> $$0 = new LinkedHashMap<>();
      this.f.forEach(($$1, $$2) -> {
         if ($$2.b()) {
            $$0.put($$1.a(), $$2);
         }
      });
      return new als.a($$0);
   }

   public boolean a(aj $$0, String $$1) {
      boolean $$2 = false;
      al $$3 = this.b($$0);
      boolean $$4 = $$3.a();
      if ($$3.a($$1)) {
         this.e($$0);
         this.h.add($$0);
         $$2 = true;
         if (!$$4 && $$3.a()) {
            $$0.b().d().a(this.j);
            $$0.b().c().ifPresent($$1x -> {
               if ($$1x.i() && this.j.y().O().c(djv.C)) {
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

   public boolean b(aj $$0, String $$1) {
      boolean $$2 = false;
      al $$3 = this.b($$0);
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

   private void c(aj $$0) {
      ak $$1 = this.e.a($$0);
      if ($$1 != null) {
         this.i.add($$1.d());
      }
   }

   private void d(aj $$0) {
      al $$1 = this.b($$0);
      if (!$$1.a()) {
         for (Entry<String, ar<?>> $$2 : $$0.b().e().entrySet()) {
            as $$3 = $$1.c($$2.getKey());
            if ($$3 != null && !$$3.a()) {
               this.a($$0, $$2.getKey(), $$2.getValue());
            }
         }
      }
   }

   private <T extends au> void a(aj $$0, String $$1, ar<T> $$2) {
      $$2.a().a(this, new at.a<>($$2.b(), $$0, $$1));
   }

   private void e(aj $$0) {
      al $$1 = this.b($$0);

      for (Entry<String, ar<?>> $$2 : $$0.b().e().entrySet()) {
         as $$3 = $$1.c($$2.getKey());
         if ($$3 != null && ($$3.a() || $$1.a())) {
            this.b($$0, $$2.getKey(), $$2.getValue());
         }
      }
   }

   private <T extends au> void b(aj $$0, String $$1, ar<T> $$2) {
      $$2.a().b(this, new at.a<>($$2.b(), $$0, $$1));
   }

   public void a(arv $$0, boolean $$1) {
      if (this.l || !this.i.isEmpty() || !this.h.isEmpty()) {
         Map<alk, al> $$2 = new HashMap<>();
         Set<aj> $$3 = new HashSet<>();
         Set<alk> $$4 = new HashSet<>();

         for (ak $$5 : this.i) {
            this.a($$5, $$3, $$4);
         }

         this.i.clear();

         for (aj $$6 : this.h) {
            if (this.g.contains($$6)) {
               $$2.put($$6.a(), this.f.get($$6));
            }
         }

         this.h.clear();
         if (!$$2.isEmpty() || !$$3.isEmpty() || !$$4.isEmpty()) {
            $$0.f.b(new agk(this.l, $$3, $$4, $$2, $$1));
         }
      }

      this.l = false;
   }

   public void a(@Nullable aj $$0) {
      aj $$1 = this.k;
      if ($$0 != null && $$0.b().a() && $$0.b().c().isPresent()) {
         this.k = $$0;
      } else {
         this.k = null;
      }

      if ($$1 != this.k) {
         this.j.f.b(new aet(this.k == null ? null : this.k.a()));
      }
   }

   public al b(aj $$0) {
      al $$1 = this.f.get($$0);
      if ($$1 == null) {
         $$1 = new al();
         this.a($$0, $$1);
      }

      return $$1;
   }

   private void a(aj $$0, al $$1) {
      $$1.a($$0.b().f());
      this.f.put($$0, $$1);
   }

   private void a(ak $$0, Set<aj> $$1, Set<alk> $$2) {
      amk.a($$0, $$0x -> this.b($$0x.b()).a(), ($$2x, $$3) -> {
         aj $$4 = $$2x.b();
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

   static record a(Map<alk, al> b) {
      public static final Codec<als.a> a = Codec.unboundedMap(alk.a, al.a).xmap(als.a::new, als.a::a);

      public void a(BiConsumer<alk, al> $$0) {
         this.b.entrySet().stream().sorted(Entry.comparingByValue()).forEach($$1 -> $$0.accept($$1.getKey(), $$1.getValue()));
      }

      public Map<alk, al> a() {
         return this.b;
      }
   }
}
