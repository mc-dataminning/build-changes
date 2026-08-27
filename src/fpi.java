import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fpi {
   public static final fpi a = new fpi();
   public final fph b;
   public final fph c;
   public final fph d;
   public final fph e;
   public final fph f;
   public final fph g;
   public final fph h;
   public final fph i;

   private fpi() {
      this(fph.a, fph.a, fph.a, fph.a, fph.a, fph.a, fph.a, fph.a);
   }

   public fpi(fpi $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fpi(fph $$0, fph $$1, fph $$2, fph $$3, fph $$4, fph $$5, fph $$6, fph $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fph a(cix $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fph.a;
      };
   }

   public boolean b(cix $$0) {
      return this.a($$0) != fph.a;
   }

   protected static class a implements JsonDeserializer<fpi> {
      public fpi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fph $$4 = this.a($$2, $$3, cix.c);
         fph $$5 = this.a($$2, $$3, cix.b);
         if ($$5 == fph.a) {
            $$5 = $$4;
         }

         fph $$6 = this.a($$2, $$3, cix.e);
         fph $$7 = this.a($$2, $$3, cix.d);
         if ($$7 == fph.a) {
            $$7 = $$6;
         }

         fph $$8 = this.a($$2, $$3, cix.f);
         fph $$9 = this.a($$2, $$3, cix.g);
         fph $$10 = this.a($$2, $$3, cix.h);
         fph $$11 = this.a($$2, $$3, cix.i);
         return new fpi($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fph a(JsonDeserializationContext $$0, JsonObject $$1, cix $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fph)$$0.deserialize($$1.get($$3), fph.class) : fph.a;
      }
   }
}
