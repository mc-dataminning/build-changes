import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class eap extends eay {
   final eap.a a;

   eap(eck[] $$0, eap.a $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public eba b() {
      return ebb.n;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(this.a.f);
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$1.c(this.a.f) instanceof beb $$3 && $$3.aa()) {
         $$0.a($$3.H_());
      }

      return $$0;
   }

   public static eay.a<?> a(eap.a $$0) {
      return a($$1 -> new eap($$1, $$0));
   }

   public static enum a {
      a("this", ebw.a),
      b("killer", ebw.d),
      c("killer_player", ebw.b),
      d("block_entity", ebw.h);

      public final String e;
      public final ebt<?> f;

      private a(String $$0, ebt<?> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static eap.a a(String $$0) {
         for (eap.a $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid name source " + $$0);
      }
   }

   public static class b extends eay.c<eap> {
      public void a(JsonObject $$0, eap $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("source", $$1.a.e);
      }

      public eap a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         eap.a $$3 = eap.a.a(aor.i($$0, "source"));
         return new eap($$2, $$3);
      }
   }
}
