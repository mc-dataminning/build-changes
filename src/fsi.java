import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fsi {
   public static final fsi a = new fsi();
   public final fsh b;
   public final fsh c;
   public final fsh d;
   public final fsh e;
   public final fsh f;
   public final fsh g;
   public final fsh h;
   public final fsh i;

   private fsi() {
      this(fsh.a, fsh.a, fsh.a, fsh.a, fsh.a, fsh.a, fsh.a, fsh.a);
   }

   public fsi(fsi $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fsi(fsh $$0, fsh $$1, fsh $$2, fsh $$3, fsh $$4, fsh $$5, fsh $$6, fsh $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fsh a(cll $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fsh.a;
      };
   }

   public boolean b(cll $$0) {
      return this.a($$0) != fsh.a;
   }

   protected static class a implements JsonDeserializer<fsi> {
      public fsi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fsh $$4 = this.a($$2, $$3, cll.c);
         fsh $$5 = this.a($$2, $$3, cll.b);
         if ($$5 == fsh.a) {
            $$5 = $$4;
         }

         fsh $$6 = this.a($$2, $$3, cll.e);
         fsh $$7 = this.a($$2, $$3, cll.d);
         if ($$7 == fsh.a) {
            $$7 = $$6;
         }

         fsh $$8 = this.a($$2, $$3, cll.f);
         fsh $$9 = this.a($$2, $$3, cll.g);
         fsh $$10 = this.a($$2, $$3, cll.h);
         fsh $$11 = this.a($$2, $$3, cll.i);
         return new fsi($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fsh a(JsonDeserializationContext $$0, JsonObject $$1, cll $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fsh)$$0.deserialize($$1.get($$3), fsh.class) : fsh.a;
      }
   }
}
