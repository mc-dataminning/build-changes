import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class ecz extends ede {
   final cir i;

   ecz(cir $$0, int $$1, int $$2, efh[] $$3, edw[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public edd a() {
      return eda.b;
   }

   @Override
   public void a(Consumer<ciw> $$0, ech $$1) {
      $$0.accept(new ciw(this.i));
   }

   public static ede.a<?> a(cpj $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecz($$0.k(), $$1, $$2, $$3, $$4));
   }

   public static class a extends ede.e<ecz> {
      public void a(JsonObject $$0, ecz $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         aep $$3 = jc.i.b($$1.i);
         if ($$3 == null) {
            throw new IllegalArgumentException("Can't serialize unknown item " + $$1.i);
         } else {
            $$0.addProperty("name", $$3.toString());
         }
      }

      protected ecz a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, efh[] $$4, edw[] $$5) {
         cir $$6 = arf.j($$0, "name");
         return new ecz($$6, $$2, $$3, $$4, $$5);
      }
   }
}
