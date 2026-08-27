import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class eft implements efv {
   private static final String b = "block_entity";
   private static final eft.a c = new eft.a() {
      @Override
      public rl a(ech $$0) {
         dck $$1 = $$0.c(eet.h);
         return $$1 != null ? $$1.m() : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<eeq<?>> b() {
         return ImmutableSet.of(eet.h);
      }
   };
   public static final eft a = new eft(c);
   final eft.a d;

   private static eft.a b(final ech.b $$0) {
      return new eft.a() {
         @Nullable
         @Override
         public rl a(ech $$0x) {
            big $$1 = $$0.c($$0.a());
            return $$1 != null ? cl.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<eeq<?>> b() {
            return ImmutableSet.of($$0.a());
         }
      };
   }

   private eft(eft.a $$0) {
      this.d = $$0;
   }

   @Override
   public efu a() {
      return efw.b;
   }

   @Nullable
   @Override
   public rl a(ech $$0) {
      return this.d.a($$0);
   }

   @Override
   public Set<eeq<?>> b() {
      return this.d.b();
   }

   public static efv a(ech.b $$0) {
      return new eft(b($$0));
   }

   static eft a(String $$0) {
      if ($$0.equals("block_entity")) {
         return new eft(c);
      } else {
         ech.b $$1 = ech.b.a($$0);
         return new eft(b($$1));
      }
   }

   interface a {
      @Nullable
      rl a(ech var1);

      String a();

      Set<eeq<?>> b();
   }

   public static class b implements ecf.b<eft> {
      public JsonElement a(eft $$0, JsonSerializationContext $$1) {
         return new JsonPrimitive($$0.d.a());
      }

      public eft b(JsonElement $$0, JsonDeserializationContext $$1) {
         String $$2 = $$0.getAsString();
         return eft.a($$2);
      }
   }

   public static class c implements ecq<eft> {
      public void a(JsonObject $$0, eft $$1, JsonSerializationContext $$2) {
         $$0.addProperty("target", $$1.d.a());
      }

      public eft b(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = arf.i($$0, "target");
         return eft.a($$2);
      }
   }
}
