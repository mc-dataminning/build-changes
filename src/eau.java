import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class eau extends eay {
   final dzk.b a;

   public eau(eck[] $$0, dzk.b $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public eba b() {
      return ebb.u;
   }

   @Override
   public Set<ebt<?>> a() {
      return ImmutableSet.of(this.a.a());
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$0.a(cgc.tt)) {
         bfj $$2 = $$1.c(this.a.a());
         if ($$2 instanceof byo) {
            GameProfile $$3 = ((byo)$$2).fM();
            $$0.w().a("SkullOwner", rd.a(new qr(), $$3));
         }
      }

      return $$0;
   }

   public static eay.a<?> a(dzk.b $$0) {
      return a($$1 -> new eau($$1, $$0));
   }

   public static class a extends eay.c<eau> {
      public void a(JsonObject $$0, eau $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("entity", $$2.serialize($$1.a));
      }

      public eau a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         dzk.b $$3 = aor.a($$0, "entity", $$1, dzk.b.class);
         return new eau($$2, $$3);
      }
   }
}
