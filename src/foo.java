import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class foo {
   public static final foo a = new foo();
   public final fon b;
   public final fon c;
   public final fon d;
   public final fon e;
   public final fon f;
   public final fon g;
   public final fon h;
   public final fon i;

   private foo() {
      this(fon.a, fon.a, fon.a, fon.a, fon.a, fon.a, fon.a, fon.a);
   }

   public foo(foo $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public foo(fon $$0, fon $$1, fon $$2, fon $$3, fon $$4, fon $$5, fon $$6, fon $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fon a(cit $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fon.a;
      };
   }

   public boolean b(cit $$0) {
      return this.a($$0) != fon.a;
   }

   protected static class a implements JsonDeserializer<foo> {
      public foo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fon $$4 = this.a($$2, $$3, cit.c);
         fon $$5 = this.a($$2, $$3, cit.b);
         if ($$5 == fon.a) {
            $$5 = $$4;
         }

         fon $$6 = this.a($$2, $$3, cit.e);
         fon $$7 = this.a($$2, $$3, cit.d);
         if ($$7 == fon.a) {
            $$7 = $$6;
         }

         fon $$8 = this.a($$2, $$3, cit.f);
         fon $$9 = this.a($$2, $$3, cit.g);
         fon $$10 = this.a($$2, $$3, cit.h);
         fon $$11 = this.a($$2, $$3, cit.i);
         return new foo($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fon a(JsonDeserializationContext $$0, JsonObject $$1, cit $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fon)$$0.deserialize($$1.get($$3), fon.class) : fon.a;
      }
   }
}
