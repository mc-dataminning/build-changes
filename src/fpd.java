import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fpd {
   public static final fpd a = new fpd();
   public final fpc b;
   public final fpc c;
   public final fpc d;
   public final fpc e;
   public final fpc f;
   public final fpc g;
   public final fpc h;
   public final fpc i;

   private fpd() {
      this(fpc.a, fpc.a, fpc.a, fpc.a, fpc.a, fpc.a, fpc.a, fpc.a);
   }

   public fpd(fpd $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fpd(fpc $$0, fpc $$1, fpc $$2, fpc $$3, fpc $$4, fpc $$5, fpc $$6, fpc $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fpc a(ciu $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fpc.a;
      };
   }

   public boolean b(ciu $$0) {
      return this.a($$0) != fpc.a;
   }

   protected static class a implements JsonDeserializer<fpd> {
      public fpd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fpc $$4 = this.a($$2, $$3, ciu.c);
         fpc $$5 = this.a($$2, $$3, ciu.b);
         if ($$5 == fpc.a) {
            $$5 = $$4;
         }

         fpc $$6 = this.a($$2, $$3, ciu.e);
         fpc $$7 = this.a($$2, $$3, ciu.d);
         if ($$7 == fpc.a) {
            $$7 = $$6;
         }

         fpc $$8 = this.a($$2, $$3, ciu.f);
         fpc $$9 = this.a($$2, $$3, ciu.g);
         fpc $$10 = this.a($$2, $$3, ciu.h);
         fpc $$11 = this.a($$2, $$3, ciu.i);
         return new fpd($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fpc a(JsonDeserializationContext $$0, JsonObject $$1, ciu $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fpc)$$0.deserialize($$1.get($$3), fpc.class) : fpc.a;
      }
   }
}
