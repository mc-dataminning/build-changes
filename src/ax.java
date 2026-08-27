import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ax extends cv<ax.a> {
   static final acq a = new acq("channeled_lightning");

   @Override
   public acq a() {
      return a;
   }

   public ax.a a(JsonObject $$0, ba $$1, be $$2) {
      ba[] $$3 = bo.b($$0, "victims", $$2);
      return new ax.a($$1, $$3);
   }

   public void a(aig $$0, Collection<? extends bfj> $$1) {
      List<dzk> $$2 = $$1.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends ar {
      private final ba[] a;

      public a(ba $$0, ba[] $$1) {
         super(ax.a, $$0);
         this.a = $$1;
      }

      public static ax.a a(bo... $$0) {
         return new ax.a(ba.a, Stream.of($$0).map(bo::a).toArray(ba[]::new));
      }

      public boolean a(Collection<? extends dzk> $$0) {
         for (ba $$1 : this.a) {
            boolean $$2 = false;

            for (dzk $$3 : $$0) {
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
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("victims", ba.a(this.a, $$0));
         return $$1;
      }
   }
}
