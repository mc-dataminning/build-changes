import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class an {
   private final te a;
   private final te b;
   private final ciw c;
   @Nullable
   private final aep d;
   private final ao e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private float i;
   private float j;

   public an(ciw $$0, te $$1, te $$2, @Nullable aep $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
      this.a = $$1;
      this.b = $$2;
      this.c = $$0;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }

   public void a(float $$0, float $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   public te a() {
      return this.a;
   }

   public te b() {
      return this.b;
   }

   public ciw c() {
      return this.c;
   }

   @Nullable
   public aep d() {
      return this.d;
   }

   public ao e() {
      return this.e;
   }

   public float f() {
      return this.i;
   }

   public float g() {
      return this.j;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public static an a(JsonObject $$0) {
      te $$1 = te.a.a($$0.get("title"));
      te $$2 = te.a.a($$0.get("description"));
      if ($$1 != null && $$2 != null) {
         ciw $$3 = b(arf.u($$0, "icon"));
         aep $$4 = $$0.has("background") ? new aep(arf.i($$0, "background")) : null;
         ao $$5 = $$0.has("frame") ? ao.a(arf.i($$0, "frame")) : ao.a;
         boolean $$6 = arf.a($$0, "show_toast", true);
         boolean $$7 = arf.a($$0, "announce_to_chat", true);
         boolean $$8 = arf.a($$0, "hidden", false);
         return new an($$3, $$1, $$2, $$4, $$5, $$6, $$7, $$8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static ciw b(JsonObject $$0) {
      if (!$$0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         cir $$1 = arf.j($$0, "item");
         if ($$0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            ciw $$2 = new ciw($$1);
            if ($$0.has("nbt")) {
               try {
                  qs $$3 = rm.a(arf.a($$0.get("nbt"), "nbt"));
                  $$2.c($$3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return $$2;
         }
      }
   }

   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.e);
      int $$1 = 0;
      if (this.d != null) {
         $$1 |= 1;
      }

      if (this.f) {
         $$1 |= 2;
      }

      if (this.h) {
         $$1 |= 4;
      }

      $$0.p($$1);
      if (this.d != null) {
         $$0.a(this.d);
      }

      $$0.a(this.i);
      $$0.a(this.j);
   }

   public static an b(sh $$0) {
      te $$1 = $$0.l();
      te $$2 = $$0.l();
      ciw $$3 = $$0.q();
      ao $$4 = $$0.b(ao.class);
      int $$5 = $$0.readInt();
      aep $$6 = ($$5 & 1) != 0 ? $$0.s() : null;
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      an $$9 = new an($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }

   public JsonElement k() {
      JsonObject $$0 = new JsonObject();
      $$0.add("icon", this.l());
      $$0.add("title", te.a.c(this.a));
      $$0.add("description", te.a.c(this.b));
      $$0.addProperty("frame", this.e.a());
      $$0.addProperty("show_toast", this.f);
      $$0.addProperty("announce_to_chat", this.g);
      $$0.addProperty("hidden", this.h);
      if (this.d != null) {
         $$0.addProperty("background", this.d.toString());
      }

      return $$0;
   }

   private JsonObject l() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("item", jc.i.b(this.c.d()).toString());
      if (this.c.u()) {
         $$0.addProperty("nbt", this.c.v().toString());
      }

      return $$0;
   }
}
