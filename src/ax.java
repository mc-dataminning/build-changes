import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class ax extends cw<ax.a> {
   public ax.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      ckx $$3 = null;
      if ($$0.has("potion")) {
         aeu $$4 = new aeu(arj.i($$0, "potion"));
         $$3 = jd.j.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$4 + "'"));
      }

      return new ax.a($$1, $$3);
   }

   public void a(ako $$0, ckx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      @Nullable
      private final ckx a;

      public a(Optional<bc> $$0, @Nullable ckx $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<ax.a> c() {
         return al.k.a(new ax.a(Optional.empty(), null));
      }

      public boolean a(ckx $$0) {
         return this.a == null || this.a == $$0;
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (this.a != null) {
            $$0.addProperty("potion", jd.j.b(this.a).toString());
         }

         return $$0;
      }
   }
}
