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

public class akx extends aua {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<akk, af> c = Map.of();
   private ak d = new ak();
   private final jl.a e;

   public akx(jl.a $$0) {
      super(b, "advancements");
      this.e = $$0;
   }

   protected void a(Map<akk, JsonElement> $$0, atw $$1, bmu $$2) {
      aki<JsonElement> $$3 = this.e.a(JsonOps.INSTANCE);
      Builder<akk, af> $$4 = ImmutableMap.builder();
      $$0.forEach(($$2x, $$3x) -> {
         try {
            ae $$4x = (ae)ae.a.parse($$3, $$3x).getOrThrow(JsonParseException::new);
            this.a($$2x, $$4x);
            $$4.put($$2x, new af($$2x, $$4x));
         } catch (Exception var6x) {
            a.error("Parsing error loading custom advancement {}: {}", $$2x, var6x.getMessage());
         }
      });
      this.c = $$4.buildOrThrow();
      ak $$5 = new ak();
      $$5.a(this.c.values());

      for (ag $$6 : $$5.b()) {
         if ($$6.b().b().c().isPresent()) {
            as.a($$6);
         }
      }

      this.d = $$5;
   }

   private void a(akk $$0, ae $$1) {
      aym.a $$2 = new aym.a();
      $$1.a($$2, this.e.b());
      $$2.b().ifPresent($$1x -> a.warn("Found validation problems in advancement {}: \n{}", $$0, $$1x));
   }

   @Nullable
   public af a(akk $$0) {
      return this.c.get($$0);
   }

   public ak a() {
      return this.d;
   }

   public Collection<af> b() {
      return this.c.values();
   }
}
