import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
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

public class akn {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
   private final aub c;
   private final Path d;
   private ak e;
   private final Map<af, ah> f = new LinkedHashMap<>();
   private final Set<af> g = new HashSet<>();
   private final Set<af> h = new HashSet<>();
   private final Set<ag> i = new HashSet<>();
   private aqf j;
   @Nullable
   private af k;
   private boolean l = true;
   private final Codec<akn.a> m;

   public akn(DataFixer $$0, aub $$1, akr $$2, Path $$3, aqf $$4) {
      this.c = $$1;
      this.d = $$3;
      this.j = $$4;
      this.e = $$2.a();
      int $$5 = 1343;
      this.m = azc.p.a(akn.a.a, $$0, 1343);
      this.d($$2);
   }

   public void a(aqf $$0) {
      this.j = $$0;
   }

   public void a() {
      for (ap<?> $$0 : lc.ap) {
         $$0.a(this);
      }
   }

   public void a(akr $$0) {
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

   private void b(akr $$0) {
      for (af $$1 : $$0.b()) {
         this.d($$1);
      }
   }

   private void c(akr $$0) {
      for (af $$1 : $$0.b()) {
         ae $$2 = $$1.b();
         if ($$2.e().isEmpty()) {
            this.a($$1, "");
            $$2.d().a(this.j);
         }
      }
   }

   private void d(akr $$0) {
      if (Files.isRegularFile(this.d)) {
         try {
            JsonReader $$1 = new JsonReader(Files.newBufferedReader(this.d, StandardCharsets.UTF_8));

            try {
               $$1.setLenient(false);
               JsonElement $$2 = Streams.parse($$1);
               akn.a $$3 = ac.a(this.m.parse(JsonOps.INSTANCE, $$2), JsonParseException::new);
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
         } catch (JsonParseException var7) {
            a.error("Couldn't parse player advancements in {}", this.d, var7);
         } catch (IOException var8) {
            a.error("Couldn't access player advancements in {}", this.d, var8);
         }
      }

      this.c($$0);
      this.b($$0);
   }

   public void b() {
      JsonElement $$0 = ac.a(this.m.encodeStart(JsonOps.INSTANCE, this.c()), IllegalStateException::new);

      try {
         v.c(this.d.getParent());

         try (Writer $$1 = Files.newBufferedWriter(this.d, StandardCharsets.UTF_8)) {
            b.toJson($$0, $$1);
         }
      } catch (IOException var7) {
         a.error("Couldn't save player advancements to {}", this.d, var7);
      }
   }

   private void a(akr $$0, akn.a $$1) {
      $$1.a(($$1x, $$2) -> {
         af $$3 = $$0.a($$1x);
         if ($$3 == null) {
            a.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", $$1x, this.d);
         } else {
            this.a($$3, $$2);
            this.h.add($$3);
            this.c($$3);
         }
      });
   }

   private akn.a c() {
      Map<akf, ah> $$0 = new LinkedHashMap<>();
      this.f.forEach(($$1, $$2) -> {
         if ($$2.b()) {
            $$0.put($$1.a(), $$2);
         }
      });
      return new akn.a($$0);
   }

   public boolean a(af $$0, String $$1) {
      boolean $$2 = false;
      ah $$3 = this.b($$0);
      boolean $$4 = $$3.a();
      if ($$3.a($$1)) {
         this.e($$0);
         this.h.add($$0);
         $$2 = true;
         if (!$$4 && $$3.a()) {
            $$0.b().d().a(this.j);
            $$0.b().c().ifPresent($$1x -> {
               if ($$1x.i() && this.j.dN().aa().b(czq.A)) {
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

   public boolean b(af $$0, String $$1) {
      boolean $$2 = false;
      ah $$3 = this.b($$0);
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

   private void c(af $$0) {
      ag $$1 = this.e.a($$0);
      if ($$1 != null) {
         this.i.add($$1.d());
      }
   }

   private void d(af $$0) {
      ah $$1 = this.b($$0);
      if (!$$1.a()) {
         for (Entry<String, an<?>> $$2 : $$0.b().e().entrySet()) {
            ao $$3 = $$1.c($$2.getKey());
            if ($$3 != null && !$$3.a()) {
               this.a($$0, $$2.getKey(), $$2.getValue());
            }
         }
      }
   }

   private <T extends aq> void a(af $$0, String $$1, an<T> $$2) {
      $$2.a().a(this, new ap.a<>($$2.b(), $$0, $$1));
   }

   private void e(af $$0) {
      ah $$1 = this.b($$0);

      for (Entry<String, an<?>> $$2 : $$0.b().e().entrySet()) {
         ao $$3 = $$1.c($$2.getKey());
         if ($$3 != null && ($$3.a() || $$1.a())) {
            this.b($$0, $$2.getKey(), $$2.getValue());
         }
      }
   }

   private <T extends aq> void b(af $$0, String $$1, an<T> $$2) {
      $$2.a().b(this, new ap.a<>($$2.b(), $$0, $$1));
   }

   public void b(aqf $$0) {
      if (this.l || !this.i.isEmpty() || !this.h.isEmpty()) {
         Map<akf, ah> $$1 = new HashMap<>();
         Set<af> $$2 = new HashSet<>();
         Set<akf> $$3 = new HashSet<>();

         for (ag $$4 : this.i) {
            this.a($$4, $$2, $$3);
         }

         this.i.clear();

         for (af $$5 : this.h) {
            if (this.g.contains($$5)) {
               $$1.put($$5.a(), this.f.get($$5));
            }
         }

         this.h.clear();
         if (!$$1.isEmpty() || !$$2.isEmpty() || !$$3.isEmpty()) {
            $$0.d.b(new afo(this.l, $$2, $$3, $$1));
         }
      }

      this.l = false;
   }

   public void a(@Nullable af $$0) {
      af $$1 = this.k;
      if ($$0 != null && $$0.b().a() && $$0.b().c().isPresent()) {
         this.k = $$0;
      } else {
         this.k = null;
      }

      if ($$1 != this.k) {
         this.j.d.b(new aea(this.k == null ? null : this.k.a()));
      }
   }

   public ah b(af $$0) {
      ah $$1 = this.f.get($$0);
      if ($$1 == null) {
         $$1 = new ah();
         this.a($$0, $$1);
      }

      return $$1;
   }

   private void a(af $$0, ah $$1) {
      $$1.a($$0.b().f());
      this.f.put($$0, $$1);
   }

   private void a(ag $$0, Set<af> $$1, Set<akf> $$2) {
      alc.a($$0, $$0x -> this.b($$0x.b()).a(), ($$2x, $$3) -> {
         af $$4 = $$2x.b();
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

   static record a(Map<akf, ah> b) {
      public static final Codec<akn.a> a = Codec.unboundedMap(akf.a, ah.a).xmap(akn.a::new, akn.a::a);

      public void a(BiConsumer<akf, ah> $$0) {
         this.b.entrySet().stream().sorted(Entry.comparingByValue()).forEach($$1 -> $$0.accept($$1.getKey(), $$1.getValue()));
      }

      public Map<akf, ah> a() {
         return this.b;
      }
   }
}
