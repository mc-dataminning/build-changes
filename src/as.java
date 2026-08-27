import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class as extends cv<as.a> {
   static final acq a = new acq("bee_nest_destroyed");

   @Override
   public acq a() {
      return a;
   }

   public as.a a(JsonObject $$0, ba $$1, be $$2) {
      cpn $$3 = a($$0);
      bz $$4 = bz.a($$0.get("item"));
      cj.d $$5 = cj.d.a($$0.get("num_bees_inside"));
      return new as.a($$1, $$3, $$4, $$5);
   }

   @Nullable
   private static cpn a(JsonObject $$0) {
      if ($$0.has("block")) {
         acq $$1 = new acq(aor.i($$0, "block"));
         return jb.f.b($$1).orElseThrow(() -> new JsonSyntaxException("Unknown block type '" + $$1 + "'"));
      } else {
         return null;
      }
   }

   public void a(aig $$0, dcb $$1, cfz $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static class a extends ar {
      @Nullable
      private final cpn a;
      private final bz b;
      private final cj.d c;

      public a(ba $$0, @Nullable cpn $$1, bz $$2, cj.d $$3) {
         super(as.a, $$0);
         this.a = $$1;
         this.b = $$2;
         this.c = $$3;
      }

      public static as.a a(cpn $$0, bz.a $$1, cj.d $$2) {
         return new as.a(ba.a, $$0, $$1.b(), $$2);
      }

      public boolean a(dcb $$0, cfz $$1, int $$2) {
         if (this.a != null && !$$0.a(this.a)) {
            return false;
         } else {
            return !this.b.a($$1) ? false : this.c.d($$2);
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("block", jb.f.b(this.a).toString());
         }

         $$1.add("item", this.b.a());
         $$1.add("num_bees_inside", this.c.d());
         return $$1;
      }
   }
}
