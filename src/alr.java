import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class alr extends ava {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<ale, ag> c = Map.of();
   private al d = new al();
   private final jq.a e;

   public alr(jq.a $$0) {
      super(b, lw.c(lw.bh));
      this.e = $$0;
   }

   protected void a(Map<ale, JsonElement> $$0, auv $$1, bog $$2) {
      alc<JsonElement> $$3 = this.e.a(JsonOps.INSTANCE);
      Builder<ale, ag> $$4 = ImmutableMap.builder();
      $$0.forEach(($$2x, $$3x) -> {
         try {
            af $$4x = (af)af.a.parse($$3, $$3x).getOrThrow(JsonParseException::new);
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

   private void a(ale $$0, af $$1) {
      azl.a $$2 = new azl.a();
      $$1.a($$2, this.e);
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public ag a(ale $$0) {
      return this.c.get($$0);
   }

   public al a() {
      return this.d;
   }

   public Collection<ag> b() {
      return this.c.values();
   }
}
