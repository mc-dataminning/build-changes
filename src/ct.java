import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ct extends cw<ct.a> {
   protected ct.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      agi $$3 = new agi(atc.i($$0, "recipe_id"));
      List<cb> $$4 = cb.b($$0.get("ingredients"));
      return new ct.a($$1, $$3, $$4);
   }

   public void a(amf $$0, agi $$1, List<clj> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends at {
      private final agi a;
      private final List<cb> b;

      public a(Optional<bc> $$0, agi $$1, List<cb> $$2) {
         super($$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static am<ct.a> a(agi $$0, List<cb.a> $$1) {
         return al.Z.a(new ct.a(Optional.empty(), $$0, $$1.stream().map(cb.a::b).toList()));
      }

      public static am<ct.a> a(agi $$0) {
         return al.Z.a(new ct.a(Optional.empty(), $$0, List.of()));
      }

      boolean b(agi $$0, List<clj> $$1) {
         if (!$$0.equals(this.a)) {
            return false;
         } else {
            List<clj> $$2 = new ArrayList<>($$1);

            for (cb $$3 : this.b) {
               boolean $$4 = false;
               Iterator<clj> $$5 = $$2.iterator();

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
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.addProperty("recipe_id", this.a.toString());
         if (!this.b.isEmpty()) {
            $$0.add("ingredients", cb.a(this.b));
         }

         return $$0;
      }
   }
}
