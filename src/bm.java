import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class bm extends cw<bm.a> {
   public bm.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      cvf $$3 = a($$0);
      Optional<da> $$4 = da.a($$0.get("state"));
      if ($$3 != null) {
         $$4.ifPresent($$1x -> $$1x.a($$3.n(), $$1xx -> {
               throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1xx);
            }));
      }

      return new bm.a($$1, $$3, $$4);
   }

   @Nullable
   private static cvf a(JsonObject $$0) {
      if ($$0.has("block")) {
         agm $$1 = new agm(atg.i($$0, "block"));
         return kc.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(amj $$0, dhn $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      @Nullable
      private final cvf a;
      private final Optional<da> b;

      public a(Optional<bc> $$0, @Nullable cvf $$1, Optional<da> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<bm.a> a(cvf $$0) {
         return al.d.a(new bm.a(Optional.empty(), $$0, Optional.empty()));
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (this.a != null) {
            $$0.addProperty("block", kc.f.b(this.a).toString());
         }

         this.b.ifPresent($$1 -> $$0.add("state", $$1.a()));
         return $$0;
      }

      public boolean a(dhn $$0) {
         return this.a != null && !$$0.a(this.a) ? false : !this.b.isPresent() || this.b.get().a($$0);
      }
   }
}
