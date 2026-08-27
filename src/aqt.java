import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class aqt extends aqy {
   private static final Logger b = LogUtils.getLogger();
   private final MinecraftServer c;
   private final File d;
   private final Set<aqu<?>> e = Sets.newHashSet();

   public aqt(MinecraftServer $$0, File $$1) {
      this.c = $$0;
      this.d = $$1;
      if ($$1.isFile()) {
         try {
            this.a($$0.ay(), FileUtils.readFileToString($$1));
         } catch (IOException var4) {
            b.error("Couldn't read statistics file {}", $$1, var4);
         } catch (JsonParseException var5) {
            b.error("Couldn't parse statistics file {}", $$1, var5);
         }
      }
   }

   public void a() {
      try {
         FileUtils.writeStringToFile(this.d, this.b());
      } catch (IOException var2) {
         b.error("Couldn't save stats", var2);
      }
   }

   @Override
   public void a(cdm $$0, aqu<?> $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e.add($$1);
   }

   private Set<aqu<?>> d() {
      Set<aqu<?>> $$0 = Sets.newHashSet(this.e);
      this.e.clear();
      return $$0;
   }

   public void a(DataFixer $$0, String $$1) {
      try {
         JsonReader $$2 = new JsonReader(new StringReader($$1));

         label47: {
            try {
               $$2.setLenient(false);
               JsonElement $$3 = Streams.parse($$2);
               if (!$$3.isJsonNull()) {
                  rz $$4 = a($$3.getAsJsonObject());
                  $$4 = aun.g.a($$0, $$4, so.b($$4, 1343));
                  if (!$$4.b("stats", 10)) {
                     break label47;
                  }

                  rz $$5 = $$4.p("stats");
                  Iterator var7 = $$5.e().iterator();

                  while (true) {
                     if (!var7.hasNext()) {
                        break label47;
                     }

                     String $$6 = (String)var7.next();
                     if ($$5.b($$6, 10)) {
                        ac.a(
                           jy.y.b(new agg($$6)),
                           $$2x -> {
                              rz $$3x = $$5.p($$6);

                              for (String $$4x : $$3x.e()) {
                                 if ($$3x.b($$4x, 99)) {
                                    ac.a(
                                       this.a($$2x, $$4x),
                                       $$2xx -> this.a.put($$2xx, $$3x.h($$4x)),
                                       () -> b.warn("Invalid statistic in {}: Don't know what {} is", this.d, $$4x)
                                    );
                                 } else {
                                    b.warn("Invalid statistic value in {}: Don't know what {} is for key {}", new Object[]{this.d, $$3x.c($$4x), $$4x});
                                 }
                              }
                           },
                           () -> b.warn("Invalid statistic type in {}: Don't know what {} is", this.d, $$6)
                        );
                     }
                  }
               }

               b.error("Unable to parse Stat data from {}", this.d);
            } catch (Throwable var10) {
               try {
                  $$2.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            $$2.close();
            return;
         }

         $$2.close();
      } catch (IOException | JsonParseException var11) {
         b.error("Unable to parse Stat data from {}", this.d, var11);
      }
   }

   private <T> Optional<aqu<T>> a(aqw<T> $$0, String $$1) {
      return Optional.ofNullable(agg.a($$1)).flatMap($$0.a()::b).map($$0::b);
   }

   private static rz a(JsonObject $$0) {
      rz $$1 = new rz();

      for (Entry<String, JsonElement> $$2 : $$0.entrySet()) {
         JsonElement $$3 = $$2.getValue();
         if ($$3.isJsonObject()) {
            $$1.a($$2.getKey(), a($$3.getAsJsonObject()));
         } else if ($$3.isJsonPrimitive()) {
            JsonPrimitive $$4 = $$3.getAsJsonPrimitive();
            if ($$4.isNumber()) {
               $$1.a($$2.getKey(), $$4.getAsInt());
            }
         }
      }

      return $$1;
   }

   protected String b() {
      Map<aqw<?>, JsonObject> $$0 = Maps.newHashMap();
      ObjectIterator $$3 = this.a.object2IntEntrySet().iterator();

      while ($$3.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<aqu<?>> $$1 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<aqu<?>>)$$3.next();
         aqu<?> $$2 = (aqu<?>)$$1.getKey();
         $$0.computeIfAbsent($$2.a(), $$0x -> new JsonObject()).addProperty(b($$2).toString(), $$1.getIntValue());
      }

      JsonObject $$3x = new JsonObject();

      for (Entry<aqw<?>, JsonObject> $$4 : $$0.entrySet()) {
         $$3x.add(jy.y.b($$4.getKey()).toString(), (JsonElement)$$4.getValue());
      }

      JsonObject $$5 = new JsonObject();
      $$5.add("stats", $$3x);
      $$5.addProperty("DataVersion", aa.b().d().c());
      return $$5.toString();
   }

   private static <T> agg b(aqu<T> $$0) {
      return $$0.a().a().b($$0.b());
   }

   public void c() {
      this.e.addAll(this.a.keySet());
   }

   public void a(amb $$0) {
      Object2IntMap<aqu<?>> $$1 = new Object2IntOpenHashMap();

      for (aqu<?> $$2 : this.d()) {
         $$1.put($$2, this.a($$2));
      }

      $$0.c.b(new yh($$1));
   }
}
