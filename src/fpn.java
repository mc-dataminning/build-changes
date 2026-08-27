import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fpn {
   public static final fpn a = new fpn();
   public final fpm b;
   public final fpm c;
   public final fpm d;
   public final fpm e;
   public final fpm f;
   public final fpm g;
   public final fpm h;
   public final fpm i;

   private fpn() {
      this(fpm.a, fpm.a, fpm.a, fpm.a, fpm.a, fpm.a, fpm.a, fpm.a);
   }

   public fpn(fpn $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fpn(fpm $$0, fpm $$1, fpm $$2, fpm $$3, fpm $$4, fpm $$5, fpm $$6, fpm $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fpm a(cjc $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fpm.a;
      };
   }

   public boolean b(cjc $$0) {
      return this.a($$0) != fpm.a;
   }

   protected static class a implements JsonDeserializer<fpn> {
      public fpn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fpm $$4 = this.a($$2, $$3, cjc.c);
         fpm $$5 = this.a($$2, $$3, cjc.b);
         if ($$5 == fpm.a) {
            $$5 = $$4;
         }

         fpm $$6 = this.a($$2, $$3, cjc.e);
         fpm $$7 = this.a($$2, $$3, cjc.d);
         if ($$7 == fpm.a) {
            $$7 = $$6;
         }

         fpm $$8 = this.a($$2, $$3, cjc.f);
         fpm $$9 = this.a($$2, $$3, cjc.g);
         fpm $$10 = this.a($$2, $$3, cjc.h);
         fpm $$11 = this.a($$2, $$3, cjc.i);
         return new fpn($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fpm a(JsonDeserializationContext $$0, JsonObject $$1, cjc $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fpm)$$0.deserialize($$1.get($$3), fpm.class) : fpm.a;
      }
   }
}
