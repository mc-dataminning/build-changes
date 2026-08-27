import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class afi extends anx {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private Map<aew, af> c = Map.of();
   private ak d = new ak();
   private final ect e;

   public afi(ect $$0) {
      super(b, "advancements");
      this.e = $$0;
   }

   protected void a(Map<aew, JsonElement> $$0, ant $$1, bdp $$2) {
      Builder<aew, af> $$3 = ImmutableMap.builder();
      $$0.forEach(($$1x, $$2x) -> {
         try {
            JsonObject $$3x = arn.m($$2x, "advancement");
            ae $$4x = ae.a($$3x, new bg($$1x, this.e));
            $$3.put($$1x, new af($$1x, $$4x));
         } catch (Exception var6) {
            a.error("Parsing error loading custom advancement {}: {}", $$1x, var6.getMessage());
         }
      });
      this.c = $$3.buildOrThrow();
      ak $$4 = new ak();
      $$4.a(this.c.values());

      for (ag $$5 : $$4.b()) {
         if ($$5.b().b().d().isPresent()) {
            as.a($$5);
         }
      }

      this.d = $$4;
   }

   @Nullable
   public af a(aew $$0) {
      return this.c.get($$0);
   }

   public ak a() {
      return this.d;
   }

   public Collection<af> b() {
      return this.c.values();
   }
}
