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
import java.lang.reflect.Type;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ahd implements Comparable<ahd> {
   public static final Codec<ahd> a = Codec.STRING.comapFlatMap(ahd::b, ahd::toString).stable();
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vd.c("argument.id.invalid"));
   public static final char b = ':';
   public static final String c = "minecraft";
   public static final String d = "realms";
   private final String f;
   private final String g;

   protected ahd(String $$0, String $$1, @Nullable ahd.a $$2) {
      this.f = $$0;
      this.g = $$1;
   }

   public ahd(String $$0, String $$1) {
      this(c($$0, $$1), d($$0, $$1), null);
   }

   private ahd(String[] $$0) {
      this($$0[0], $$0[1]);
   }

   public ahd(String $$0) {
      this(b($$0, ':'));
   }

   public static ahd a(String $$0, char $$1) {
      return new ahd(b($$0, $$1));
   }

   @Nullable
   public static ahd a(String $$0) {
      try {
         return new ahd($$0);
      } catch (z var2) {
         return null;
      }
   }

   @Nullable
   public static ahd a(String $$0, String $$1) {
      try {
         return new ahd($$0, $$1);
      } catch (z var3) {
         return null;
      }
   }

   protected static String[] b(String $$0, char $$1) {
      String[] $$2 = new String[]{"minecraft", $$0};
      int $$3 = $$0.indexOf($$1);
      if ($$3 >= 0) {
         $$2[1] = $$0.substring($$3 + 1);
         if ($$3 >= 1) {
            $$2[0] = $$0.substring(0, $$3);
         }
      }

      return $$2;
   }

   public static DataResult<ahd> b(String $$0) {
      try {
         return DataResult.success(new ahd($$0));
      } catch (z var2) {
         return DataResult.error(() -> "Not a valid resource location: " + $$0 + " " + var2.getMessage());
      }
   }

   public String a() {
      return this.g;
   }

   public String b() {
      return this.f;
   }

   public ahd c(String $$0) {
      return new ahd(this.f, d(this.f, $$0), null);
   }

   public ahd a(UnaryOperator<String> $$0) {
      return this.c($$0.apply(this.g));
   }

   public ahd d(String $$0) {
      return this.c($$0 + this.g);
   }

   public ahd e(String $$0) {
      return this.c(this.g + $$0);
   }

   @Override
   public String toString() {
      return this.f + ":" + this.g;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ahd $$1) ? false : this.f.equals($$1.f) && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      return 31 * this.f.hashCode() + this.g.hashCode();
   }

   public int a(ahd $$0) {
      int $$1 = this.g.compareTo($$0.g);
      if ($$1 == 0) {
         $$1 = this.f.compareTo($$0.f);
      }

      return $$1;
   }

   public String c() {
      return this.toString().replace('/', '_').replace(':', '_');
   }

   public String d() {
      return this.f + "." + this.g;
   }

   public String e() {
      return this.f.equals("minecraft") ? this.g : this.d();
   }

   public String f(String $$0) {
      return $$0 + "." + this.d();
   }

   public String b(String $$0, String $$1) {
      return $$0 + "." + this.d() + "." + $$1;
   }

   public static ahd a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      String $$2 = $$0.getString().substring($$1, $$0.getCursor());

      try {
         return new ahd($$2);
      } catch (z var4) {
         $$0.setCursor($$1);
         throw e.createWithContext($$0);
      }
   }

   public static boolean a(char $$0) {
      return $$0 >= '0' && $$0 <= '9' || $$0 >= 'a' && $$0 <= 'z' || $$0 == '_' || $$0 == ':' || $$0 == '/' || $$0 == '.' || $$0 == '-';
   }

   public static boolean g(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!b($$0.charAt($$1))) {
            return false;
         }
      }

      return true;
   }

   public static boolean h(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!c($$0.charAt($$1))) {
            return false;
         }
      }

      return true;
   }

   private static String c(String $$0, String $$1) {
      if (!h($$0)) {
         throw new z("Non [a-z0-9_.-] character in namespace of location: " + $$0 + ":" + $$1);
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

   public static boolean i(String $$0) {
      String[] $$1 = b($$0, ':');
      return h(StringUtils.isEmpty($$1[0]) ? "minecraft" : $$1[0]) && g($$1[1]);
   }

   private static String d(String $$0, String $$1) {
      if (!g($$1)) {
         throw new z("Non [a-z0-9/._-] character in path of location: " + $$0 + ":" + $$1);
      } else {
         return $$1;
      }
   }

   protected interface a {
   }

   public static class b implements JsonDeserializer<ahd>, JsonSerializer<ahd> {
      public ahd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new ahd(aty.a($$0, "location"));
      }

      public JsonElement a(ahd $$0, Type $$1, JsonSerializationContext $$2) {
         return new JsonPrimitive($$0.toString());
      }
   }
}
