import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cz {
   public static final cz a = new cz(ImmutableList.of());
   private final List<cz.c> b;

   private static cz.c a(String $$0, JsonElement $$1) {
      if ($$1.isJsonPrimitive()) {
         String $$2 = $$1.getAsString();
         return new cz.b($$0, $$2);
      } else {
         JsonObject $$3 = aor.m($$1, "value");
         String $$4 = $$3.has("min") ? b($$3.get("min")) : null;
         String $$5 = $$3.has("max") ? b($$3.get("max")) : null;
         return (cz.c)($$4 != null && $$4.equals($$5) ? new cz.b($$0, $$4) : new cz.d($$0, $$4, $$5));
      }
   }

   @Nullable
   private static String b(JsonElement $$0) {
      return $$0.isJsonNull() ? null : $$0.getAsString();
   }

   cz(List<cz.c> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   public <S extends dcd<?, S>> boolean a(dcc<?, S> $$0, S $$1) {
      for (cz.c $$2 : this.b) {
         if (!$$2.a($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   public boolean a(dcb $$0) {
      return this.a($$0.b().l(), $$0);
   }

   public boolean a(dxe $$0) {
      return this.a($$0.a().f(), $$0);
   }

   public void a(dcc<?, ?> $$0, Consumer<String> $$1) {
      this.b.forEach($$2 -> $$2.a($$0, $$1));
   }

   public static cz a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = aor.m($$0, "properties");
         List<cz.c> $$2 = Lists.newArrayList();

         for (Entry<String, JsonElement> $$3 : $$1.entrySet()) {
            $$2.add(a($$3.getKey(), $$3.getValue()));
         }

         return new cz($$2);
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (!this.b.isEmpty()) {
            this.b.forEach($$1 -> $$0.add($$1.b(), $$1.a()));
         }

         return $$0;
      }
   }

   public static class a {
      private final List<cz.c> a = Lists.newArrayList();

      private a() {
      }

      public static cz.a a() {
         return new cz.a();
      }

      public cz.a a(dde<?> $$0, String $$1) {
         this.a.add(new cz.b($$0.f(), $$1));
         return this;
      }

      public cz.a a(dde<Integer> $$0, int $$1) {
         return this.a($$0, Integer.toString($$1));
      }

      public cz.a a(dde<Boolean> $$0, boolean $$1) {
         return this.a($$0, Boolean.toString($$1));
      }

      public <T extends Comparable<T> & apr> cz.a a(dde<T> $$0, T $$1) {
         return this.a($$0, $$1.c());
      }

      public cz b() {
         return new cz(this.a);
      }
   }

   static class b extends cz.c {
      private final String a;

      public b(String $$0, String $$1) {
         super($$0);
         this.a = $$1;
      }

      @Override
      protected <T extends Comparable<T>> boolean a(dcd<?, ?> $$0, dde<T> $$1) {
         T $$2 = $$0.c($$1);
         Optional<T> $$3 = $$1.b(this.a);
         return $$3.isPresent() && $$2.compareTo($$3.get()) == 0;
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive(this.a);
      }
   }

   abstract static class c {
      private final String a;

      public c(String $$0) {
         this.a = $$0;
      }

      public <S extends dcd<?, S>> boolean a(dcc<?, S> $$0, S $$1) {
         dde<?> $$2 = $$0.a(this.a);
         return $$2 == null ? false : this.a($$1, $$2);
      }

      protected abstract <T extends Comparable<T>> boolean a(dcd<?, ?> var1, dde<T> var2);

      public abstract JsonElement a();

      public String b() {
         return this.a;
      }

      public void a(dcc<?, ?> $$0, Consumer<String> $$1) {
         dde<?> $$2 = $$0.a(this.a);
         if ($$2 == null) {
            $$1.accept(this.a);
         }
      }
   }

   static class d extends cz.c {
      @Nullable
      private final String a;
      @Nullable
      private final String b;

      public d(String $$0, @Nullable String $$1, @Nullable String $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      @Override
      protected <T extends Comparable<T>> boolean a(dcd<?, ?> $$0, dde<T> $$1) {
         T $$2 = $$0.c($$1);
         if (this.a != null) {
            Optional<T> $$3 = $$1.b(this.a);
            if (!$$3.isPresent() || $$2.compareTo($$3.get()) < 0) {
               return false;
            }
         }

         if (this.b != null) {
            Optional<T> $$4 = $$1.b(this.b);
            if (!$$4.isPresent() || $$2.compareTo($$4.get()) > 0) {
               return false;
            }
         }

         return true;
      }

      @Override
      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         if (this.a != null) {
            $$0.addProperty("min", this.a);
         }

         if (this.b != null) {
            $$0.addProperty("max", this.b);
         }

         return $$0;
      }
   }
}
