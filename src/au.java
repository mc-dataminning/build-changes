import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public class au extends cw<au.a> {
   public au.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      cut $$3 = a($$0);
      Optional<cb> $$4 = cb.a($$0.get("item"));
      cl.d $$5 = cl.d.a($$0.get("num_bees_inside"));
      return new au.a($$1, $$3, $$4, $$5);
   }

   @Nullable
   private static cut a(JsonObject $$0) {
      if ($$0.has("block")) {
         agg $$1 = new agg(asy.i($$0, "block"));
         return jy.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(amb $$0, dgw $$1, clb $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static class a extends at {
      @Nullable
      private final cut a;
      private final Optional<cb> b;
      private final cl.d c;

      public a(Optional<bc> $$0, @Nullable cut $$1, Optional<cb> $$2, cl.d $$3) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static am<au.a> a(cut $$0, cb.a $$1, cl.d $$2) {
         return al.K.a(new au.a(Optional.empty(), $$0, Optional.of($$1.b()), $$2));
      }

      public boolean a(dgw $$0, clb $$1, int $$2) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else {
            return this.b.isPresent() && !this.b.get().a($$1) ? false : this.c.d($$2);
         }
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         if (this.a != null) {
            $$0.addProperty("block", jy.f.b(this.a).toString());
         }

         this.b.ifPresent($$1 -> $$0.add("item", $$1.a()));
         $$0.add("num_bees_inside", this.c.e());
         return $$0;
      }
   }
}
