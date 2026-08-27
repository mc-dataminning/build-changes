import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class frq {
   public static final frq a = new frq();
   public final frp b;
   public final frp c;
   public final frp d;
   public final frp e;
   public final frp f;
   public final frp g;
   public final frp h;
   public final frp i;

   private frq() {
      this(frp.a, frp.a, frp.a, frp.a, frp.a, frp.a, frp.a, frp.a);
   }

   public frq(frq $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public frq(frp $$0, frp $$1, frp $$2, frp $$3, frp $$4, frp $$5, frp $$6, frp $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public frp a(cky $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> frp.a;
      };
   }

   public boolean b(cky $$0) {
      return this.a($$0) != frp.a;
   }

   protected static class a implements JsonDeserializer<frq> {
      public frq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         frp $$4 = this.a($$2, $$3, cky.c);
         frp $$5 = this.a($$2, $$3, cky.b);
         if ($$5 == frp.a) {
            $$5 = $$4;
         }

         frp $$6 = this.a($$2, $$3, cky.e);
         frp $$7 = this.a($$2, $$3, cky.d);
         if ($$7 == frp.a) {
            $$7 = $$6;
         }

         frp $$8 = this.a($$2, $$3, cky.f);
         frp $$9 = this.a($$2, $$3, cky.g);
         frp $$10 = this.a($$2, $$3, cky.h);
         frp $$11 = this.a($$2, $$3, cky.i);
         return new frq($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private frp a(JsonDeserializationContext $$0, JsonObject $$1, cky $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (frp)$$0.deserialize($$1.get($$3), frp.class) : frp.a;
      }
   }
}
