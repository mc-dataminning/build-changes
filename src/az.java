import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class az extends cw<az.a> {
   public az.a a(JsonObject $$0, Optional<bc> $$1, bg $$2) {
      List<bc> $$3 = bq.b($$0, "victims", $$2);
      return new az.a($$1, $$3);
   }

   public void a(aks $$0, Collection<? extends biq> $$1) {
      List<ecq> $$2 = $$1.stream().map($$1x -> bq.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends at {
      private final List<bc> a;

      public a(Optional<bc> $$0, List<bc> $$1) {
         super($$0);
         this.a = $$1;
      }

      public static am<az.a> a(bq.a... $$0) {
         return al.E.a(new az.a(Optional.empty(), bq.a($$0)));
      }

      public boolean a(Collection<? extends ecq> $$0) {
         for (bc $$1 : this.a) {
            boolean $$2 = false;

            for (ecq $$3 : $$0) {
               if ($$1.a($$3)) {
                  $$2 = true;
                  break;
               }
            }

            if (!$$2) {
               return false;
            }
         }

         return true;
      }

      @Override
      public JsonObject a() {
         JsonObject $$0 = super.a();
         $$0.add("victims", bc.a(this.a));
         return $$0;
      }
   }
}
