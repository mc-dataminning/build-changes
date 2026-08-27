import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class an {
   private final tf a;
   private final tf b;
   private final cix c;
   @Nullable
   private final aer d;
   private final ao e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private float i;
   private float j;

   public an(cix $$0, tf $$1, tf $$2, @Nullable aer $$3, ao $$4, boolean $$5, boolean $$6, boolean $$7) {
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

   public tf a() {
      return this.a;
   }

   public tf b() {
      return this.b;
   }

   public cix c() {
      return this.c;
   }

   @Nullable
   public aer d() {
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
      tf $$1 = tf.a.a($$0.get("title"));
      tf $$2 = tf.a.a($$0.get("description"));
      if ($$1 != null && $$2 != null) {
         cix $$3 = b(arg.u($$0, "icon"));
         aer $$4 = $$0.has("background") ? new aer(arg.i($$0, "background")) : null;
         ao $$5 = $$0.has("frame") ? ao.a(arg.i($$0, "frame")) : ao.a;
         boolean $$6 = arg.a($$0, "show_toast", true);
         boolean $$7 = arg.a($$0, "announce_to_chat", true);
         boolean $$8 = arg.a($$0, "hidden", false);
         return new an($$3, $$1, $$2, $$4, $$5, $$6, $$7, $$8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static cix b(JsonObject $$0) {
      if (!$$0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         he<cis> $$1 = arg.j($$0, "item");
         if ($$0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            cix $$2 = new cix($$1);
            if ($$0.has("nbt")) {
               try {
                  qr $$3 = rl.a(arg.a($$0.get("nbt"), "nbt"));
                  $$2.c($$3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return $$2;
         }
      }
   }

   public void a(si $$0) {
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

   public static an b(si $$0) {
      tf $$1 = $$0.l();
      tf $$2 = $$0.l();
      cix $$3 = $$0.q();
      ao $$4 = $$0.b(ao.class);
      int $$5 = $$0.readInt();
      aer $$6 = ($$5 & 1) != 0 ? $$0.s() : null;
      boolean $$7 = ($$5 & 2) != 0;
      boolean $$8 = ($$5 & 4) != 0;
      an $$9 = new an($$3, $$1, $$2, $$6, $$4, $$7, false, $$8);
      $$9.a($$0.readFloat(), $$0.readFloat());
      return $$9;
   }

   public JsonElement k() {
      JsonObject $$0 = new JsonObject();
      $$0.add("icon", this.l());
      $$0.add("title", tf.a.c(this.a));
      $$0.add("description", tf.a.c(this.b));
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
      $$0.addProperty("item", jb.i.b(this.c.d()).toString());
      if (this.c.u()) {
         $$0.addProperty("nbt", this.c.v().toString());
      }

      return $$0;
   }
}
