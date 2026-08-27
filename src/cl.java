import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class cl {
   public static final cl a = new cl(null);
   @Nullable
   private final qs b;

   public cl(@Nullable qs $$0) {
      this.b = $$0;
   }

   public boolean a(ciw $$0) {
      return this == a ? true : this.a($$0.v());
   }

   public boolean a(big $$0) {
      return this == a ? true : this.a(b($$0));
   }

   public boolean a(@Nullable rl $$0) {
      return $$0 == null ? this == a : this.b == null || re.a(this.b, $$0, true);
   }

   public JsonElement a() {
      return (JsonElement)(this != a && this.b != null ? new JsonPrimitive(this.b.toString()) : JsonNull.INSTANCE);
   }

   public static cl a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         qs $$1;
         try {
            $$1 = rm.a(arf.a($$0, "nbt"));
         } catch (CommandSyntaxException var3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3.getMessage());
         }

         return new cl($$1);
      } else {
         return a;
      }
   }

   public static qs b(big $$0) {
      qs $$1 = $$0.f(new qs());
      if ($$0 instanceof cbl) {
         ciw $$2 = ((cbl)$$0).fQ().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qs()));
         }
      }

      return $$1;
   }
}
