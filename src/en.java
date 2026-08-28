import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;
import javax.annotation.Nullable;

public record en(@Nullable Float c, @Nullable Float d) {
   public static final en a = new en(null, null);
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("argument.range.ints"));

   public static en a(float $$0) {
      return new en($$0, $$0);
   }

   public static en a(float $$0, float $$1) {
      return new en($$0, $$1);
   }

   public static en b(float $$0) {
      return new en($$0, null);
   }

   public static en c(float $$0) {
      return new en(null, $$0);
   }

   public boolean d(float $$0) {
      if (this.c != null && this.d != null && this.c > this.d && this.c > $$0 && this.d < $$0) {
         return false;
      } else {
         return this.c != null && this.c > $$0 ? false : this.d == null || !(this.d < $$0);
      }
   }

   public boolean a(double $$0) {
      if (this.c != null && this.d != null && this.c > this.d && (double)(this.c * this.c) > $$0 && (double)(this.d * this.d) < $$0) {
         return false;
      } else {
         return this.c != null && (double)(this.c * this.c) > $$0 ? false : this.d == null || !((double)(this.d * this.d) < $$0);
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else if (this.c != null && this.d != null && this.c.equals(this.d)) {
         return new JsonPrimitive(this.c);
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            $$0.addProperty("min", this.c);
         }

         if (this.d != null) {
            $$0.addProperty("max", this.c);
         }

         return $$0;
      }
   }

   public static en a(@Nullable JsonElement $$0) {
      if ($$0 == null || $$0.isJsonNull()) {
         return a;
      } else if (azc.b($$0)) {
         float $$1 = azc.e($$0, "value");
         return new en($$1, $$1);
      } else {
         JsonObject $$2 = azc.m($$0, "value");
         Float $$3 = $$2.has("min") ? azc.m($$2, "min") : null;
         Float $$4 = $$2.has("max") ? azc.m($$2, "max") : null;
         return new en($$3, $$4);
      }
   }

   public static en a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return a($$0, $$1, $$0x -> $$0x);
   }

   public static en a(StringReader $$0, boolean $$1, Function<Float, Float> $$2) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw dj.a.createWithContext($$0);
      } else {
         int $$3 = $$0.getCursor();
         Float $$4 = a(b($$0, $$1), $$2);
         Float $$5;
         if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
            $$0.skip();
            $$0.skip();
            $$5 = a(b($$0, $$1), $$2);
            if ($$4 == null && $$5 == null) {
               $$0.setCursor($$3);
               throw dj.a.createWithContext($$0);
            }
         } else {
            if (!$$1 && $$0.canRead() && $$0.peek() == '.') {
               $$0.setCursor($$3);
               throw b.createWithContext($$0);
            }

            $$5 = $$4;
         }

         if ($$4 == null && $$5 == null) {
            $$0.setCursor($$3);
            throw dj.a.createWithContext($$0);
         } else {
            return new en($$4, $$5);
         }
      }
   }

   @Nullable
   private static Float b(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      while ($$0.canRead() && c($$0, $$1)) {
         $$0.skip();
      }

      String $$3 = $$0.getString().substring($$2, $$0.getCursor());
      if ($$3.isEmpty()) {
         return null;
      } else {
         try {
            return Float.parseFloat($$3);
         } catch (NumberFormatException var5) {
            if ($$1) {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext($$0, $$3);
            } else {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext($$0, $$3);
            }
         }
      }
   }

   private static boolean c(StringReader $$0, boolean $$1) {
      char $$2 = $$0.peek();
      if (($$2 < '0' || $$2 > '9') && $$2 != '-') {
         return $$1 && $$2 == '.' ? !$$0.canRead(2) || $$0.peek(1) != '.' : false;
      } else {
         return true;
      }
   }

   @Nullable
   private static Float a(@Nullable Float $$0, Function<Float, Float> $$1) {
      return $$0 == null ? null : $$1.apply($$0);
   }

   @Nullable
   public Float b() {
      return this.c;
   }

   @Nullable
   public Float c() {
      return this.d;
   }
}
