import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fld {
   public static final fld a = new fld();
   public final flc b;
   public final flc c;
   public final flc d;
   public final flc e;
   public final flc f;
   public final flc g;
   public final flc h;
   public final flc i;

   private fld() {
      this(flc.a, flc.a, flc.a, flc.a, flc.a, flc.a, flc.a, flc.a);
   }

   public fld(fld $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fld(flc $$0, flc $$1, flc $$2, flc $$3, flc $$4, flc $$5, flc $$6, flc $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public flc a(cfw $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> flc.a;
      };
   }

   public boolean b(cfw $$0) {
      return this.a($$0) != flc.a;
   }

   protected static class a implements JsonDeserializer<fld> {
      public fld a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         flc $$4 = this.a($$2, $$3, cfw.c);
         flc $$5 = this.a($$2, $$3, cfw.b);
         if ($$5 == flc.a) {
            $$5 = $$4;
         }

         flc $$6 = this.a($$2, $$3, cfw.e);
         flc $$7 = this.a($$2, $$3, cfw.d);
         if ($$7 == flc.a) {
            $$7 = $$6;
         }

         flc $$8 = this.a($$2, $$3, cfw.f);
         flc $$9 = this.a($$2, $$3, cfw.g);
         flc $$10 = this.a($$2, $$3, cfw.h);
         flc $$11 = this.a($$2, $$3, cfw.i);
         return new fld($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private flc a(JsonDeserializationContext $$0, JsonObject $$1, cfw $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (flc)$$0.deserialize($$1.get($$3), flc.class) : flc.a;
      }
   }
}
