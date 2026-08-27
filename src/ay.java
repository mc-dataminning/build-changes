import com.google.gson.JsonObject;
import java.util.Optional;
import javax.annotation.Nullable;

public class ay extends cw<ay.a> {
   public ay.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      agf<crs> $$3 = $$0.has("from") ? agf.a(jz.aJ, new agg(asy.i($$0, "from"))) : null;
      agf<crs> $$4 = $$0.has("to") ? agf.a(jz.aJ, new agg(asy.i($$0, "to"))) : null;
      return new ay.a($$1, $$3, $$4);
   }

   public void a(amb $$0, agf<crs> $$1, agf<crs> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends at {
      @Nullable
      private final agf<crs> a;
      @Nullable
      private final agf<crs> b;

      public a(Optional<bc> $$0, @Nullable agf<crs> $$1, @Nullable agf<crs> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<ay.a> c() {
         return al.v.a(new ay.a(Optional.empty(), null, null));
      }

      public static am<ay.a> a(agf<crs> $$0, agf<crs> $$1) {
         return al.v.a(new ay.a(Optional.empty(), $$0, $$1));
      }

      public static am<ay.a> a(agf<crs> $$0) {
         return al.v.a(new ay.a(Optional.empty(), null, $$0));
      }

      public static am<ay.a> b(agf<crs> $$0) {
         return al.v.a(new ay.a(Optional.empty(), $$0, null));
      }

      public boolean b(agf<crs> $$0, agf<crs> $$1) {
         return this.a != null && this.a != $$0 ? false : this.b == null || this.b == $$1;
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (this.a != null) {
            $$0.addProperty("from", this.a.a().toString());
         }

         if (this.b != null) {
            $$0.addProperty("to", this.b.a().toString());
         }

         return $$0;
      }
   }
}
