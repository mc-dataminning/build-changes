import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import javax.annotation.Nullable;

public class ecs implements eck {
   @Nullable
   final Long a;
   final dzj b;

   ecs(@Nullable Long $$0, dzj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public ecl b() {
      return ecm.q;
   }

   @Override
   public Set<ebt<?>> a() {
      return this.b.a();
   }

   public boolean a(dzk $$0) {
      aif $$1 = $$0.d();
      long $$2 = $$1.W();
      if (this.a != null) {
         $$2 %= this.a;
      }

      return this.b.b($$0, (int)$$2);
   }

   public static ecs.a a(dzj $$0) {
      return new ecs.a($$0);
   }

   public static class a implements eck.a {
      @Nullable
      private Long a;
      private final dzj b;

      public a(dzj $$0) {
         this.b = $$0;
      }

      public ecs.a a(long $$0) {
         this.a = $$0;
         return this;
      }

      public ecs a() {
         return new ecs(this.a, this.b);
      }
   }

   public static class b implements dzt<ecs> {
      public void a(JsonObject $$0, ecs $$1, JsonSerializationContext $$2) {
         $$0.addProperty("period", $$1.a);
         $$0.add("value", $$2.serialize($$1.b));
      }

      public ecs b(JsonObject $$0, JsonDeserializationContext $$1) {
         Long $$2 = $$0.has("period") ? aor.n($$0, "period") : null;
         dzj $$3 = aor.a($$0, "value", $$1, dzj.class);
         return new ecs($$2, $$3);
      }
   }
}
