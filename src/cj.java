import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cj<T extends Number> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("argument.range.empty"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("argument.range.swapped"));
   @Nullable
   protected final T c;
   @Nullable
   protected final T d;

   protected cj(@Nullable T $$0, @Nullable T $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   public T a() {
      return this.c;
   }

   @Nullable
   public T b() {
      return this.d;
   }

   public boolean c() {
      return this.c == null && this.d == null;
   }

   public JsonElement d() {
      if (this.c()) {
         return JsonNull.INSTANCE;
      } else if (this.c != null && this.c.equals(this.d)) {
         return new JsonPrimitive(this.c);
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            $$0.addProperty("min", this.c);
         }

         if (this.d != null) {
            $$0.addProperty("max", this.d);
         }

         return $$0;
      }
   }

   protected static <T extends Number, R extends cj<T>> R a(@Nullable JsonElement $$0, R $$1, BiFunction<JsonElement, String, T> $$2, cj.a<T, R> $$3) {
      if ($$0 == null || $$0.isJsonNull()) {
         return $$1;
      } else if (aor.b($$0)) {
         T $$4 = (T)$$2.apply($$0, "value");
         return $$3.create($$4, $$4);
      } else {
         JsonObject $$5 = aor.m($$0, "value");
         T $$6 = $$5.has("min") ? $$2.apply($$5.get("min"), "min") : null;
         T $$7 = $$5.has("max") ? $$2.apply($$5.get("max"), "max") : null;
         return $$3.create($$6, $$7);
      }
   }

   protected static <T extends Number, R extends cj<T>> R a(
      StringReader $$0, cj.b<T, R> $$1, Function<String, T> $$2, Supplier<DynamicCommandExceptionType> $$3, Function<T, T> $$4
   ) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         int $$5 = $$0.getCursor();

         try {
            T $$6 = (T)a(a($$0, $$2, $$3), $$4);
            T $$7;
            if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
               $$0.skip();
               $$0.skip();
               $$7 = (T)a(a($$0, $$2, $$3), $$4);
               if ($$6 == null && $$7 == null) {
                  throw a.createWithContext($$0);
               }
            } else {
               $$7 = $$6;
            }

            if ($$6 == null && $$7 == null) {
               throw a.createWithContext($$0);
            } else {
               return $$1.create($$0, $$6, $$7);
            }
         } catch (CommandSyntaxException var8) {
            $$0.setCursor($$5);
            throw new CommandSyntaxException(var8.getType(), var8.getRawMessage(), var8.getInput(), $$5);
         }
      }
   }

   @Nullable
   private static <T extends Number> T a(StringReader $$0, Function<String, T> $$1, Supplier<DynamicCommandExceptionType> $$2) throws CommandSyntaxException {
      int $$3 = $$0.getCursor();

      while ($$0.canRead() && a($$0)) {
         $$0.skip();
      }

      String $$4 = $$0.getString().substring($$3, $$0.getCursor());
      if ($$4.isEmpty()) {
         return null;
      } else {
         try {
            return $$1.apply($$4);
         } catch (NumberFormatException var6) {
            throw $$2.get().createWithContext($$0, $$4);
         }
      }
   }

   private static boolean a(StringReader $$0) {
      char $$1 = $$0.peek();
      if (($$1 < '0' || $$1 > '9') && $$1 != '-') {
         return $$1 != '.' ? false : !$$0.canRead(2) || $$0.peek(1) != '.';
      } else {
         return true;
      }
   }

   @Nullable
   private static <T> T a(@Nullable T $$0, Function<T, T> $$1) {
      return $$0 == null ? null : $$1.apply($$0);
   }

   @FunctionalInterface
   protected interface a<T extends Number, R extends cj<T>> {
      R create(@Nullable T var1, @Nullable T var2);
   }

   @FunctionalInterface
   protected interface b<T extends Number, R extends cj<T>> {
      R create(StringReader var1, @Nullable T var2, @Nullable T var3) throws CommandSyntaxException;
   }

   public static class c extends cj<Double> {
      public static final cj.c e = new cj.c(null, null);
      @Nullable
      private final Double f;
      @Nullable
      private final Double g;

      private static cj.c a(StringReader $$0, @Nullable Double $$1, @Nullable Double $$2) throws CommandSyntaxException {
         if ($$1 != null && $$2 != null && $$1 > $$2) {
            throw b.createWithContext($$0);
         } else {
            return new cj.c($$1, $$2);
         }
      }

      @Nullable
      private static Double a(@Nullable Double $$0) {
         return $$0 == null ? null : $$0 * $$0;
      }

      private c(@Nullable Double $$0, @Nullable Double $$1) {
         super($$0, $$1);
         this.f = a($$0);
         this.g = a($$1);
      }

      public static cj.c a(double $$0) {
         return new cj.c($$0, $$0);
      }

      public static cj.c a(double $$0, double $$1) {
         return new cj.c($$0, $$1);
      }

      public static cj.c b(double $$0) {
         return new cj.c($$0, null);
      }

      public static cj.c c(double $$0) {
         return new cj.c(null, $$0);
      }

      public boolean d(double $$0) {
         return this.c != null && this.c > $$0 ? false : this.d == null || !(this.d < $$0);
      }

      public boolean e(double $$0) {
         return this.f != null && this.f > $$0 ? false : this.g == null || !(this.g < $$0);
      }

      public static cj.c a(@Nullable JsonElement $$0) {
         return a($$0, e, aor::d, cj.c::new);
      }

      public static cj.c a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static cj.c a(StringReader $$0, Function<Double, Double> $$1) throws CommandSyntaxException {
         return a($$0, cj.c::a, Double::parseDouble, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidDouble, $$1);
      }
   }

   public static class d extends cj<Integer> {
      public static final cj.d e = new cj.d(null, null);
      @Nullable
      private final Long f;
      @Nullable
      private final Long g;

      private static cj.d a(StringReader $$0, @Nullable Integer $$1, @Nullable Integer $$2) throws CommandSyntaxException {
         if ($$1 != null && $$2 != null && $$1 > $$2) {
            throw b.createWithContext($$0);
         } else {
            return new cj.d($$1, $$2);
         }
      }

      @Nullable
      private static Long a(@Nullable Integer $$0) {
         return $$0 == null ? null : $$0.longValue() * $$0.longValue();
      }

      private d(@Nullable Integer $$0, @Nullable Integer $$1) {
         super($$0, $$1);
         this.f = a($$0);
         this.g = a($$1);
      }

      public static cj.d a(int $$0) {
         return new cj.d($$0, $$0);
      }

      public static cj.d a(int $$0, int $$1) {
         return new cj.d($$0, $$1);
      }

      public static cj.d b(int $$0) {
         return new cj.d($$0, null);
      }

      public static cj.d c(int $$0) {
         return new cj.d(null, $$0);
      }

      public boolean d(int $$0) {
         return this.c != null && this.c > $$0 ? false : this.d == null || this.d >= $$0;
      }

      public boolean a(long $$0) {
         return this.f != null && this.f > $$0 ? false : this.g == null || this.g >= $$0;
      }

      public static cj.d a(@Nullable JsonElement $$0) {
         return a($$0, e, aor::g, cj.d::new);
      }

      public static cj.d a(StringReader $$0) throws CommandSyntaxException {
         return a($$0, $$0x -> $$0x);
      }

      public static cj.d a(StringReader $$0, Function<Integer, Integer> $$1) throws CommandSyntaxException {
         return a($$0, cj.d::a, Integer::parseInt, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidInt, $$1);
      }
   }
}
