import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ax extends cu<ax.a> {
   static final aer a = new aer("channeled_lightning");

   @Override
   public aer a() {
      return a;
   }

   public ax.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      List<ba> $$3 = bo.b($$0, "victims", $$2);
      return new ax.a($$1, $$3);
   }

   public void a(akl $$0, Collection<? extends bii> $$1) {
      List<ech> $$2 = $$1.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends ar {
      private final List<ba> a;

      public a(Optional<ba> $$0, List<ba> $$1) {
         super(ax.a, $$0);
         this.a = $$1;
      }

      public static ax.a a(bo.a... $$0) {
         return new ax.a(Optional.empty(), bo.a($$0));
      }

      public boolean a(Collection<? extends ech> $$0) {
         for (ba $$1 : this.a) {
            boolean $$2 = false;

            for (ech $$3 : $$0) {
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
      public JsonObject b() {
         JsonObject $$0 = super.b();
         $$0.add("victims", ba.a(this.a));
         return $$0;
      }
   }
}
