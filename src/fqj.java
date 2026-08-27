import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fqj {
   public static final fqj a = new fqj();
   public final fqi b;
   public final fqi c;
   public final fqi d;
   public final fqi e;
   public final fqi f;
   public final fqi g;
   public final fqi h;
   public final fqi i;

   private fqj() {
      this(fqi.a, fqi.a, fqi.a, fqi.a, fqi.a, fqi.a, fqi.a, fqi.a);
   }

   public fqj(fqj $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fqj(fqi $$0, fqi $$1, fqi $$2, fqi $$3, fqi $$4, fqi $$5, fqi $$6, fqi $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fqi a(ckg $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fqi.a;
      };
   }

   public boolean b(ckg $$0) {
      return this.a($$0) != fqi.a;
   }

   protected static class a implements JsonDeserializer<fqj> {
      public fqj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fqi $$4 = this.a($$2, $$3, ckg.c);
         fqi $$5 = this.a($$2, $$3, ckg.b);
         if ($$5 == fqi.a) {
            $$5 = $$4;
         }

         fqi $$6 = this.a($$2, $$3, ckg.e);
         fqi $$7 = this.a($$2, $$3, ckg.d);
         if ($$7 == fqi.a) {
            $$7 = $$6;
         }

         fqi $$8 = this.a($$2, $$3, ckg.f);
         fqi $$9 = this.a($$2, $$3, ckg.g);
         fqi $$10 = this.a($$2, $$3, ckg.h);
         fqi $$11 = this.a($$2, $$3, ckg.i);
         return new fqj($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fqi a(JsonDeserializationContext $$0, JsonObject $$1, ckg $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fqi)$$0.deserialize($$1.get($$3), fqi.class) : fqi.a;
      }
   }
}
