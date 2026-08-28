import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class awt extends awy {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<Map<awu<?>, Integer>> c = Codec.dispatchedMap(mg.v.q(), ag.b(awt::a)).xmap($$0 -> {
      Map<awu<?>, Integer> $$1 = new HashMap<>();
      $$0.forEach(($$1x, $$2) -> $$1.putAll((Map<? extends awu<?>, ? extends Integer>)$$2));
      return $$1;
   }, $$0 -> $$0.entrySet().stream().collect(Collectors.groupingBy($$0x -> ((awu)$$0x.getKey()).a(), ag.a())));
   private final MinecraftServer d;
   private final File e;
   private final Set<awu<?>> f = Sets.newHashSet();

   private static <T> Codec<Map<awu<?>, Integer>> a(aww<T> $$0) {
      Codec<T> $$1 = $$0.b().q();
      Codec<awu<?>> $$2 = $$1.flatComapMap(
         $$0::b, $$1x -> $$1x.a() == $$0 ? DataResult.success($$1x.b()) : DataResult.error(() -> "Expected type " + $$0 + ", but got " + $$1x.a())
      );
      return Codec.unboundedMap($$2, Codec.INT);
   }

   public awt(MinecraftServer $$0, File $$1) {
      this.d = $$0;
      this.e = $$1;
      if ($$1.isFile()) {
         try {
            this.a($$0.aC(), FileUtils.readFileToString($$1));
         } catch (IOException var4) {
            b.error("Couldn't read statistics file {}", $$1, var4);
         } catch (JsonParseException var5) {
            b.error("Couldn't parse statistics file {}", $$1, var5);
         }
      }
   }

   public void a() {
      try {
         FileUtils.writeStringToFile(this.e, this.b());
      } catch (IOException var2) {
         b.error("Couldn't save stats", var2);
      }
   }

   @Override
   public void a(crm $$0, awu<?> $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.f.add($$1);
   }

   private Set<awu<?>> d() {
      Set<awu<?>> $$0 = Sets.newHashSet(this.f);
      this.f.clear();
      return $$0;
   }

   public void a(DataFixer $$0, String $$1) {
      try {
         JsonReader $$2 = new JsonReader(new StringReader($$1));

         label35: {
            try {
               $$2.setLenient(false);
               JsonElement $$3 = Streams.parse($$2);
               if (!$$3.isJsonNull()) {
                  Dynamic<JsonElement> $$4 = new Dynamic(JsonOps.INSTANCE, $$3);
                  $$4 = bbb.g.a($$0, $$4, uo.a($$4, 1343));
                  this.a
                     .putAll(
                        c.parse($$4.get("stats").orElseEmptyMap())
                           .resultOrPartial($$0x -> b.error("Failed to parse statistics for {}: {}", this.e, $$0x))
                           .orElse(Map.of())
                     );
                  break label35;
               }

               b.error("Unable to parse Stat data from {}", this.e);
            } catch (Throwable var7) {
               try {
                  $$2.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }

               throw var7;
            }

            $$2.close();
            return;
         }

         $$2.close();
      } catch (IOException | JsonParseException var8) {
         b.error("Unable to parse Stat data from {}", this.e, var8);
      }
   }

   protected String b() {
      JsonObject $$0 = new JsonObject();
      $$0.add("stats", (JsonElement)c.encodeStart(JsonOps.INSTANCE, this.a).getOrThrow());
      $$0.addProperty("DataVersion", ac.b().d().c());
      return $$0.toString();
   }

   public void c() {
      this.f.addAll(this.a.keySet());
   }

   public void a(arr $$0) {
      Object2IntMap<awu<?>> $$1 = new Object2IntOpenHashMap();

      for (awu<?> $$2 : this.d()) {
         $$1.put($$2, this.a($$2));
      }

      $$0.f.b(new abx($$1));
   }
}
