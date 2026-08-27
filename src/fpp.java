import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fpp {
   public static final fpp a = new fpp();
   public final fpo b;
   public final fpo c;
   public final fpo d;
   public final fpo e;
   public final fpo f;
   public final fpo g;
   public final fpo h;
   public final fpo i;

   private fpp() {
      this(fpo.a, fpo.a, fpo.a, fpo.a, fpo.a, fpo.a, fpo.a, fpo.a);
   }

   public fpp(fpp $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fpp(fpo $$0, fpo $$1, fpo $$2, fpo $$3, fpo $$4, fpo $$5, fpo $$6, fpo $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fpo a(cje $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fpo.a;
      };
   }

   public boolean b(cje $$0) {
      return this.a($$0) != fpo.a;
   }

   protected static class a implements JsonDeserializer<fpp> {
      public fpp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fpo $$4 = this.a($$2, $$3, cje.c);
         fpo $$5 = this.a($$2, $$3, cje.b);
         if ($$5 == fpo.a) {
            $$5 = $$4;
         }

         fpo $$6 = this.a($$2, $$3, cje.e);
         fpo $$7 = this.a($$2, $$3, cje.d);
         if ($$7 == fpo.a) {
            $$7 = $$6;
         }

         fpo $$8 = this.a($$2, $$3, cje.f);
         fpo $$9 = this.a($$2, $$3, cje.g);
         fpo $$10 = this.a($$2, $$3, cje.h);
         fpo $$11 = this.a($$2, $$3, cje.i);
         return new fpp($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fpo a(JsonDeserializationContext $$0, JsonObject $$1, cje $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fpo)$$0.deserialize($$1.get($$3), fpo.class) : fpo.a;
      }
   }
}
