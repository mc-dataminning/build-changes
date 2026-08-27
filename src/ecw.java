import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class ecw implements ecy {
   private static final String b = "block_entity";
   private static final ecw.a c = new ecw.a() {
      @Override
      public rk a(dzk $$0) {
         czn $$1 = $$0.c(ebw.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<ebt<?>> b() {
         return ImmutableSet.of(ebw.h);
      }
   };
   public static final ecw a = new ecw(c);
   final ecw.a d;

   private static ecw.a b(final dzk.b $$0) {
      return new ecw.a() {
         @Nullable
         @Override
         public rk a(dzk $$0x) {
            bfj $$1 = $$0.c($$0.a());
            return $$1 != null ? cl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<ebt<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private ecw(ecw.a $$0) {
      this.d = $$0;
   }

   @Override
   public ecx a() {
      return ecz.b;
   }

   @Nullable
   @Override
   public rk a(dzk $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<ebt<?>> b() {
      return this.d.b();
   }

   public static ecy a(dzk.b $$0) {
      return new ecw(b($$0));
   }

   static ecw a(String $$0) {
      if ($$0.equals("block_entity")) {
         return new ecw(c);
      } else {
         dzk.b $$1 = dzk.b.a($$0);
         return new ecw(b($$1));
      }
   }

   interface a {
      @Nullable
      rk a(dzk var1);

      String a();

      Set<ebt<?>> b();
   }

   public static class b implements dzi.b<ecw> {
      public JsonElement a(ecw $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.d.a());
      }

      public ecw b(JsonElement $$0, JsonDeserializationContext $$1) {
         String $$2 = $$0.getAsString();
         return ecw.a($$2);
      }
   }

   public static class c implements dzt<ecw> {
      public void a(JsonObject $$0, ecw $$1, JsonSerializationContext $$2) {
         $$0.addProperty("target", $$1.d.a());
      }

      public ecw b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = aor.i($$0, "target");
         return ecw.a($$2);
      }
   }
}
