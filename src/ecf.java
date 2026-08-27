import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.lang.reflect.Type;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ecf {
   public static <E, T extends ecr<E>> ecf.a<E, T> a(hs<T> $$0, String $$1, String $$2, Function<E, T> $$3) {
      return new ecf.a<>($$0, $$1, $$2, $$3);
   }

   public static class a<E, T extends ecr<E>> {
      private final hs<T> a;
      private final String b;
      private final String c;
      private final Function<E, T> d;
      @Nullable
      private Pair<T, ecf.b<? extends E>> e;
      @Nullable
      private T f;

      a(hs<T> $$0, String $$1, String $$2, Function<E, T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ecf.a<E, T> a(T $$0, ecf.b<? extends E> $$1) {
         this.e = Pair.of($$0, $$1);
         return this;
      }

      public ecf.a<E, T> a(T $$0) {
         this.f = $$0;
         return this;
      }

      public Object a() {
         return new ecf.c<>(this.a, this.b, this.c, this.d, this.f, this.e);
      }
   }

   public interface b<T> {
      JsonElement a(T var1, JsonSerializationContext var2);

      T a(JsonElement var1, JsonDeserializationContext var2);
   }

   static class c<E, T extends ecr<E>> implements JsonDeserializer<E>, JsonSerializer<E> {
      private final hs<T> a;
      private final String b;
      private final String c;
      private final Function<E, T> d;
      @Nullable
      private final T e;
      @Nullable
      private final Pair<T, ecf.b<? extends E>> f;

      c(hs<T> $$0, String $$1, String $$2, Function<E, T> $$3, @Nullable T $$4, @Nullable Pair<T, ecf.b<? extends E>> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      public E deserialize(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonObject()) {
            JsonObject $$3 = arf.m($$0, this.b);
            String $$4 = arf.a($$3, this.c, "");
            T $$5;
            if ($$4.isEmpty()) {
               $$5 = this.e;
            } else {
               aep $$6 = new aep($$4);
               $$5 = this.a.a($$6);
            }

            if ($$5 == null) {
               throw new JsonSyntaxException("Unknown type '" + $$4 + "'");
            } else {
               return (E)$$5.a().a($$3, $$2);
            }
         } else if (this.f == null) {
            throw new UnsupportedOperationException("Object " + $$0 + " can't be deserialized");
         } else {
            return (E)((ecf.b)this.f.getSecond()).a($$0, $$2);
         }
      }

      public JsonElement serialize(E $$0, Type $$1, JsonSerializationContext $$2) {
         T $$3 = this.d.apply($$0);
         if (this.f != null && this.f.getFirst() == $$3) {
            return ((ecf.b)this.f.getSecond()).a($$0, $$2);
         } else if ($$3 == null) {
            throw new JsonSyntaxException("Unknown type: " + $$0);
         } else {
            JsonObject $$4 = new JsonObject();
            $$4.addProperty(this.c, this.a.b($$3).toString());
            $$3.a().a($$4, $$0, $$2);
            return $$4;
         }
      }
   }
}
