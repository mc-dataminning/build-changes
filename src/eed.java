import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class eed extends edv {
   final aep a;
   final long b;
   final dcm<?> c;

   eed(efh[] $$0, aep $$1, long $$2, dcm<?> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public edx b() {
      return edy.r;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qs $$2 = cgp.a($$0);
         if ($$2 == null) {
            $$2 = new qs();
         }

         $$2.a("LootTable", this.a.toString());
         if (this.b != 0L) {
            $$2.a("LootTableSeed", this.b);
         }

         cgp.a($$0, this.c, $$2);
         return $$0;
      }
   }

   @Override
   public void a(ecs $$0) {
      super.a($$0);
      ecj<ecp> $$1 = new ecj<>(ecm.c, this.a);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.a);
      }
   }

   public static edv.a<?> a(dcm<?> $$0, aep $$1) {
      return a($$2 -> new eed($$2, $$1, 0L, $$0));
   }

   public static edv.a<?> a(dcm<?> $$0, aep $$1, long $$2) {
      return a($$3 -> new eed($$3, $$1, $$2, $$0));
   }

   public static class a extends edv.c<eed> {
      public void a(JsonObject $$0, eed $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.a.toString());
         $$0.addProperty("type", jc.l.b($$1.c).toString());
         if ($$1.b != 0L) {
            $$0.addProperty("seed", $$1.b);
         }
      }

      public eed a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         aep $$3 = new aep(arf.i($$0, "name"));
         long $$4 = arf.a($$0, "seed", 0L);
         aep $$5 = new aep(arf.i($$0, "type"));
         dcm<?> $$6 = jc.l.b($$5).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$5 + "'"));
         return new eed($$2, $$3, $$4, $$6);
      }
   }
}
