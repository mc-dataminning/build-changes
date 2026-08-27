import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class edr extends edv {
   final ech.b a;

   public edr(efh[] $$0, ech.b $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.u;
   }

   @Override
   public Set<eeq<?>> a() {
      return ImmutableSet.of(this.a.a());
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.a(ciz.tt) && $$1.c(this.a.a()) instanceof cbl $$2) {
         GameProfile $$3 = $$2.fP();
         $$0.w().a("SkullOwner", re.a(new qs(), $$3));
      }

      return $$0;
   }

   public static edv.a<?> a(ech.b $$0) {
      return a($$1 -> new edr($$1, $$0));
   }

   public static class a extends edv.c<edr> {
      public void a(JsonObject $$0, edr $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("entity", $$2.serialize($$1.a));
      }

      public edr a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         ech.b $$3 = arf.a($$0, "entity", $$1, ech.b.class);
         return new edr($$2, $$3);
      }
   }
}
