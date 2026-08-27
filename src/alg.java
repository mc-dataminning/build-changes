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

public class alg extends auh {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<akt, ag> c = Map.of();
   private al d = new al();
   private final jc.a e;

   public alg(jc.a $$0) {
      super(b, "advancements");
      this.e = $$0;
   }

   protected void a(Map<akt, JsonElement> $$0, aud $$1, bmo $$2) {
      akr<JsonElement> $$3 = this.e.a(JsonOps.INSTANCE);
      Builder<akt, ag> $$4 = ImmutableMap.builder();
      $$0.forEach(($$2x, $$3x) -> {
         try {
            af $$4x = ad.a(af.a.parse($$3, $$3x), JsonParseException::new);
            this.a($$2x, $$4x);
            $$4.put($$2x, new ag($$2x, $$4x));
         } catch (Exception var6x) {
            a.error("Parsing error loading custom advancement {}: {}", $$2x, var6x.getMessage());
         }
      });
      this.c = $$4.buildOrThrow();
      al $$5 = new al();
      $$5.a(this.c.values());

      for (ah $$6 : $$5.b()) {
         if ($$6.b().b().c().isPresent()) {
            at.a($$6);
         }
      }

      this.d = $$5;
   }

   private void a(akt $$0, af $$1) {
      ayr.a $$2 = new ayr.a();
      $$1.a($$2, this.e.b());
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
   public ag a(akt $$0) {
      return this.c.get($$0);
   }

   public al a() {
      return this.d;
   }

   public Collection<ag> b() {
      return this.c.values();
   }
}
