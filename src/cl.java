import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class cl {
   public static final cl a = new cl(null);
   @Nullable
   private final qr b;

   public cl(@Nullable qr $$0) {
      this.b = $$0;
   }

   public boolean a(cfz $$0) {
      return this == a ? true : this.a($$0.v());
   }

   public boolean a(bfj $$0) {
      return this == a ? true : this.a(b($$0));
   }

   public boolean a(@Nullable rk $$0) {
      return $$0 == null ? this == a : this.b == null || rd.a(this.b, $$0, true);
   }

   public JsonElement a() {
      return (JsonElement)(this != a && this.b != null ? new JsonPrimitive(this.b.toString()) : JsonNull.INSTANCE);
   }

   public static cl a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         qr $$1;
         try {
            $$1 = rl.a(aor.a($$0, "nbt"));
         } catch (CommandSyntaxException var3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3.getMessage());
         }

         return new cl($$1);
      } else {
         return a;
      }
   }

   public static qr b(bfj $$0) {
      qr $$1 = $$0.f(new qr());
      if ($$0 instanceof byo) {
         cfz $$2 = ((byo)$$0).fN().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qr()));
         }
      }

      return $$1;
   }
}
