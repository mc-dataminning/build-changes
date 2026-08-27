import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Set;
import org.slf4j.Logger;

public class eeh extends edv {
   private static final Logger a = LogUtils.getLogger();
   final egc b;
   final boolean c;

   eeh(efh[] $$0, egc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edx b() {
      return edy.i;
   }

   @Override
   public Set<eeq<?>> a() {
      return this.b.a();
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.i()) {
         int $$2 = $$0.l();
         float $$3 = this.c ? 1.0F - (float)$$0.k() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - aro.a(this.b.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(aro.d($$4 * (float)$$2));
      } else {
         a.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static edv.a<?> a(egc $$0) {
      return a($$1 -> new eeh($$1, $$0, false));
   }

   public static edv.a<?> a(egc $$0, boolean $$1) {
      return a($$2 -> new eeh($$2, $$0, $$1));
   }

   public static class a extends edv.c<eeh> {
      public void a(JsonObject $$0, eeh $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("damage", $$2.serialize($$1.b));
         $$0.addProperty("add", $$1.c);
      }

      public eeh a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         egc $$3 = arf.a($$0, "damage", $$1, egc.class);
         boolean $$4 = arf.a($$0, "add", false);
         return new eeh($$2, $$3, $$4);
      }
   }
}
