import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class eek extends edv {
   final qs a;

   eek(efh[] $$0, qs $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.f;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      $$0.w().a(this.a);
      return $$0;
   }

   @Deprecated
   public static edv.a<?> a(qs $$0) {
      return a($$1 -> new eek($$1, $$0));
   }

   public static class a extends edv.c<eek> {
      public void a(JsonObject $$0, eek $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("tag", $$1.a.toString());
      }

      public eek a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         try {
            qs $$3 = rm.a(arf.i($$0, "tag"));
            return new eek($$2, $$3);
         } catch (CommandSyntaxException var5) {
            throw new JsonSyntaxException(var5.getMessage());
         }
      }
   }
}
