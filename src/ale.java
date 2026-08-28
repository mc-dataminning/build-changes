import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Type;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public final class ale implements Comparable<ale> {
   public static final Codec<ale> a = Codec.STRING.comapFlatMap(ale::d, ale::toString).stable();
   public static final zc<ByteBuf, ale> b = za.m.a(ale::a, ale::toString);
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("argument.id.invalid"));
   public static final char d = ':';
   public static final String e = "minecraft";
   public static final String f = "realms";
   private final String h;
   private final String i;

   private ale(String $$0, String $$1) {
      assert j($$0);

      assert i($$1);

      this.h = $$0;
      this.i = $$1;
   }

   private static ale d(String $$0, String $$1) {
      return new ale(e($$0, $$1), f($$0, $$1));
   }

   public static ale a(String $$0, String $$1) {
      return d($$0, $$1);
   }

   public static ale a(String $$0) {
      return a($$0, ':');
   }

   public static ale b(String $$0) {
      return new ale("minecraft", f("minecraft", $$0));
   }

   @Nullable
   public static ale c(String $$0) {
      return b($$0, ':');
   }

   @Nullable
   public static ale b(String $$0, String $$1) {
      return j($$0) && i($$1) ? new ale($$0, $$1) : null;
   }

   public static ale a(String $$0, char $$1) {
      int $$2 = $$0.indexOf($$1);
      if ($$2 >= 0) {
         String $$3 = $$0.substring($$2 + 1);
         if ($$2 != 0) {
            String $$4 = $$0.substring(0, $$2);
            return d($$4, $$3);
         } else {
            return b($$3);
         }
      } else {
         return b($$0);
      }
   }

   @Nullable
   public static ale b(String $$0, char $$1) {
      int $$2 = $$0.indexOf($$1);
      if ($$2 >= 0) {
         String $$3 = $$0.substring($$2 + 1);
         if (!i($$3)) {
            return null;
         } else if ($$2 != 0) {
            String $$4 = $$0.substring(0, $$2);
            return j($$4) ? new ale($$4, $$3) : null;
         } else {
            return new ale("minecraft", $$3);
         }
      } else {
         return i($$0) ? new ale("minecraft", $$0) : null;
      }
   }

   public static DataResult<ale> d(String $$0) {
      try {
         return DataResult.success(a($$0));
      } catch (aa var2) {
         return DataResult.error(() -> "Not a valid resource location: " + $$0 + " " + var2.getMessage());
      }
   }

   public String a() {
      return this.i;
   }

   public String b() {
      return this.h;
   }

   public ale e(String $$0) {
      return new ale(this.h, f(this.h, $$0));
   }

   public ale a(UnaryOperator<String> $$0) {
      return this.e($$0.apply(this.i));
   }

   public ale f(String $$0) {
      return this.e($$0 + this.i);
   }

   public ale g(String $$0) {
      return this.e(this.i + $$0);
   }

   @Override
   public String toString() {
      return this.h + ":" + this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ale $$1) ? false : this.h.equals($$1.h) && this.i.equals($$1.i);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.h.hashCode() + this.i.hashCode();
   }

   public int a(ale $$0) {
      int $$1 = this.i.compareTo($$0.i);
      if ($$1 == 0) {
         $$1 = this.h.compareTo($$0.h);
      }

      return $$1;
   }

   public String c() {
      return this.toString().replace('/', '_').replace(':', '_');
   }

   public String d() {
      return this.h + "." + this.i;
   }

   public String e() {
      return this.h.equals("minecraft") ? this.i : this.d();
   }

   public String h(String $$0) {
      return $$0 + "." + this.d();
   }

   public String c(String $$0, String $$1) {
      return $$0 + "." + this.d() + "." + $$1;
   }

   private static String c(StringReader $$0) {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$1, $$0.getCursor());
   }

   public static ale a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = c($$0);

      try {
         return a($$2);
      } catch (aa var4) {
         $$0.setCursor($$1);
         throw c.createWithContext($$0);
      }
   }

   public static ale b(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = c($$0);
      if ($$2.isEmpty()) {
         throw c.createWithContext($$0);
      } else {
         try {
            return a($$2);
         } catch (aa var4) {
            $$0.setCursor($$1);
            throw c.createWithContext($$0);
         }
      }
   }

   public static boolean a(char $$0) {
      return $$0 >= '0' && $$0 <= '9' || $$0 >= 'a' && $$0 <= 'z' || $$0 == '_' || $$0 == ':' || $$0 == '/' || $$0 == '.' || $$0 == '-';
   }

   public static boolean i(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!b($$0.charAt($$1))) {
            return false;
         }
      }

      return true;
   }

   public static boolean j(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!c($$0.charAt($$1))) {
            return false;
         }
      }

      return true;
   }

   private static String e(String $$0, String $$1) {
      if (!j($$0)) {
         throw new aa("Non [a-z0-9_.-] character in namespace of location: " + $$0 + ":" + $$1);
      } else {
         return $$0;
      }
   }

   public static boolean b(char $$0) {
      return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '/' || $$0 == '.';
   }

   private static boolean c(char $$0) {
      return $$0 == '_' || $$0 == '-' || $$0 >= 'a' && $$0 <= 'z' || $$0 >= '0' && $$0 <= '9' || $$0 == '.';
   }

   private static String f(String $$0, String $$1) {
      if (!i($$1)) {
         throw new aa("Non [a-z0-9/._-] character in path of location: " + $$0 + ":" + $$1);
      } else {
         return $$1;
      }
   }

   public static class a implements JsonDeserializer<ale>, JsonSerializer<ale> {
      public ale a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return ale.a(ayv.a($$0, "location"));
      }

      public JsonElement a(ale $$0, Type $$1, JsonSerializationContext $$2) {
         return new JsonPrimitive($$0.toString());
      }
   }
}
