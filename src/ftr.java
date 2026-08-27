import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ftr {
   public static final ftr a = new ftr();
   public final ftq b;
   public final ftq c;
   public final ftq d;
   public final ftq e;
   public final ftq f;
   public final ftq g;
   public final ftq h;
   public final ftq i;

   private ftr() {
      this(ftq.a, ftq.a, ftq.a, ftq.a, ftq.a, ftq.a, ftq.a, ftq.a);
   }

   public ftr(ftr $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public ftr(ftq $$0, ftq $$1, ftq $$2, ftq $$3, ftq $$4, ftq $$5, ftq $$6, ftq $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ftq a(cme $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> ftq.a;
      };
   }

   public boolean b(cme $$0) {
      return this.a($$0) != ftq.a;
   }

   protected static class a implements JsonDeserializer<ftr> {
      public ftr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ftq $$4 = this.a($$2, $$3, cme.c);
         ftq $$5 = this.a($$2, $$3, cme.b);
         if ($$5 == ftq.a) {
            $$5 = $$4;
         }

         ftq $$6 = this.a($$2, $$3, cme.e);
         ftq $$7 = this.a($$2, $$3, cme.d);
         if ($$7 == ftq.a) {
            $$7 = $$6;
         }

         ftq $$8 = this.a($$2, $$3, cme.f);
         ftq $$9 = this.a($$2, $$3, cme.g);
         ftq $$10 = this.a($$2, $$3, cme.h);
         ftq $$11 = this.a($$2, $$3, cme.i);
         return new ftr($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private ftq a(JsonDeserializationContext $$0, JsonObject $$1, cme $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (ftq)$$0.deserialize($$1.get($$3), ftq.class) : ftq.a;
      }
   }
}
