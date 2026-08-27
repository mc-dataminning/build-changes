import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajk extends ase {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<aiy, af> c = Map.of();
   private ak d = new ak();
   private final eiy e;

   public ajk(eiy $$0) {
      super(b, "advancements");
      this.e = $$0;
   }

   protected void a(Map<aiy, JsonElement> $$0, asa $$1, bil $$2) {
      Builder<aiy, af> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         try {
            ae $$3x = ac.a(ae.a.parse(JsonOps.INSTANCE, $$2x), JsonParseException::new);
            this.a($$1x, $$3x);
            $$3.put($$1x, new af($$1x, $$3x));
         } catch (Exception var5x) {
            a.error("Parsing error loading custom advancement {}: {}", $$1x, var5x.getMessage());
         }
      });
      this.c = $$3.buildOrThrow();
      ak $$4 = new ak();
      $$4.a(this.c.values());

      for (ag $$5 : $$4.b()) {
         if ($$5.b().b().c().isPresent()) {
            as.a($$5);
         }
      }

      this.d = $$4;
   }

   private void a(aiy $$0, ae $$1) {
      awm.a $$2 = new awm.a();
      $$1.a($$2, this.e);
      Multimap<String, String> $$3 = $$2.a();
      if (!$$3.isEmpty()) {
         String $$4 = $$3.asMap()
            .entrySet()
            .stream()
            .map($$0x -> "  at " + (String)$$0x.getKey() + ": " + String.join("; ", (Iterable<? extends CharSequence>)$$0x.getValue()))
            .collect(Collectors.joining("\n"));
         a.warn("Found validation problems in advancement {}: \n{}", $$0, $$4);
      }
   }

   @Nullable
   public af a(aiy $$0) {
      return this.c.get($$0);
   }

   public ak a() {
      return this.d;
   }

   public Collection<af> b() {
      return this.c.values();
   }
}
