import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class efd implements efh {
   static final efd a = new efd();

   private efd() {
   }

   @Override
   public efi b() {
      return efj.l;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(eet.j);
   }

   public boolean a(ech $$0) {
      Float $$1 = $$0.c(eet.j);
      if ($$1 != null) {
         art $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efh.a c() {
      return () -> a;
   }

   public static class a implements ecq<efd> {
      public void a(JsonObject $$0, efd $$1, JsonSerializationContext $$2) {
      }

      public efd b(JsonObject $$0, JsonDeserializationContext $$1) {
         return efd.a;
      }
   }
}
