import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cr extends cv<cr.a> {
   static final acq a = new acq("recipe_crafted");

   @Override
   public acq a() {
      return a;
   }

   protected cr.a a(JsonObject $$0, ba $$1, be $$2) {
      acq $$3 = new acq(aor.i($$0, "recipe_id"));
      bz[] $$4 = bz.b($$0.get("ingredients"));
      return new cr.a($$1, $$3, List.of($$4));
   }

   public void a(aig $$0, acq $$1, List<cfz> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends ar {
      private final acq a;
      private final List<bz> b;

      public a(ba $$0, acq $$1, List<bz> $$2) {
         super(cr.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cr.a a(acq $$0, List<bz> $$1) {
         return new cr.a(ba.a, $$0, $$1);
      }

      public static cr.a a(acq $$0) {
         return new cr.a(ba.a, $$0, List.of());
      }

      boolean b(acq $$0, List<cfz> $$1) {
         if (!$$0.equals(this.a)) {
            return false;
         } else {
            List<cfz> $$2 = new ArrayList<>($$1);

            for (bz $$3 : this.b) {
               boolean $$4 = false;
               Iterator<cfz> $$5 = $$2.iterator();

               while ($$5.hasNext()) {
                  if ($$3.a($$5.next())) {
                     $$5.remove();
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("recipe_id", this.a.toString());
         if (this.b.size() > 0) {
            JsonArray $$2 = new JsonArray();

            for (bz $$3 : this.b) {
               $$2.add($$3.a());
            }

            $$1.add("ingredients", $$2);
         }

         return $$1;
      }
   }
}
