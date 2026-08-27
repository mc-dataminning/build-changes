import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fou {
   public static final fou a = new fou();
   public final fot b;
   public final fot c;
   public final fot d;
   public final fot e;
   public final fot f;
   public final fot g;
   public final fot h;
   public final fot i;

   private fou() {
      this(fot.a, fot.a, fot.a, fot.a, fot.a, fot.a, fot.a, fot.a);
   }

   public fou(fou $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fou(fot $$0, fot $$1, fot $$2, fot $$3, fot $$4, fot $$5, fot $$6, fot $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fot a(civ $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fot.a;
      };
   }

   public boolean b(civ $$0) {
      return this.a($$0) != fot.a;
   }

   protected static class a implements JsonDeserializer<fou> {
      public fou a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fot $$4 = this.a($$2, $$3, civ.c);
         fot $$5 = this.a($$2, $$3, civ.b);
         if ($$5 == fot.a) {
            $$5 = $$4;
         }

         fot $$6 = this.a($$2, $$3, civ.e);
         fot $$7 = this.a($$2, $$3, civ.d);
         if ($$7 == fot.a) {
            $$7 = $$6;
         }

         fot $$8 = this.a($$2, $$3, civ.f);
         fot $$9 = this.a($$2, $$3, civ.g);
         fot $$10 = this.a($$2, $$3, civ.h);
         fot $$11 = this.a($$2, $$3, civ.i);
         return new fou($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fot a(JsonDeserializationContext $$0, JsonObject $$1, civ $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fot)$$0.deserialize($$1.get($$3), fot.class) : fot.a;
      }
   }
}
