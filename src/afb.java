import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class afb extends ano {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().create();
   private af c = new af();
   private final eck d;

   public afb(eck $$0) {
      super(b, "advancements");
      this.d = $$0;
   }

   protected void a(Map<aep, JsonElement> $$0, ank $$1, bde $$2) {
      Map<aep, ae.a> $$3 = Maps.newHashMap();
      $$0.forEach(($$1x, $$2x) -> {
         try {
            JsonObject $$3x = arf.m($$2x, "advancement");
            ae.a $$4x = ae.a.a($$3x, new be($$1x, this.d));
            $$3.put($$1x, $$4x);
         } catch (Exception var6) {
            a.error("Parsing error loading custom advancement {}: {}", $$1x, var6.getMessage());
         }
      });
      af $$4 = new af();
      $$4.a($$3);

      for (ae $$5 : $$4.b()) {
         if ($$5.d() != null) {
            aq.a($$5);
         }
      }

      this.c = $$4;
   }

   @Nullable
   public ae a(aep $$0) {
      return this.c.a($$0);
   }

   public Collection<ae> a() {
      return this.c.c();
   }
}
