import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Contract;

public class axv {
   private static final Gson a = new GsonBuilder().create();

   public static boolean a(JsonObject $$0, String $$1) {
      return !f($$0, $$1) ? false : $$0.getAsJsonPrimitive($$1).isString();
   }

   public static boolean a(JsonElement $$0) {
      return !$$0.isJsonPrimitive() ? false : $$0.getAsJsonPrimitive().isString();
   }

   public static boolean b(JsonObject $$0, String $$1) {
      return !f($$0, $$1) ? false : $$0.getAsJsonPrimitive($$1).isNumber();
   }

   public static boolean b(JsonElement $$0) {
      return !$$0.isJsonPrimitive() ? false : $$0.getAsJsonPrimitive().isNumber();
   }

   public static boolean c(JsonObject $$0, String $$1) {
      return !f($$0, $$1) ? false : $$0.getAsJsonPrimitive($$1).isBoolean();
   }

   public static boolean c(JsonElement $$0) {
      return !$$0.isJsonPrimitive() ? false : $$0.getAsJsonPrimitive().isBoolean();
   }

   public static boolean d(JsonObject $$0, String $$1) {
      return !g($$0, $$1) ? false : $$0.get($$1).isJsonArray();
   }

   public static boolean e(JsonObject $$0, String $$1) {
      return !g($$0, $$1) ? false : $$0.get($$1).isJsonObject();
   }

   public static boolean f(JsonObject $$0, String $$1) {
      return !g($$0, $$1) ? false : $$0.get($$1).isJsonPrimitive();
   }

   public static boolean g(@Nullable JsonObject $$0, String $$1) {
      return $$0 == null ? false : $$0.get($$1) != null;
   }

   public static JsonElement h(JsonObject $$0, String $$1) {
      JsonElement $$2 = $$0.get($$1);
      if ($$2 != null && !$$2.isJsonNull()) {
         return $$2;
      } else {
         throw new JsonSyntaxException("Missing field " + $$1);
      }
   }

   public static String a(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive()) {
         return $$0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a string, was " + d($$0));
      }
   }

   public static String i(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return a($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a string");
      }
   }

   @Nullable
   @Contract("_,_,!null->!null;_,_,null->_")
   public static String a(JsonObject $$0, String $$1, @Nullable String $$2) {
      return $$0.has($$1) ? a($$0.get($$1), $$1) : $$2;
   }

   public static ix<ctl> b(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive()) {
         String $$2 = $$0.getAsString();
         return le.h.c(new akn($$2)).orElseThrow(() -> new JsonSyntaxException("Expected " + $$1 + " to be an item, was unknown string '" + $$2 + "'"));
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be an item, was " + d($$0));
      }
   }

   public static ix<ctl> j(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return b($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find an item");
      }
   }

   @Nullable
   @Contract("_,_,!null->!null;_,_,null->_")
   public static ix<ctl> a(JsonObject $$0, String $$1, @Nullable ix<ctl> $$2) {
      return $$0.has($$1) ? b($$0.get($$1), $$1) : $$2;
   }

   public static boolean c(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive()) {
         return $$0.getAsBoolean();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Boolean, was " + d($$0));
      }
   }

   public static boolean k(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return c($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Boolean");
      }
   }

   public static boolean a(JsonObject $$0, String $$1, boolean $$2) {
      return $$0.has($$1) ? c($$0.get($$1), $$1) : $$2;
   }

   public static double d(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsDouble();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Double, was " + d($$0));
      }
   }

   public static double l(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return d($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Double");
      }
   }

   public static double a(JsonObject $$0, String $$1, double $$2) {
      return $$0.has($$1) ? d($$0.get($$1), $$1) : $$2;
   }

   public static float e(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Float, was " + d($$0));
      }
   }

   public static float m(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return e($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Float");
      }
   }

   public static float a(JsonObject $$0, String $$1, float $$2) {
      return $$0.has($$1) ? e($$0.get($$1), $$1) : $$2;
   }

   public static long f(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Long, was " + d($$0));
      }
   }

   public static long n(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return f($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Long");
      }
   }

   public static long a(JsonObject $$0, String $$1, long $$2) {
      return $$0.has($$1) ? f($$0.get($$1), $$1) : $$2;
   }

   public static int g(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Int, was " + d($$0));
      }
   }

   public static int o(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return g($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Int");
      }
   }

   public static int a(JsonObject $$0, String $$1, int $$2) {
      return $$0.has($$1) ? g($$0.get($$1), $$1) : $$2;
   }

   public static byte h(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Byte, was " + d($$0));
      }
   }

   public static byte p(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return h($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Byte");
      }
   }

   public static byte a(JsonObject $$0, String $$1, byte $$2) {
      return $$0.has($$1) ? h($$0.get($$1), $$1) : $$2;
   }

   public static char i(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsCharacter();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Character, was " + d($$0));
      }
   }

   public static char q(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return i($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Character");
      }
   }

   public static char a(JsonObject $$0, String $$1, char $$2) {
      return $$0.has($$1) ? i($$0.get($$1), $$1) : $$2;
   }

   public static BigDecimal j(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsBigDecimal();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a BigDecimal, was " + d($$0));
      }
   }

   public static BigDecimal r(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return j($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a BigDecimal");
      }
   }

   public static BigDecimal a(JsonObject $$0, String $$1, BigDecimal $$2) {
      return $$0.has($$1) ? j($$0.get($$1), $$1) : $$2;
   }

   public static BigInteger k(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsBigInteger();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a BigInteger, was " + d($$0));
      }
   }

   public static BigInteger s(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return k($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a BigInteger");
      }
   }

   public static BigInteger a(JsonObject $$0, String $$1, BigInteger $$2) {
      return $$0.has($$1) ? k($$0.get($$1), $$1) : $$2;
   }

   public static short l(JsonElement $$0, String $$1) {
      if ($$0.isJsonPrimitive() && $$0.getAsJsonPrimitive().isNumber()) {
         return $$0.getAsShort();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a Short, was " + d($$0));
      }
   }

   public static short t(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return l($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a Short");
      }
   }

   public static short a(JsonObject $$0, String $$1, short $$2) {
      return $$0.has($$1) ? l($$0.get($$1), $$1) : $$2;
   }

   public static JsonObject m(JsonElement $$0, String $$1) {
      if ($$0.isJsonObject()) {
         return $$0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a JsonObject, was " + d($$0));
      }
   }

   public static JsonObject u(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return m($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a JsonObject");
      }
   }

   @Nullable
   @Contract("_,_,!null->!null;_,_,null->_")
   public static JsonObject a(JsonObject $$0, String $$1, @Nullable JsonObject $$2) {
      return $$0.has($$1) ? m($$0.get($$1), $$1) : $$2;
   }

   public static JsonArray n(JsonElement $$0, String $$1) {
      if ($$0.isJsonArray()) {
         return $$0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + $$1 + " to be a JsonArray, was " + d($$0));
      }
   }

   public static JsonArray v(JsonObject $$0, String $$1) {
      if ($$0.has($$1)) {
         return n($$0.get($$1), $$1);
      } else {
         throw new JsonSyntaxException("Missing " + $$1 + ", expected to find a JsonArray");
      }
   }

   @Nullable
   @Contract("_,_,!null->!null;_,_,null->_")
   public static JsonArray a(JsonObject $$0, String $$1, @Nullable JsonArray $$2) {
      return $$0.has($$1) ? n($$0.get($$1), $$1) : $$2;
   }

   public static <T> T a(@Nullable JsonElement $$0, String $$1, JsonDeserializationContext $$2, Class<? extends T> $$3) {
      if ($$0 != null) {
         return (T)$$2.deserialize($$0, $$3);
      } else {
         throw new JsonSyntaxException("Missing " + $$1);
      }
   }

   public static <T> T a(JsonObject $$0, String $$1, JsonDeserializationContext $$2, Class<? extends T> $$3) {
      if ($$0.has($$1)) {
         return a($$0.get($$1), $$1, $$2, $$3);
      } else {
         throw new JsonSyntaxException("Missing " + $$1);
      }
   }

   @Nullable
   @Contract("_,_,!null,_,_->!null;_,_,null,_,_->_")
   public static <T> T a(JsonObject $$0, String $$1, @Nullable T $$2, JsonDeserializationContext $$3, Class<? extends T> $$4) {
      return $$0.has($$1) ? a($$0.get($$1), $$1, $$3, $$4) : $$2;
   }

   public static String d(@Nullable JsonElement $$0) {
      String $$1 = StringUtils.abbreviateMiddle(String.valueOf($$0), "...", 10);
      if ($$0 == null) {
         return "null (missing)";
      } else if ($$0.isJsonNull()) {
         return "null (json)";
      } else if ($$0.isJsonArray()) {
         return "an array (" + $$1 + ")";
      } else if ($$0.isJsonObject()) {
         return "an object (" + $$1 + ")";
      } else {
         if ($$0.isJsonPrimitive()) {
            JsonPrimitive $$2 = $$0.getAsJsonPrimitive();
            if ($$2.isNumber()) {
               return "a number (" + $$1 + ")";
            }

            if ($$2.isBoolean()) {
               return "a boolean (" + $$1 + ")";
            }
         }

         return $$1;
      }
   }

   @Nullable
   public static <T> T a(Gson $$0, Reader $$1, Class<T> $$2, boolean $$3) {
      try {
         JsonReader $$4 = new JsonReader($$1);
         $$4.setLenient($$3);
         return (T)$$0.getAdapter($$2).read($$4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static <T> T b(Gson $$0, Reader $$1, Class<T> $$2, boolean $$3) {
      T $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 == null) {
         throw new JsonParseException("JSON data was null or empty");
      } else {
         return $$4;
      }
   }

   @Nullable
   public static <T> T a(Gson $$0, Reader $$1, TypeToken<T> $$2, boolean $$3) {
      try {
         JsonReader $$4 = new JsonReader($$1);
         $$4.setLenient($$3);
         return (T)$$0.getAdapter($$2).read($$4);
      } catch (IOException var5) {
         throw new JsonParseException(var5);
      }
   }

   public static <T> T b(Gson $$0, Reader $$1, TypeToken<T> $$2, boolean $$3) {
      T $$4 = a($$0, $$1, $$2, $$3);
      if ($$4 == null) {
         throw new JsonParseException("JSON data was null or empty");
      } else {
         return $$4;
      }
   }

   @Nullable
   public static <T> T a(Gson $$0, String $$1, TypeToken<T> $$2, boolean $$3) {
      return a($$0, new StringReader($$1), $$2, $$3);
   }

   public static <T> T a(Gson $$0, String $$1, Class<T> $$2, boolean $$3) {
      return b($$0, new StringReader($$1), $$2, $$3);
   }

   @Nullable
   public static <T> T b(Gson $$0, String $$1, Class<T> $$2, boolean $$3) {
      return a($$0, new StringReader($$1), $$2, $$3);
   }

   public static <T> T a(Gson $$0, Reader $$1, TypeToken<T> $$2) {
      return b($$0, $$1, $$2, false);
   }

   @Nullable
   public static <T> T a(Gson $$0, String $$1, TypeToken<T> $$2) {
      return a($$0, $$1, $$2, false);
   }

   public static <T> T a(Gson $$0, Reader $$1, Class<T> $$2) {
      return b($$0, $$1, $$2, false);
   }

   public static <T> T a(Gson $$0, String $$1, Class<T> $$2) {
      return a($$0, $$1, $$2, false);
   }

   public static JsonObject a(String $$0, boolean $$1) {
      return a(new StringReader($$0), $$1);
   }

   public static JsonObject a(Reader $$0, boolean $$1) {
      return b(a, $$0, JsonObject.class, $$1);
   }

   public static JsonObject a(String $$0) {
      return a($$0, false);
   }

   public static JsonObject a(Reader $$0) {
      return a($$0, false);
   }

   public static JsonArray b(String $$0) {
      return b(new StringReader($$0));
   }

   public static JsonArray b(Reader $$0) {
      return b(a, $$0, JsonArray.class, false);
   }

   public static String e(JsonElement $$0) {
      StringWriter $$1 = new StringWriter();
      JsonWriter $$2 = new JsonWriter($$1);

      try {
         a($$2, $$0, Comparator.naturalOrder());
      } catch (IOException var4) {
         throw new AssertionError(var4);
      }

      return $$1.toString();
   }

   public static void a(JsonWriter $$0, @Nullable JsonElement $$1, @Nullable Comparator<String> $$2) throws IOException {
      if ($$1 == null || $$1.isJsonNull()) {
         $$0.nullValue();
      } else if ($$1.isJsonPrimitive()) {
         JsonPrimitive $$3 = $$1.getAsJsonPrimitive();
         if ($$3.isNumber()) {
            $$0.value($$3.getAsNumber());
         } else if ($$3.isBoolean()) {
            $$0.value($$3.getAsBoolean());
         } else {
            $$0.value($$3.getAsString());
         }
      } else if ($$1.isJsonArray()) {
         $$0.beginArray();

         for (JsonElement $$4 : $$1.getAsJsonArray()) {
            a($$0, $$4, $$2);
         }

         $$0.endArray();
      } else {
         if (!$$1.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + $$1.getClass());
         }

         $$0.beginObject();

         for (Entry<String, JsonElement> $$5 : a($$1.getAsJsonObject().entrySet(), $$2)) {
            $$0.name($$5.getKey());
            a($$0, $$5.getValue(), $$2);
         }

         $$0.endObject();
      }
   }

   private static Collection<Entry<String, JsonElement>> a(Collection<Entry<String, JsonElement>> $$0, @Nullable Comparator<String> $$1) {
      if ($$1 == null) {
         return $$0;
      } else {
         List<Entry<String, JsonElement>> $$2 = new ArrayList<>($$0);
         $$2.sort(Entry.comparingByKey($$1));
         return $$2;
      }
   }
}
