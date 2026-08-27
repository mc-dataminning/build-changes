import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class cx extends cw<cx.a> {
   public cx.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      csx $$3 = a($$0);
      Optional<da> $$4 = da.a($$0.get("state"));
      if ($$3 != null) {
         $$4.ifPresent($$1x -> $$1x.a($$3.l(), $$1xx -> {
               throw new JsonSyntaxException("Block " + $$3 + " has no property " + $$1xx);
            }));
      }

      return new cx.a($$1, $$3, $$4);
   }

   @Nullable
   private static csx a(JsonObject $$0) {
      if ($$0.has("block")) {
         aey $$1 = new aey(arp.i($$0, "block"));
         return jd.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(akt $$0, dfl $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends at {
      @Nullable
      private final csx a;
      private final Optional<da> b;

      public a(Optional<bc> $$0, @Nullable csx $$1, Optional<da> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<cx.a> a(csx $$0) {
         return al.J.a(new cx.a(Optional.empty(), $$0, Optional.empty()));
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (this.a != null) {
            $$0.addProperty("block", jd.f.b(this.a).toString());
         }

         this.b.ifPresent($$1 -> $$0.add("state", $$1.a()));
         return $$0;
      }

      public boolean a(dfl $$0) {
         return this.a != null && !$$0.a(this.a) ? false : !this.b.isPresent() || this.b.get().a($$0);
      }
   }
}
