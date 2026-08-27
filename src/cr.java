import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cr extends cu<cr.a> {
   static final aer a = new aer("recipe_crafted");

   @Override
   public aer a() {
      return a;
   }

   protected cr.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      aer $$3 = new aer(arg.i($$0, "recipe_id"));
      List<bz> $$4 = bz.b($$0.get("ingredients"));
      return new cr.a($$1, $$3, $$4);
   }

   public void a(akl $$0, aer $$1, List<cix> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static class a extends ar {
      private final aer a;
      private final List<bz> b;

      public a(Optional<ba> $$0, aer $$1, List<bz> $$2) {
         super(cr.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cr.a a(aer $$0, List<bz.a> $$1) {
         return new cr.a(Optional.empty(), $$0, $$1.stream().flatMap($$0x -> $$0x.b().stream()).toList());
      }

      public static cr.a a(aer $$0) {
         return new cr.a(Optional.empty(), $$0, List.of());
      }

      boolean b(aer $$0, List<cix> $$1) {
         if (!$$0.equals(this.a)) {
            return false;
         } else {
            List<cix> $$2 = new ArrayList<>($$1);

            for (bz $$3 : this.b) {
               boolean $$4 = false;
               Iterator<cix> $$5 = $$2.iterator();

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
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.addProperty("recipe_id", this.a.toString());
         if (!this.b.isEmpty()) {
            $$0.add("ingredients", bz.a(this.b));
         }

         return $$0;
      }
   }
}
