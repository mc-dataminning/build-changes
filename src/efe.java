import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efe implements efh {
   final efh a;

   efe(efh $$0) {
      this.a = $$0;
   }

   @Override
   public efi b() {
      return efj.a;
   }

   public final boolean a(ech $$0) {
      return !this.a.test($$0);
   }

   @Override
   public Set<eeq<?>> a() {
      return this.a.a();
   }

   @Override
   public void a(ecs $$0) {
      efh.super.a($$0);
      this.a.a($$0);
   }

   public static efh.a a(efh.a $$0) {
      efe $$1 = new efe($$0.build());
      return () -> $$1;
   }

   public static class a implements ecq<efe> {
      public void a(JsonObject $$0, efe $$1, JsonSerializationContext $$2) {
         $$0.add("term", $$2.serialize($$1.a));
      }

      public efe b(JsonObject $$0, JsonDeserializationContext $$1) {
         efh $$2 = arf.a($$0, "term", $$1, efh.class);
         return new efe($$2);
      }
   }
}
