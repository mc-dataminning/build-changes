import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class ecg implements eck {
   static final ecg a = new ecg();

   private ecg() {
   }

   @Override
   public ecl b() {
      return ecm.l;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(ebw.j);
   }

   public boolean a(dzk $$0) {
      Float $$1 = $$0.c(ebw.j);
      if ($$1 != null) {
         apf $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eck.a c() {
      return () -> a;
   }

   public static class a implements dzt<ecg> {
      public void a(JsonObject $$0, ecg $$1, JsonSerializationContext $$2) {
      }

      public ecg b(JsonObject $$0, JsonDeserializationContext $$1) {
         return ecg.a;
      }
   }
}
