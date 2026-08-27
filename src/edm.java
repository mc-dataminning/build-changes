import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class edm extends edv {
   final edm.a a;

   edm(efh[] $$0, edm.a $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.n;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(this.a.f);
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$1.c(this.a.f) instanceof bgs $$3 && $$3.ac()) {
         $$0.a($$3.H_());
      }

      return $$0;
   }

   public static edv.a<?> a(edm.a $$0) {
      return a($$1 -> new edm($$1, $$0));
   }

   public static enum a {
      a("this", eet.a),
      b("killer", eet.d),
      c("killer_player", eet.b),
      d("block_entity", eet.h);

      public final String e;
      public final eeq<?> f;

      private a(String $$0, eeq<?> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static edm.a a(String $$0) {
         for (edm.a $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid name source " + $$0);
      }
   }

   public static class b extends edv.c<edm> {
      public void a(JsonObject $$0, edm $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("source", $$1.a.e);
      }

      public edm a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         edm.a $$3 = edm.a.a(arf.i($$0, "source"));
         return new edm($$2, $$3);
      }
   }
}
