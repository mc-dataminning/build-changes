import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import javax.annotation.Nullable;

public class efr implements efh {
   @Nullable
   final Boolean a;
   @Nullable
   final Boolean b;

   efr(@Nullable Boolean $$0, @Nullable Boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public efi b() {
      return efj.o;
   }

   public boolean a(ech $$0) {
      aki $$1 = $$0.d();
      return this.a != null && this.a != $$1.Z() ? false : this.b == null || this.b == $$1.Y();
   }

   public static efr.a c() {
      return new efr.a();
   }

   public static class a implements efh.a {
      @Nullable
      private Boolean a;
      @Nullable
      private Boolean b;

      public efr.a a(@Nullable Boolean $$0) {
         this.a = $$0;
         return this;
      }

      public efr.a b(@Nullable Boolean $$0) {
         this.b = $$0;
         return this;
      }

      public efr a() {
         return new efr(this.a, this.b);
      }
   }

   public static class b implements ecq<efr> {
      public void a(JsonObject $$0, efr $$1, JsonSerializationContext $$2) {
         $$0.addProperty("raining", $$1.a);
         $$0.addProperty("thundering", $$1.b);
      }

      public efr b(JsonObject $$0, JsonDeserializationContext $$1) {
         Boolean $$2 = $$0.has("raining") ? arf.k($$0, "raining") : null;
         Boolean $$3 = $$0.has("thundering") ? arf.k($$0, "thundering") : null;
         return new efr($$2, $$3);
      }
   }
}
