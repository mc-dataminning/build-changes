import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class aq {
   private final ti a;
   private final ti b;
   private final cja c;
   @Nullable
   private final aeu d;
   private final ar e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private float i;
   private float j;

   public aq(cja $$0, ti $$1, ti $$2, @Nullable aeu $$3, ar $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public ti a() {
      return this.a;
   }

   public ti b() {
      return this.b;
   }

   public cja c() {
      return this.c;
   }

   @Nullable
   public aeu d() {
      return this.d;
   }

   public ar e() {
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

   public static aq a(JsonObject $$0) {
      ti $$1 = ti.a.a($$0.get("title"));
      ti $$2 = ti.a.a($$0.get("description"));
      if ($$1 != null && $$2 != null) {
         cja $$3 = b(arj.u($$0, "icon"));
         aeu $$4 = $$0.has("background") ? new aeu(arj.i($$0, "background")) : null;
         ar $$5 = $$0.has("frame") ? ar.a(arj.i($$0, "frame")) : ar.a;
         boolean $$6 = arj.a($$0, "show_toast", true);
         boolean $$7 = arj.a($$0, "announce_to_chat", true);
         boolean $$8 = arj.a($$0, "hidden", false);
         return new aq($$3, $$1, $$2, $$4, $$5, $$6, $$7, $$8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static cja b(JsonObject $$0) {
      if (!$$0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         hg<civ> $$1 = arj.j($$0, "item");
         if ($$0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            cja $$2 = new cja($$1);
            if ($$0.has("nbt")) {
               try {
                  qu $$3 = ro.a(arj.a($$0.get("nbt"), "nbt"));
                  $$2.c($$3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return $$2;
         }
      }
   }

   public void a(sl $$0) {
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

   public static aq b(sl $$0) {
      ti $$1 = $$0.l();
      ti $$2 = $$0.l();
      cja $$3 = $$0.q();
      ar $$4 = $$0.b(ar.class);
      int $$5 = $$0.readInt();
      aeu $$6 = ($$5 & 1) != 0 ? $$0.s() : null;
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      aq $$9 = new aq($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }

   public JsonElement k() {
      JsonObject $$0 = new JsonObject();
      $$0.add("icon", this.l());
      $$0.add("title", ti.a.c(this.a));
      $$0.add("description", ti.a.c(this.b));
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
      $$0.addProperty("item", jd.i.b(this.c.d()).toString());
      if (this.c.u()) {
         $$0.addProperty("nbt", this.c.v().toString());
      }

      return $$0;
   }
}
