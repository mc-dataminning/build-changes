import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class ebg extends eay {
   final acq a;
   final long b;
   final czp<?> c;

   ebg(eck[] $$0, acq $$1, long $$2, czp<?> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public eba b() {
      return ebb.r;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         qr $$2 = cds.a($$0);
         if ($$2 == null) {
            $$2 = new qr();
         }

         $$2.a("LootTable", this.a.toString());
         if (this.b != 0L) {
            $$2.a("LootTableSeed", this.b);
         }

         cds.a($$0, this.c, $$2);
         return $$0;
      }
   }

   @Override
   public void a(dzv $$0) {
      super.a($$0);
      dzm<dzs> $$1 = new dzm<>(dzp.c, this.a);
      if ($$0.b().getElementOptional($$1).isEmpty()) {
         $$0.a("Missing loot table used for container: " + this.a);
      }
   }

   public static eay.a<?> a(czp<?> $$0, acq $$1) {
      return a($$2 -> new ebg($$2, $$1, 0L, $$0));
   }

   public static eay.a<?> a(czp<?> $$0, acq $$1, long $$2) {
      return a($$3 -> new ebg($$3, $$1, $$2, $$0));
   }

   public static class a extends eay.c<ebg> {
      public void a(JsonObject $$0, ebg $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.a.toString());
         $$0.addProperty("type", jb.l.b($$1.c).toString());
         if ($$1.b != 0L) {
            $$0.addProperty("seed", $$1.b);
         }
      }

      public ebg a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         acq $$3 = new acq(aor.i($$0, "name"));
         long $$4 = aor.a($$0, "seed", 0L);
         acq $$5 = new acq(aor.i($$0, "type"));
         czp<?> $$6 = jb.l.b($$5).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$5 + "'"));
         return new ebg($$2, $$3, $$4, $$6);
      }
   }
}
