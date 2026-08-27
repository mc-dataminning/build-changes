import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fpj {
   public static final fpj a = new fpj();
   public final fpi b;
   public final fpi c;
   public final fpi d;
   public final fpi e;
   public final fpi f;
   public final fpi g;
   public final fpi h;
   public final fpi i;

   private fpj() {
      this(fpi.a, fpi.a, fpi.a, fpi.a, fpi.a, fpi.a, fpi.a, fpi.a);
   }

   public fpj(fpj $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fpj(fpi $$0, fpi $$1, fpi $$2, fpi $$3, fpi $$4, fpi $$5, fpi $$6, fpi $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fpi a(cji $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fpi.a;
      };
   }

   public boolean b(cji $$0) {
      return this.a($$0) != fpi.a;
   }

   protected static class a implements JsonDeserializer<fpj> {
      public fpj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fpi $$4 = this.a($$2, $$3, cji.c);
         fpi $$5 = this.a($$2, $$3, cji.b);
         if ($$5 == fpi.a) {
            $$5 = $$4;
         }

         fpi $$6 = this.a($$2, $$3, cji.e);
         fpi $$7 = this.a($$2, $$3, cji.d);
         if ($$7 == fpi.a) {
            $$7 = $$6;
         }

         fpi $$8 = this.a($$2, $$3, cji.f);
         fpi $$9 = this.a($$2, $$3, cji.g);
         fpi $$10 = this.a($$2, $$3, cji.h);
         fpi $$11 = this.a($$2, $$3, cji.i);
         return new fpj($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fpi a(JsonDeserializationContext $$0, JsonObject $$1, cji $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fpi)$$0.deserialize($$1.get($$3), fpi.class) : fpi.a;
      }
   }
}
